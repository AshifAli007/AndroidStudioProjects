package com.example.ashifprac9;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class changeTextColor extends Fragment implements View.OnClickListener {
    Button changeText;
    TextView mainText;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_change_text_color, container, false);
        mainText = (TextView) view.findViewById(R.id.mainText);
        changeText = (Button) view.findViewById(R.id.changeText);
        changeText.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int red = new Random().nextInt(266);
        int green = new Random().nextInt(266);
        int blue = new Random().nextInt(266);
        mainText.setTextColor(Color.rgb(red,green,blue));
    }
}