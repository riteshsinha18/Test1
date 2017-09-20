package com.example.ritesh.test1;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class ServiceDemo2 extends Service {
    IBinder iBinder;
    long startTime;
    long checkTime;
    long difference;

    @Override
    public IBinder onBind(Intent intent) {
        iBinder = new MyBinder();
        return iBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startTime = System.currentTimeMillis();
        return super.onStartCommand(intent, flags, startId);
    }

    public long getTimeDuration() {
        checkTime = System.currentTimeMillis();
        difference = checkTime - startTime;
        return difference / 1000;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        stopSelf();
    }


    class MyBinder extends Binder {
        ServiceDemo2 getMyservice() {
            return ServiceDemo2.this;
        }
    }
}
