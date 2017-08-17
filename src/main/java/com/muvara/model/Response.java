package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Response<T> {

    @Expose
    @SerializedName("msg")
    private String message;
    @Expose
    private String status;
    @Expose
    private T result;
}