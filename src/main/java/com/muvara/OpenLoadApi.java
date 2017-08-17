package com.muvara;

import com.google.gson.*;
import com.muvara.model.File;
import com.muvara.model.FileInfo;
import com.muvara.model.RemoteUploadFile;
import com.muvara.model.RemoteUploadStatus;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import static com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES;

public class OpenLoadApi {

    public static final String UPLOAD_TEST_FILE = "Test.txt";

    public static Api client(final String login, final String key) {
        Gson gson = new GsonBuilder()
                // TODO REFACTOR
                .registerTypeAdapter(FileInfo.class,
                        (JsonDeserializer<FileInfo>) (json, typeOfT, context) -> {
                            JsonObject jsonObject = json.getAsJsonObject();
                            Map<String, File> files = new HashMap<>();
                            // TODO STREAM
                            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                                File file = context.deserialize(entry.getValue(), File.class);
                                files.put(entry.getKey(), file);
                            }
                            return new FileInfo(files);
                        })
                .registerTypeAdapter(RemoteUploadStatus.class,
                        (JsonDeserializer<RemoteUploadStatus>) (json, typeOfT, context) -> {
                            JsonObject jsonObject = json.getAsJsonObject();
                            Map<String, RemoteUploadFile> files = new HashMap<>();
                            // TODO STREAM
                            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                                RemoteUploadFile file = context.deserialize(entry.getValue(), RemoteUploadFile.class);
                                files.put(entry.getKey(), file);
                            }
                            return new RemoteUploadStatus(files);
                        })
                .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
                .create();

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(chain -> {
            Request request = chain.request();
            HttpUrl url = request.url().newBuilder()
                    .addQueryParameter("key", key)
                    .addQueryParameter("login", login)
                    .build();
            request = request.newBuilder().url(url).build();
            return chain.proceed(request);
        }).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        return retrofit.create(Api.class);
    }

    private static String calcSHA1(java.io.File file) throws IOException, NoSuchAlgorithmException {

        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        try (InputStream input = new FileInputStream(file)) {

            byte[] buffer = new byte[8192];
            int len = input.read(buffer);

            while (len != -1) {
                sha1.update(buffer, 0, len);
                len = input.read(buffer);
            }

            return new HexBinaryAdapter().marshal(sha1.digest());
        }
    }
}
