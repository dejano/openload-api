package com.muvara;

import com.muvara.model.*;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

interface Api {

    String BASE_URL = "https://api.openload.co/1/";

    @GET("account/info")
    Call<Response<AccountInfo>> accountInfo();

    @GET("file/dlticket")
    Call<Response<DownloadTicket>> downloadTicket(@Query("file") String file);

    @GET("file/info")
    Call<Response<FileInfo>> fileInfo(@Query("file") String id);

    @GET("file/ul")
    Call<Response<UploadUrl>> getUploadUrl(@Query("folder") String folderId, @Query("sha1") String sha1, @Query("httponly") String httpOnly);

    @POST
    @Multipart
    Call<Response<Upload>> upload(@Url String url, @Part MultipartBody.Part file);

    @GET("remotedl/add")
    Call<Response<RemoteUpload>> remoteUpload(@Query("remoteUrl") String remoteUrl, @Query("folder") String folderId);

    @GET("remotedl/status")
    Call<Response<RemoteUploadStatus>> remoteUploadStatus(@Query("limit") String limit, @Query("id") String id);

    @GET("file/listfolder")
    Call<Response<Folder>> listFolder(@Query("folder") String id);

    @GET("file/delete")
    Call<Response> delete(@Query("file") String fileId);

    @GET("file/renamefolder")
    Call<Response> renameFolder(@Query("folder") String folderId, @Query("name") String name);

    @GET("file/rename")
    Call<Response> renameFile(@Query("file") String fileId, @Query("name") String name);
}
