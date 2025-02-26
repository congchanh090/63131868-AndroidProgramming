package com.example.appdoidonvi;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText inputValue;
    Spinner fromUnit, toUnit;
    Button convertButton;
    TextView resultView;

    String[] units = {"Meter (m)", "Kilometer (km)", "Centimeter (cm)", "Millimeter (mm)", "Inch (in)", "Foot (ft)", "Yard (yd)", "Mile (mile)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValue = findViewById(R.id.inputValue);
        fromUnit = findViewById(R.id.fromUnit);
        toUnit = findViewById(R.id.toUnit);
        convertButton = findViewById(R.id.convertButton);
        resultView = findViewById(R.id.resultView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, units);
        fromUnit.setAdapter(adapter);
        toUnit.setAdapter(adapter);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertLength();
            }
        });
    }

    private void convertLength() {
        String inputText = inputValue.getText().toString();
        if (inputText.isEmpty()) {
            resultView.setText("Please enter a value");
            return;
        }
        double input = Double.parseDouble(inputText);
        int fromIndex = fromUnit.getSelectedItemPosition();
        int toIndex = toUnit.getSelectedItemPosition();
        double meters = convertToMeters(input, fromIndex);
        double result = convertFromMeters(meters, toIndex);
        resultView.setText(String.format("%.4f", result));
    }

    private double convertToMeters(double value, int fromIndex) {
        double[] conversionFactors = {1, 1000, 0.01, 0.001, 0.0254, 0.3048, 0.9144, 1609.34};
        return value * conversionFactors[fromIndex];
    }

    private double convertFromMeters(double meters, int toIndex) {
        double[] conversionFactors = {1, 0.001, 100, 1000, 39.3701, 3.28084, 1.09361, 0.000621371};
        return meters * conversionFactors[toIndex];
    }
}