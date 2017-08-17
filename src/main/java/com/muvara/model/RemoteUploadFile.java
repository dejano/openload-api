package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RemoteUploadFile {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("remoteurl")
    @Expose
    private String remoteUrl;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("bytes_loaded")
    @Expose
    private Object bytesLoaded;
    @SerializedName("bytes_total")
    @Expose
    private Object bytesTotal;
    @SerializedName("folderid")
    @Expose
    private String folderId;
    @SerializedName("added")
    @Expose
    private String added;
    @SerializedName("last_update")
    @Expose
    private String lastUpdate;
    @SerializedName("extid")
    @Expose
    private Boolean extid;
    @SerializedName("url")
    @Expose
    private Boolean url;
}
