package com.example.ritesh.test1;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OrientationSensorActivity extends AppCompatActivity implements SensorEventListener
{
ConstraintLayout cl1;
    TextView tv1;
    SensorManager sm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_sensor);
        cl1= (ConstraintLayout) findViewById(R.id.layout1);
        tv1= (TextView) findViewById(R.id.textView1);
        sm= (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        int rollNoOfSensor= Sensor.TYPE_ACCELEROMETER;
        Sensor s=sm.getDefaultSensor(rollNoOfSensor);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent)
    {
        int x=(int)(sensorEvent.values[0]*100);
        int y=(int)(sensorEvent.values[1]*100);
        int z=(int)(sensorEvent.values[2]*100);
        String status="x=" +x+ "\nY="+y+"\nZ="+z;
        tv1.setText("status="+x+"|"+y+"|"+z);
        cl1.setBackgroundColor(Color.rgb(x,y,z));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
