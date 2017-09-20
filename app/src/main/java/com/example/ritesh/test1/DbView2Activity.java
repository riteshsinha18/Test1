package com.example.ritesh.test1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DbView2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db_view2);
        listView1= (ListView) findViewById(R.id.listView1);
        SQLiteDatabase db =openOrCreateDatabase("RCPL_Db",MODE_APPEND,null);
        Cursor cursor=db.rawQuery("select * from Customer",null);
        MyCursorAdapter myCursorAdapter=new MyCursorAdapter(this,cursor,0);
        listView1.setAdapter(myCursorAdapter);
        listView1.setOnItemSelectedListener(this);

    }
    class MyCursorAdapter extends CursorAdapter
    {

        public MyCursorAdapter(Context context, Cursor c, int flags) {
            super(context, c, flags);
        }

        @Override
        public View newView(Context context, Cursor cursor, ViewGroup viewGroup)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v=inflater.inflate(R.layout.row,viewGroup,false);

            return v;
        }

        @Override
        public void bindView(View view, Context context, Cursor cursor)
        {
            TextView tvCid= (TextView) view.findViewById(R.id.textView1);
            TextView tvName= (TextView) view.findViewById(R.id.textView2);
            TextView tvPhone=(TextView) view.findViewById(R.id.textView3);
            int cid=cursor.getInt(cursor.getColumnIndex("_id"));
            String name=cursor.getString(cursor.getColumnIndex("name"));
            String phone=cursor.getString(cursor.getColumnIndex("phone"));
            tvCid.append(String.valueOf(cid));
            tvName.append(name);
            tvPhone.append(phone);

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        Cursor cursor= (Cursor) adapterView.getItemAtPosition(i);
        int cid=cursor.getInt(cursor.getColumnIndex("_id"));
        String name=cursor.getString(cursor.getColumnIndex("name"));
        String phone=cursor.getString(cursor.getColumnIndex("phone"));
        Toast.makeText(this, "Clicked:"+cid+"-"+name+"-"+phone+"-", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
