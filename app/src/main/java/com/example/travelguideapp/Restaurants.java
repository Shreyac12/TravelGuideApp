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


public class Restaurants extends AppCompatActivity {

    SearchView searchView;
    RecyclerView recyclerView;
    ArrayList<RestaurantsModel> searchList=new ArrayList<>();
    ArrayList<RestaurantsModel> arrayList=new ArrayList<>();

    ArrayList<RestaurantsModel> search0List=new ArrayList<>();
    ArrayList<RestaurantsModel> array0List=new ArrayList<>();

    ArrayList<RestaurantsModel> search2List=new ArrayList<>();
    ArrayList<RestaurantsModel> array2List=new ArrayList<>();

//    ArrayList<RestaurantsModel> search3List=new ArrayList<>();
//    ArrayList<RestaurantsModel> array3List=new ArrayList<>();

    ArrayList<RestaurantsModel> search4List=new ArrayList<>();
    ArrayList<RestaurantsModel> array4List=new ArrayList<>();

    ArrayList<RestaurantsModel> search5List=new ArrayList<>();
    ArrayList<RestaurantsModel> array5List=new ArrayList<>();

//    ArrayList<RestaurantsModel> search6List=new ArrayList<>();
//    ArrayList<RestaurantsModel> array6List=new ArrayList<>();

//    ArrayList<RestaurantsModel> search7List=new ArrayList<>();
//    ArrayList<RestaurantsModel> array7List=new ArrayList<>();

