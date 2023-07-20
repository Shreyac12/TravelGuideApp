package com.example.travelguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    CardView places,resorts,heritage,beach,towns,museums,gallery,restaurants;
    Button logout;
    ImageView profile;
    FirebaseAuth auth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        places = findViewById(R.id.places);
        resorts = findViewById(R.id.resorts);
        beach = findViewById(R.id.beach);
        heritage = findViewById(R.id.heritage);
        towns = findViewById(R.id.towns);
        museums = findViewById(R.id.museums);
        gallery = findViewById(R.id.gallery);
        restaurants=findViewById(R.id.restaurant);
        profile = findViewById(R.id.profile);
        auth=FirebaseAuth.getInstance();
        user = auth.getCurrentUser();


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(user!=null) {
                    String email = user.getEmail();
                    if (email != null) {
                        String username = email.substring(0, email.indexOf("@"));

                        Intent intent = new Intent(MainActivity.this, Profile.class);
                        intent.putExtra("username", username);
                        startActivity(intent);
                    }
                }
            }
        });



        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Places.class);

                startActivity(intent);
            }
        });
        resorts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Resorts.class);
                startActivity(intent);
            }
        });
        beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Beach.class);
                startActivity(intent);
            }
        });
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Restaurants.class);
                startActivity(intent);
            }
        });
        heritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Heritage.class);
                startActivity(intent);
            }
        });
//        towns.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), Cities.class);
//                startActivity(intent);
//            }
//        });
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Museum.class);
                startActivity(intent);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Gallery.class);
                startActivity(intent);
            }
        });

    }
}