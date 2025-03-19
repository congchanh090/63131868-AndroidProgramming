package com.example.loginvd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private Button btnOK;
    private TextView tvHienthi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ View
        edtName = findViewById(R.id.edtName);
        btnOK = findViewById(R.id.btnOK);
        tvHienthi = findViewById(R.id.tvHienthi);

        // Xử lý khi nhấn nút OK
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy dữ liệu từ EditText
                String name = edtName.getText().toString().trim();
                
                    // Hiển thị tên lên TextView
                    tvHienthi.setText("Tên của bạn: " + name);

            }
        });
    }
}