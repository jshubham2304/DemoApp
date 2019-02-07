package com.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.demoapp.OnSwipeTouchListener;

public class ContentDisplay extends AppCompatActivity {

    ScrollView layout;
    List<DataStorage> Data_list = new ArrayList<>();
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.img1)
    ImageView img1;
    @BindView(R.id.img2)
    ImageView img2;
    @BindView(R.id.bb)
    TextView desc;
    @BindView(R.id.tf)
    TextView technologydesc;
    @BindView(R.id.wf)
    TextView womanfriendly;
    @BindView(R.id.performance)
    TextView performance;
    @BindView(R.id.ld)
    TextView localofapplication;
    @BindView(R.id.oib)
    TextView Outcome;
    @BindView(R.id.limitation)
    TextView limitation;
    @BindView(R.id.source)
    TextView source;
    @BindView(R.id.dtr)
    TextView develope;
    @BindView(R.id.year)
    TextView year;
    @BindView(R.id.cost)
    TextView cost;
    @BindView(R.id.performancev)
    View performancev;
    @BindView(R.id.performancetv)
    TextView performancetv;
    @BindView(R.id.yearv)
    View yearv;
    @BindView(R.id.yeartv)
    TextView yeartv;
    @BindView(R.id.costv)
    View costv;
    @BindView(R.id.costtv)
    TextView costtv;
    @BindView(R.id.card1)
    CardView card1;
    @BindView(R.id.card2)
    CardView card2;
//    @BindView(R.id.fd)
//    TextView fd;

    private GestureDetector gestureDetector;
    View.OnTouchListener gestureListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_display);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        layout = (ScrollView) findViewById(R.id.layout);
        final int i = bundle.getInt("index");
        Data_list = (List<DataStorage>) bundle.getSerializable("list");

        layout.setOnTouchListener(new OnSwipeTouchListener(ContentDisplay.this) {
//            public void onSwipeTop() {
//                Toast.makeText(ContentDisplay.this, "top", Toast.LENGTH_SHORT).show();
//            }
            public void onSwipeRight() {
                if(i != 0)
                {
                int j=i-1;
//                Toast.makeText(ContentDisplay.this, "right", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ContentDisplay.this,ContentDisplay.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("list", (Serializable) Data_list);

                bundle.putInt("index", j);
                intent.putExtras(bundle);
                startActivity(intent);
            }
            }
            public void onSwipeLeft() {
//                Toast.makeText(ContentDisplay.this, "left", Toast.LENGTH_SHORT).show();
                if (i != 24) {
                    int j = i + 1;
                    //Toast.makeText(ContentDisplay.this, "right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ContentDisplay.this, ContentDisplay.class);
                    Bundle bundle = new Bundle();

                    bundle.putSerializable("list", (Serializable) Data_list);

                    bundle.putInt("index", j);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
//            public void onSwipeBottom() {
//                Toast.makeText(ContentDisplay.this, "bottom", Toast.LENGTH_SHORT).show();
//            }

        });
        
        

        {
            String syear = getString(Data_list.get(i).year);
            String scost = getString(Data_list.get(i).cost);
            String sper = getString(Data_list.get(i).performance);

            title.setText(Data_list.get(i).title);
            desc.setText(Data_list.get(i).description);
            technologydesc.setText(Data_list.get(i).technologydesc);
            limitation.setText(Data_list.get(i).limit);
            localofapplication.setText(Data_list.get(i).localediss_app);
            Outcome.setText(Data_list.get(i).outcome);
            source.setText(Data_list.get(i).source);
            year.setText(Data_list.get(i).getYear());
            cost.setText(Data_list.get(i).cost);
            develope.setText(Data_list.get(i).develope);
            womanfriendly.setText(Data_list.get(i).womenfriend);
            performance.setText(Data_list.get(i).performance);
            if (Data_list.get(i).image1 != 1) {
                img1.setImageResource(Data_list.get(i).image1);
            } else {
                img1.setVisibility(View.GONE);
                card1.setVisibility(View.GONE);
            }
            if (Data_list.get(i).image2 != 1) {
                img2.setImageResource(Data_list.get(i).image2);
            } else {
                img2.setVisibility(View.GONE);
                card2.setVisibility(View.GONE);
            }
            if (syear.isEmpty()) {
                year.setVisibility(View.GONE);
                yearv.setVisibility(View.GONE);
                yeartv.setVisibility(View.GONE);
            }
            if (scost.isEmpty()) {
                cost.setVisibility(View.GONE);
                costv.setVisibility(View.GONE);
                costtv.setVisibility(View.GONE);
            }
            if (sper.isEmpty()) {
                performance.setVisibility(View.GONE);
                performancev.setVisibility(View.GONE);
                performancetv.setVisibility(View.GONE);
            }
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ContentDisplay.this,MainActivity.class);
        startActivity(intent);
    }
}
