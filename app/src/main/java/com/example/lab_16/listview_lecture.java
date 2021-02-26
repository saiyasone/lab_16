package com.example.lab_16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listview_lecture extends AppCompatActivity {

    ListView lv;
    String[] arr = {"Brunei Darusalam", "Cambodia", "Indonesia", "Laos", "Malaysia",
            "Myanmar", "Philippines", "Singapor", "Thailand", "Vietnam"};
    ArrayAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_lecture);
        lv = findViewById(R.id.lstitm);

        myadapter apt = new myadapter(listview_lecture.this, arr, arr, arr);
        lv.setAdapter(apt);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = arr[position].toString();
                Toast.makeText(getApplication(), str, Toast.LENGTH_LONG).show();
            }
        });

    }
}