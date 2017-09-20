package com.example.ritesh.test1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class ServiceDemo extends Service {
    public ServiceDemo() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "ServiceDemo:onCreated()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(this, "ServiceDemo: onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent,  int flags, int startId) {
        Toast.makeText(this, "ServiceDemo:onStartCommand", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "ServiceDemo:onDestroy", Toast.LENGTH_SHORT).show();
    }
}
