package com.example.ashifprac14;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public static MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String path = "/storage/emulated/0/Download/Serhat Durmus - My Feelings (ft. Georgia Ku).mp3";



        Log.i("Path----------------------------------------------",path);
        player = new MediaPlayer();
        try {
            player.setDataSource(path);
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        player.setLooping(true);
        player.start();
        Log.i("Audio-------------------------------------",String.valueOf(player.getDuration()));

        player.getCurrentPosition();
    }
}