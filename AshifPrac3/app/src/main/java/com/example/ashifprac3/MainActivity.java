package com.example.ashifprac3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static TextView username, password;
    Button loginButton;
    int attemptsLeft = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.loginButton);

    }
    public void onLoginHandler(View v){
        String currentUser = username.getText().toString();
        String currentPassword = password.getText().toString();

        if(currentPassword.isEmpty() || currentPassword.isEmpty()){
            Toast.makeText(MainActivity.this, "Username or Password Empty", Toast.LENGTH_LONG).show();
        }else{
            boolean isValid = userValidation(currentUser, currentPassword);
            Log.i("inside else","fdfdf");
            if(isValid){
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                attemptsLeft = 5; // resetting attempts on successful login only.

            }else{
                attemptsLeft--;
                if (attemptsLeft == 0){
                    loginButton.setEnabled(false);
                }
                Toast.makeText(getBaseContext(), "Login Failed", Toast.LENGTH_SHORT).show();
                Log.i("Attempts Left", String.valueOf(attemptsLeft));

            }
        }

    }
    public boolean userValidation(String username, String password){
        String savedUsername = "AshifAli007";
        String savedPassword = "123";
        Log.i("inside userValidation", String.valueOf(password.equals(savedPassword)));

        return username.equals(savedUsername) && password.equals(savedPassword);
    }
}