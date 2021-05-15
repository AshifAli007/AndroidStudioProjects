package com.example.ashifprac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textToChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToChange = (TextView) findViewById(R.id.textToChange);
    }
    public void increaseHandler(View v){
        String currentValue = textToChange.getText().toString();
        int newValue = Integer.parseInt(currentValue)+1;
        textToChange.setText("" + newValue + "");
    }
    public void decreaseHandler(View v){
        String currentValue = textToChange.getText().toString();
        int newValue = Integer.parseInt(currentValue)-1;
        textToChange.setText("" + newValue + "");
    }
    public void resetHandler(View v){
        textToChange.setText("0");
    }
}