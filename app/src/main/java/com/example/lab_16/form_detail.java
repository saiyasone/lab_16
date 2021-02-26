package com.example.lab_16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class form_detail extends AppCompatActivity {

    TextView id, n, gender, mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_detail);

        id = findViewById(R.id.strid);
        n=findViewById(R.id.strn);
        gender = findViewById(R.id.strgender);
        mobile=findViewById(R.id.strtel);

        Bundle bun = getIntent().getExtras();
        id.setText(bun.getString("id"));
        n.setText(bun.getString("name"));
        mobile.setText(bun.getString("tel"));
        gender.setText(bun.getString("gender"));
    }
}