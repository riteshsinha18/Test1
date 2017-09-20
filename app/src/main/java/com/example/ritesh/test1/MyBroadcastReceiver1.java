package com.example.ritesh.test1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver1 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent)
    {
        String str=intent.getAction();
        if(str.equals("android.intent.action.ACTION_POWER_CONNECTED"))
        {
            Toast.makeText(context, "Charging started by ritesh", Toast.LENGTH_SHORT).show();

        }//end of if block
        else
        {
            Toast.makeText(context, "Chaging disconnected", Toast.LENGTH_SHORT).show();
        }
    }
}
