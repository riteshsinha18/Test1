package com.example.ritesh.test1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
ImageView im;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        im= (ImageView) findViewById(R.id.imageView78);
        b1= (Button) findViewById(R.id.button7);
    }
    public void openCamera(View v)
    {
        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle=data.getExtras();
        Bitmap bitmap= (Bitmap) bundle.get("data");
        im.setImageBitmap(bitmap);
    }
}
