package com.myapplicationdev.android.tw_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvYear);

        al = new ArrayList<String>();
        al.add("Year 1");
        al.add("Year 2");
        al.add("Year 3");

        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);


    }
}
