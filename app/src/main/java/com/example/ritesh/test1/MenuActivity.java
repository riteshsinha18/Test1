package com.example.ritesh.test1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity {
String arr[]={"CalculatorActivity","FullCalciActivity","MainActivity","DealActivity","CameraActivity",
        "IntentDemoActivity","VibrationActivity","SpinnerActivity","RadioActivity","ImageResourceActivity"
        ,"AlertDialogActivity","ToggleSwitchActivity","DateActivity","OptionsMenuActivity","WallpaperActivity",
        "SharedPrefrenceActivity","ProximitySensorActivity","OrientationSensorActivity","SeekbarActivity","SdcardActivity",
        "VideoActivity","NotificationActivity","ServiceDemoActivity"
        ,"MusicActivity","ServiceDemo2Activity","GpsActivity","DatabaseAddActivity","DatabaseViewActivity","DatabaseDeleteActivity","DatabaseUpdateActivity","EXIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_menu);
        ArrayAdapter adapter=new ArrayAdapter(MenuActivity.this,android.R.layout.simple_list_item_1,arr);
        setListAdapter(adapter);
        registerForContextMenu(getListView());
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("options");
        menu.add(0,v.getId(), 0,"Add");
        menu.add(0,v.getId(), 0,"edit");
        menu.add(0,v.getId(), 0,"delete");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
      AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        Toast.makeText(this, arr[(int)info.id], Toast.LENGTH_SHORT).show();
        if(item.getTitle().equals("Add"))
        {
            Toast.makeText(this, "Add invoked", Toast.LENGTH_SHORT).show();

        }
        else if(item.getTitle().equals("Edit"))
        {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().equals("Delete"))
        {
            Toast.makeText(this, "Delete invoked", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String str=arr[position];
        Toast.makeText(this,"Clicked="+str,Toast.LENGTH_SHORT).show();
        if(arr[position].equals("CalculatorActivity"))
        {
            Intent i=new Intent(MenuActivity.this,CalculatorActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("FullCalciActivity"))
        {
            Intent i=new Intent(MenuActivity.this,FullCalciActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("MainActivity"))
        {
            Intent i=new Intent(MenuActivity.this,MainActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("DealActivity"))
        {
            Intent i= new Intent(MenuActivity.this,DealActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("CameraActivity"))
        {
            Intent i=new Intent(MenuActivity.this,CameraActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("IntentDemoActivity"))
        {
            Intent i=new Intent(MenuActivity.this,IntentDemoActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("VibrationActivity"))
        {
            Intent i=new Intent(MenuActivity.this,VibrationActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("SpinnerActivity"))
        {
            Intent i=new Intent(MenuActivity.this,SpinnerActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("RadioActivity"))
        {
            Intent i=new Intent(MenuActivity.this,RadioActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("ImageResourceActivity"))
        {
            Intent i=new Intent(MenuActivity.this,ImageResourceActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("AlertDialogActivity"))
        {
            Intent i=new Intent(MenuActivity.this,AlertDialogActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("ToggleSwitchActivity"))
        {
            Intent i=new Intent(MenuActivity.this,ToggleSwitchActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("DateActivity"))
        {
            Intent i=new Intent(MenuActivity.this,DateActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("OptionsMenuActivity"))
        {
            Intent i=new Intent(MenuActivity.this,OptionsMenuActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("WallpaperActivity"))
        {
            Intent i=new Intent(MenuActivity.this,WallpaperActvity.class);
            startActivity(i);
        }
        else if(arr[position].equals("SharedPrefrenceActivity"))
        {
            Intent i=new Intent(MenuActivity.this,SharedPrefrenceActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("ProximitySensorActivity"))
        {
            Intent i=new Intent(MenuActivity.this,ProximitySensorActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("OrientationSensorActivity"))
        {
            Intent i=new Intent(MenuActivity.this,OrientationSensorActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("SeekbarActivity"))
        {
            Intent i=new Intent(MenuActivity.this,SeekbarActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("SdcardActivity"))
        {
            Intent i=new Intent(MenuActivity.this,SdcardActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("VideoActivity"))
        {
            Intent i=new Intent(MenuActivity.this,VideoActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("NotificationActivity"))
        {
            Intent i=new Intent(MenuActivity.this,NotificationActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("ServiceDemoActivity"))
        {
            Intent i=new Intent(MenuActivity.this,ServiceDemoActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("MusicActivity"))
        {
            Intent i=new Intent(MenuActivity.this,MusicActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("ServiceDemo2Activity"))
        {
            Intent i=new Intent(MenuActivity.this,ServiceDemo2Activity.class);
            startActivity(i);
        }
        else if(arr[position].equals("GpsActivity"))
        {
            Intent i=new Intent(MenuActivity.this,GpsActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("DatabaseAddActivity"))
        {
            Intent i=new Intent(MenuActivity.this,DatabaseAddActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("DatabaseViewActivity"))
        {
            Intent i=new Intent(MenuActivity.this,DatabaseViewActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("DatabaseDeleteActivity"))
        {
            Intent i=new Intent(MenuActivity.this,DatabaseDeleteActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("DatabaseUpdateActivity"))
        {
            Intent i=new Intent(MenuActivity.this,DatabaseUpdateActivity.class);
            startActivity(i);
        }
        else if(arr[position].equals("EXIT"))
        {
            finish();
        }
    }
}
