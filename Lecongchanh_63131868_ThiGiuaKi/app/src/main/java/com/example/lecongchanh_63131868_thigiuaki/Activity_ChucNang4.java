package com.example.lecongchanh_63131868_thigiuaki;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Activity_ChucNang4 extends AppCompatActivity {

        UniversityAdapter adapter;
        ArrayList<University> list;
        RecyclerView recyclerViewUniversity;


        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_chuc_nang4);
            //3. Chuẩn bị dữ liệu cho list
            list = new ArrayList<University>();
            list.add(new University("Trường Đại Học Nha Trang", "nhatrang_university"));
            list.add(new University("Trường Đại Học Văn Lang", "vanlang_university"));
            list.add(new University("Trường Đại Học Văn Hiến", "vanhien_university"));
            list.add(new University("Trường Đại Học  Cần Thơ", "cantho_university"));
            //4. Tìm điều khiển Recycler
            recyclerViewUniversity = findViewById(R.id.rVUniversity);
            //5. Tạo layout manager để đặt bố cục cho Recycler
            RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
            recyclerViewUniversity.setLayoutManager(layoutLinear);
            //6. Tạo adapter gắn vào nguồn dữ liệu
            adapter = new UniversityAdapter(this, list);
            //7, Gắn adapter vào Recycler
            recyclerViewUniversity.setAdapter(adapter);
        }

    }
