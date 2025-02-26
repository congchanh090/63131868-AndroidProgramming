package com.example.apptinhchuvidientichtg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText sideA, sideB, sideC;
    Button calculateButton;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sideA = findViewById(R.id.sideA);
        sideB = findViewById(R.id.sideB);
        sideC = findViewById(R.id.sideC);
        calculateButton = findViewById(R.id.calculateButton);
        resultView = findViewById(R.id.resultView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTriangle();
            }
        });
    }

    private void calculateTriangle() {
        String aText = sideA.getText().toString();
        String bText = sideB.getText().toString();
        String cText = sideC.getText().toString();

        if (aText.isEmpty() || bText.isEmpty() || cText.isEmpty()) {
            resultView.setText("Vui lòng nhập đầy đủ 3 cạnh");
            return;
        }

        double a = Double.parseDouble(aText);
        double b = Double.parseDouble(bText);
        double c = Double.parseDouble(cText);

        if (a + b <= c || a + c <= b || b + c <= a) {
            resultView.setText("Ba cạnh không tạo thành tam giác hợp lệ");
            return;
        }

        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        resultView.setText("Chu vi: " + String.format("%.2f", perimeter) + "\nDiện tích: " + String.format("%.2f", area));
    }
}