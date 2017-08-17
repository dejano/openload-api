package com.muvara.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DownloadTicket {

    @SerializedName("ticket")
    @Expose
    private String ticket;

    @SerializedName("captcha_url")
    @Expose
    private String captchaUrl;

    @SerializedName("captcha_w")
    @Expose
    private Integer captchaW;

    @SerializedName("captcha_h")
    @Expose
    private Integer captchaH;

    @SerializedName("wait_time")
    @Expose
    private Integer waitTime;

    @SerializedName("valid_until")
    @Expose
    private String validUntil;

}
