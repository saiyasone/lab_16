package com.example.lab_16;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomCountryList extends ArrayAdapter {
    private String[] countryname, capitalname;
    private Integer[] imageid;
    private Activity context;

    public CustomCountryList(Activity context, String[] countryname, String[] capitalname, Integer[] imgid) {
        super(context, R.layout.model_listview_image);
        this.context = context;
        this.countryname = countryname;
        this.capitalname = capitalname;
        this.imageid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        LayoutInflater flat = context.getLayoutInflater();
        if (convertView == null)
            v = flat.inflate(R.layout.model_listview_image, null, true);
            TextView viewCountry = (TextView) v.findViewById(R.id.textCountry);
            TextView viewCapital = (TextView) v.findViewById(R.id.textViewCapital);
            ImageView imgFlag = (ImageView) v.findViewById(R.id.imgViewFlag);

            viewCountry.setText(countryname[position]);
            viewCapital.setText(capitalname[position]);
            imgFlag.setImageResource(imageid[position]);
            return v;
    }
}
