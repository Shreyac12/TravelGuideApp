package com.example.travelguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.MyHolder> {

    private Context context;
    private List<Booking> bookingList;
    private LayoutInflater layoutInflater;
    public BookingAdapter(Context context, List<Booking> bookingList) {
        this.context = context;
        this.bookingList = bookingList;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.history_list, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        Booking booking = bookingList.get(position);
        holder.hotelName.setText(booking.getHotel_name());
        holder.names.setText(booking.getNames());
        holder.room.setText(booking.getGuest());
        holder.duration.setText(booking.getDuration());
        holder.checkIn.setText(booking.getShowCheckIns());
        holder.checkOut.setText(booking.getShowCheckOuts());
        holder.price.setText(booking.getPrices());
        holder.total.setText(booking.getTotals());
    }

    @Override
    public int getItemCount() {
        return bookingList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView room, duration, checkIn, checkOut, price, total,names,hotelName;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            hotelName =itemView.findViewById(R.id.hotelName);
            names = itemView.findViewById(R.id.names);
            room = itemView.findViewById(R.id.room);
            duration = itemView.findViewById(R.id.duration);
            checkIn = itemView.findViewById(R.id.check_in);
            checkOut = itemView.findViewById(R.id.check_out);
            price = itemView.findViewById(R.id.price_p);
            total = itemView.findViewById(R.id.total_p);
        }
    }
}