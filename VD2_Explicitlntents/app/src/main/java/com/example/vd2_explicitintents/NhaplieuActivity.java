package com.example.vd2_explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.PixelCopy;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NhaplieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhaplieu);
    }


    public void Nhap_QuayVe(View v) {
        EditText edHT = (EditText) findViewById(R.id.edHoTen);
        EditText edNS = (EditText) findViewById(R.id.edNamSinh);
        //lay du lieu
        String hoten = edHT.getText().toString();
        int namsinh = Integer.parseInt(edNS.getText().toString());


        //tao moi intent
        Intent iKQnhaplieu = new Intent();
        //dua du lieu vao intent de gui ve
        iKQnhaplieu.putExtra("HT", hoten);
        iKQnhaplieu.putExtra("NS", namsinh);
        setResult(RESULT_OK, iKQnhaplieu);
        finish();
    }

}