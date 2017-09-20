package com.example.ritesh.test1;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView vv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        vv1= (VideoView) findViewById(R.id.videoView1);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(vv1);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid);
//(Environment.getExternalStorageDirectory().getPatch()+"Download/myvideo.mp4");
        vv1.setVideoURI(uri);
        vv1.requestFocus();
        vv1.start();
    }
}
