package com.example.walkzz;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.pm.PackageManager;

import android.graphics.drawable.Drawable;
import android.net.Uri;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class wallpaperActivity extends AppCompatActivity {
    ImageView ivImage1;
    TextView txtName;
    Button btnSetWallpaper;
    ImageButton btnlike;
    ImageButton btnDownload;
    ImageButton btnShare;
    LinearLayout linWallAct;
    String alphaName;
    String alphaImage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        ivImage1 = findViewById(R.id.ivImage1);
        btnSetWallpaper = (Button) findViewById(R.id.btnSetWallpaper);
        btnlike = (ImageButton) findViewById(R.id.btnLike);
        btnDownload = (ImageButton) findViewById(R.id.btnDownload);
        btnShare = (ImageButton) findViewById(R.id.btnShare);

        txtName = findViewById(R.id.txtName3);


        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }


        });


        alphaName = getIntent().getStringExtra("name");
        alphaImage= getIntent().getStringExtra("image");


       // alphaImage = getIntent().getIntExtra("image", 0);        //now set the get values in the respective widgets
        txtName.setText(alphaName);

        //ivImage1.setImageResource(alphaImage);

        Glide.with(this).load(alphaImage).listener(new RequestListener<Drawable>() {
        @Override
            public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
            // making progress bar visibility 
            // to gone on below line.

            return false;
                    }
                    @Override
            public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
            // making progress bar visibility to gone
            // on below line when image is ready.

            return false;
            }
            }).into(ivImage1);


        final WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        btnSetWallpaper.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {
        try {
            wallpaperManager.setResource(getIntent().getIntExtra("image",0));
            Toast.makeText(wallpaperActivity.this, "APPLIED", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}