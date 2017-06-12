package com.example.merxu.testrv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.mRecyclerView);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.addItemDecoration(new MyItemDecoration(this, MyItemDecoration.VERTICAL_LIST));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        mRecyclerView.addOnItemTouchListener(new OnItemClickListener(mRecyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder viewHolder, int position) {
                Toast.makeText(MainActivity.this, "on item click " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(RecyclerView.ViewHolder viewHolder, int position) {
//                Toast.makeText(MainActivity.this, "on item long click " + position, Toast.LENGTH_SHORT).show();
            }
        });
        ItemTouchHelper helper = new ItemTouchHelper(new MyItemTouchCallback(adapter));
        helper.attachToRecyclerView(mRecyclerView);
        mRecyclerView.setAdapter(adapter);
        adapter.getDataList().add("A");
        adapter.getDataList().add("B");
        adapter.getDataList().add("C");
        adapter.getDataList().add("D");
        adapter.getDataList().add("E");
        adapter.getDataList().add("F");
        adapter.getDataList().add("G");
        adapter.getDataList().add("H");
        adapter.getDataList().add("I");
        adapter.getDataList().add("J");
        adapter.getDataList().add("K");
        adapter.getDataList().add("L");
        adapter.getDataList().add("M");
        adapter.getDataList().add("N");
        adapter.getDataList().add("O");
        adapter.getDataList().add("P");
    }

}
