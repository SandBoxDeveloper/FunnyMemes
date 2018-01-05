package com.example.android.funnymems.repository;

import android.content.Context;
import android.util.Log;

import com.example.android.funnymems.View.MemeListActivity;
import com.example.android.funnymems.app.MemeData;
import com.example.android.funnymems.app.Memes;
import com.example.android.funnymems.app.model.Meme;
import com.example.android.funnymems.app.net.MemeApi;
import com.example.android.funnymems.app.net.MemeApiClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MemeRepositoryImpl implements MemeRepository {

    private final MemeListActivity view;
    private MemeApi memeApiInterface;

    public MemeRepositoryImpl(MemeListActivity view) {
        this.view = view;
        this.memeApiInterface = MemeApiClient.getClient().create(MemeApi.class);
    }

    @Override
    public List<Meme> getMemesFromAPI() {
        Call<MemeData> call = memeApiInterface.getMemeList();

        call.enqueue(new Callback<MemeData>() {
            @Override
            public void onResponse(Call<MemeData> call, Response<MemeData> response) {
                Memes memesList = response.body().getMemeData();
                List<Meme> memes = new ArrayList<>();
                List<Meme> meme = memesList.getMemes();

                for (Meme memeItem : meme) {
                    memes.add(new Meme(memeItem.id,
                            memeItem.name,
                            memeItem.url,
                            memeItem.width,
                            memeItem.height));
                }

                view.onMemesFetched(memes);
            }

            @Override
            public void onFailure(Call<MemeData> call, Throwable t) {
                Log.e(t.getMessage(), "Error fetching memes.");
            }
        });
        return null;
    }
}
