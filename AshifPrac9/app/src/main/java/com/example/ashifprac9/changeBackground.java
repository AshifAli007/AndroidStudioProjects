package com.example.ashifprac9;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;


public class changeBackground extends Fragment implements View.OnClickListener{
    Button changeBg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_change_background, container, false);
        changeBg = (Button) view.findViewById(R.id.changeBg);
        changeBg.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int red = new Random().nextInt(266);
        int green = new Random().nextInt(266);
        int blue = new Random().nextInt(266);
        getView().setBackgroundColor(Color.rgb(red,green,blue));

    }
}

