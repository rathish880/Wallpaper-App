package com.example.walkzz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class wallpaperActivity extends AppCompatActivity {

    private ImageView ivImage1;
    private Button btnSetWallpaper;
    private ProgressBar pbLoading = (ProgressBar) findViewById(R.id.pbLoading);
    String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        imageUrl=getIntent().getStringExtra("imgUrl");
        ivImage1= (ImageView) findViewById(R.id.ivImage1);


    }
}