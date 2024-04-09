package com.example.usingrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter ;
    ArrayList<LandScape> recylerViewDatas ;
    RecyclerView recyclerViewLandscape ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recylerViewDatas = getDataForRecyclerView() ;
        //4
        recyclerViewLandscape = findViewById(R.id.recycleLand) ;
        //5
 //       RecyclerView.LayoutManager layoutLinear  = new LinearLayoutManager(this) ;
        //    recyclerViewLandscape.setLayoutManager(layoutLinear);
     //   RecyclerView.LayoutManager layoutLinearHorizonal  = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) ;
     //   recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);
        RecyclerView.LayoutManager layoutLinearGrid  = new GridLayoutManager(this,2);
        recyclerViewLandscape.setLayoutManager(layoutLinearGrid);
        //6
        landScapeAdapter = new LandScapeAdapter(this,recylerViewDatas) ;
        //7
        recyclerViewLandscape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDULIEU = new ArrayList<LandScape>() ;
        LandScape landScape1 = new LandScape("HaNoi" , "Hà Nội");
        dsDULIEU.add(landScape1) ;
        dsDULIEU.add(new LandScape("Hue" , "Huế")) ;
        return dsDULIEU ;

    }
}