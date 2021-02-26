package com.example.lab_16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class recycler_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        RecyclerView recyclerView = findViewById(R.id.recycleview);

        //setting Layout
        RecyclerView.LayoutManager meta = new LinearLayoutManager(this);

        //setting Adapter
        String[] str = {"Laos", "Thailand", "Vietname"};
        RecycleAdapter apt = new RecycleAdapter(str);
        recyclerView.setAdapter(apt);
    }
}