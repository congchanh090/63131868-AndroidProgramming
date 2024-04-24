package com.example.vd1_explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
    public void QuayVe(View v){
        Intent iManhinhcHINH  = new Intent(this,SubActivityOne.class) ;
        //thuc hien chuyen
        startActivity (iManhinhcHINH) ;
    }
}