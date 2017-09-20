package com.example.ritesh.test1;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ProximitySensorActivity extends AppCompatActivity implements SensorEventListener
{
ImageView iv;
    SensorManager sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_sensor);
        iv= (ImageView) findViewById(R.id.imageView1);
        sm= (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        int rollNoOfSensor= Sensor.TYPE_PROXIMITY;
        Sensor s=sm.getDefaultSensor(rollNoOfSensor);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onStop() {
        super.onStop();
        sm.unregisterListener(this);
        finish();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent)
    {
        float f=sensorEvent.values[0];
        Toast.makeText(this, "Sensor value="+ f, Toast.LENGTH_SHORT).show();
        if(f==100.0)
        {
            iv.setImageResource(R.drawable.pixlr);
        }
        else
        {
            iv.setImageResource(R.drawable.pixl2);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
