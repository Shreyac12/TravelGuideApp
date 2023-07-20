package com.example.travelguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gmap;
    FrameLayout map;
    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        map = findViewById(R.id.maps);
        selected = getIntent().getStringExtra("map");

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this::onMapReady);

    }

    public void onMapReady(GoogleMap googleMap) {

        this.gmap = googleMap;
        if (selected.equals("Aalankritha Resort")){
            LatLng mapIndia = new LatLng(17.572438726162957, 78.55715142176983);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Aalankrita Resort And Convention, Thumkunta Village, Shamirpet, Secunderabad, Telangana, India"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        } else if (selected.equals("Araku Haritha Resort")){
            LatLng mapIndia = new LatLng(18.320302435233227, 82.88552775681988);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Araku Haritha Valley Resort, Araku, Opp. Araku Police Station, Visakhapatnam, Main Road, Araku Valley, Andhra Pradesh 531151"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        } else if (selected.equals("Dindi valley")){
            LatLng mapIndia = new LatLng(16.446692409549446, 81.78440993961507);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Dindi resorts, CQWM+MQF, Palakollu, Elamanchili, Andhra Pradesh"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("Golkonda Resorts and Spa")){
            LatLng mapIndia = new LatLng(17.389523958077785, 78.31628435905982);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("The Golkonda Resorts & Spa, Sagar Mahal Complex, near Osman Sagar Lake, Gandipet, Telangana 500075"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("The Palm Beach Hotel and Resort")){
            LatLng mapIndia = new LatLng(17.720825128802563, 83.33591028021829);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Palm Beach Hotel, Beach Road Near Vuda Park, Visakhapatnam, Andhra Pradesh 530023"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("Punnami Vihar Resort")){
            LatLng mapIndia = new LatLng(17.77895141645163, 83.38544225657988);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Punnami Rushikonda, Bheemili Road, Beach Path, Rushikonda, Visakhapatnam, Andhra Pradesh 530045"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }
//        _______________Bihar___________________________
        else if (selected.equals("Chanakya Inn Patna")){
            LatLng mapIndia = new LatLng(25.601138422283878, 85.13846101631911);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Chanakya Inn Patna, Hari Om Tower Plot no 21, Karbigahiya Road, Jn, behind Patna, New Karbigahiya, Patna, Bihar 800001"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("Hotel Bodh Vilas")){
            LatLng mapIndia = new LatLng(24.706691141237194, 84.97958208487445);// these two coordinate u change as per ur location, in google ull get the coordinate. search like coordinate for mangalore
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Hotel Bodh Vilas, Latika Rd, Bodh Gaya, Bihar 824231"));//here put place name
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("Gargee Gautam Vihar Resort")){
            LatLng mapIndia = new LatLng(25.02910768528661, 85.41663473959666);
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Gargee Gautam Vihar Resort, Rajgir, Bunglow No 1, Rajgir, Bihar 803116"));
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("Hotel Nalanda Regency")){
            LatLng mapIndia = new LatLng(25.02744027889551, 85.41680608431656);
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Hotel Nalanda Regency, Rajgir, Bihar 803116"));
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("The Panache Hotel and Resort")){
            LatLng mapIndia = new LatLng(25.615257196947486, 85.14393467773523);
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Hotel The Panache, West of Ram Gulam Chowk, South Gandhi Maidan, Raja Ji Salai, Dujra Diara, Patna, Bihar 800001"));
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("The Rajgir Residency Hotel")){
            LatLng mapIndia = new LatLng(25.02744027889551, 85.41680608431656);//should change
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Hotel Nalanda Regency, Rajgir, Bihar 803116"));
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }
       else if (selected.equals("Patna Sahib")){
                LatLng mapIndia = new LatLng(25.596197431747434, 85.23017903181018);//should change
                this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Patna Sahib, Jhauganj, Hajiganj, Patna, Bihar 800008"));
                this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
            }
        else if (selected.equals("Humayun's Tomb")){
            LatLng mapIndia = new LatLng(28.59328506215019, 77.25074908386452);//should change
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Humayun’s Tomb, Hazrat Nizamuddin Aulia Dargah, Mathura Rd, Nizamuddin, Nizamuddin East, New Delhi, Delhi 110013"));
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }else if (selected.equals("Mysore Place")){
            LatLng mapIndia = new LatLng(28.59328506215019, 77.25074908386452);//should change
            this.gmap.addMarker(new MarkerOptions().position(mapIndia).title("Mysore Palace, Sayyaji Rao Rd, Agrahara, Chamrajpura, Mysuru, Karnataka 570001"));
            this.gmap.moveCamera(CameraUpdateFactory.newLatLng(mapIndia));
        }
    }
}