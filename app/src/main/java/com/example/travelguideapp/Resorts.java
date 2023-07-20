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


public class Resorts extends AppCompatActivity {

    SearchView searchView;
    RecyclerView recyclerView;
    ArrayList<ResortModel> searchList=new ArrayList<>();
    ArrayList<ResortModel> arrayList=new ArrayList<>();

    ArrayList<ResortModel> search0List=new ArrayList<>();
    ArrayList<ResortModel> array0List=new ArrayList<>();

    ArrayList<ResortModel> search2List=new ArrayList<>();
    ArrayList<ResortModel> array2List=new ArrayList<>();

    ArrayList<ResortModel> search3List=new ArrayList<>();
    ArrayList<ResortModel> array3List=new ArrayList<>();

    ArrayList<ResortModel> search4List=new ArrayList<>();
    ArrayList<ResortModel> array4List=new ArrayList<>();

    ArrayList<ResortModel> search5List=new ArrayList<>();
    ArrayList<ResortModel> array5List=new ArrayList<>();

    ArrayList<ResortModel> search6List=new ArrayList<>();
    ArrayList<ResortModel> array6List=new ArrayList<>();

    ArrayList<ResortModel> search7List=new ArrayList<>();
    ArrayList<ResortModel> array7List=new ArrayList<>();

