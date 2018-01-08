package com.mars.android20180108_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//listview 使用 Map來放資料
public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String, String>> mylist = new ArrayList();
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        mylist.add(m1);
        HashMap<String, String> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        mylist.add(m2);
        HashMap<String, String> m3 = new HashMap<>();
        m3.put("city", "台南");
        m3.put("code", "06");
        mylist.add(m3);
        HashMap<String, String> m4 = new HashMap<>();
        m4.put("city", "高雄");
        m4.put("code", "07");
        mylist.add(m4);

        //android.R.layout.simple_list_item_2
        //android.R.id.text1, android.R.id.text2
        //這兩個可以改成自訂的layout以及textview,達到自訂listview顯示格式的目的
        /*
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                mylist, android.R.layout.simple_list_item_2, new String[] {"city", "code"},
                new int[] {android.R.id.text1, android.R.id.text2});
        */

        //自訂listview顯示格式
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                mylist, R.layout.mylistview, new String[] {"city", "code"},
                new int[] {R.id.textView, R.id.textView2});
        lv.setAdapter(adapter);


    }
}
