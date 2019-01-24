package com.example.administrator.studentapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitystud extends AppCompatActivity {

    EditText s1,s2;
    Button b1,b2;
    String getsid,getpassword,checkusername;
    String id= "mzc";
    String pass= "college";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitystud);


        SharedPreferences pref=getSharedPreferences("Login",MODE_PRIVATE);
        checkusername=pref.getString("studentid",null);

        if(checkusername!= null)
        {
            Intent j=new Intent(getApplicationContext(),welcomeActivity.class);
            startActivity(j);
        }


        s1=(EditText)findViewById(R.id.stuid);
        s2=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.log);
        b2=(Button)findViewById(R.id.reg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getsid = s1.getText().toString();
                getpassword = s2.getText().toString();

                if ((getsid .equals(id)) && (getpassword .equals(pass))) {

                    SharedPreferences.Editor editor=getSharedPreferences("Login",MODE_PRIVATE).edit();
                    editor.putString("studentid",getsid);
                    editor.putString("password",getpassword);
                    editor.apply();

                    Intent j = new Intent(getApplicationContext(), welcomeActivity.class);
                   j.putExtra("student",getsid);
                   j.putExtra("password",getpassword);

                    startActivity(j);
                } else {
                    Toast.makeText(getApplicationContext(), "user name and password are incorrect", Toast.LENGTH_LONG).show();
                }


            }

            });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
                {
                    Intent j = new Intent(getApplicationContext(), RegisterActivity.class);
                    startActivity(j);

                }
        });
        }

    }