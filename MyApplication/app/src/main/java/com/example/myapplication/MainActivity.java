package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNav  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //TIM
        bottomNav = findViewById(R.id.bot_nav) ;
        //LANG NGNHE
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int mnuItemDuocChonID  = item.getItemId() ;
                if(mnuItemDuocChonID == R.id.mnu_home) {
                    //thay frament home
                    Toast.makeText(MainActivity.this, "Thay home", Toast.LENGTH_LONG).show();
                }else if(mnuItemDuocChonID == R.id.mnu_search) {
                    Toast.makeText(MainActivity.this, "Thay search", Toast.LENGTH_LONG).show();
                }else if(mnuItemDuocChonID == R.id.mnu_profile) {
                    Toast.makeText(MainActivity.this, "Thay profile", Toast.LENGTH_LONG).show();
                }else return false;

                return  true ;
            }
        });
    }
}