package com.demoapp;

import android.content.Intent;
import android.content.res.Resources;
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
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        RecyclerView mylist;
    ArrayList<DataStorage> mydata = new ArrayList<DataStorage>();
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = (RecyclerView)findViewById(R.id.recyclerView);
        mylist.setHasFixedSize(true);
        getData();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mylist.setLayoutManager(layoutManager);
        ListingAdapter adapter = new ListingAdapter(this,mydata);
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
        mydata.add(new DataStorage(1,R.string.point1_title,R.string.point1_bb,R.string.point1_td,R.string.point1_wf,
                R.string.point1_performance,R.string.point1_ld,R.string.point1_oib,R.string.point1_limitation,
                R.string.point1_source,R.string.point1_dtf,R.string.point1_Year,R.string.point1_Cost,
                R.drawable.point1_img1,R.drawable.point1_img2));

        mydata.add(new DataStorage(2,R.string.point2_title,R.string.point2_bb,R.string.point2_td,R.string.point2_wf,
                R.string.point2_performance,R.string.point2_ld,R.string.point2_oib,R.string.point2_limitation,
                R.string.point1_source,R.string.point1_dtf,R.string.point1_Year,R.string.point1_Cost,
                R.drawable.point2_img1,R.drawable.point2_img2));

        mydata.add(new DataStorage(3,R.string.point3_title,R.string.point3_bb,R.string.point3_td,R.string.point3_wf,
                R.string.point3_performance,R.string.point3_ld,R.string.point3_oib,R.string.point3_limitation,
                R.string.point3_source,R.string.point3_dtf,R.string.point3_Year,R.string.point1_Cost,
                R.drawable.point3_img1,R.drawable.point3_img2));

        mydata.add(new DataStorage(4,R.string.point4_title,R.string.point4_bb,R.string.point4_td,R.string.point4_wf,
                R.string.point4_performance,R.string.point4_ld,R.string.point4_oib,R.string.point4_limitation,
                R.string.point4_source,R.string.point4_dtf,R.string.point4_Year,R.string.point1_Cost,
                R.drawable.point4_img1,R.drawable.point4_img2));

        mydata.add(new DataStorage(5,R.string.point5_title,R.string.point5_bb,R.string.point5_td,R.string.point5_wf,
                R.string.point5_performance,R.string.point5_ld,R.string.point5_oib,R.string.point5_limitation,
                R.string.point5_source,R.string.point5_dtf,R.string.point5_Year,R.string.point1_Cost,
                R.drawable.point5_img1,R.drawable.point5_img2));

        mydata.add(new DataStorage(6,R.string.point6_title,R.string.point6_bb,R.string.point6_td,R.string.point6_wf,
                R.string.point6_performance,R.string.point6_ld,R.string.point6_oib,R.string.point6_limitation,
                R.string.point6_source,R.string.point6_dtf,R.string.point6_Year,R.string.point1_Cost,
                R.drawable.point6_img1,R.drawable.point6_img2));

        mydata.add(new DataStorage(7,R.string.point7_title,R.string.point7_bb,R.string.point7_td,R.string.point7_wf,
                R.string.point7_performance,R.string.point7_ld,R.string.point7_oib,R.string.point7_limitation,
                R.string.point7_source,R.string.point7_dtf,R.string.point7_Year,R.string.point1_Cost,
                R.drawable.point7_img1,R.drawable.point7_img2));
