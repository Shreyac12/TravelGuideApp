package com.example.travelguideapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HotelDetails extends AppCompatActivity {

    TextView name,description,website,location,direction,phone_no,address_;
    ImageView image;
//    FirebaseDatabase firebaseDatabase;
    DatabaseReference myRef, myRef1 , myRef2;

    int get_Image;

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    String selectedResort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_details);
        name = findViewById(R.id.name);
        description = findViewById(R.id.description);
        website = findViewById(R.id.website);
        location = findViewById(R.id.location);
        image = findViewById(R.id.imageView);
        direction=findViewById(R.id.direction);
        phone_no = findViewById(R.id.number);
        address_ = findViewById(R.id.address);

        get_Image = getIntent().getIntExtra("image", 0);


//        firebaseDatabase = FirebaseDatabase.getInstance();
//        String selectedResort = getIntent().getStringExtra("name");
        selectedResort = getIntent().getStringExtra("name");
        if (selectedResort != null) {
            if (selectedResort.equals("Araku Haritha Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Andhra").child("Araku");
                image.setImageResource(get_Image);
            } else if (selectedResort.equals("Aalankritha Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Andhra").child("Aalankritha");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Dindi valley")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Andhra").child("Dindi");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Golkonda Resorts and Spa")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Andhra").child("Golkonda");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Palm Beach Hotel and Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Andhra").child("Palm Beach");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Punnami Vihar Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Andhra").child("Punnami Vihar");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Chanakya Inn Patna")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Bihar").child("Chanakya");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Hotel Bodh Vilas")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Bihar").child("Bodh Vilas");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Gargee Gautam Vihar Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Bihar").child("Gargee");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Hotel Nalanda Regency")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Bihar").child("Nalanda");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Panache Hotel and Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Bihar").child("Panache");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Rajgir Residency Hotel")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Bihar").child("Rajgir");
                image.setImageResource(get_Image);
            }
//           ___________________Delhi ____________________________________________
            else if (selectedResort.equals("Botanix Nature Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Delhi").child("Botanix");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Grand New Delhi")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Delhi").child("Grand");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Lalit New Delhi")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Delhi").child("Lalit");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Suryaa New Delhi")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Delhi").child("Suryaa");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Umrao")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Delhi").child("Umrao");
                image.setImageResource(get_Image);
            }
            
//      ______________________________GOA_______________________________________________

            else if (selectedResort.equals("Alila Diwa Goa")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Goa").child("Alila");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Cidade de Goa")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Goa").child("Cidade");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Park Hyatt Goa Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Goa").child("Park Hyatt");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Radisson Blu Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Goa").child("Radisson");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Taj Exotica Resort & Spa")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Goa").child("Taj Exotica");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("W Goa")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Goa").child("W");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Zuri White Sands")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Goa").child("Zuri");
                image.setImageResource(get_Image);


//   __________________________Himachal______________________________________________________________


            }else if (selectedResort.equals("Ananda In The Himalayas")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Ananda");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Chalets Naldehra")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Chalets");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Fortune Select Forest Hill")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Fortune");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Club Mahindra Resort")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Mahindra");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Lamrin Norwood Green")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Norwood");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Oberoi Cecil")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Oberoi Cecil");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Span Resort & Spa")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Span");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("The Himalayan")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("The Himalayan");
                image.setImageResource(get_Image);
            }else if (selectedResort.equals("Wildflower Hall")) {
                myRef = firebaseDatabase.getReference().child("a_resort").child("Himachal").child("Wildflower");
                image.setImageResource(get_Image);
            }
            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                    String resname = dataSnapshot.child("resort_name").getValue(String.class);
                    String descriptionValue = dataSnapshot.child("description").getValue(String.class);
                    String loc = dataSnapshot.child("location").getValue(String.class);
                    String webs = dataSnapshot.child("website").getValue(String.class);
                    String phone = dataSnapshot.child("phno").getValue(String.class);
                    String address = dataSnapshot.child("address").getValue(String.class);
                    name.setText(resname);
                    description.setText(descriptionValue);
                    location.setText(loc);
                    phone_no.setText(phone);
                    address_.setText(address);
                    website.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webs));
                            startActivity(intent);
                        }
                    });
                    website.setMovementMethod(LinkMovementMethod.getInstance());
                    Linkify.addLinks(website, Linkify.WEB_URLS);
                }


//


                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }

    }

        public void directions(View view){
            Intent intent = new Intent(HotelDetails.this,Map.class);
            intent.putExtra("map",selectedResort);
            startActivity(intent);
        }
        public void payments(View view){
        Intent intent = new Intent(HotelDetails.this,Book.class);
        String selected = getIntent().getStringExtra("name");
        if(selected.equals("Araku Haritha Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Aalankritha Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Dindi valley")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Golkonda Resorts and Spa")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("The Palm Beach Hotel and Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Punnami Vihar Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Chanakya Inn Patna")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Hotel Bodh Vilas")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Gargee Gautam Vihar Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("Hotel Nalanda Regency")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("The Panache Hotel and Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedResort);
        }else if(selected.equals("The Rajgir Residency Hotel")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }
//        ___________________________Delhi_____________________________________
        else if(selected.equals("Botanix Nature Resort")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Grand New Delhi")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Lalit New Delhi")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Suryaa New Delhi")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Umrao")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }

//        __________________________________GOA__________________________________
        else if(selected.equals("Alila Diwa Goa")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Cidade de Goa")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Park Hyatt Goa Resort")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Radisson Blu Resort")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Taj Exotica Resort & Spa")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("W Goa")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Zuri White Sands")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }
//  __________________________HIMACHAL__________________________________


        else if(selected.equals("Ananda In The Himalayas")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Chalets Naldehra")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Fortune Select Forest Hill")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Club Mahindra Resort")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Lamrin Norwood Green")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Oberoi Cecil")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Span Resort & Spa")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Himalayan")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Wildflower Hall")){
            intent.putExtra("resortName",selectedResort);
            intent.putExtra("picture",get_Image);
        }

        startActivity(intent);
        }
    }
