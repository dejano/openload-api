package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FolderFile {


    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sha1")
    @Expose
    private String sha1;
    @SerializedName("folderid")
    @Expose
    private String folderId;
    @SerializedName("upload_at")
    @Expose
    private String uploadAt;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("download_count")
    @Expose
    private String downloadCount;
    @SerializedName("cstatus")
    @Expose
    private String cstatus;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("linkextid")
    @Expose
    private String externalLinkId;
}
