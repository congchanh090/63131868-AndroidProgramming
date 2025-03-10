package com.example.chuyenmanhinhquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        //nhận intent
        Intent iNhanDuoc = getIntent() ;
        // bóc data
        String strTenDangNhap = iNhanDuoc.getStringExtra("tenDN")  ;
        //xỬ LÝ
        //hiện ra đk textview
        TextView textViewDN = findViewById(R.id.tvUserName) ;;
        textViewDN.setText(strTenDangNhap);
    }
}