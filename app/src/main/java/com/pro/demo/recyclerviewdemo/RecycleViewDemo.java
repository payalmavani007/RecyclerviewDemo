package com.pro.demo.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class RecycleViewDemo extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_demo);
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        adapter = new RecyclerAdapter(getItem());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    private ArrayList getItem(){

        ArrayList<RecycleModel> arrayList = new ArrayList<>();

        RecycleModel addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.a);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.b);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.c);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.d);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.a);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.b);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.c);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.d);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.a);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.b);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.c);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.d);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.a);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.b);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.c);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.d);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.a);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.b);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.c);
        arrayList.add(addarray);

        addarray = new RecycleModel();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.d);
        arrayList.add(addarray);
        return arrayList;
    }
    }

