package com.example.walkzz.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.walkzz.Adapter.recyclerAdapterCategories;

import com.example.walkzz.R;
import com.example.walkzz.imageCardView;

import java.util.ArrayList;


public class categoriesFragment extends Fragment {
    private RecyclerView recyclerView1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView1 = (RecyclerView) view.findViewById(R.id.recyclerView1);

        ArrayList<imageCardView> imageCardView0ArrayList1 = new ArrayList<imageCardView>();

       // for (int i = 0; i < 100; i++) {
         //   System.out.println(imageCardView0ArrayList1.add(new imageCardView("Flower", R.drawable.rose)));
        //}

        imageCardView0ArrayList1.add(new imageCardView("FLOWERS", R.drawable.rose));
        imageCardView0ArrayList1.add(new imageCardView("NATURE", R.drawable.nature));
        imageCardView0ArrayList1.add(new imageCardView("AESTHETIC", R.drawable.aesthetic));
        imageCardView0ArrayList1.add(new imageCardView("MOVIES", R.drawable.movies));
        imageCardView0ArrayList1.add(new imageCardView("ANIME", R.drawable.anime));
        imageCardView0ArrayList1.add(new imageCardView("BLACK", R.drawable.black));
        imageCardView0ArrayList1.add(new imageCardView("SPECIES", R.drawable.species));




        recyclerAdapterCategories recyclerAdapter = new recyclerAdapterCategories(requireContext(), imageCardView0ArrayList1);
        //GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 1, LinearLayoutManager.VERTICAL, false);


        //recyclerView1.setLayoutManager(gridLayoutManager);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false);

// in below two lines we are setting layoutmanager and adapter to our recycler view.
        recyclerView1.setLayoutManager(linearLayoutManager);
        recyclerView1.setAdapter(recyclerAdapter);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false);
    }
}