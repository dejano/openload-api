package com.muvara.gson;

import com.google.gson.*;
import com.muvara.model.File;
import com.muvara.model.FileInfo;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class FileInfoDeserializer implements JsonDeserializer<FileInfo> {
    @Override
    public FileInfo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Map<String, File> files = new HashMap<>();
        // TODO STREAM
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            File file = context.deserialize(entry.getValue(), File.class);
            files.put(entry.getKey(), file);
        }
        return new FileInfo(files);
    }
}
