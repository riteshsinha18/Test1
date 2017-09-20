package com.example.ritesh.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageResourceActivity extends AppCompatActivity {
ImageView im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_resource);
        im1= (ImageView) findViewById(R.id.imageView1);
        im1.setImageResource(R.drawable.pixlr);
    }
}
