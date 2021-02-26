package com.example.lab_16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class sends extends AppCompatActivity {

    Button btnok, btncancel;
    TextView txtcode, txtname, tel;
    RadioButton rmale, rfemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sends);

        txtcode = findViewById(R.id.txtid);
        txtname = findViewById(R.id.txtname);
        tel = findViewById(R.id.txtmobile);

        rmale = findViewById(R.id.Rmale);
        rfemale = findViewById(R.id.Rfemale);

        btnok = findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(sends.this, form_detail.class);
                String sex = "";
                if (rmale.isChecked()) {
                    sex = "ຊາຍ";
                } else if (rfemale.isChecked()) {
                    sex = "ຍິງ";
                } else {
                    sex = "Unknown";
                }

                view.putExtra("id", txtcode.getText().toString());
                view.putExtra("name", txtname.getText().toString());
                view.putExtra("tel", tel.getText().toString());
                view.putExtra("gender", sex);
                startActivity(view);
            }
        });

        btncancel = findViewById(R.id.btncancel);
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtcode.setText("");
                txtname.setText("");
                tel.setText("");
//                txtcode.setText("");
            }
        });

    }
}