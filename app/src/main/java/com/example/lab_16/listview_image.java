package com.example.lab_16;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class listview_image extends AppCompatActivity {

    private String countryName[] = {
            "Laos",
            "Thailand",
            "Vietnam",
            "Malaysia",
    };
    private String capitalName[] = {
            "Vientiane",
            "Bangkok",
            "Hochimin",
            "Kualalumper",
    };
    private Integer imgid[] = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.e,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_image);

//        setting header
        TextView tv = new TextView(this);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setText("List of Countries");

        ListView lst = (ListView) findViewById(R.id.n_list);
        lst.addHeaderView(tv);

//        retriving list data
        CustomCountryList cs = new CustomCountryList(listview_image.this, countryName, capitalName, imgid);
        lst.setAdapter(cs);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You Selected " + countryName[position - 1] + " as Country", Toast.LENGTH_SHORT).show();
            }
        });

    }


}