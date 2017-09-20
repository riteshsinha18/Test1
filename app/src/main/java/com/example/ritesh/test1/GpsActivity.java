package com.example.ritesh.test1;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class GpsActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);
        tv1 = (TextView) findViewById(R.id.textView11);
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        MylocationListener locationlistener = new MylocationListener();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 0, locationlistener);

    }
    class MylocationListener implements LocationListener
    {

        @Override
        public void onLocationChanged(Location location)
        {
            String text="\nlatitude:" +location.getLatitude()+"\nlongitude:"+ location.getLongitude();
            tv1.setText(text);

        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s)
        {
            Toast.makeText(GpsActivity.this, "GPS dissabled", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onProviderDisabled(String s)
        {
            Toast.makeText(GpsActivity.this, "GPS enabled", Toast.LENGTH_SHORT).show();

        }
    }
}
