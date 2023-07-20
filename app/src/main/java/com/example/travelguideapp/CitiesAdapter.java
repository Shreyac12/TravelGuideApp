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

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.MyHolder> {

    Context context;
    ArrayList<CitiesModel> arrayList;
    LayoutInflater layoutInflater;
    CardView cardView;

    public CitiesAdapter(Context context, ArrayList<CitiesModel> arrayList ) {
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

        if(arrayList.get(position).getHName().equals("Aalankritha Resort")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),Aalankritha_Resort.class);
                    v.getContext().startActivity(intent);
                }
            });
        } else if (arrayList.get(position).getHName().equals("Araku Haritha Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(), Details.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        } else if (arrayList.get(position).getHName().equals("Dindi valley")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent=new Intent(v.getContext(),Dindi_Valley.class);
                    Intent intent=new Intent(v.getContext(), Details.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        } else if (arrayList.get(position).getHName().equals("Golkonda Resorts and Spa")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(), Details.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        } else if (arrayList.get(position).getHName().equals("The Palm Beach Hotel and Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(), Details.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }
        else if (arrayList.get(position).getHName().equals("Punnami Vihar Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(), Details.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }
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
