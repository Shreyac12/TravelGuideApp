package com.example.travelguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Aalankritha_Resort extends AppCompatActivity {
    TextView website, direction,alan;
    int get_Image;
    String selectedPlace;
    ImageView image;
    Button booking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aalankritha_resort);
        website = findViewById(R.id.website);
        direction = findViewById(R.id.direction);
        booking = findViewById(R.id.booking);
        alan = findViewById(R.id.alan);
        image = findViewById(R.id.imageView3);
//        get_Image = getIntent().getIntExtra("image", 0);
//        selectedPlace = getIntent().getStringExtra("name");


        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aalankritha_Resort.this,Map.class);
                startActivity(intent);
            }
        });


        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedPlace = alan.getText().toString();

                Intent intent = new Intent(Aalankritha_Resort.this,Book.class);
                intent.putExtra("name",selectedPlace);
                startActivity(intent);
            }
        });


        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aalankrita.com/");
            }
        });
    }
    private void gotoUrl(String s){
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}