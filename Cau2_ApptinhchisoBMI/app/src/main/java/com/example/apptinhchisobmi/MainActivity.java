package com.example.apptinhchisobmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText editTextCC , editTextCN;
   RadioGroup radioGroupGT ;
   RadioButton radioButtonNAM , radioButtonNu ;
   Button buttonDG ;
   TextView textViewDG , textViewBMI  ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDG = (Button) findViewById(R.id.buttonDG) ;
        radioGroupGT = (RadioGroup) findViewById(R.id.RadioGroupGT) ;
        radioButtonNAM= (RadioButton) findViewById(R.id.radioButtonNam) ;
        radioButtonNu = (RadioButton) findViewById(R.id.radioButtonNu) ;
        editTextCC = (EditText) findViewById(R.id.editTextCC) ;
        editTextCN = (EditText) findViewById(R.id.editTextCN) ;
        textViewDG = (TextView) findViewById(R.id.textViewDG) ;
        textViewBMI = (TextView) findViewById(R.id.textViewBMI) ;

        buttonDG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewBMI.setText("");
                textViewBMI.setText("");
                if(editTextCC.getText().toString().isEmpty() && editTextCN.getText().toString().isEmpty())
                {
                    Toast.makeText( MainActivity.this , "Chưa nhập chiều cao , cân nặng",Toast.LENGTH_SHORT).show();
                    editTextCC.requestFocus() ;

                }
                else if(editTextCC.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Thiếu dữ liệu chiều cao",Toast.LENGTH_SHORT).show();
                    editTextCC.requestFocus();
                }
                else if(editTextCC.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Thiếu dữ liệu cân nặng",Toast.LENGTH_SHORT).show();
                    editTextCC.requestFocus();
                }
                else if(radioButtonNAM.isChecked() == false && radioButtonNu.isChecked() ==false){
                    Toast.makeText(MainActivity.this,"Vui lòng chọn giới tính ",Toast.LENGTH_SHORT).show();
                }
        });

        buttonDG.setOnClickListener((view) -> {
            textViewBMI.setText("");
            textViewBMI.setText("");
            if(editTextCC.getText().toString().isEmpty() && editTextCN.getText().toString().isEmpty())
            {
                Toast.makeText( MainActivity.this , "Chưa nhập chiều cao , cân nặng",Toast.LENGTH_SHORT).show();
                editTextCC.requestFocus() ;

            }


        };





    }
}