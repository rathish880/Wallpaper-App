package com.example.walkzz.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.walkzz.R;
import com.example.walkzz.imageCardView;
import com.example.walkzz.wallpaperActivity;

import java.util.ArrayList;

public class adapterCategoriesItems extends RecyclerView.Adapter<adapterCategoriesItems.Viewholder> {


    public final Context context;
    public final ArrayList<imageCardView> imageCardViewArrayList2;

    public adapterCategoriesItems(Context context,ArrayList<imageCardView> imageCardViewArrayList){
        this.context=context;
        this.imageCardViewArrayList2=imageCardViewArrayList;
    }
    @NonNull
    @Override
    public adapterCategoriesItems.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoriesitems,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterCategoriesItems.Viewholder holder, int position) {
        imageCardView model=imageCardViewArrayList2.get(position);
        holder.imgNAme2.setText(model.getImgName());
        holder.img2.setImageDrawable(context.getResources().getDrawable(model.getImg()));

        holder.relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          Intent intent=new Intent(context, wallpaperActivity.class);
                intent.putExtra("image",model.getImg());
                intent.putExtra("name",model.getImgName());

                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
          context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return imageCardViewArrayList2.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        private final ImageView img2;
        private final TextView imgNAme2;
        RelativeLayout relativeLayout1;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            img2=itemView.findViewById(R.id.ivImage2);
            imgNAme2=itemView.findViewById(R.id.txtName2);
            relativeLayout1=itemView.findViewById(R.id.item2);


        }
    }
}
