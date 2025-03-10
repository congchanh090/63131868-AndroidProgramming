package com.example.chuyenmanhinhquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    EditText edTenDangNhap ;
    Button nutXacNhan ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
       nutXacNhan = findViewById(R.id.btnOk)   ;
       edTenDangNhap = findViewById(R.id.edtUserName);
       nutXacNhan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent iQuiz = new Intent(LoginActivity.this , HomeActivity.class) ;
               //Lấy dữ liệu để gói
               String strTenDangNhap = edTenDangNhap.getText().toString() ;
               //gói
               iQuiz.putExtra("tenDN",strTenDangNhap) ;
               //gửi
               startActivity(iQuiz);
           }
       });
    }
}