package com.example.android.funnymems.app;

import com.google.gson.annotations.SerializedName;

public class MemeData {

    @SerializedName("data")
    private Memes memeData;

    public Memes getMemeData() {
        return memeData;
    }
}
