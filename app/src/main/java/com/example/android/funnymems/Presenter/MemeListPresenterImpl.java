package com.example.android.funnymems.Presenter;

import com.example.android.funnymems.View.MemeListActivity;
import com.example.android.funnymems.app.model.Meme;
import com.example.android.funnymems.domain.GetMemesUseCaseCallback;
import com.example.android.funnymems.domain.GetMemesUseCaseImpl;

import java.util.List;

public class MemeListPresenterImpl implements MemeListPresenter, GetMemesUseCaseCallback {

    private final MemeListActivity view;
    private final GetMemesUseCaseImpl getMemesUseCase;

    public MemeListPresenterImpl(MemeListActivity view) {
        this.view = view;
        this.getMemesUseCase = new GetMemesUseCaseImpl();
    }

    @Override
    public void getMemes() {
        getMemesUseCase.execute(view);
    }

    public void onMemesRetrieved(List<Meme> memes) {
        //getMemesUseCase.execute();
    }

    @Override
    public void onMemesNetworkError() {

    }
}


