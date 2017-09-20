package com.example.ritesh.test1;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class IntentDemoActivity extends ListActivity {
    String arr[]={"PHONECALL","SMS","WEB","WEB SEARCH","PHONEBOOK","MAP SEARCH","EXIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_menu);
        ArrayAdapter adapter=new ArrayAdapter(IntentDemoActivity.this,android.R.layout.simple_list_item_1,arr);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String str=arr[position];
        Toast.makeText(this,"Clicked="+str,Toast.LENGTH_SHORT).show();
        if(arr[position].equals("PHONECALL"))
        {
            Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9717023877"));
            startActivity(i);
        }
        else if(arr[position].equals("SMS"))
        {
            Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:9717023877"));
            i.putExtra("sms_body","Code Testing");
            startActivity(i);

            }
            else if(arr[position].equals("WEB"))
        {
               Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
            startActivity(i);

        }
        else if(arr[position].equals("WEB SEARCH"))
        {

            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
            i.putExtra(SearchManager.QUERY,"Indian Rail timing");
            startActivity(i);

        }
        else if(arr[position].equals("PHONEBOOK"))
        {
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));
            startActivity(i);
        }
        else if(arr[position].equals("MAP SEARCH"))
        {
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=Delhi"));
            startActivity(i);
        }
        else if(arr[position].equals("EXIT"))
        {
            finish();
        }
    }
}
