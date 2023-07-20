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

public class Heritage extends AppCompatActivity {
    SearchView searchView;
    RecyclerView recyclerView;
    ArrayList<HeritageModel> searchList=new ArrayList<>();
    ArrayList<HeritageModel> arrayList=new ArrayList<>();

//    ArrayList<HeritageModel> search1List=new ArrayList<>();
//    ArrayList<HeritageModel> array1List=new ArrayList<>();

    ArrayList<HeritageModel> search2List=new ArrayList<>();
    ArrayList<HeritageModel> array2List=new ArrayList<>();

//    ArrayList<HeritageModel> search3List=new ArrayList<>();
//    ArrayList<HeritageModel> array3List=new ArrayList<>();

    ArrayList<HeritageModel> search4List=new ArrayList<>();
    ArrayList<HeritageModel> array4List=new ArrayList<>();

    ArrayList<HeritageModel> search5List=new ArrayList<>();
    ArrayList<HeritageModel> array5List=new ArrayList<>();

    ArrayList<HeritageModel> search6List=new ArrayList<>();
    ArrayList<HeritageModel> array6List=new ArrayList<>();

    ArrayList<HeritageModel> search7List=new ArrayList<>();
    ArrayList<HeritageModel> array7List=new ArrayList<>();

    String[] hotel = new String[]{"Humayun’s Tomb","Mysore Palace","Hatu Mata Temple","Hampi","Rashtrapati Niwas","Qutub Minar","Thiksey Monastery"};
    String[] loc = new String[]{"Nizamuddin East","Mysore","Narkanda","Hampi","Shimla","Mehrauli","Thiksey"};
    int[] imgList = new int[]{R.drawable.humayuns_tomb,R.drawable.mysore_palace,R.drawable.hatu_temple,R.drawable.hampi,
            R.drawable.rashtrapati_niwas,R.drawable.qutub_minar,R.drawable.thiksey_monastery};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heritage);
        recyclerView=findViewById(R.id.recyclerView1);
        searchView = findViewById(R.id.searchView1);

        for(int i =0 ; i<hotel.length;i++){
            HeritageModel heritageModel=new HeritageModel();
            heritageModel.setHName(hotel[i]);
            heritageModel.setHLoc(loc[i]);
            heritageModel.setImg(imgList[i]);
            arrayList.add(heritageModel);
        }

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
        recyclerView.setLayoutManager(layoutManager);

        HeritageAdapter HeritageAdapter=new HeritageAdapter(Heritage.this,arrayList);
        recyclerView.setAdapter(HeritageAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchList = new ArrayList<>();

                if(query.length()>0){
                    for(int i=0;i<arrayList.size();i++){
                        if(arrayList.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                            HeritageModel heritageModel=new HeritageModel();
                            heritageModel.setHName(arrayList.get(i).getHName());
                            heritageModel.setHLoc(arrayList.get(i).getHLoc());
                            heritageModel.setImg(arrayList.get(i).getImg());
                            searchList.add(heritageModel);
                        }
                    }

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                    recyclerView.setLayoutManager(layoutManager);

                    HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,searchList);
                    recyclerView.setAdapter(heritageAdapter);

                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList = new ArrayList<>();

                if(newText.length()>0){
                    for(int i=0;i<arrayList.size();i++){
                        if(arrayList.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || arrayList.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                            HeritageModel heritageModel=new HeritageModel();
                            heritageModel.setHName(arrayList.get(i).getHName());
                            heritageModel.setHLoc(arrayList.get(i).getHLoc());
                            heritageModel.setImg(arrayList.get(i).getImg());
                            searchList.add(heritageModel);
                        }
                    }

                    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                    recyclerView.setLayoutManager(layoutManager);

                    HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,searchList);
                    recyclerView.setAdapter(heritageAdapter);

                }
                return false;
            }
        });




        String[] type = new String[]{"Bihar","Delhi","Himachal Pradesh","Karnataka","Ladakh"};

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.spinner,type);

        AutoCompleteTextView autoCompleteTextView=findViewById(R.id.dropDown);
        autoCompleteTextView.setAdapter(adapter);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select = autoCompleteTextView.getText().toString();




                if(select.equals("Bihar")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search2List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(array2List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array2List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array2List.get(i).getHName());
                                        heritageModel.setHLoc(array2List.get(i).getHLoc());
                                        heritageModel.setImg(array2List.get(i).getImg());
                                        search2List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search2List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search2List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array2List.size();i++){
                                    if(array2List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array2List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array2List.get(i).getHName());
                                        heritageModel.setHLoc(array2List.get(i).getHLoc());
                                        heritageModel.setImg(array2List.get(i).getImg());
                                        search2List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search2List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Patna Sahib","Mahabodhi Temple","Ruins of Nalanda University","Sher Shah Suri Tomb","Vikramshila Ruins","Ghora Katora"};
                    String[] loc = new String[]{"Patna","Bodh Gaya","Baragaon, Nalanda","Sasaram","Bhagalpur","Rajgir"};
                    int[] imgList = new int[]{R.drawable.gurudwara_patna_sahib,R.drawable.mahabodhi,R.drawable.rajgir,
                            R.drawable.tomb,R.drawable.vikramshila,R.drawable.nalanda};

                    for(int i =0 ; i<hotel.length;i++){
                        HeritageModel heritageModel=new HeritageModel();
                        heritageModel.setHName(hotel[i]);
                        heritageModel.setHLoc(loc[i]);
                        heritageModel.setImg(imgList[i]);
                        array2List.add(heritageModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Heritage.this);
                    recyclerView.setLayoutManager(layoutManager);

                    HeritageAdapter heritageAdapter = new HeritageAdapter(Heritage.this, array2List);
                    recyclerView.setAdapter(heritageAdapter);
                }


                if(select.equals("Delhi")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search4List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array4List.size();i++){
                                    if(array4List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array4List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array4List.get(i).getHName());
                                        heritageModel.setHLoc(array4List.get(i).getHLoc());
                                        heritageModel.setImg(array4List.get(i).getImg());
                                        search4List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search4List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search4List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array4List.size();i++){
                                    if(array4List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array4List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array4List.get(i).getHName());
                                        heritageModel.setHLoc(array4List.get(i).getHLoc());
                                        heritageModel.setImg(array4List.get(i).getImg());
                                        search4List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search4List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Agrasen ki Baoli","Humayun’s Tomb","India Gate","Jama Masjid","Jantar Mantar","Lodhi Garden","Qutub Minar","Red Fort","Safdarjung Tomb"};
                    String[] loc = new String[]{"Connaught Place","Nizamuddin East","Rajpath","Chandni Chowk","Connaught Place","Lodhi Road","Mehrauli","Chandni Chowk","Safdarjung Airport"};
                    int[] imgList = new int[]{R.drawable.agrasen_ki_baoli,R.drawable.humayuns_tomb,R.drawable.india_gate,R.drawable.jama_masjid,
                            R.drawable.jantar_mantar,R.drawable.lodhi_gardens,R.drawable.qutub_minar,R.drawable.red_fort,
                            R.drawable.safdarjung_tomb};

                    for(int i =0 ; i<hotel.length;i++){
                        HeritageModel heritageModel=new HeritageModel();
                        heritageModel.setHName(hotel[i]);
                        heritageModel.setHLoc(loc[i]);
                        heritageModel.setImg(imgList[i]);
                        array4List.add(heritageModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Heritage.this);
                    recyclerView.setLayoutManager(layoutManager);

                    HeritageAdapter heritageAdapter = new HeritageAdapter(Heritage.this, array4List);
                    recyclerView.setAdapter(heritageAdapter);
                }

                if(select.equals("Ladakh")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search5List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(array5List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array5List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array5List.get(i).getHName());
                                        heritageModel.setHLoc(array5List.get(i).getHLoc());
                                        heritageModel.setImg(array5List.get(i).getImg());
                                        search5List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search5List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search5List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array5List.size();i++){
                                    if(array5List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array5List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array5List.get(i).getHName());
                                        heritageModel.setHLoc(array5List.get(i).getHLoc());
                                        heritageModel.setImg(array5List.get(i).getImg());
                                        search5List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search5List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Thiksey Monastery","The Corner Grocery Store Shey","Stakna Gompa","Leh Palace","Likir Gompa","The Lamayuru Monastery","Diskit Gompa","Basgo gompa","Alchi Monastery - Choskhor"};
                    String[] loc = new String[]{"Thiksey","Monastery in Shey","Monastery in Stakna","Leh","Monastery in Likir","Monastery in Lamayuru","Monastery in Diskit","Monastery in Basgo","Monastery in Alchi"};
                    int[] imgList = new int[]{R.drawable.thiksey_monastery,R.drawable.shey_palace_and_monastery,R.drawable.stakna_monastery,R.drawable.leh_palace,
                            R.drawable.likir_monastery,R.drawable.lamayuru_monastery,R.drawable.diskit_monastery,R.drawable.basgo_monastery_and_ruins, R.drawable.alchi_monastery};

                    for(int i =0 ; i<hotel.length;i++){
                        HeritageModel heritageModel=new HeritageModel();
                        heritageModel.setHName(hotel[i]);
                        heritageModel.setHLoc(loc[i]);
                        heritageModel.setImg(imgList[i]);
                        array5List.add(heritageModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Heritage.this);
                    recyclerView.setLayoutManager(layoutManager);

                    HeritageAdapter heritageAdapter = new HeritageAdapter(Heritage.this, array5List);
                    recyclerView.setAdapter(heritageAdapter);
                }

                if(select.equals("Himachal Pradesh")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search6List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array6List.size();i++){
                                    if(array6List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array6List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array6List.get(i).getHName());
                                        heritageModel.setHLoc(array6List.get(i).getHLoc());
                                        heritageModel.setImg(array6List.get(i).getImg());
                                        search6List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search6List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search6List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array6List.size();i++){
                                    if(array6List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array6List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array6List.get(i).getHName());
                                        heritageModel.setHLoc(array6List.get(i).getHLoc());
                                        heritageModel.setImg(array6List.get(i).getImg());
                                        search6List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search6List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Shri Bhima Kali Ji Temple","Christ Church","Hatu Mata Temple","Kee Monastery","Kuthachal Village","Masroor Rock Cut Temple","Rashtrapati Niwas","Tabo Monastery"};
                    String[] loc = new String[]{"Sarahan","Shimla","Narkanda","village of Kibber","Himachal","Kangra","Shimla","Tabo"};
                    int[] imgList = new int[]{R.drawable.bhimakali_temple,R.drawable.christ_church,R.drawable.hatu_temple,
                            R.drawable.key_monastery,R.drawable.kuthachal_village,R.drawable.masroor_rock_cut_temples,R.drawable.rashtrapati_niwas,
                            R.drawable.tabo_monastery};

                    for(int i =0 ; i<hotel.length;i++){
                        HeritageModel heritageModel=new HeritageModel();
                        heritageModel.setHName(hotel[i]);
                        heritageModel.setHLoc(loc[i]);
                        heritageModel.setImg(imgList[i]);
                        array6List.add(heritageModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Heritage.this);
                    recyclerView.setLayoutManager(layoutManager);

                    HeritageAdapter heritageAdapter = new HeritageAdapter(Heritage.this, array6List);
                    recyclerView.setAdapter(heritageAdapter);
                }

                if(select.equals("Karnataka")){



                    searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                        @Override
                        public boolean onQueryTextSubmit(String query) {
                            search7List = new ArrayList<>();

                            if(query.length()>0){
                                for(int i=0;i<array7List.size();i++){
                                    if(array7List.get(i).getHName().toUpperCase().contains(query.toUpperCase()) || array7List.get(i).getHLoc().toUpperCase().contains(query.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array7List.get(i).getHName());
                                        heritageModel.setHLoc(array7List.get(i).getHLoc());
                                        heritageModel.setImg(array7List.get(i).getImg());
                                        search7List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search7List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }

                        @Override
                        public boolean onQueryTextChange(String newText) {
                            search7List = new ArrayList<>();

                            if(newText.length()>0){
                                for(int i=0;i<array7List.size();i++){
                                    if(array7List.get(i).getHName().toUpperCase().contains(newText.toUpperCase()) || array7List.get(i).getHLoc().toUpperCase().contains(newText.toUpperCase())){
                                        HeritageModel heritageModel=new HeritageModel();
                                        heritageModel.setHName(array7List.get(i).getHName());
                                        heritageModel.setHLoc(array7List.get(i).getHLoc());
                                        heritageModel.setImg(array7List.get(i).getImg());
                                        search7List.add(heritageModel);
                                    }
                                }

                                RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Heritage.this);
                                recyclerView.setLayoutManager(layoutManager);

                                HeritageAdapter heritageAdapter=new HeritageAdapter(Heritage.this,search7List);
                                recyclerView.setAdapter(heritageAdapter);

                            }
                            return false;
                        }
                    });



                    String[] hotel = new String[]{"Mysore Palace","Hampi","Shri Durga Temple Complex","Chitradurga Fort","Gol Gumbaz","Pattadakal","The Bidar Fort"};
                    String[] loc = new String[]{"Mysore","Hampi","Aihole","Chitradurga","Vijayapura","Bagalkot","Bidar"};
                    int[] imgList = new int[]{R.drawable.mysore_palace,R.drawable.hampi,R.drawable.aihole,R.drawable.chitradurga_fort,
                            R.drawable.gol_gumbaz,R.drawable.pattadakal,R.drawable.srirangapatna,R.drawable.bidar_fort};

                    for(int i =0 ; i<hotel.length;i++){
                        HeritageModel heritageModel=new HeritageModel();
                        heritageModel.setHName(hotel[i]);
                        heritageModel.setHLoc(loc[i]);
                        heritageModel.setImg(imgList[i]);
                        array7List.add(heritageModel);
                    }
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Heritage.this);
                    recyclerView.setLayoutManager(layoutManager);

                    HeritageAdapter heritageAdapter = new HeritageAdapter(Heritage.this, array7List);
                    recyclerView.setAdapter(heritageAdapter);
                }
            }
        });



    }

}