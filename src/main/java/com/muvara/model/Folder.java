package com.muvara.model;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Folder {

    @Expose
    List<?> files;
    @Expose
    List<FolderDescription> folders;
}
