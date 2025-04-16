package vn.LeCongChanh;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Activity_Cau2 extends AppCompatActivity {

    ArrayList<String> dsbaihat;
    ArrayAdapter<String> adapterBaihat;
    ListView lvBaiHat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);

        TimDK();
        dsbaihat = new ArrayList<String>();
        dsbaihat.add("Em của ngày hôm qua");
        dsbaihat.add("Ngày em đẹp nhất");
        dsbaihat.add("Mất kết nối");
        dsbaihat.add("Nơi này có anh");
        dsbaihat.add("Ghé qua");
        dsbaihat.add("Cơn mưa tình yêu");
        dsbaihat.add("Wrong time");
        dsbaihat.add("Say yes");
        dsbaihat.add("Hẹn em ở lần yêu thứ hai");
        dsbaihat.add("Phiêu du");
        dsbaihat.add("Lặng");


        adapterBaihat = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsbaihat) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textView = view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.BLACK); // Đổi màu chữ thành đen
                return view;
            }
        };

        lvBaiHat.setAdapter(adapterBaihat);

        lvBaiHat.setOnItemClickListener(BoLangNghe);
    }
    void TimDK() {
        lvBaiHat = findViewById(R.id.lvbaihat);
    }

    AdapterView.OnItemClickListener BoLangNghe = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String tenBaiHat = dsbaihat.get(position);
            Toast.makeText(Activity_Cau2.this, "Bạn vừa chọn: " + tenBaiHat, Toast.LENGTH_SHORT).show();
        }
    };

}