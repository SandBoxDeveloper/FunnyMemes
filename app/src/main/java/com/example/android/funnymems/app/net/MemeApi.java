package com.example.android.funnymems.app.net;

import com.example.android.funnymems.app.MemeData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MemeApi {

    @GET("/get_memes")
    Call<MemeData> getMemeList();
}
