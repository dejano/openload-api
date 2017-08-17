package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccountInfo {

    @SerializedName("extid")
    @Expose
    private String extid;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("signup_at")
    @Expose
    private String signUpAt;

    @SerializedName("storage_left")
    @Expose
    private Integer storageLeft;

    @SerializedName("storage_used")
    @Expose
    private String storageUsed;

    @SerializedName("traffic")
    @Expose
    private Traffic traffic;

    @SerializedName("balance")
    @Expose
    private Integer balance;

}