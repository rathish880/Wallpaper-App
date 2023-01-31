package com.example.walkzz.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.walkzz.R;


public class favoritesFragment extends Fragment {

    private View root_view;
    View lyt_no_found;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        root_view = inflater.inflate(R.layout.fragment_favorites, container, false);
        lyt_no_found=root_view.findViewById(R.id.lyt_not_found);






        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorites, container, false);
    }
}