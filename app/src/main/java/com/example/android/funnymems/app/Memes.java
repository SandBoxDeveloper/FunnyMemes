package com.example.android.funnymems.app;

import com.example.android.funnymems.app.model.Meme;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Memes {

    @SerializedName("memes")
    List<Meme> memes;

    public List<Meme> getMemes() {
        return memes;
    }
}
