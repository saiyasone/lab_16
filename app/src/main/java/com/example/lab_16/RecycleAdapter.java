package com.example.lab_16;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.Holder> {

    private String[] mDaraset;

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);
        Holder hold = new Holder(view);
        return hold;
    }

    public RecycleAdapter(String[] dataset){
        mDaraset = dataset;
    }

    public RecycleAdapter(){}


    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.setItem(position);
    }

    @Override
    public int getItemCount() {
        return mDaraset.length;
    }

    class Holder extends RecyclerView.ViewHolder {

        TextView txttitle, txtdes;

        public Holder(View itemView) {
            super(itemView);
            txttitle = itemView.findViewById(R.id.v_title);
            txtdes = itemView.findViewById(R.id.v_detail);
        }

        public void setItem(int position) {
            txttitle.setText(mDaraset[position]);
            txtdes.setText("index = " + position);
        }

    }
}
