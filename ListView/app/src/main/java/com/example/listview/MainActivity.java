package com.example.listview;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsbaihat;
    ArrayAdapter<String> adapterBaihat;
    ListView lvBaiHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDK();

        dsbaihat = new ArrayList<String>();
        dsbaihat.add("Em của ngày hôm qua");
        dsbaihat.add("Ngày em đẹp nhất");
        dsbaihat.add("Mất kết nối");
        dsbaihat.add("Nơi này có anh");
        dsbaihat.add("Ghé qua");
        dsbaihat.add("Cơn mưa tình yêu");
        dsbaihat.add("Wrong time");
        dsbaihat.add("Say yes");
        dsbaihat.add("Hẹn em ở lần yêu thứ hai");
        dsbaihat.add("Phiêu du");
        dsbaihat.add("Lặng");


        adapterBaihat = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsbaihat);

        lvBaiHat.setAdapter(adapterBaihat);

        lvBaiHat.setOnItemClickListener(BoLangNghe);


        //Cách 1:
//        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String tenBaiHat = dsbaihat.get(position);
//                Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + tenBaiHat, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
    void TimDK(){
        lvBaiHat = findViewById(R.id.lvbaihat);
    }




    //Tạo bộ lắng nghe và xử lý sự kiện OnItemClick
    //Cách 2:
    AdapterView.OnItemClickListener BoLangNghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String tenBaiHat = dsbaihat.get(position);
            Toast.makeText(MainActivity.this, "Bạn vừa chọn: " + tenBaiHat, Toast.LENGTH_SHORT).show();
        }
    };

}