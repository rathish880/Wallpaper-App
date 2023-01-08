package com.example.walkzz;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class wallpaperActivity extends AppCompatActivity {
    ImageView ivImage1;
    TextView txtName;
    Button btnSetWallpaper;
    String alphaName ;
    int alphaImage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
        ivImage1 = findViewById(R.id.ivImage1);
        btnSetWallpaper= (Button) findViewById(R.id.btnSetWallpaper);
        txtName = findViewById(R.id.txtName);

        //get the intent
        alphaName = getIntent().getStringExtra("name");

        alphaImage = getIntent().getIntExtra("image",0);        //now set the get values in the respective widgets
        txtName.setText(alphaName);

        ivImage1.setImageResource(alphaImage);
    }    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

