package com.example.lecongchanh_63131868_thigiuaki;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button btnChuyen = findViewById(R.id.btnChuyen);

        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenMan = new Intent(MainActivity.this, Activity_ChucNang2.class);

                startActivity(chuyenMan);
            }
        });

        Button btnChuyenMan2 = findViewById(R.id.btnChuyenMan2);
        btnChuyenMan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ChucNang3.class);
                startActivity(intent);
            }
        });
        Button btnChuyenMan3 = findViewById(R.id.btnChuyenMan3);
        btnChuyenMan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_ChucNang4.class);
                startActivity(intent);
            }
        });
        Button btnChuyenMan4 = findViewById(R.id.btnChuyenMan4);
        btnChuyenMan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_AboutMe.class);
                startActivity(intent);
            }
        });

        Button btnChuyenMan5 = findViewById(R.id.btnChuyenMan5);
        btnChuyenMan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_LamThem.class);
                startActivity(intent);
            }
        });




    }
}