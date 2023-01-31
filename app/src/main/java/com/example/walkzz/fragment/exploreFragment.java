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
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.walkzz.R;
import com.example.walkzz.Upload;

import com.example.walkzz.Adapter.recyclerAdapterExplore;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class exploreFragment extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseReference mDatabaseRef;
    private List<Upload> mUploads;
    private recyclerAdapterExplore recyclerAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       // mDatabaseRef= FirebaseDatabase.getInstance().getReference("uploads");



    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mDatabaseRef= FirebaseDatabase.getInstance().getReference("uploads");
        mUploads = new ArrayList<>();


        //ArrayList<Upload> imageCardView0ArrayList = new ArrayList<>();
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(gridLayoutManager);

        // imageCardView0ArrayList.add(new imageCardView("Flower", R.drawable.rose));
        //imageCardView0ArrayList.add(new imageCardView("Species", R.drawable.species));


       // final recyclerAdapterExplore[] recyclerAdapter = {new recyclerAdapterExplore(requireContext(), imageCardView0ArrayList)};
       //GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false);


       // recyclerView.setLayoutManager(gridLayoutManager);
        //recyclerView.setAdapter(recyclerAdapter);
        mDatabaseRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Upload upload = postSnapshot.getValue(Upload.class);
                    mUploads.add(upload);
                }

                recyclerAdapter = new  recyclerAdapterExplore(requireContext(), (ArrayList<Upload>) mUploads);

                recyclerView.setAdapter(recyclerAdapter);



            }


            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(requireContext(), databaseError.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });







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



