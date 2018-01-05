package com.example.android.funnymems.View.adapter;

import android.support.v7.widget.RecyclerView;

import com.example.android.funnymems.app.model.Meme;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public abstract class MemeAdapter extends RecyclerView.Adapter<MemeViewHolder> {

    public abstract void setMemes(@Nullable List<Meme> memes);
}
