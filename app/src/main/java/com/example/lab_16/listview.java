package com.example.lab_16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {

    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.tt, mobileArray);
        ListView item = (ListView) findViewById(R.id.item);
        item.setAdapter(adapter);

    }
}