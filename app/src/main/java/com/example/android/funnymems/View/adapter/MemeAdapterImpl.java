package com.example.android.funnymems.View.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.funnymems.R;
import com.example.android.funnymems.app.model.Meme;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MemeAdapterImpl extends MemeAdapter {

    private List<Meme> memes;

    @Override
    public void setMemes(@Nullable List<Meme> memes) {
        this.memes = memes;
        notifyDataSetChanged();
    }

    @Override
    public MemeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_meme, parent, false);
        return new MemeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MemeViewHolder holder, int position) {
        holder.bind(memes.get(position));
    }

    @Override
    public int getItemCount() {
        return memes != null ? memes.size() : 0;
    }
}
