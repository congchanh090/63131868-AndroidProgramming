package com.example.vidulistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //tai day ta tham chieu bien toan cuc
    // vi du cac bien tham chieu den dieu khien
    EditText edThongTin ;
    ListView lvTen ;
    // bien luu tru danh sach ten
    ArrayList<String> dsTen  ;
    //ham lay tham chieu
    void getControls (){
        edThongTin= (EditText)findViewById(R.id.edThôngTin) ;
        lvTen = (ListView) findViewById(R.id.lvTen) ;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ta muốn có ngay listvỉew hiện dữ liệu khi màn hình đc tạo ra
        // va hien lên nen ta code o day
        getControls(); //lay tham chieu
        //tao nguon du lieu ds ten
        dsTen = new ArrayList<String>() ; //lenh tao ms danh sach
        // ở đây , ta tạo cững  (hardcode) một dánh sách tên
        dsTen.add("Phương") ;
        dsTen.add("Ngân") ;
        dsTen.add("Ngọc") ;
        dsTen.add("Tiên") ;
        //tạo adapter và gắn vào nguồn dữ liệu
        ArrayList<String> bo_Nguon = new ArrayList<String>(this, android.R.layout.simple_list_item_1,dsTen) ;
        //cam bo nguon vao listview
        lvTen.setAdapter(bo_Nguon);


    }


}