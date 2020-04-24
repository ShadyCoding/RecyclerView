package com.shady.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private List<ListItem> mListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mListItems = new ArrayList<>();

        ListItem listItem1 = new ListItem("Lemon drizzle cake", getString(R.string.item1_desc), "Delicious");
        ListItem listItem2 = new ListItem("Ultimate chocolate cake ", getString(R.string.item2_desc), "Amazing");
        ListItem listItem3 = new ListItem("Chilli con carne recipe ", getString(R.string.item3_desc), "Wow!");
        ListItem listItem4 = new ListItem("Carrot cake", getString(R.string.item4_desc), "Delicious");
        ListItem listItem5 = new ListItem("Lemon drizzle cake", getString(R.string.item1_desc), "Delicious");
        ListItem listItem6 = new ListItem("Ultimate chocolate cake ", getString(R.string.item2_desc), "Amazing");
        ListItem listItem7 = new ListItem("Chilli con carne recipe ", getString(R.string.item3_desc), "Wow!");
        ListItem listItem8 = new ListItem("Carrot cake", getString(R.string.item4_desc), "Delicious");
        mListItems.add(listItem1);
        mListItems.add(listItem2);
        mListItems.add(listItem3);
        mListItems.add(listItem4);
        mListItems.add(listItem5);
        mListItems.add(listItem6);
        mListItems.add(listItem7);
        mListItems.add(listItem8);
        /*for (int i = 0; i < 10; i++) {
            ListItem listItem = new ListItem("Item "+(i+1), "Decription", "Amazing");
            mListItems.add(listItem);
        }*/


        mAdapter = new MyAdapter(this, mListItems);
        mRecyclerView.setAdapter(mAdapter);

    }
}
