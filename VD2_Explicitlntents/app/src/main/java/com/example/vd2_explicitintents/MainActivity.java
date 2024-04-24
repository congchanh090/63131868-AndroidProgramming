package com.example.vd2_explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void NhapLieu(View v){
        //tao moi 1 intent
        Intent iNhap = new Intent(this, NhaplieuActivity.class) ;
        // chuyển sang màn hình nhập liệu
        //nhưng đợi kq trả ve , mã của yêu cầu này đặt 1234
      startActivityForResult(iNhap,1234);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == 1234)
            if(resultCode == RESULT_OK){
                //Lấy dữ liệu gửi về
                // dữ liệu gửi về theo cắp key -- value
                String hotennhanduoc = data.getStringExtra("HT") ;  //KEY ĐẶT Ở ACTIVIY NHÂP LIỆU
                int namsinhnhanduoc = data.getIntExtra("NS",2024) ;  //KEY ĐẶT Ở ACTIVIY NHÂP LIỆU
                //đưa lên điều khiển ta muốn kq nhận đc
                TextView tvHT = (TextView) findViewById(R.id.tvHoTen)  ;
                TextView tvNS = (TextView) findViewById(R.id.tvNamSinh)  ;
                tvHT.setText(hotennhanduoc);
                tvNS.setText(String.valueOf(namsinhnhanduoc));

            }
            else
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_LONG);
        else
            super.onActivityResult(requestCode,resultCode,data)  ;
    }


}