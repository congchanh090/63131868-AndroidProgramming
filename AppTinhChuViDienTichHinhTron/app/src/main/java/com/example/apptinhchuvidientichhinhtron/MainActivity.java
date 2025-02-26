package com.example.apptinhchuvidientichhinhtron;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText radiusInput;
    Button calculateButton;
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiusInput = findViewById(R.id.radiusInput);
        calculateButton = findViewById(R.id.calculateButton);
        resultView = findViewById(R.id.resultView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCircle();
            }
        });
    }

    private void calculateCircle() {
        String radiusText = radiusInput.getText().toString();

        if (radiusText.isEmpty()) {
            resultView.setText("Vui lòng nhập bán kính");
            return;
        }

        double r = Double.parseDouble(radiusText);

        double perimeter = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        resultView.setText("Chu vi: " + String.format("%.2f", perimeter) + "\nDiện tích: " + String.format("%.2f", area));
    }
}
