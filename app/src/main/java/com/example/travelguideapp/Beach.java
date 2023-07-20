package com.example.travelguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class Beach extends AppCompatActivity {
    SearchView searchView;
    RecyclerView recyclerView;
    ArrayList<ResortModel> searchList=new ArrayList<>();
    ArrayList<ResortModel> arrayList=new ArrayList<>();

    ArrayList<ResortModel> search1List=new ArrayList<>();
    ArrayList<ResortModel> array1List=new ArrayList<>();

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

    String[] hotel = new String[]{"Rishikonda Beach","Son River","Candolim Beach","Beas River","Chandratal Lake","Palolem Beach","Calangute Beach"};
    String[] loc = new String[]{"Visakhapatnam","Bihar","Goa","Himachal","Himachal","Goa","Goa"};
    int[] imgList = new int[]{R.drawable.ar1,R.drawable.son,R.drawable.candolim,R.drawable.beas_river,
            R.drawable.chandratal_lake,R.drawable.palolem,R.drawable.calangute};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach);
        recyclerView=findViewById(R.id.recyclerView1);
        searchView = findViewById(R.id.searchView1);

        for(int i =0 ; i<hotel.length;i++){
            ResortModel resortModel=new ResortModel();
            resortModel.setHName(hotel[i]);
            resortModel.setHLoc(loc[i]);
            resortModel.setImg(imgList[i]);
            arrayList.add(resortModel);
        }

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
        recyclerView.setLayoutManager(layoutManager);

        ResortAdapter resortAdapter=new ResortAdapter(Beach.this,arrayList);
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

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter=new ResortAdapter(Beach.this,searchList);
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

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter=new ResortAdapter(Beach.this,searchList);
                    recyclerView.setAdapter(resortAdapter);

                }
                return false;
            }
        });




        String[] type = new String[]{"Andhra Pradesh","Bihar","Goa","Himachal Pradesh"};

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
                            search1List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array1List.size();i++){
                                    if(array1List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array1List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array1List.get(i).getHName());
                                        resortModel.setHLoc(array1List.get(i).getHLoc());
                                        resortModel.setImg(array1List.get(i).getImg());
                                        search1List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search1List);
                                recyclerView.setAdapter(resortAdapter);



                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search1List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array1List.size();i++){
                                    if(array1List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array1List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array1List.get(i).getHName());
                                        resortModel.setHLoc(array1List.get(i).getHLoc());
                                        resortModel.setImg(array1List.get(i).getImg());
                                        search1List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search1List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });
                    searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                        @Override
                        public boolean onClose() {
                            searchView.setQuery("", false);
                            searchView.clearFocus();

                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Beach.this);
                            recyclerView.setLayoutManager(layoutManager);

                            ResortAdapter resortAdapter = new ResortAdapter(Beach.this, array1List);
                            recyclerView.setAdapter(resortAdapter);

                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Rishikonda Beach","Yarada Beach","Manginapudi Beach","Suryalanka Beach","Krishna River"};
                    String[] loc = new String[]{"Visakhapatnam","Visakhapatnam","Machilipatnam","Guntur district","Kurnool"};
                    int[] imgList = new int[]{R.drawable.ar1,R.drawable.ar2,R.drawable.ar3,R.drawable.ar4, R.drawable.ar5};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array1List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Beach.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Beach.this, array1List);
                    recyclerView.setAdapter(resortAdapter);
                }

                if(select.equals("Bihar")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search2List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(array2List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array2List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array2List.get(i).getHName());
                                        resortModel.setHLoc(array2List.get(i).getHLoc());
                                        resortModel.setImg(array2List.get(i).getImg());
                                        search2List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search2List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search2List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(array2List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array2List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array2List.get(i).getHName());
                                        resortModel.setHLoc(array2List.get(i).getHLoc());
                                        resortModel.setImg(array2List.get(i).getImg());
                                        search2List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search2List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Ganga River","Son River","Kosi River - Sorrow of Bihar","Punpun River"};
                    String[] loc = new String[]{"Ganga","Bihar","Bihar","Jehanabad"};
                    int[] imgList = new int[]{R.drawable.ganga,R.drawable.son,R.drawable.kosi,R.drawable.punpun,};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array2List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Beach.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Beach.this, array2List);
                    recyclerView.setAdapter(resortAdapter);
                }


                if(select.equals("Goa")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search5List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(array5List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array5List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array5List.get(i).getHName());
                                        resortModel.setHLoc(array5List.get(i).getHLoc());
                                        resortModel.setImg(array5List.get(i).getImg());
                                        search5List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search5List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search5List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(array5List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array5List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array5List.get(i).getHName());
                                        resortModel.setHLoc(array5List.get(i).getHLoc());
                                        resortModel.setImg(array5List.get(i).getImg());
                                        search5List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search5List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Candolim Beach","Baga Beach","Palolem Beach","Arambol Beach","Calangute Beach","Anjuna Beach","Agonda Beach"};
                    String[] loc = new String[]{"Goa","Goa","Goa","Goa","Goa","Goa","Goa"};
                    int[] imgList = new int[]{R.drawable.candolim,R.drawable.baga,R.drawable.palolem,R.drawable.arambol,
                            R.drawable.calangute,R.drawable.anjuna,R.drawable.agonda};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array5List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Beach.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Beach.this, array5List);
                    recyclerView.setAdapter(resortAdapter);
                }

                if(select.equals("Himachal Pradesh")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search6List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array6List.size();i++){
                                    if(array6List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array6List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array6List.get(i).getHName());
                                        resortModel.setHLoc(array6List.get(i).getHLoc());
                                        resortModel.setImg(array6List.get(i).getImg());
                                        search6List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search6List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search6List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array6List.size();i++){
                                    if(array6List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array6List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        ResortModel resortModel=new ResortModel();
                                        resortModel.setHName(array6List.get(i).getHName());
                                        resortModel.setHLoc(array6List.get(i).getHLoc());
                                        resortModel.setImg(array6List.get(i).getImg());
                                        search6List.add(resortModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Beach.this);
                                recyclerView.setLayoutManager(layoutManager);

                                ResortAdapter resortAdapter=new ResortAdapter(Beach.this,search6List);
                                recyclerView.setAdapter(resortAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Beas River","Chamba Valley","Chandratal Lake","kullu_valley","manali_beach","mandi","prashar_lake","renuka_lake","rewalsar_lake","solang_valley","suraj_tal_lake"};
                    String[] loc = new String[]{"Himachal","Himachal","Himachal","Himachal","Himachal","Himachal","Himachal","Himachal","Himachal","Himachal","Himachal"};
                    int[] imgList = new int[]{R.drawable.beas_river,R.drawable.chamba_valley,R.drawable.chandratal_lake,R.drawable.kullu_valley,
                            R.drawable.manali_beach,R.drawable.mandi,R.drawable.prashar_lake,R.drawable.renuka_lake,R.drawable.rewalsar_lake,
                            R.drawable.solang_valley,R.drawable.suraj_tal_lake,R.drawable.beach2,R.drawable.beach2,R.drawable.beach2,
                            R.drawable.beach2,R.drawable.beach2};

                    for(int i =0 ; i<hotel.length;i++){
                        ResortModel resortModel=new ResortModel();
                        resortModel.setHName(hotel[i]);
                        resortModel.setHLoc(loc[i]);
                        resortModel.setImg(imgList[i]);
                        array6List.add(resortModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Beach.this);
                    recyclerView.setLayoutManager(layoutManager);

                    ResortAdapter resortAdapter = new ResortAdapter(Beach.this, array6List);
                    recyclerView.setAdapter(resortAdapter);
                }


            }
        });



    }

}