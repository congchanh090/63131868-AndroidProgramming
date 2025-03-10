package com.example.chuyenmanhinhquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nutDangNhap ;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nutDangNhap = findViewById(R.id.btnLogin) ;
        nutDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code ở đây
                //1 , tạo mới  intern (ngữ cảnh hiện sử dụng , màn hình chuyển đến (nhận)
                Intent iLogin  = new Intent(MainActivity.this , LoginActivity.class) ;
                //1.1 cú pháp gói dữ liệu
                // iLogin.putExtra(key,value) ;
                //2 goi chuyển lệnh
                startActivity(iLogin);
            }
        });

    }
}