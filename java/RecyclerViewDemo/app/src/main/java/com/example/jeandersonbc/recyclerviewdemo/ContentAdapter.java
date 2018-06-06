package com.example.jeandersonbc.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder> {

    private String[] mDataSet;

    ContentAdapter() {
        // Dummy data
        int N = 1_000;
        mDataSet = new String[N];
        for (int i = 0; i < N; i++) {
            mDataSet[i] = String.valueOf(i);
        }
    }

    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View textView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ContentViewHolder(textView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {
        holder.bind(mDataSet[position]);

    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

}
