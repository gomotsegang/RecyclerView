package com.example.android.recyclerview;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Percy> percyList= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.ptp);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        Percy percy1=new Percy();
        percy1.setName("tsu");

        Percy percy2=new Percy();
        percy2.setName("tshepo2");

        percyList.add(percy1);
        percyList.add(percy2);

        MyAdapter myAdapter= new MyAdapter(MainActivity.this,percyList);
        recyclerView.setAdapter(myAdapter);
    }
}
