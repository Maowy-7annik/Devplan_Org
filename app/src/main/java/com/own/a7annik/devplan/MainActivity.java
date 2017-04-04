package com.own.a7annik.devplan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.id;
import static com.own.a7annik.devplan.R.string.app_name;

/*
   Class description:

*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating java-object instance for the button on the layout to connect with
        Button button1 = (Button) findViewById(R.id.Button1);
        // Declaring a new OnClickListener for the button and specifying the behavior with inline
        // declared onClick method of the OnClickListener
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast message floating on the bottom of the screen
                //   .makeText(sending object, message, duration)
                Toast.makeText(MainActivity.this, "Button1", Toast.LENGTH_SHORT).show();

                // Using an intent to pass the task to a different activity to care about
                // Creating the Intent
                Intent i = new Intent(MainActivity.this, TaskActivity.class);
                startActivity(i);
            }
        });

        Button button2 = (Button) findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button2", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });
    }

}

