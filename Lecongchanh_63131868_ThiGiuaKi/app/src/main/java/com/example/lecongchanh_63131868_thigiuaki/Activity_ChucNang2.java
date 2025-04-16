package com.example.lecongchanh_63131868_thigiuaki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_ChucNang2 extends AppCompatActivity {

      EditText editQT, editGK, editCK, editKQ;
    Button btnTB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);

        // Ánh xạ view
        editQT = findViewById(R.id.editQT);
        editGK = findViewById(R.id.editGK);
        editCK = findViewById(R.id.editCK);
        editKQ = findViewById(R.id.editKQ);
        btnTB = findViewById(R.id.btnTB);

        // Xử lý sự kiện bấm nút tính điểm trung bình
        btnTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTB();
            }
        });
    }

    public void XuLyTB() {
        try {
            // Lấy giá trị từ EditText
            double diemQT = Double.parseDouble(editQT.getText().toString());
            double diemGK = Double.parseDouble(editGK.getText().toString());
            double diemCK = Double.parseDouble(editCK.getText().toString());

            // Tính điểm trung bình theo công thức
            double diemTB = (diemQT * 0.2) + (diemGK * 0.3) + (diemCK * 0.5);

            // Hiển thị kết quả
            editKQ.setText(String.format("%.2f", diemTB));
        } catch (NumberFormatException e) {
            editKQ.setText("Lỗi!");
        }
    }
}