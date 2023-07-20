package com.example.travelguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Resort2Adapter extends RecyclerView.Adapter<Resort2Adapter.MyHolder> {

    Context context;
    ArrayList<ResortModel> array2List;
    LayoutInflater layoutInflater;
    CardView cardView;

    public Resort2Adapter(Context context, ArrayList<ResortModel> array2List ) {
        this.context = context;
        this.array2List = array2List;


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
        holder.HName.setText(array2List.get(position).getHName());
        holder.HLoc.setText(array2List.get(position).getHLoc());
        holder.img.setImageResource(array2List.get(position).getImg());

        if(array2List.get(position).getHName().equals("hotel1")){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent=new Intent(v.getContext(),Hotel1.class);
//                    v.getContext().startActivity(intent);

                }
            });
        } else if (array2List.get(position).getHName().equals("hotel2")) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent intent=new Intent(v.getContext(),Hotel2.class);
//                    v.getContext().startActivity(intent);

                }
            });

        }
    }




    @Override
    public int getItemCount() {
        return array2List.size();
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

