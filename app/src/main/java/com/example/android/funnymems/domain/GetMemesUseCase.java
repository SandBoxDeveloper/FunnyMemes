package com.example.android.funnymems.domain;

import com.example.android.funnymems.View.MemeListActivity;

public interface GetMemesUseCase {

    void execute(MemeListActivity activity);

    void setCallback();
}
