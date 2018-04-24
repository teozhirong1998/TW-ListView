package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    Button btnBack;
    ArrayAdapter aa;
    ArrayList<Module> module;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        module = new ArrayList<Module>();


        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);
        btnBack = (Button) findViewById(R.id.buttonBack);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (year.equalsIgnoreCase("year 1")){
            module.add(new Module("C123", false));
            module.add(new Module("C456", false));
            module.add(new Module("C789", true));

        } else if (year.equalsIgnoreCase("year 2")) {
            module.add(new Module("C208", true));
            module.add(new Module("C200", false));
            module.add(new Module("C346", true));


        } else {
            module.add(new Module("C302", true));
            module.add(new Module("C349", true));
            module.add(new Module("C347", true));
        }

        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);
    }



}