// no Image in 8
        mydata.add(new DataStorage(8,R.string.point8_title,R.string.point8_bb,R.string.point8_td,R.string.point8_wf,
                R.string.point8_performance,R.string.point8_ld,R.string.point8_oib,R.string.point8_limitation,
                R.string.point8_source,R.string.point8_dtf,R.string.point8_Year,R.string.point1_Cost,
                R.drawable.point8_img1,1));

        mydata.add(new DataStorage(9,R.string.point9_title,R.string.point9_bb,R.string.point9_td,R.string.point9_wf,
                R.string.point9_performance,R.string.point9_ld,R.string.point9_oib,R.string.point9_limitation,
                R.string.point9_source,R.string.point9_dtf,R.string.point9_Year,R.string.point1_Cost,
                R.drawable.point9_img1,R.drawable.point9_img2));

        mydata.add(new DataStorage(10,R.string.point10_title,R.string.point10_bb,R.string.point10_td,R.string.point10_wf,
                R.string.point10_performance,R.string.point10_ld,R.string.point10_oib,R.string.point10_limitation,
                R.string.point10_source,R.string.point10_dtf,R.string.point10_Year,R.string.point1_Cost,
                R.drawable.point10_img1,R.drawable.point10_img2));

        mydata.add(new DataStorage(11,R.string.point11_title,R.string.point11_bb,R.string.point11_td,R.string.point11_wf,
                R.string.point11_performance,R.string.point11_ld,R.string.point11_oib,R.string.point11_limitation,
                R.string.point11_source,R.string.point11_dtf,R.string.point11_Year,R.string.point1_Cost,
                R.drawable.point11_img1,1));

        mydata.add(new DataStorage(12,R.string.point12_title,R.string.point12_bb,R.string.point12_td,R.string.point12_wf,
                R.string.point12_performance,R.string.point12_ld,R.string.point12_oib,R.string.point12_limitation,
                R.string.point12_source,R.string.point12_dtf,R.string.point12_Year,R.string.point12_Cost,
                R.drawable.point12_img1,R.drawable.point12_img2));
        mydata.add(new DataStorage(13,R.string.point13_title,R.string.point13_bb,R.string.point13_td,R.string.point13_wf,
                R.string.point13_performance,R.string.point13_ld,R.string.point13_oib,R.string.point13_limitation,
                R.string.point13_source,R.string.point13_dtf,R.string.point13_Year,R.string.point13_Cost,
                R.drawable.point13_img1,R.drawable.point13_img2));
        mydata.add(new DataStorage(14,R.string.point14_title,R.string.point14_bb,R.string.point14_td,R.string.point14_wf,
                R.string.point14_performance,R.string.point14_ld,R.string.point14_oib,R.string.point14_limitation,
                R.string.point14_source,R.string.point14_dtf,R.string.point14_Year,R.string.point14_Cost,
                R.drawable.point14_img1,R.drawable.point14_img2));
        mydata.add(new DataStorage(15,R.string.point15_title,R.string.point15_bb,R.string.point15_td,R.string.point15_wf,
                R.string.point15_performance,R.string.point15_ld,R.string.point15_oib,R.string.point15_limitation,
                R.string.point15_source,R.string.point15_dtf,R.string.point15_Year,R.string.point15_Cost,
                R.drawable.point15_img1,1));

        mydata.add(new DataStorage(16,R.string.point16_title,R.string.point16_bb,R.string.point16_td,R.string.point16_wf,
                R.string.point16_performance,R.string.point16_ld,R.string.point16_oib,R.string.point16_limitation,
                R.string.point16_source,R.string.point16_dtf,R.string.point16_Year,R.string.point16_Cost,
                R.drawable.point16_img1,R.drawable.point16_img2));

        mydata.add(new DataStorage(17,R.string.point17_title,R.string.point17_bb,R.string.point17_td,R.string.point17_wf,
                R.string.point17_performance,R.string.point17_ld,R.string.point17_oib,R.string.point17_limitation,
                R.string.point17_source,R.string.point17_dtf,R.string.point17_Year,R.string.point17_Cost,
                R.drawable.point17_img1,R.drawable.point17_img2));

        mydata.add(new DataStorage(18,R.string.point18_title,R.string.point18_bb,R.string.point18_td,R.string.point18_wf,
                R.string.point18_performance,R.string.point18_ld,R.string.point18_oib,R.string.point18_limitation,
                R.string.point18_source,R.string.point18_dtf,R.string.point18_Year,R.string.point18_Cost,
                R.drawable.point18_img1,1));

        mydata.add(new DataStorage(19,R.string.point19_title,R.string.point19_bb,R.string.point19_td,R.string.point19_wf,
                R.string.point19_performance,R.string.point19_ld,R.string.point19_oib,R.string.point19_limitation,
                R.string.point19_source,R.string.point19_dtf,R.string.point19_Year,R.string.point19_Cost,
                R.drawable.point19_img1,R.drawable.point19_img2));

        mydata.add(new DataStorage(20,R.string.point20_title,R.string.point20_bb,R.string.point20_td,R.string.point20_wf,
                R.string.point20_performance,R.string.point20_ld,R.string.point20_oib,R.string.point20_limitation,
                R.string.point20_source,R.string.point20_dtf,R.string.point20_Year,R.string.point20_Cost,
                R.drawable.point20_img1,R.drawable.point20_img2));

        mydata.add(new DataStorage(21,R.string.point21_title,R.string.point21_bb,R.string.point21_td,R.string.point21_wf,
                R.string.point21_performance,R.string.point21_ld,R.string.point21_oib,R.string.point21_limitation,
                R.string.point21_source,R.string.point21_dtf,R.string.point21_Year,R.string.point21_Cost,
                R.drawable.point21_img1,R.drawable.point21_img2));

        mydata.add(new DataStorage(22,R.string.point22_title,R.string.point22_bb,R.string.point22_td,R.string.point22_wf,
                R.string.point22_performance,R.string.point22_ld,R.string.point22_oib,R.string.point22_limitation,
                R.string.point22_source,R.string.point22_dtf,R.string.point22_Year,R.string.point22_Cost,
                R.drawable.point22_img1,R.drawable.point22_img2));

        mydata.add(new DataStorage(23,R.string.point23_title,R.string.point23_bb,R.string.point23_td,R.string.point23_wf,
                R.string.point23_performance,R.string.point23_ld,R.string.point23_oib,R.string.point23_limitation,
                R.string.point23_source,R.string.point23_dtf,R.string.point23_Year,R.string.point23_Cost,
                R.drawable.point23_img1,R.drawable.point23_img2));


        mydata.add(new DataStorage(24,R.string.point24_title,R.string.point24_bb,R.string.point24_td,R.string.point24_wf,
                R.string.point24_performance,R.string.point24_ld,R.string.point24_oib,R.string.point24_limitation,
                R.string.point24_source,R.string.point24_dtf,R.string.point24_Year,R.string.point24_Cost,
                R.drawable.point24_img1,R.drawable.point24_img2));


        mydata.add(new DataStorage(25,R.string.point25_title,R.string.point25_bb,R.string.point25_td,R.string.point25_wf,
                R.string.point25_performance,R.string.point25_ld,R.string.point25_oib,R.string.point25_limitation,
                R.string.point25_source,R.string.point25_dtf,R.string.point25_Year,R.string.point25_Cost,
                R.drawable.point25_img1,R.drawable.point25_img2));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
