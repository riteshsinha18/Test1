package com.example.ritesh.test1;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MusicService extends Service implements MediaPlayer.OnCompletionListener {
    public MusicService() {
    }
MediaPlayer mp;
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp=MediaPlayer.create(this,R.raw.mymusic);
       mp.setOnCompletionListener(this);


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(mp.isPlaying()==false)
        {
            mp.start();
        }
        Toast.makeText(this, "Music is Playing", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mp.isPlaying()==true)
        {
            mp.stop();
        }
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        stopSelf();

    }
}
