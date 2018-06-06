package com.example.jeandersonbc.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentViewHolder> {

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
        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_list_item, parent, false);
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

    static class ContentViewHolder extends RecyclerView.ViewHolder {

        private TextView mListItem;

        ContentViewHolder(TextView itemView) {
            super(itemView);
            mListItem = itemView;
        }

        void bind(String content) {
            mListItem.setText(content);
        }
    }
}
