package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RemoteUpload {

    @Expose
    private String id;

    @Expose
    @SerializedName("folderid")
    private String folderId;
}