    String[] hotel = new String[]{"Aalankritha Resort","Gargee Gautam Vihar Resort","Botanix Nature Resort","Alila Diwa Goa","The Chalets Naldehra","Punnami Vihar Resort"};
    String[] loc = new String[]{"Hyderabad","Rajgir","Samalkha","Goa","Naldehra","Araku Valley"};
    int[] imgList = new int[]{R.drawable.aalankritha_resort,R.drawable.bihar_resort2,R.drawable.d_hotel1,R.drawable.g_resort2,
            R.drawable.h_resort2,R.drawable.resort2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resorts);
        recyclerView=findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.searchView);

        for(int i =0 ; i<hotel.length;i++){
            ResortModel resortModel=new ResortModel();
            resortModel.setHName(hotel[i]);
            resortModel.setHLoc(loc[i]);
            resortModel.setImg(imgList[i]);
            arrayList.add(resortModel);
        }

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
        recyclerView.setLayoutManager(layoutManager);

        ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,arrayList);
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

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,searchList);
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

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,searchList);
                    recyclerView.setAdapter(resortAdapter);

                }
                return false;
            }
        });




        String[] type = new String[]{"Andhra Pradesh","Bihar","Delhi","Goa","Himachal Pradesh"};

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.spinner,type);

        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.dropDown);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select = autoCompleteTextView.getText().toString();





                if(select.equals("Andhra Pradesh")){

                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search0List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array0List.size();i++){
                                    if(array0List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array0List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array0List.get(i).getHName());
                                        resortModel.setHLoc(array0List.get(i).getHLoc());
                                        resortModel.setImg(array0List.get(i).getImg());
                                        search0List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search0List);
                                recyclerView.setAdapter(resortAdapter);



                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search0List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array0List.size();i++){
                                    if(array0List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array0List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array0List.get(i).getHName());
                                        resortModel.setHLoc(array0List.get(i).getHLoc());
                                        resortModel.setImg(array0List.get(i).getImg());
                                        search0List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search0List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });
                    searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                        @Override
                        public boolean onClose() {
                            // Clear the search query and display all hotels
                            searchView.setQuery("", false);
                            searchView.clearFocus();

                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Resorts.this);
                            recyclerView.setLayoutManager(layoutManager);

                            ResortAdapter resortAdapter = new ResortAdapter(Resorts.this, array0List);
                            recyclerView.setAdapter(resortAdapter);

                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Aalankritha Resort","Araku Haritha Resort","Dindi valley","Golkonda Resorts and Spa","The Palm Beach Hotel and Resort","Punnami Vihar Resort"};
                    String[] loc = new String[]{"Hyderabad","Hyderabad","Konaseema region","Hyderabad","Visakhapatnam","Araku Valley"};
                    int[] imgList = new int[]{R.drawable.aalankritha_resort,R.drawable.araku,R.drawable.dindi1,R.drawable.oberoi,
                            R.drawable.resort1,R.drawable.resort2};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array0List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Resorts.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Resorts.this, array0List);
                    recyclerView.setAdapter(resortAdapter);
                }

                if(select.equals("Bihar")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search2List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(array2List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array2List.get(i).getHName());
                                        resortModel.setHLoc(array2List.get(i).getHLoc());
                                        resortModel.setImg(array2List.get(i).getImg());
                                        search2List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search2List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search2List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array2List.get(i).getHName());
                                        resortModel.setHLoc(array2List.get(i).getHLoc());
                                        resortModel.setImg(array2List.get(i).getImg());
                                        search2List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search2List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Chanakya Inn Patna","Hotel Bodh Vilas","Gargee Gautam Vihar Resort","Hotel Nalanda Regency","The Panache Hotel and Resort","The Rajgir Residency Hotel"};
                    String[] loc = new String[]{"Patna","Bodh Gaya","Rajgir","Rajgir","Bhagalpur","Rajgir"};
                    int[] imgList = new int[]{R.drawable.bihar_resort7,R.drawable.bihar_resort1,R.drawable.bihar_resort2,R.drawable.bihar_resort3,
                            R.drawable.bihar_resort4,R.drawable.bihar_resort5,R.drawable.bihar_resort6,R.drawable.bihar_resort8};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array2List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Resorts.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Resorts.this, array2List);
                    recyclerView.setAdapter(resortAdapter);
                }


                if(select.equals("Delhi")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search4List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array4List.size();i++){
                                    if(array4List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array4List.get(i).getHName());
                                        resortModel.setHLoc(array4List.get(i).getHLoc());
                                        resortModel.setImg(array4List.get(i).getImg());
                                        search4List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search4List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search4List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array4List.size();i++){
                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array4List.get(i).getHName());
                                        resortModel.setHLoc(array4List.get(i).getHLoc());
                                        resortModel.setImg(array4List.get(i).getImg());
                                        search4List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search4List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Botanix Nature Resort","The Grand New Delhi","The Lalit New Delhi","The Suryaa New Delhi","The Umrao"};
                    String[] loc = new String[]{"Samalkha","Vasant Kunj","Connaught Place","New Friends Colony","Samalkha area"};
                    int[] imgList = new int[]{R.drawable.d_hotel1,R.drawable.d_hotel2,R.drawable.d_hotel3,R.drawable.d_hotel4,R.drawable.d_hotel5};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array4List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Resorts.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Resorts.this, array4List);
                    recyclerView.setAdapter(resortAdapter);
                }

                if(select.equals("Goa")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search5List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(array5List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array5List.get(i).getHName());
                                        resortModel.setHLoc(array5List.get(i).getHLoc());
                                        resortModel.setImg(array5List.get(i).getImg());
                                        search5List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search5List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search5List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array5List.get(i).getHName());
                                        resortModel.setHLoc(array5List.get(i).getHLoc());
                                        resortModel.setImg(array5List.get(i).getImg());
                                        search5List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search5List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Alila Diwa Goa","Cidade de Goa","Park Hyatt Goa Resort","Radisson Blu Resort","Taj Exotica Resort & Spa","W Goa","The Zuri White Sands"};
                    String[] loc = new String[]{"Goa","Goa","Goa","Goa","Goa","Goa","Goa"};
                    int[] imgList = new int[]{R.drawable.g_resort2,R.drawable.g_resort3,R.drawable.g_resort4,R.drawable.g_resort1,R.drawable.g_resort5,R.drawable.g_resort6,R.drawable.g_resort7};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array5List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Resorts.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Resorts.this, array5List);
                    recyclerView.setAdapter(resortAdapter);
                }

                if(select.equals("Himachal Pradesh")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search6List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array6List.size();i++){
                                    if(array6List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array6List.get(i).getHName());
                                        resortModel.setHLoc(array6List.get(i).getHLoc());
                                        resortModel.setImg(array6List.get(i).getImg());
                                        search6List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search6List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search6List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array6List.size();i++){
                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array6List.get(i).getHName());
                                        resortModel.setHLoc(array6List.get(i).getHLoc());
                                        resortModel.setImg(array6List.get(i).getImg());
                                        search6List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search6List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Ananda In The Himalayas","The Chalets Naldehra","Fortune Select Forest Hill","Club Mahindra Resort","Lamrin Norwood Green","The Oberoi Cecil","Span Resort & Spa","The Himalayan","Wildflower Hall"};
                    String[] loc = new String[]{"Shimla","Naldehra","Kasauli","Mashobra","Palampur","Shimla","Kullu","Manali","Shimla"};
                    int[] imgList = new int[]{R.drawable.h_resort1,R.drawable.h_resort2,R.drawable.h_resort3,R.drawable.h_resort5,
                            R.drawable.h_resort6,R.drawable.h_hotel1,R.drawable.h_resort7,R.drawable.h_resort8,R.drawable.h_resort9};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array6List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Resorts.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Resorts.this, array6List);
                    recyclerView.setAdapter(resortAdapter);
                }

