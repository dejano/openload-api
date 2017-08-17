package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UploadUrl {

    @Expose
    @SerializedName("url")
    private String url;

    @Expose
    @SerializedName("valid_until")
    private String validUntil;
}
