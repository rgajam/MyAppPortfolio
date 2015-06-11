package com.gajamapps.myapps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button appButton1, appButton2, appButton3, appButton4, appButton5, appButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appButton1 = (Button) findViewById(R.id.appButton1);
        appButton2 = (Button) findViewById(R.id.appButton2);
        appButton3 = (Button) findViewById(R.id.appButton3);
        appButton4 = (Button) findViewById(R.id.appButton4);
        appButton5 = (Button) findViewById(R.id.appButton5);
        appButton6 = (Button) findViewById(R.id.appButton6);

        appButton1.setOnClickListener(this);
        appButton2.setOnClickListener(this);
        appButton3.setOnClickListener(this);
        appButton4.setOnClickListener(this);
        appButton5.setOnClickListener(this);
        appButton6.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.aboutButton) {
            Toast.makeText(getApplicationContext(), "This app is designed and developed by Rishikesh Gajam", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "";
        switch (v.getId()) {
            case R.id.appButton1:
                text = "This will open Spotify Streamer App";
                break;
            case R.id.appButton2:
                text = "This will open Scores App";
                break;
            case R.id.appButton3:
                text = "This will open Library App";
                break;
            case R.id.appButton4:
                text = "This will open Build it Bigger App";
                break;
            case R.id.appButton5:
                text = "This will open XYZ Reader App";
                break;
            case R.id.appButton6:
                text = "This will open Capstone: My own App";
                break;
        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}