package com.example.android.funnymems.repository;

import com.example.android.funnymems.app.model.Meme;

import java.util.List;

public interface MemeRepository {

    List<Meme> getMemesFromAPI();
}
