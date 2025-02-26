package com.example.apptinhchuvidientichhcn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText sideA, sideB, sideC;
    EditText length, width;
    Button calculateTriangleButton, calculateRectangleButton;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sideA = findViewById(R.id.sideA);
        sideB = findViewById(R.id.sideB);
        sideC = findViewById(R.id.sideC);
        length = findViewById(R.id.length);
        width = findViewById(R.id.width);
        calculateTriangleButton = findViewById(R.id.calculateTriangleButton);
        calculateRectangleButton = findViewById(R.id.calculateRectangleButton);
        resultView = findViewById(R.id.resultView);

        calculateTriangleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTriangle();
            }
        });

        calculateRectangleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateRectangle();
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

    private void calculateRectangle() {
        String lengthText = length.getText().toString();
        String widthText = width.getText().toString();

        if (lengthText.isEmpty() || widthText.isEmpty()) {
            resultView.setText("Vui lòng nhập chiều dài và chiều rộng");
            return;
        }

        double l = Double.parseDouble(lengthText);
        double w = Double.parseDouble(widthText);

        double perimeter = 2 * (l + w);
        double area = l * w;

        resultView.setText("Chu vi: " + String.format("%.2f", perimeter) + "\nDiện tích: " + String.format("%.2f", area));
    }
}