package com.example.ashifprac13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        TextView text = findViewById(R.id.textView);

        String message = getIntent().getStringExtra("message");
        text.setText(message);
    }
}