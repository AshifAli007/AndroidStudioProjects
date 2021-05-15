package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increaseFont(View view){
        TextView welcomeText = (TextView) findViewById(R.id.welcomeText);
//        welcomeText.setTextSize((float) (welcomeText.getTextSize()+0.1));
        Log.i(String.valueOf(welcomeText.getTextSize()), "increaseFont: ");

    }
    public void decreaseFont(View view){
//        TextView welcomeText = (TextView) findViewById(R.id.welcomeText);
//        welcomeText.setTextSize(welcomeText.getTextSize());
    }
}