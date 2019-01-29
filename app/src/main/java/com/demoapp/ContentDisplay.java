package com.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContentDisplay extends AppCompatActivity {

    TextView conttitle,contDesc;
    List<DataStorage>Data_list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_display);

        Bundle bundle = getIntent().getExtras();
        int i=bundle.getInt("index");
        Data_list= (List<DataStorage>) bundle.getSerializable("list");

        conttitle=(TextView)findViewById(R.id.title);

        conttitle.setText(Data_list.get(i).title);



    }
}
