package com.udsm.akil.photoz.clone;

import jakarta.validation.constraints.NotEmpty;

public class Photo {

    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    private String id;

    private byte[] data;

    @NotEmpty
    private String fileName;

    public Photo(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
