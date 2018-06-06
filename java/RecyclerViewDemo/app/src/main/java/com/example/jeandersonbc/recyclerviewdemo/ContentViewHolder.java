package com.example.jeandersonbc.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ContentViewHolder extends RecyclerView.ViewHolder {

    private TextView viewContent;

    public ContentViewHolder(View itemView) {
        super(itemView);
        viewContent = itemView.findViewById(R.id.tv_item_content);
    }

    public void bind(String content) {
        viewContent.setText(content);
    }
}
