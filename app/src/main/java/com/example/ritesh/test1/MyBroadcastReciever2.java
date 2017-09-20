package com.example.ritesh.test1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyBroadcastReciever2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Bundle bundle=intent.getExtras();
        if(bundle!=null)
        {
            String state=bundle.getString("state");
            if(state.equals("RINGING"))
            {
                Toast.makeText(context, "PICKUP THE PHONE", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
