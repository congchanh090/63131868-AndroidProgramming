package com.example.vd1_explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //hàm đáp ứng sự kieenj  nhấn nút sang màn hình khác
    // tham số thứ 2 của hàm tạo này , là tên Activity (màn hình ) ta muốn chuyển sang
    public void ChuyenManHinh(View v){
        Intent iManhinhkhac  = new Intent(this,SubActivityOne.class) ;
        //thuc hien chuyen
        startActivity (iManhinhkhac) ;
    }

}