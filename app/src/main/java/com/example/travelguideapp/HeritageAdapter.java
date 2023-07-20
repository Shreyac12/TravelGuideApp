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

public class HeritageAdapter extends RecyclerView.Adapter<HeritageAdapter.MyHolder> {

    Context context;
    ArrayList<HeritageModel> arrayList;
    LayoutInflater layoutInflater;

    public HeritageAdapter(Context context, ArrayList<HeritageModel> arrayList ) {
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


//_____________________________________Bihar____________________________________________________

        if(arrayList.get(position).getHName().equals("Sher Shah Suri Tomb")){
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
        else if(arrayList.get(position).getHName().equals("Patna Sahib")){
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
        else if(arrayList.get(position).getHName().equals("Mahabodhi Temple")){
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
        else if(arrayList.get(position).getHName().equals("Ruins of Nalanda University")){
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

//   ___________________________________ DELHI________________________________________________

        else if(arrayList.get(position).getHName().equals("Agrasen ki Baoli")){
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
        } else if (arrayList.get(position).getHName().equals("Humayun’s Tomb")) {
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

        } else if (arrayList.get(position).getHName().equals("India Gate")) {
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

        } else if (arrayList.get(position).getHName().equals("Jama Masjid")) {
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

        } else if (arrayList.get(position).getHName().equals("Jantar Mantar")) {
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
        else if (arrayList.get(position).getHName().equals("Lodhi Garden")) {
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

//        _____________________________Himachal__________________________________________

        else if (arrayList.get(position).getHName().equals("Shri Bhima Kali Ji Temple")) {
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
        else if (arrayList.get(position).getHName().equals("Christ Church")) {
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

        }else if (arrayList.get(position).getHName().equals("Hatu Mata Temple")) {
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

        }else if (arrayList.get(position).getHName().equals("Kee Monastery")) {
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

        }else if (arrayList.get(position).getHName().equals("Kuthachal Village")) {
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

        }else if (arrayList.get(position).getHName().equals("Masroor Rock Cut Temple")) {
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

        }else if (arrayList.get(position).getHName().equals("Rashtrapati Niwas")) {
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

        }else if (arrayList.get(position).getHName().equals("Tabo Monastery")) {
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
//        ______________________________Karnataka_______________________________________

        else if (arrayList.get(position).getHName().equals("Mysore Palace")) {
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
        else if (arrayList.get(position).getHName().equals("Hampi")) {
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
        else if (arrayList.get(position).getHName().equals("Shri Durga Temple Complex")) {
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
        else if (arrayList.get(position).getHName().equals("Chitradurga Fort")) {
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
