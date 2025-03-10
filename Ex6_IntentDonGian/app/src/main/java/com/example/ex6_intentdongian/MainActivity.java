package com.example.ex6_intentdongian;

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
        setContentView(R.layout.activity_main);

        Button btnChuyen = findViewById(R.id.btnChuyen);

        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenMan = new Intent(MainActivity.this, MH2Activity.class);

                startActivity(chuyenMan);
            }
        });

        Button btnChuyenMan3 = findViewById(R.id.btnChuyenMan3);
        btnChuyenMan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MH3Activity.class);
                startActivity(intent);
            }
        });


    }
}