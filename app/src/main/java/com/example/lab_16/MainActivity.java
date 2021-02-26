package com.example.lab_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button send, btnlist, btnlab, btnrecycle, btnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = findViewById(R.id.btnsend);
        btnlist = (Button) findViewById(R.id.btnlistview);
        btnlab = findViewById(R.id.btnlab_list);
        btnrecycle = findViewById(R.id.btnRecycleView);
        btnImage = findViewById(R.id.btnlistImage);

        //pass data
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(MainActivity.this, sends.class);
                startActivity(view);
            }
        });

        //display listview
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dtr = new Intent(MainActivity.this, listview.class);
                startActivity(dtr);
            }
        });

        //display listview
        btnlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dtr = new Intent(MainActivity.this, listview_lecture.class);
                startActivity(dtr);
            }
        });

        //display RecycleView
        btnrecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dtr = new Intent(MainActivity.this, RecycleAdapter.class);
                startActivity(dtr);
            }
        });

//        display list image
        btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, listview_image.class);
                startActivity(intent);
            }
        });

    }
}