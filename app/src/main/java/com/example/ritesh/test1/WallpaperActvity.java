package com.example.ritesh.test1;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class WallpaperActvity extends AppCompatActivity {
ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_actvity);
        iv1= (ImageView) findViewById(R.id.imageView1);
    }
    public void setwall(View v)
    {
        WallpaperManager wm=WallpaperManager.getInstance(getApplicationContext());
        BitmapDrawable bmd= (BitmapDrawable) iv1.getDrawable();
        Bitmap b=bmd.getBitmap();
        try
        {
            wm.setBitmap(b);
            Toast.makeText(this, "wallpaper set successfully", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Wallpaper not set", Toast.LENGTH_SHORT).show();
        }

    }
}
