package com.example.android.funnymems.Presenter;

import com.example.android.funnymems.domain.GetMemesUseCaseCallback;
import com.example.android.funnymems.domain.GetMemesUseCaseImpl;
import com.example.android.funnymems.View.MemeListActivity;
import com.example.android.funnymems.app.model.Meme;
import com.example.android.funnymems.app.net.MemeApi;
import com.example.android.funnymems.app.net.MemeApiClient;

import java.util.List;

public class MemeListPresenterImpl implements MemeListPresenter, GetMemesUseCaseCallback {

    private final MemeListActivity view;
    private final GetMemesUseCaseImpl getMemesUseCase;
    private MemeApi memeApiInterface;

    public MemeListPresenterImpl(MemeListActivity view) {
        this.view = view;
        this.getMemesUseCase = new GetMemesUseCaseImpl();
        this.memeApiInterface = MemeApiClient.getClient().create(MemeApi.class);
    }

    @Override
    public void getMemes() {
        getMemesUseCase.execute(view);
//        Call<MemeData> call = memeApiInterface.getMemeList();
//
//        call.enqueue(new Callback<MemeData>() {
//            @Override
//            public void onResponse(Call<MemeData> call, Response<MemeData> response) {
//                Memes memesList = response.body().getMemeData();
//                List<Meme> memes = new ArrayList<>();
//                List<Meme> meme = memesList.getMemes();
//
//                for (Meme memeItem : meme) {
//                    memes.add(new Meme(memeItem.id,
//                            memeItem.name,
//                            memeItem.url,
//                            memeItem.width,
//                            memeItem.height));
//                }
//
//                view.onMemesFetched(memes);
//            }
//
//            @Override
//            public void onFailure(Call<MemeData> call, Throwable t) {
//                Log.e(t.getMessage(), "Error fetching memes.");
//            }
//        });
    }

    @Override
    public void onMemesRetrieved(List<Meme> memes) {
        //getMemesUseCase.execute();
    }

    @Override
    public void onMemesNetworkError() {

    }
}


