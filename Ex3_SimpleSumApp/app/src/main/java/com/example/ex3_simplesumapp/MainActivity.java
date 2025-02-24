package com.example.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //gắn layout tương ứng với file này

        setContentView(R.layout.activity_main);
    }
        // Bo lang nghe xu ly xu kien nut tinh tong
        public void XuLyCong(View view){
        // tim tham chieu dieu khien tren tap XML

           EditText editTextSoA =  findViewById(R.id.editA)  ;
            EditText editTextSoB =  findViewById(R.id.editB)  ;
            EditText editTextKetQua =  findViewById(R.id.editKQ)  ;

            //Lay du lieu ve

           String strA =  editTextSoA.getText().toString() ;
            String strB =  editTextSoA.getText().toString() ;

           //chuyen du lieu
           int soA  = Integer.parseInt(strA);
            int soB  = Integer.parseInt(strB);
            //tinh toan
            int tong  =  soA + soB ;
           String strTong = String.valueOf(tong) ;
            //hien ra man hinh

            editTextKetQua.setText(strTong);





        }
}