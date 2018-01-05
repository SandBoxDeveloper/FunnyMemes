package com.example.android.funnymems.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.funnymems.R;
import com.example.android.funnymems.app.model.Meme;
import com.example.android.funnymems.Presenter.MemeListPresenterImpl;
import com.example.android.funnymems.View.adapter.MemeAdapterImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MemeListActivity extends AppCompatActivity implements MemeListView {

    @BindView(R.id.memes_recycler_view)
    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;
    MemeListPresenterImpl memeListPresenter;
    MemeAdapterImpl memeAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_list);
        ButterKnife.bind(this);
        setupRecyclerView();
        memeListPresenter = new MemeListPresenterImpl(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        memeListPresenter.getMemes();
    }

    private void setupRecyclerView() {
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(memeAdapter);
        memeAdapter = new MemeAdapterImpl();
        recyclerView.setAdapter(memeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onMemesFetched(List<Meme> memes) {
        memeAdapter.setMemes(memes);
    }
}
