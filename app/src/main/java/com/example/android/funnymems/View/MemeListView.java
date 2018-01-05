package com.example.android.funnymems.View;

import com.example.android.funnymems.app.model.Meme;

import java.util.List;

public interface MemeListView {

    void onMemesFetched(List<Meme> meme);
}
