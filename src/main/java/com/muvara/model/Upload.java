package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Upload {

    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("size")
    private String sizeInBytes;
    @Expose
    @SerializedName("sha1")
    private String sha1;
    @Expose
    @SerializedName("content_type")
    private String contentType;
    @Expose
    @SerializedName("id")
    private String id;
    @Expose
    @SerializedName("url")
    private String url;

}
