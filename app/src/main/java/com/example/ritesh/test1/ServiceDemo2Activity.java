package com.example.ritesh.test1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ServiceDemo2Activity extends AppCompatActivity {
 ServiceDemo2 svd1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo2);
        tv1= (TextView) findViewById(R.id.textView1);
    }

    class MyServiceConnection implements ServiceConnection
    {

        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder)
        {
            ServiceDemo2.MyBinder myBinder=(ServiceDemo2.MyBinder)iBinder;
            svd1=myBinder.getMyservice();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    }
    MyServiceConnection serviceConnection=null; //global refrence of the claass
    public void b1click(View v)
    {
        Intent intent=new Intent(this,ServiceDemo2.class);
        startService(intent);
        serviceConnection=new MyServiceConnection();
        bindService(intent,serviceConnection, Context.BIND_AUTO_CREATE);
        tv1.setText("service started");

    }
    public void b2click(View v)
    {
        String msg="Time Duration:" + svd1.getTimeDuration()+"secs";
                tv1.setText(msg);
    }
    public void b3click(View v)
    {
        unbindService(serviceConnection);
        Intent intent=new Intent(this,ServiceDemo2.class);
        stopService(intent);
    }
    @Override
    protected void onStop() {
        super.onStop();
        unbindService(serviceConnection);
    }
}
