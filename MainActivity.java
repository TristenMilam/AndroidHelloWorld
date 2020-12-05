package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button to change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((TextView) findViewById(R.id.text)).getCurrentTextColor() == getResources().getColor(R.color.black)) {
                    ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
                }
                else {
                    ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        //Button to change background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((RelativeLayout) findViewById(R.id.background)).setBackgroundColor(getResources().getColor(R.color.limegreen));
            }
        });

        //Button to change text
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //Press background to reset all fields
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Hello from Tristen!");
                ((RelativeLayout) findViewById(R.id.background)).setBackgroundColor(getResources().getColor(R.color.babyblue));
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.black));
            }
        });

        //Press button to submit textbox into main text
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userText = ((EditText) findViewById(R.id.textbox)).getText().toString();
                ((TextView) findViewById(R.id.text)).setText(userText);
            }
        });
    }
}