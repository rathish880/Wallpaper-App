package com.example.walkzz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.walkzz.Adapter.adapterCategoriesItems;
import com.example.walkzz.Adapter.recyclerAdapterExplore;

import java.util.ArrayList;

public class flowerActivity extends AppCompatActivity {

    private RecyclerView recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        recyclerView1= (RecyclerView) findViewById(R.id.recyclerView1);
        ArrayList<imageCardView> imageCardViewArrayList1=new ArrayList<imageCardView>();

        recyclerView1.setHasFixedSize(true);

        imageCardViewArrayList1.add(new imageCardView("Rose",R.drawable.rose));
        imageCardViewArrayList1.add(new imageCardView("Black",R.drawable.black));
        adapterCategoriesItems recyclerAdapter = new adapterCategoriesItems(this, imageCardViewArrayList1);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);

        recyclerView1.setAdapter(recyclerAdapter);
        recyclerView1.setLayoutManager(gridLayoutManager);


    }
}