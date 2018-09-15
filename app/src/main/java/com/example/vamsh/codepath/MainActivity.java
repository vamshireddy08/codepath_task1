package com.example.vamsh.codepath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("vamshi","clicked");
                TextView textElement = (TextView) findViewById(R.id.textView2);
                textElement.setTextColor(0xFF00FF00);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorOrange));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textElement = (TextView) findViewById(R.id.textView2);
                textElement.setText("Good BYE !!!");
            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset text color back to black from green
                TextView textElement1 = (TextView) findViewById(R.id.textView2);
                textElement1.setTextColor(0xFF000000);
                //reset background color back to pink from orange
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                //reset text back to "welcome to vamshi's app" from "goodbye"
                TextView textElement2 = (TextView) findViewById(R.id.textView2);
                textElement2.setText("Welcome to vamshi's app");

            }
        });
    }
}
