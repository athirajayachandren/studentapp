package com.example.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText a1, a2, a3, a4, a5, a6, a7;
    Button b1, b2;
    String name,adno,cog,place,stuid,psw,cpsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        a1 = (EditText) findViewById(R.id.name);
        a2 = (EditText) findViewById(R.id.adno);
        a3 = (EditText) findViewById(R.id.colg);
        a4 = (EditText) findViewById(R.id.place);
        a5 = (EditText) findViewById(R.id.stuid);
        a6 = (EditText) findViewById(R.id.pass);
        a7 = (EditText) findViewById(R.id.cpass);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.areg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=a1.getText().toString();
                adno=a2.getText().toString();
                cog=a3.getText().toString();
                place=a4.getText().toString();
                stuid=a5.getText().toString();
                psw=a6.getText().toString();
                cpsw=a7.getText().toString();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivitystud.class);
                startActivity(i);
            }
        });

    }
}