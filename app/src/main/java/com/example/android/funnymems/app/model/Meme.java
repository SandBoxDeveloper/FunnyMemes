package com.example.android.funnymems.app.model;

import com.google.gson.annotations.SerializedName;

public class Meme {

    @SerializedName("id")
    public String id;
    @SerializedName("name")
    public String name;
    @SerializedName("url")
    public String url;
    @SerializedName("width")
    public int width;
    @SerializedName("height")
    public int height;

    public Meme(String id, String name, String url, int width, int height) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.width = width;
        this.height = height;
    }
}
