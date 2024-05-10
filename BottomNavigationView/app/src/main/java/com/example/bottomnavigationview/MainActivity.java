package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                        break ;
                    case R.id.action_favorite:
                        Toast.makeText(MainActivity.this,"Favorite",Toast.LENGTH_SHORT).show();
                        break ;
                    case R.id.action_profile:
                        Toast.makeText(MainActivity.this,"Profile",Toast.LENGTH_SHORT).show();
                        break ;
                }
                return true;
            }
        });

    }
}