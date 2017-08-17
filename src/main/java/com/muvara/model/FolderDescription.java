package com.muvara.model;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FolderDescription {

    @Expose
    private String id;
    @Expose
    private String name;
}
