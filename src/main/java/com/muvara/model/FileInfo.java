package com.muvara.model;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class FileInfo {

    // TODO
//    @Expose
//    @SerializedName(value = "files", alternate = {"EtWnCp6hzP8"})
//    @JsonProperty
//    private Map<String, String> files;
//    private JsonObject files;

    @Expose
    Map<String, File> files = new HashMap<>();

    // Capture all other fields that Jackson do not match other members
//    @JsonAnyGetter
//    public Map<String, File> otherFields() {
//        return files;
//    }
//
//    @JsonAnySetter
//    public void setOtherField(String name, File value) {
//        files.put(name, value);
//    }
}
