package com.example.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class div extends AppCompatActivity {

    EditText n1,n2,n3;
    Button b1,b2;
    String s1,s2,s3;
    Integer a1,a2,a3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);

        n1=(EditText)findViewById(R.id.num1);
        n2=(EditText)findViewById(R.id.num2);
        n3=(EditText)findViewById(R.id.result);
        b1=(Button) findViewById(R.id.div);
        b2=(Button)findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=n1.getText().toString();
                s2=n2.getText().toString();

                a1=Integer.parseInt(s1);
                a2=Integer.parseInt(s2);
                a3=a1/a2;
                s3=String.valueOf(a3);
                n3.setVisibility(View.VISIBLE);
                n3.setText(s3);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(getApplicationContext(),welcomeActivity.class);
                startActivity(j);
            }
        });
    }
}
