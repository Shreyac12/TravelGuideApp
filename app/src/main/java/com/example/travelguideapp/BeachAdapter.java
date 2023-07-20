package com.example.travelguideapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BeachAdapter extends RecyclerView.Adapter<BeachAdapter.MyHolder> {

    Context context;
    ArrayList<BeachModel> arrayList;
    LayoutInflater layoutInflater;
    CardView cardView;

    public BeachAdapter(Context context, ArrayList<BeachModel> arrayList ) {
        this.context = context;
        this.arrayList = arrayList;


        layoutInflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.resort_list,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.HName.setText(arrayList.get(position).getHName());
        holder.HLoc.setText(arrayList.get(position).getHLoc());
        holder.img.setImageResource(arrayList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        public Object cardView;
        TextView HName,HLoc;
        ImageView img;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            HName=itemView.findViewById(R.id.hotelName);
            HLoc=itemView.findViewById(R.id.room);
            img=itemView.findViewById(R.id.img);


        }
    }
}
