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

import java.text.DecimalFormat;

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
                if (editTextCC.getText().toString().isEmpty() && editTextCN.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Chưa nhập chiều cao , cân nặng", Toast.LENGTH_SHORT).show();
                    editTextCC.requestFocus();

                } else if (editTextCC.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Thiếu dữ liệu chiều cao", Toast.LENGTH_SHORT).show();
                    editTextCC.requestFocus();
                } else if (editTextCC.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Thiếu dữ liệu cân nặng", Toast.LENGTH_SHORT).show();
                    editTextCC.requestFocus();
                } else if (radioButtonNAM.isChecked() == false && radioButtonNu.isChecked() == false) {
                    Toast.makeText(MainActi                    double CC = Double.parseDouble(editTextCC.getText() + "");
                    double CN = Double.parseDouble(editTextCN.getText() + "");
                    DecimalFormat dcf = new DecimalFormat("0.00");
                    double BMI = CN / Math.pow(CC, 2) * 10000;
                    if ((CC == 0) || (CN == 0)) {
                        Toast.makeText(MainActivity.this, "Chiều cao cân nặng phải khác 0", Toast.LENGTH_SHORT).show();
                    } else {
                        textViewBMI.setText("Chỉ số BMI của bạn " + dcf.format(BMI));
                        if (BMI < 18.5)
                            textViewBMI.setText("Bạn quá gầy , cần bổ sung thêm chất dinh dưỡng nữa bạn nhé ");
                        else if (18.5 <= BMI && BMI < 25)
                            textViewBMI.setText("Body chuẩn nhé , cứ tiếp tục phát huy  ");
                        else if (25 <= BMI && BMI < 30)
                            textViewBMI.setText("Bạn đang béo phì cấp độ 1 , bạn nên giảm cân nhé ");
                        else if (30 <= BMI && BMI < 35)
                            textViewBMI.setText("Bạn đang béo phì cấp độ 2 , cần có chế độ giảm cân hợp lý ");
                        else
                            textViewBMI.setText("Bạn đang béo phì cấp độ 3 , nên điều chỉnh chế độ ăn uống , tập thể dục nhiều vào nhé ");
                    }
                    vity.this, "Vui lòng chọn giới tính ", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });

    }
}