package com.example.merxu.testrv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<String> dataList = new ArrayList<>();

    public List<String> getDataList() {
        return dataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder)holder).tv.setText(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    private static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        RelativeLayout mainView;

        MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.tv);
            mainView = (RelativeLayout) itemView.findViewById(R.id.mainView);
        }
    }

}
