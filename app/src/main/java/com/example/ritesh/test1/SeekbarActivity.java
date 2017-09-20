package com.example.ritesh.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class SeekbarActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar sb1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        sb1= (SeekBar) findViewById(R.id.seekBar1);
        tv1= (TextView) findViewById(R.id.textView1);
        sb1.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        tv1.setText("Status:" +i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Toast.makeText(SeekbarActivity.this, "Tracking Start", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(SeekbarActivity.this, "Tracking Stopped", Toast.LENGTH_SHORT).show();

    }
}
