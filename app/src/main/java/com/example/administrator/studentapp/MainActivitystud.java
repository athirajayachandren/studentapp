package com.example.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitystud extends AppCompatActivity {

    EditText s1,s2;
    Button b1,b2;
    String getsid,getpassword;
    String id= "mzc";
    String pass= "college";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitystud);

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

                    Intent j = new Intent(getApplicationContext(), welcomeActivity.class);
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