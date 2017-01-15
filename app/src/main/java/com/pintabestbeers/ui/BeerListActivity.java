package com.pintabestbeers.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.pintabestbeers.R;
import com.pintabestbeers.adapter.BeerListAdapter;
import com.pintabestbeers.model.BeerListData;

public class BeerListActivity extends AppCompatActivity {

    private RecyclerView beerListRecyclerView;
    private BeerListAdapter beerListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_list);

        //Attach XML component to the java
        beerListRecyclerView = (RecyclerView) findViewById(R.id.beerListRecyclerView);
        //Set Layout manager (Linear, Grid, Stagger). This decide how our list will be displayed
        beerListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Populate adapter with given data
        beerListAdapter = new BeerListAdapter(BeerListData.getBeerListData(), this);
        //Put populated adapter to layout
        beerListRecyclerView.setAdapter(beerListAdapter);


    }


}

