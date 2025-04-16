package vn.LeCongChanh;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_Cau1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
    }

    // Bo lang nghe xu ly xu kien nut tinh tong
    public void XuLyCong(View view) {
        // tim tham chieu dieu khien tren tap XML

        EditText editTextSoA = findViewById(R.id.editA);
        EditText editTextSoB = findViewById(R.id.editB);
        EditText editTextKetQua = findViewById(R.id.editKQ);

        //Lay du lieu ve

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString(); // Đúng, lấy từ editTextSoB

        //chuyen du lieu
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        //tinh toan
        int tong = soA + soB;
        String strTong = String.valueOf(tong);
        //hien ra man hinh

        editTextKetQua.setText(strTong);
    }
}