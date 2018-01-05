package com.example.android.funnymems.View.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.android.funnymems.R;
import com.example.android.funnymems.app.model.Meme;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MemeViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.meme_name)
    TextView memeName;

    public MemeViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(Meme meme) {
        memeName.setText(meme.name);
    }

}
