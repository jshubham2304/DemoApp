package com.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        RecyclerView mylist;
    FloatingActionButton floatingActionButton;
    ArrayList<DataStorage> mydata = new ArrayList<DataStorage>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = (RecyclerView)findViewById(R.id.recyclerView);
        mylist.setHasFixedSize(true);
       getData();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mylist.setLayoutManager(layoutManager);
        ListingAdapter adapter = new ListingAdapter(this,  mydata);
        mylist.setAdapter(adapter);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutUs.class));
            }
        });
    }

    private void getData() {
        mydata.add(new DataStorage(1,R.string.point1_title,R.string.point1_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point2_title,R.string.point2_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point3_title,R.string.point3_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point4_title,R.string.point4_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point5_title,R.string.point5_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point6_title,R.string.point6_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point7_title,R.string.point7_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point8_title,R.string.point8_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point9_title,R.string.point9_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point10_title,R.string.point10_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point11_title,R.string.point11_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point12_title,R.string.point12_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point13_title,R.string.point13_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point14_title,R.string.point14_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point15_title,R.string.point15_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point16_title,R.string.point16_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point17_title,R.string.point17_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point18_title,R.string.point18_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point19_title,R.string.point19_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point20_title,R.string.point20_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point21_title,R.string.point21_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point22_title,R.string.point22_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point23_title,R.string.point23_data,1,2));
//
//        mydata.add(new DataStorage(1,R.string.point24_title,R.string.point24_data,1,2));
//        mydata.add(new DataStorage(1,R.string.point25_title,R.string.point25_data,1,2));
    }

}