//                if(select.equals("Jharkhand")){
//
//
//
//                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//                        @Override
//                        public boolean onQueryTextSubmit(String query) {
//                            search7List = new ArrayList<>();
//
//                            if(query.length()>0){
//                                for(int i=0;i<array7List.size();i++){
//                                    if(array7List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
//                                        ResortModel resortModel=new ResortModel();
//                                        resortModel.setHName(array7List.get(i).getHName());
//                                        resortModel.setHLoc(array7List.get(i).getHLoc());
//                                        resortModel.setImg(array7List.get(i).getImg());
//                                        search7List.add(resortModel);
//                                    }
//                                }
//
//                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
//                                recyclerView.setLayoutManager(layoutManager);
//
//                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search7List);
//                                recyclerView.setAdapter(resortAdapter);
//
//                            }
//                            return false;
//                        }
//
//                        @Override
//                        public boolean onQueryTextChange(String newText) {
//                            search7List = new ArrayList<>();
//
//                            if(newText.length()>0){
//                                for(int i=0;i<array7List.size();i++){
//                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
//                                        ResortModel resortModel=new ResortModel();
//                                        resortModel.setHName(array7List.get(i).getHName());
//                                        resortModel.setHLoc(array7List.get(i).getHLoc());
//                                        resortModel.setImg(array7List.get(i).getImg());
//                                        search7List.add(resortModel);
//                                    }
//                                }
//
//                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Resorts.this);
//                                recyclerView.setLayoutManager(layoutManager);
//
//                                ResortAdapter resortAdapter=new ResortAdapter(Resorts.this,search7List);
//                                recyclerView.setAdapter(resortAdapter);
//
//                            }
//                            return false;
//                        }
//                    });
//
//
//
//                    String[] hotel = new String[]{"hotel1","hotel2","hotel3","hotel4","hotel5","hotel6","hotel7","hotel8","hotel9","hotel0","hotel17","hotel77","hotel47","hotel7","hotel7","hotel7"};
//                    String[] loc = new String[]{"loc1","loc2","loc3","loc4","loc5","loc6","loc7","loc8","loc9","loc0","loc75","loc7","loc7","loc7","loc7","loc7"};
//                    int[] imgList = new int[]{R.drawable.resort3,R.drawable.resort4,R.drawable.resort5,R.drawable.resort6,
//                            R.drawable.beach2,R.drawable.beach2,R.drawable.beach2,R.drawable.beach2,R.drawable.beach2,
//                            R.drawable.beach2,R.drawable.beach2,R.drawable.beach2,R.drawable.beach2,R.drawable.beach2,
//                            R.drawable.beach2,R.drawable.beach2};
//
//                    for(int i =0 ; i<hotel.length;i++){
//                        ResortModel resortModel=new ResortModel();
//                        resortModel.setHName(hotel[i]);
//                        resortModel.setHLoc(loc[i]);
//                        resortModel.setImg(imgList[i]);
//                        array7List.add(resortModel);
//                    }
//                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Resorts.this);
//                    recyclerView.setLayoutManager(layoutManager);
//
//                    ResortAdapter resortAdapter = new ResortAdapter(Resorts.this, array7List);
//                    recyclerView.setAdapter(resortAdapter);
//                }
            }
        });



    }

}