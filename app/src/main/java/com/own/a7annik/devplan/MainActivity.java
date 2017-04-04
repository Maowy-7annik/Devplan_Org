package com.own.a7annik.devplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.R.attr.name;
import static com.own.a7annik.devplan.R.string.app_name;

/*
   Class description:

*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button1_click(View view) {
        // Toast message floating on the bottom of the screen
        //   .makeText(sending object, message, duration)
        Toast.makeText(this, getString(app_name), Toast.LENGTH_SHORT).show();

        // Using an intent to switch the activity from MainActivity to TaskActivity
        //
        Intent i = new Intent(this, TaskActivity.class);
        startActivity(i);
    }
}
