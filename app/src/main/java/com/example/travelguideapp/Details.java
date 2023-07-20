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

public class Details extends AppCompatActivity {
    TextView name,description,location,direction,address_;
    ImageView image;
    //
    DatabaseReference myRef;

    int get_Image;

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    String selectedPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        name = findViewById(R.id.name);
        description = findViewById(R.id.description);
        location = findViewById(R.id.location);
        image = findViewById(R.id.imageView);
        direction=findViewById(R.id.direction);
        address_ = findViewById(R.id.address1);

        get_Image = getIntent().getIntExtra("image", 0);

        
        selectedPlace = getIntent().getStringExtra("name");
        if (selectedPlace != null) {
            if (selectedPlace.equals("Araku Haritha Resort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Andhra").child("Araku");
                image.setImageResource(get_Image);
            } else if (selectedPlace.equals("Dindi valley")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Andhra").child("Dindi");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Golkonda Resorts and Spa")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Andhra").child("Golkonda");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("The Palm Beach Hotel and Resort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Andhra").child("Palm Beach");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Punnami Vihar Resort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Andhra").child("Punnami Vihar");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Chanakya Inn Patna")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Chanakya");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Hotel Bodh Vilas")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Bodh Vilas");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Gargee Gautam Vihar Resort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Gargee");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Hotel Nalanda Regency")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Nalanda");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("The Panache Hotel and Resort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Panache");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("The Rajgir Residency Hotel")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Rajgir");
                image.setImageResource(get_Image);
            }
//           ___________________Delhi ____________________________________________
            else if (selectedPlace.equals("Agrasen ki Baoli")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Agrasen");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Humayun’s Tomb")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Humayun");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("India Gate")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("India Gate");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Jantar Mantar")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Jantar");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Lodhi Garden")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Lodhi");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Jama Masjid")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Masjid");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Qutub Minar")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Qutub");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Red Fort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Red");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Safdarjung Tomb")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Delhi").child("Safdarjung");
                image.setImageResource(get_Image);
            }

//      ______________________________GOA_______________________________________________
            else if (selectedPlace.equals("Black Sheep Bistro")) {
                myRef = firebaseDatabase.getReference().child("restaurant").child("Goa").child("Black");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Alila Diwa Goa")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Goa").child("Alila");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Cidade de Goa")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Goa").child("Cidade");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Park Hyatt Goa Resort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Goa").child("Park Hyatt");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Radisson Blu Resort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Goa").child("Radisson");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Taj Exotica Resort & Spa")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Goa").child("Taj Exotica");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("W Goa")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Goa").child("W");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("The Zuri White Sands")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Goa").child("Zuri");
                image.setImageResource(get_Image);


//   __________________________Himachal______________________________________________________________

            }else if (selectedPlace.equals("Shri Bhima Kali Ji Temple")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Bhima");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Christ Church")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Church");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Hatu Mata Temple")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Hatu");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Kee Monastery")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Kee");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Kuthachal Village")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Kuthachal");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Masroor Rock Cut Temple")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Masroor");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Rashtrapati Niwas")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Rashtrapati");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Tabo Monastery")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Himachal").child("Tabo");
                image.setImageResource(get_Image);
            }

//            ________________________Karnataka______________________________________________________________
            else if (selectedPlace.equals("Mysore Palace")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Karnataka").child("Palace");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Hampi")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Karnataka").child("Hampi");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Chitradurga Fort")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Karnataka").child("Chitradurga");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Shri Durga Temple Complex")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Karnataka").child("Aihole");
                image.setImageResource(get_Image);
            }

//_______________________________________Bihar________________________________________________________________
            else if (selectedPlace.equals("Mahabodhi Temple")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Mahabodhi");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Ruins of Nalanda University")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Nalanda");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Patna Sahib")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Sahib");
                image.setImageResource(get_Image);
            }else if (selectedPlace.equals("Sher Shah Suri Tomb")) {
                myRef = firebaseDatabase.getReference().child("heritage").child("Bihar").child("Sher");
                image.setImageResource(get_Image);
            }

            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                    String resname = dataSnapshot.child("name").getValue(String.class);
                    String descriptionValue = dataSnapshot.child("description").getValue(String.class);
                    String loc = dataSnapshot.child("location").getValue(String.class);
                    String address = dataSnapshot.child("address").getValue(String.class);
                    name.setText(resname);
                    description.setText(descriptionValue);
                    location.setText(loc);
                    address_.setText(address);

                }


//


                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }

    }

    public void directions(View view){
        Intent intent = new Intent(Details.this,Map.class);
        intent.putExtra("map",selectedPlace);
        startActivity(intent);
    }
    public void payments(View view){
        Intent intent = new Intent(Details.this,Book.class);
        String selected = getIntent().getStringExtra("name");
        if(selected.equals("Araku Haritha Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("Dindi valley")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("Golkonda Resorts and Spa")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("The Palm Beach Hotel and Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("Punnami Vihar Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }
//   __________________________Bihar__________________________________
        else if(selected.equals("Chanakya Inn Patna")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("Hotel Bodh Vilas")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("Gargee Gautam Vihar Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("Hotel Nalanda Regency")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("The Panache Hotel and Resort")){
            intent.putExtra("picture",get_Image);
            intent.putExtra("resortName",selectedPlace);
        }else if(selected.equals("The Rajgir Residency Hotel")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }
//        ___________________________Delhi_____________________________________
        else if(selected.equals("Botanix Nature Resort")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Grand New Delhi")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Lalit New Delhi")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Suryaa New Delhi")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Umrao")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }

//        __________________________________GOA__________________________________
        else if(selected.equals("Alila Diwa Goa")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Cidade de Goa")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Park Hyatt Goa Resort")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Radisson Blu Resort")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Taj Exotica Resort & Spa")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("W Goa")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Zuri White Sands")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }
//  __________________________HIMACHAL__________________________________


        else if(selected.equals("Ananda In The Himalayas")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Chalets Naldehra")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Fortune Select Forest Hill")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Club Mahindra Resort")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Lamrin Norwood Green")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Oberoi Cecil")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Span Resort & Spa")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("The Himalayan")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }else if(selected.equals("Wildflower Hall")){
            intent.putExtra("resortName",selectedPlace);
            intent.putExtra("picture",get_Image);
        }

        startActivity(intent);
    }
}