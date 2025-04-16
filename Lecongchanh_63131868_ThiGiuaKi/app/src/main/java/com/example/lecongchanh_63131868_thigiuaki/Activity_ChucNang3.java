package com.example.lecongchanh_63131868_thigiuaki;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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

public class Activity_ChucNang3 extends AppCompatActivity {

    ArrayList<String> dsmonhoc;
    ArrayAdapter<String> adapterMonhoc;
    ListView lvMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);

        TimDK();
        dsmonhoc = new ArrayList<String>();
        dsmonhoc.add("Lập trình c");
        dsmonhoc.add("Lâp trình java");
        dsmonhoc.add("Phát triển ứng dụng web");
        dsmonhoc.add("Khai phá dữ liệu lớn");
        dsmonhoc.add("Cấu trúc dữ liệu");
        dsmonhoc.add("An minh mạng");

        adapterMonhoc = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsmonhoc) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.BLACK); // Đổi màu chữ thành đen
                return view;
            }
        };

        lvMonHoc.setAdapter(adapterMonhoc);

        lvMonHoc.setOnItemClickListener(BoLangNghe);
    }
    void TimDK() {
        lvMonHoc = findViewById(R.id.lvmonhoc);
    }

    AdapterView.OnItemClickListener BoLangNghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String tenBaiHat = dsmonhoc.get(position);
            Toast.makeText(Activity_ChucNang3.this, "Bạn vừa chọn: " + tenBaiHat, Toast.LENGTH_SHORT).show();
        }
    };

}