package com.demoapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;



public class ListingAdapter extends RecyclerView.Adapter<ListingAdapter.ViewHolder> {
    private ArrayList<DataStorage> DataList;
    private Context context;

    public ListingAdapter(Context context,ArrayList<DataStorage> android) {
        this.DataList = android;
        this.context = context;
    }

    @Override
    public ListingAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mainpoints, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tv_android.setText(DataList.get(i).title);
        viewHolder.mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+i, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,ContentDisplay.class);
                Bundle bundle = new Bundle();

                bundle.putSerializable("list", (Serializable) DataList);

                bundle.putInt("index", i);
//                bundle.putInt("desc", android.get(i).description);
////                intent.putExtra("title",android.get(i).getTitle());
//                intent.putExtra("desc",android.get(i).getDescription());
               // Toast.makeText(context, android.get(i).getDescription(), Toast.LENGTH_SHORT).show();
               intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_android;
        private CardView mycard;
        public ViewHolder(View view) {
            super(view);

            tv_android = (TextView)view.findViewById(R.id.header);
            mycard =(CardView)view.findViewById(R.id.card);
        }
    }

}