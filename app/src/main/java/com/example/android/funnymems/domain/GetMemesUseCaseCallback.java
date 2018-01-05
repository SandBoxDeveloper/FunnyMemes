package com.example.android.funnymems.domain;

import com.example.android.funnymems.app.model.Meme;

import java.util.List;

public interface GetMemesUseCaseCallback {

    void onMemesRetrieved(List<Meme> memes);

    void onMemesNetworkError();
}
