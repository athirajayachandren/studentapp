package com.example.administrator.studentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

public class userlist extends AppCompatActivity {

    TextView a1;
    String url="https://jsonplaceholder.typicode.com/users";
    String getname,getusername,getemail,getphone,getwebsite,getstreet,getcity,getzipcode,getsuite,finaldata="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlist);

        a1=(TextView)findViewById(R.id.tv);

        FetchData();
    }

    private void FetchData() {

        Log.d("test","working");

        StringRequest stringRequest=new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Log.d("response",response);
                        try {

                            JSONArray jsonArray = new JSONArray(response);
                            for (int i = 0; i<jsonArray.length(); i++)
                            {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                getname = jsonObject.getString("name");
                                Log.d("Names",getname);

                                getusername=jsonObject.getString("username");
                                Log.d("usernames",getusername);

                                getemail=jsonObject.getString("email");
                                Log.d("Email",getemail);

                                getphone=jsonObject.getString("phone");
                                Log.d("Phone",getphone);

                                getwebsite=jsonObject.getString("website");
                                Log.d("Website",getwebsite);

                                JSONObject ob1=new JSONObject(jsonObject.getString("address"));
                                getstreet=ob1.getString("street");
                                Log.d("Address",getstreet);
                                getcity=ob1.getString("city");
                                Log.d("city",getstreet);
                                getzipcode=ob1.getString("zipcode");
                                Log.d("zipcode",getstreet);
                                getsuite=ob1.getString("suite");
                                Log.d("suite",getstreet);

                                finaldata += "Name:" + getname + "\n";
                                finaldata += "username:" + getusername + "\n";
                                finaldata += "Email:" + getemail + "\n\n"+"\n";


                            }
//                            Toast.makeText(getApplicationContext(),finaldata,Toast.LENGTH_SHORT).show();
                               a1.setText(finaldata);
                        }
                    catch(JSONException ob) {
                            Log.d("Exception",ob.toString());

                    }
                        }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );

        RequestQueue requestQueue=Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);

//        Toast.makeText(getApplicationContext(),"function",Toast.LENGTH_LONG).show();
    }
}
