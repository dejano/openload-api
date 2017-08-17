package com.muvara.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class RemoteUploadStatus {

    Map<String, RemoteUploadFile> files;
}
