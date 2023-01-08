package com.example.walkzz.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
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

import java.util.ArrayList;

public class recyclerAdapterCategories extends RecyclerView.Adapter<recyclerAdapterCategories.Viewholder> {


    public final Context context;
    public final ArrayList<imageCardView> imageCardViewArrayList1;

    public recyclerAdapterCategories(Context context, ArrayList<imageCardView> imageCardViewArrayList) {
        this.context = context;
        this.imageCardViewArrayList1 = imageCardViewArrayList;
    }


    @NonNull
    @Override
    public recyclerAdapterCategories.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_categories, parent, false);
        return new Viewholder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull recyclerAdapterCategories.Viewholder holder, @SuppressLint("RecyclerView") int position) {
        imageCardView model = imageCardViewArrayList1.get(position);
        holder.imgName2.setText(model.getImgName());
        holder.img2.setImageResource(model.getImg());

       holder.img2.setImageDrawable(context.getResources().getDrawable(model.getImg()));






    }

    @Override
    public int getItemCount()
    {
        return imageCardViewArrayList1.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder {
        private final ImageView img2;
        private final TextView imgName2;
        RelativeLayout relativeLayout1;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            img2= (ImageView) itemView.findViewById(R.id.ivImage1);
            imgName2= (TextView) itemView.findViewById(R.id.txtName1);
            relativeLayout1= (RelativeLayout) itemView.findViewById(R.id.item1);
        }
    }
}
