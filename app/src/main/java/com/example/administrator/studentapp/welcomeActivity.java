package com.example.administrator.studentapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {
    String sid,pass,chackuser;
   String getsid,getPass;
   Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        b=(Button)findViewById(R.id.logout);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("Login",MODE_PRIVATE).edit();
                editor.clear();
                editor.commit();

                Intent j=new Intent(getApplicationContext(),MainActivitystud.class);
                startActivity(j);
            }
        });

        SharedPreferences sharedPreferences=getSharedPreferences("Login",MODE_PRIVATE);
       getsid=sharedPreferences.getString("studentid",null);
       getPass=sharedPreferences.getString("password",null);
        Toast.makeText(getApplicationContext(),getsid,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),getPass,Toast.LENGTH_LONG).show();



//        Intent j=getIntent();
//        sid=j.getStringExtra("studentid");
//        pass=j.getExtras().getString("password");

//        Toast.makeText(getApplicationContext(),sid,Toast.LENGTH_LONG).show();
//        Toast.makeText(getApplicationContext(),pass,Toast.LENGTH_LONG).show();

    }
}
