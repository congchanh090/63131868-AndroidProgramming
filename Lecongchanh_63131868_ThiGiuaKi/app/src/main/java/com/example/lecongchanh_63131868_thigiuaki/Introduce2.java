package com.example.lecongchanh_63131868_thigiuaki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Introduce2 extends AppCompatActivity {


    ImageButton btnql, btntt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce2);
        btntt = findViewById(R.id.imbTieptheo2);
        btnql = findViewById(R.id.imbQuayLai2);
        btntt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduce2.this, Introduce3.class);
                startActivity(intent);
            }
        });

        btnql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduce2.this, Introduce1.class);
                startActivity(intent);
            }
        });


    }
}