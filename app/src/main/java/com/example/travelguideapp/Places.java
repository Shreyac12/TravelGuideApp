package com.example.travelguideapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class Places extends AppCompatActivity {

    SearchView searchView;
    RecyclerView recyclerView;
    ArrayList<ResortModel> searchList=new ArrayList<>();
    ArrayList<ResortModel> arrayList=new ArrayList<>();


    String[] hotel = new String[]{"Aalankritha Resort","Gargee Gautam Vihar Resort","Botanix Nature Resort","Alila Diwa Goa","The Chalets Naldehra"};
    String[] loc = new String[]{"Hyderabad","Rajgir","Samalkha","Goa","Naldehra"};
    int[] imgList = new int[]{R.drawable.aalankritha_resort,R.drawable.bihar_resort2,R.drawable.d_hotel1,R.drawable.g_resort2,
            R.drawable.h_resort2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        recyclerView=findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.searchView);

        for(int i =0 ; i<hotel.length;i++){
            ResortModel resortModel=new ResortModel();
            resortModel.setHName(hotel[i]);
            resortModel.setHLoc(loc[i]);
            resortModel.setImg(imgList[i]);
            arrayList.add(resortModel);
        }

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Places.this);
        recyclerView.setLayoutManager(layoutManager);

        ResortAdapter resortAdapter=new ResortAdapter(Places.this,arrayList);
        recyclerView.setAdapter(resortAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchList = new ArrayList<>();

                if(query.length()>0){
                    for(int i=0;i<arrayList.size();i++){
                        if(arrayList.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                            ResortModel resortModel=new ResortModel();
                            resortModel.setHName(arrayList.get(i).getHName());
                            resortModel.setHLoc(arrayList.get(i).getHLoc());
                            resortModel.setImg(arrayList.get(i).getImg());
                            searchList.add(resortModel);
                        }
                    }

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Places.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter=new ResortAdapter(Places.this,searchList);
                    recyclerView.setAdapter(resortAdapter);

                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList = new ArrayList<>();

                if(newText.length()>0){
                    for(int i=0;i<arrayList.size();i++){
                        if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                            ResortModel resortModel=new ResortModel();
                            resortModel.setHName(arrayList.get(i).getHName());
                            resortModel.setHLoc(arrayList.get(i).getHLoc());
                            resortModel.setImg(arrayList.get(i).getImg());
                            searchList.add(resortModel);
                        }
                    }

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Places.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter=new ResortAdapter(Places.this,searchList);
                    recyclerView.setAdapter(resortAdapter);

                }
                return false;
            }
        });


    }

}