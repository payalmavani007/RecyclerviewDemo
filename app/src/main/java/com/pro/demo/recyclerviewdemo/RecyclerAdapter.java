package com.pro.demo.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.EventLogTags;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import javax.security.auth.login.LoginException;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    Context context;
    private ArrayList arrayList;

    public RecyclerAdapter(ArrayList arrayList, Context context) {
        this.arrayList = arrayList; this.context=context;
    }



    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerAdapter.MyViewHolder holder, final int position) {
        final RecycleModel model = (RecycleModel) arrayList.get(position);
        holder.imageView.setImageResource(model.getImg());
        holder.textView.setText(model.getName());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FullScreenImage.class);
                intent.putExtra("img", model.getImg());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Log.d("tag", "abc: "+arrayList.get(position));
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.postImage);
            textView = (TextView) itemView.findViewById(R.id.txtName);

        }
    }
}
