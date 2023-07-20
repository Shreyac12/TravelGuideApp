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

public class ResortAdapter extends RecyclerView.Adapter<ResortAdapter.MyHolder> {

    Context context;
    ArrayList<ResortModel> arrayList;
    LayoutInflater layoutInflater;
    CardView cardView;

    public ResortAdapter(Context context, ArrayList<ResortModel> arrayList ) {
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
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);

                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });
        } else if (arrayList.get(position).getHName().equals("Araku Haritha Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
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
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
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
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
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
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
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
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Chanakya Inn Patna")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }
        else if (arrayList.get(position).getHName().equals("Hotel Bodh Vilas")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Gargee Gautam Vihar Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Hotel Nalanda Regency")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Panache Hotel and Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Rajgir Residency Hotel")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }

// ________________________       Delhi    ___________________________________________________


        else if (arrayList.get(position).getHName().equals("Botanix Nature Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Grand New Delhi")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Lalit New Delhi")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Suryaa New Delhi")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Umrao")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }

//   _________________    Goa    __________________________________________

        else if (arrayList.get(position).getHName().equals("Alila Diwa Goa")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Cidade de Goa")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Park Hyatt Goa Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Radisson Blu Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Taj Exotica Resort & Spa")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("W Goa")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Zuri White Sands")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }

//    ____________________    Himachal    _________________________________________


        else if (arrayList.get(position).getHName().equals("Ananda In The Himalayas")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Chalets Naldehra")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Fortune Select Forest Hill")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Club Mahindra Resort")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Lamrin Norwood Green")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Oberoi Cecil")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Span Resort & Spa")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Himalayan")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("Wildflower Hall")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
                    intent.putExtra("name",arrayList.get(currentPosition).getHName());
                    intent.putExtra("image", arrayList.get(currentPosition).getImg());
                    v.getContext().startActivity(intent);
                }
            });

        }else if (arrayList.get(position).getHName().equals("The Zuri White Sands")) {
            final int currentPosition = position;
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(),HotelDetails.class);
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
