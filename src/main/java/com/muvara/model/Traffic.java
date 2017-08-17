package com.muvara.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Traffic {

    @SerializedName("left")
    @Expose
    private Integer left;

    @SerializedName("used_24h")
    @Expose
    private Integer used24h;
}