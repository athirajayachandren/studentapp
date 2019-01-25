package com.example.administrator.studentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class view extends AppCompatActivity {

    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        lv=(ListView)findViewById(R.id.mylistview);

        String[] students={"Ammu","Anju","Manu","Renju","Sanju"};

        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),R.layout.list_item_view,students);
        lv.setAdapter(adapter);

    }
}
