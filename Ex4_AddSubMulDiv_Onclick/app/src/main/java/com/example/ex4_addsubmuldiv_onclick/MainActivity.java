package com.example.ex4_addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    //khai bao cac doi tuong vs dieu khien tuong ung o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong , nutTru , nutNhan,nutChia  ;


    void TimDieuKhien(){
        editTextSo1 =(EditText) findViewById(R.id.edtSo1) ;
        editTextSo2 = (EditText)findViewById(R.id.edtSo2) ;
        editTextKQ = (EditText) findViewById(R.id.btnKetQua) ;
        nutCong = (Button) findViewById(R.id.btnCong) ;
        nutTru = (Button) findViewById(R.id.btnTru) ;
        nutNhan = (Button) findViewById(R.id.btnNhan) ;
        nutChia = (Button) findViewById(R.id.btnChia) ;



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien() ;
    }


    // Xu ly cong
   public void XuLyCong (View v ){
        // code xu ly cong o day
        //lay du lieu 2 so
        //tim edit text so1 va so2


//lay du lieu tu 2 dieu kien do
     String  sothu1 =  editTextSo1.getText().toString() ;
        String  sothu2 =  editTextSo2.getText().toString() ;
//chuyen du lieu
        float soA = Float.parseFloat(sothu1) ;
        float soB = Float.parseFloat(sothu2) ;
//tinh toan
        float Tong = soA + soB ;
//hien kq

   //chuan bi du lieu xuat bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tong) ;
        //gan kq len dk
        editTextKQ.setText(chuoiKQ);
    }
 public    void XuLyTru(View v){
        //code xu ly tru
        //lay du lieu 2 so
        //tim edit text so1 va so2


//lay du lieu tu 2 dieu kien do
        String  sothu1 =  editTextSo1.getText().toString() ;
        String  sothu2 =  editTextSo2.getText().toString() ;
//chuyen du lieu
        float soA = Float.parseFloat(sothu1) ;
        float soB = Float.parseFloat(sothu2) ;
//tinh toan
        float Hieu = soA - soB ;
//hien kq
        //chuan bi du lieu xuat bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Hieu) ;
        //gan kq len dk
        editTextKQ.setText(chuoiKQ);

    }
 public    void XuLyNhan(View v){
        // code xu ly nhan

        //lay du lieu 2 so
        //tim edit text so1 va so2

//lay du lieu tu 2 dieu kien do
        String  sothu1 =  editTextSo1.getText().toString() ;
        String  sothu2 =  editTextSo2.getText().toString() ;
//chuyen du lieu
        float soA = Float.parseFloat(sothu1) ;
        float soB = Float.parseFloat(sothu2) ;
//tinh toan
        float Tich = soA * soB ;
//hien kq
        //chuan bi du lieu xuat bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tich) ;
        //gan kq len dk
        editTextKQ.setText(chuoiKQ);

    }
  public   void XuLyChia(View v){
        // code xu ly chia

        //lay du lieu 2 so
        //tim edit text so1 va so2


//lay du lieu tu 2 dieu kien do
        String  sothu1 =  editTextSo1.getText().toString() ;
        String  sothu2 =  editTextSo2.getText().toString() ;
//chuyen du lieu
        float soA = Float.parseFloat(sothu1) ;
        float soB = Float.parseFloat(sothu2) ;
//tinh toan
        float Thuong = soA / soB ;
//hien kq
        //chuan bi du lieu xuat bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Thuong) ;
        //gan kq len dk
        editTextKQ.setText(chuoiKQ);

    }
}