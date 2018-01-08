package com.mars.android20180108_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Map;

//listview 使用 Map來放資料
public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String,String>> mylist;
    ListView lv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv  = (ListView)findViewById(R.id.listview);
    }
}
