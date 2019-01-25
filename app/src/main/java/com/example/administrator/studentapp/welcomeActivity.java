package com.example.administrator.studentapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {
    String sid,pass,chackuser;
   String getsid,getPass;
   Button b,b1;
   ImageView a1,a2,a3,a4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        b=(Button)findViewById(R.id.logout);
        b1=(Button)findViewById(R.id.view);

        a1=(ImageView)findViewById(R.id.add);
        a2=(ImageView)findViewById(R.id.sub);
        a3=(ImageView)findViewById(R.id.mul);
        a4=(ImageView)findViewById(R.id.div);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"addition",Toast.LENGTH_LONG).show();
            }
        });

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

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("Login",MODE_PRIVATE).edit();
                editor.clear();
                editor.commit();

                Intent j=new Intent(getApplicationContext(),view.class);
                startActivity(j);
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),add.class);
                startActivity(i);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),sub.class);
                startActivity(i);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),mul.class);
                startActivity(i);
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),div.class);
                startActivity(i);
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
