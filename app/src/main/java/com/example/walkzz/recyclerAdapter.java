package com.example.walkzz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.Viewholder> {


    public final Context context;
    public final ArrayList<imageCardView> imageCardViewArrayList;

    public recyclerAdapter(Context context, ArrayList<imageCardView> imageCardViewArrayList) {
        this.context = context;
        this.imageCardViewArrayList = imageCardViewArrayList;
    }


    @NonNull
    @Override
    public recyclerAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.reccyler_item, parent, false);
        return new Viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.Viewholder holder, @SuppressLint("RecyclerView") int position) {
           imageCardView model = imageCardViewArrayList.get(position);
           holder.imgName1.setText(model.getImgName());
           //holder.img1.setImageResource(model.getImg());

        holder.img1.setImageDrawable(context.getResources().getDrawable(model.getImg()));

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,wallpaperActivity.class);
                intent.putExtra("image",model.getImg());
                intent.putExtra("name",model.getImgName());

                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });





    }

    @Override
    public int getItemCount()
    {
        return imageCardViewArrayList.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        private final ImageView img1;
        private final TextView imgName1;
        RelativeLayout relativeLayout;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            img1= (ImageView) itemView.findViewById(R.id.ivImage);
            imgName1= (TextView) itemView.findViewById(R.id.tvName);
            relativeLayout= (RelativeLayout) itemView.findViewById(R.id.item);
        }
    }
}
