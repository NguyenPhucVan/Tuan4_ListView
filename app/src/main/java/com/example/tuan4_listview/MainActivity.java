package com.example.tuan4_listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.ShortcutXmlParser;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodAdapter adt;
    ArrayList<Goods> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Ca nấu lẩu, nấu mì","Shop Devang",
                                R.drawable.ca_nau_lau));
        arrayList.add(new Goods("1KG Khô gà bơ tỏi","Shop LTD Food",
                R.drawable.ga_bo_toi));
        arrayList.add(new Goods("Xe cần cẩu đa năng","Shop Đồ chơi",
                R.drawable.xa_can_cau));
        arrayList.add(new Goods("Đồ chơi mô hình","Shop Đồ chơi",
                R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new Goods("Lãnh đạo giản đơn","Shop Minh Long Book",
                R.drawable.lanh_dao_gian_don));

        adt = new CustomGoodAdapter(this, R.layout.item_listview,arrayList);

        lvGoods.setAdapter(adt);
    }
}