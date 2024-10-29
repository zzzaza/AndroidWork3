package com.example.myapplication1;

public class Message {
    private String name;
    private int photoId;

    public Message(String name, int photoId) {
        this.name = name;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public int getPhotoId() {
        return photoId;
    }
}