    String[] hotel = new String[]{"Abhiruchi","Baans Ghat","SodaBottleOpenerWala","Indian Accent","Black Sheep Bistro","Gunpowder"};
    String[] loc = new String[]{"Maddilapalem","Nalanda","Khan Market","Lodhi Road","In Panjim","In Assagao"};
    int[] imgList = new int[]{R.drawable.res1,R.drawable.res4,R.drawable.res12,R.drawable.res10,
            R.drawable.res13,R.drawable.res15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        recyclerView=findViewById(R.id.recyclerView1);
        searchView = findViewById(R.id.searchView1);

        for(int i =0 ; i<hotel.length;i++){
            RestaurantsModel restaurantsModel=new RestaurantsModel();
            restaurantsModel.setHName(hotel[i]);
            restaurantsModel.setHLoc(loc[i]);
            restaurantsModel.setImg(imgList[i]);
            arrayList.add(restaurantsModel);
        }

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
        recyclerView.setLayoutManager(layoutManager);

        RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,arrayList);
        recyclerView.setAdapter(restaurantsAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchList = new ArrayList<>();

                if(query.length()>0){
                    for(int i=0;i<arrayList.size();i++){
                        if(arrayList.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                            RestaurantsModel restaurantsModel=new RestaurantsModel();
                            restaurantsModel.setHName(arrayList.get(i).getHName());
                            restaurantsModel.setHLoc(arrayList.get(i).getHLoc());
                            restaurantsModel.setImg(arrayList.get(i).getImg());
                            searchList.add(restaurantsModel);
                        }
                    }

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                    recyclerView.setLayoutManager(layoutManager);

                    RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,searchList);
                    recyclerView.setAdapter(restaurantsAdapter);

                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList = new ArrayList<>();

                if(newText.length()>0){
                    for(int i=0;i<arrayList.size();i++){
                        if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                            RestaurantsModel restaurantsModel=new RestaurantsModel();
                            restaurantsModel.setHName(arrayList.get(i).getHName());
                            restaurantsModel.setHLoc(arrayList.get(i).getHLoc());
                            restaurantsModel.setImg(arrayList.get(i).getImg());
                            searchList.add(restaurantsModel);
                        }
                    }

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                    recyclerView.setLayoutManager(layoutManager);

                    RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,searchList);
                    recyclerView.setAdapter(restaurantsAdapter);

                }
                return false;
            }
        });




        String[] type = new String[]{"Andhra Pradesh","Bihar","Delhi","Goa"};

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
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array0List.get(i).getHName());
                                        restaurantsModel.setHLoc(array0List.get(i).getHLoc());
                                        restaurantsModel.setImg(array0List.get(i).getImg());
                                        search0List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search0List);
                                recyclerView.setAdapter(restaurantsAdapter);



                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search0List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array0List.size();i++){
                                    if(array0List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array0List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array0List.get(i).getHName());
                                        restaurantsModel.setHLoc(array0List.get(i).getHLoc());
                                        restaurantsModel.setImg(array0List.get(i).getImg());
                                        search0List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search0List);
                                recyclerView.setAdapter(restaurantsAdapter);

                            }
                            return false;
                        }
                    });
                    searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                        @Override
                        public boolean onClose() {
                            searchView.setQuery("", false);
                            searchView.clearFocus();

                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Restaurants.this);
                            recyclerView.setLayoutManager(layoutManager);

                            RestaurantsAdapter restaurantsAdapter = new RestaurantsAdapter(Restaurants.this, array0List);
                            recyclerView.setAdapter(restaurantsAdapter);

                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Abhiruchi","Mana Amaravathi","Ulavacharu"};
                    String[] loc = new String[]{"Maddilapalem","Vijayawada","Telangana"};
                    int[] imgList = new int[]{R.drawable.res1,R.drawable.res2,R.drawable.res3};

                    for(int i =0 ; i<hotel.length;i++){
                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                        restaurantsModel.setHName(hotel[i]);
                        restaurantsModel.setHLoc(loc[i]);
                        restaurantsModel.setImg(imgList[i]);
                        array0List.add(restaurantsModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Restaurants.this);
                    recyclerView.setLayoutManager(layoutManager);

                    RestaurantsAdapter restaurantsAdapter = new RestaurantsAdapter(Restaurants.this, array0List);
                    recyclerView.setAdapter(restaurantsAdapter);
                }

                if(select.equals("Bihar")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search2List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(array2List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array2List.get(i).getHName());
                                        restaurantsModel.setHLoc(array2List.get(i).getHLoc());
                                        restaurantsModel.setImg(array2List.get(i).getImg());
                                        search2List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search2List);
                                recyclerView.setAdapter(restaurantsAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search2List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array2List.get(i).getHName());
                                        restaurantsModel.setHLoc(array2List.get(i).getHLoc());
                                        restaurantsModel.setImg(array2List.get(i).getImg());
                                        search2List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search2List);
                                recyclerView.setAdapter(restaurantsAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Baans Ghat","Bansi Vihar","Ghar Aangan","The Oven","Raj Rasoi"};
                    String[] loc = new String[]{"Nalanda","Muzaffarpur","Patna","Patna","Patna"};
                    int[] imgList = new int[]{R.drawable.res4,R.drawable.res5,R.drawable.res6,R.drawable.res7,
                            R.drawable.res8};

                    for(int i =0 ; i<hotel.length;i++){
                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                        restaurantsModel.setHName(hotel[i]);
                        restaurantsModel.setHLoc(loc[i]);
                        restaurantsModel.setImg(imgList[i]);
                        array2List.add(restaurantsModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Restaurants.this);
                    recyclerView.setLayoutManager(layoutManager);

                    RestaurantsAdapter restaurantsAdapter = new RestaurantsAdapter(Restaurants.this, array2List);
                    recyclerView.setAdapter(restaurantsAdapter);
                }



                if(select.equals("Delhi")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search4List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array4List.size();i++){
                                    if(array4List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array4List.get(i).getHName());
                                        restaurantsModel.setHLoc(array4List.get(i).getHLoc());
                                        restaurantsModel.setImg(array4List.get(i).getImg());
                                        search4List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search4List);
                                recyclerView.setAdapter(restaurantsAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search4List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array4List.size();i++){
                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array4List.get(i).getHName());
                                        restaurantsModel.setHLoc(array4List.get(i).getHLoc());
                                        restaurantsModel.setImg(array4List.get(i).getImg());
                                        search4List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search4List);
                                recyclerView.setAdapter(restaurantsAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Bukhara","Indian Accent","Karim's","SodaBottleOpenerWala","The Umrao"};
                    String[] loc = new String[]{"ITC Maurya","Lodhi Road","Nizamuddin","Khan Market","Samalkha area"};
                    int[] imgList = new int[]{R.drawable.res9,R.drawable.res10,R.drawable.res11,R.drawable.res12,R.drawable.d_hotel5};

                    for(int i =0 ; i<hotel.length;i++){
                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                        restaurantsModel.setHName(hotel[i]);
                        restaurantsModel.setHLoc(loc[i]);
                        restaurantsModel.setImg(imgList[i]);
                        array4List.add(restaurantsModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Restaurants.this);
                    recyclerView.setLayoutManager(layoutManager);

                    RestaurantsAdapter restaurantsAdapter = new RestaurantsAdapter(Restaurants.this, array4List);
                    recyclerView.setAdapter(restaurantsAdapter);
                }

                if(select.equals("Goa")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search5List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(array5List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array5List.get(i).getHName());
                                        restaurantsModel.setHLoc(array5List.get(i).getHLoc());
                                        restaurantsModel.setImg(array5List.get(i).getImg());
                                        search5List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search5List);
                                recyclerView.setAdapter(restaurantsAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search5List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                                        restaurantsModel.setHName(array5List.get(i).getHName());
                                        restaurantsModel.setHLoc(array5List.get(i).getHLoc());
                                        restaurantsModel.setImg(array5List.get(i).getImg());
                                        search5List.add(restaurantsModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Restaurants.this);
                                recyclerView.setLayoutManager(layoutManager);

                                RestaurantsAdapter restaurantsAdapter=new RestaurantsAdapter(Restaurants.this,search5List);
                                recyclerView.setAdapter(restaurantsAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Black Sheep Bistro","Cafe Chocolatti","Gunpowder","Martin's Corner","A Reverie","W Goa","The Zuri White Sands"};
                    String[] loc = new String[]{"In Panjim","In Panjim","In Assagao","In Betalbatim","In Calangute","Goa","Goa"};
                    int[] imgList = new int[]{R.drawable.res13,R.drawable.res14,R.drawable.res15,R.drawable.res16,R.drawable.res17,R.drawable.g_resort6,R.drawable.g_resort7};

                    for(int i =0 ; i<hotel.length;i++){
                        RestaurantsModel restaurantsModel=new RestaurantsModel();
                        restaurantsModel.setHName(hotel[i]);
                        restaurantsModel.setHLoc(loc[i]);
                        restaurantsModel.setImg(imgList[i]);
                        array5List.add(restaurantsModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Restaurants.this);
                    recyclerView.setLayoutManager(layoutManager);

                    RestaurantsAdapter restaurantsAdapter = new RestaurantsAdapter(Restaurants.this, array5List);
                    recyclerView.setAdapter(restaurantsAdapter);
                }
            }
        });
    }

}