package com.example.abhinav.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abhinav on 7/22/2017.
 */

 class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {
    List<Pojo> a;
    public adapter(List<Pojo> a) {
        this.a = a;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.noticeboard,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
      holder.msg.setText( a.get(holder.getAdapterPosition()).getName());
        holder.time.setText( a.get(holder.getAdapterPosition()).getTime());
        holder.from.setText( a.get(holder.getAdapterPosition()).getFrom());
    }

    @Override
    public int getItemCount() {
        return a.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
          TextView msg,from,time;
        ImageView not;
         MyViewHolder(View itemView) {
            super(itemView);
             msg = (TextView) itemView.findViewById(R.id.msg);
             from = (TextView) itemView.findViewById(R.id.from);
             time = (TextView) itemView.findViewById(R.id.time);
             not = (ImageView) itemView.findViewById(R.id.img);
         }
    }
}
