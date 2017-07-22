package com.example.abhinav.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int i = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Pojo> a = new ArrayList<>();
       while (i<10)
       {
           Pojo pojo = new Pojo();
           pojo.setName("abcdef"+i);
           pojo.setFrom("abcdef"+i);
           pojo.setTime(String.valueOf(new Date().getTime()));
           a.add(pojo);
           i++;
       }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(new adapter(a));
    }
}
