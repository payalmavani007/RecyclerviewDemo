package com.pro.demo.recyclerviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.ArrayList;

public class FullScreenImage extends AppCompatActivity {
    private ArrayList arrayList;
    ImageView full_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);
        full_img = findViewById(R.id.full_img);
        Intent intent = getIntent();
        int img = intent.getIntExtra("img", 0);
        full_img.setImageResource(img);
        RecyclerAdapter imageAdapter = new RecyclerAdapter(arrayList,getApplicationContext());

//        full_img.setImageResource(RecycleModel.getImg());

    }
}
