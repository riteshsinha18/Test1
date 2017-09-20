package com.example.ritesh.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        intent=new Intent(this,MusicService.class);
    }
    public void  b1click(View v)
    {
        startService(intent);
    }
    public void b2click(View v)
    {
        stopService(intent);
    }
}
