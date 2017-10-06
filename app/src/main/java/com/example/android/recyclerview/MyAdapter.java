package com.example.android.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/21.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>
{
    Context context;
    List<Percy>percyList;

    public MyAdapter(Context context, List<Percy> percyList) {
        this.context = context;
        this.percyList = percyList;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.section1,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
  Percy percy= percyList.get(position);
        holder.txt.setText(percy.getName());
    }

    @Override
    public int getItemCount() {
        return percyList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt;

        public MyViewHolder(View itemView) {
            super(itemView);
          txt=(TextView)itemView.findViewById(R.id.txt);
        }
    }
}
