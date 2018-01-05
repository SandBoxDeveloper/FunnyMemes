package com.example.android.funnymems.domain;

import com.example.android.funnymems.View.MemeListActivity;
import com.example.android.funnymems.repository.MemeRepository;
import com.example.android.funnymems.repository.MemeRepositoryImpl;

public class GetMemesUseCaseImpl implements GetMemesUseCase {

    MemeRepository memeRepository;

    @Override
    public void execute(MemeListActivity view) {
        memeRepository = new MemeRepositoryImpl(view);
        memeRepository.getMemesFromAPI();
    }

    @Override
    public void setCallback() {

    }
}
