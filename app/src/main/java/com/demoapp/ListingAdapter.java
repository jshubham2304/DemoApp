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

import java.util.ArrayList;
import java.util.List;


public class ListingAdapter extends RecyclerView.Adapter<ListingAdapter.ViewHolder> {
    private ArrayList<DataStorage> android;
    private Context context;


    public ListingAdapter(Context context, ArrayList<DataStorage> android) {
        this.android = android;
        this.context = context;
    }

    @Override
    public ListingAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mainpoints, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tv_android.setText(android.get(i).title);
        viewHolder.mycard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, ""+i, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context,ContentDisplay.class);
                Bundle bundle = new Bundle();
                bundle.putString("title", String.valueOf(android.get(i).title));
                bundle.putString("desc", String.valueOf(android.get(i).description));
                context.startActivity(intent,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return android.size();
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