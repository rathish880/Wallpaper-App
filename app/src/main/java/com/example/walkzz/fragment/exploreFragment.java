package com.example.walkzz.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.walkzz.R;
import com.example.walkzz.imageCardView;
import com.example.walkzz.Adapter.recyclerAdapterExplore;

import java.util.ArrayList;


public class exploreFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        ArrayList<imageCardView> imageCardView0ArrayList = new ArrayList<imageCardView>();
        recyclerView.setHasFixedSize(true);

        imageCardView0ArrayList.add(new imageCardView("Flower", R.drawable.rose));
        imageCardView0ArrayList.add(new imageCardView("Species", R.drawable.species));


        recyclerAdapterExplore recyclerAdapter = new recyclerAdapterExplore(requireContext(), imageCardView0ArrayList);
       GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false);


        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false);
    }

    public void onItemClick(int position){

    }
}



