package com.example.lab_16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class myadapter extends ArrayAdapter<String> {
    String[] str1;
    String[] str2;
    String[] str3;
    Context context;

    public myadapter(Context context, String[] arr1, String[] arr2, String[] arr3) {
        super(context, R.layout.model_listview);
        this.context = context;
        this.str1 = arr1;
        this.str2 = arr2;
        this.str3 = arr3;
    }

    @Override
    public int getCount() {
        return str1.length;
    }

    public View getView(int index, View view, ViewGroup parent) {
        ControlTextView ctv = new ControlTextView();
        if (view == null) {
            LayoutInflater flat = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = flat.inflate(R.layout.model_listview, parent, false);
            ctv.tv1 = view.findViewById(R.id.tv1);
            ctv.tv2 = view.findViewById(R.id.tv2);
            ctv.tv3 = view.findViewById(R.id.tv3);
        } else {
            ctv = (ControlTextView) view.getTag();
        }
        ctv.tv1.setText(str1[index]);
        ctv.tv2.setText(str2[index]);
        ctv.tv3.setText(str3[index]);

        return view;
    }

    static class ControlTextView {
        TextView tv1;
        TextView tv2;
        TextView tv3;
    }
}
