package com.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContentDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_display);
        Bundle bundle = new Bundle();
        String title = String.valueOf(bundle.getString("title"));
        String desc = String.valueOf(bundle.getString("desc"));
        Toast.makeText(this,title,Toast.LENGTH_SHORT).show();

    }
}
