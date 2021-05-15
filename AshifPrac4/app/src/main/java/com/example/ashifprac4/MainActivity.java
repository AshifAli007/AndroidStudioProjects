package com.example.ashifprac4;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView planet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        planet = (ImageView) findViewById(R.id.planet);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String selectedPlanet = String.valueOf(spinner.getSelectedItem());

        Log.i("selected planet",selectedPlanet);

        if(selectedPlanet.equals("Mercury")){
            planet.setImageResource(R.drawable.mercury);
        }else if(selectedPlanet.equals("Venus")){
            planet.setImageResource(R.drawable.venus);
        }else if(selectedPlanet.equals("Earth")){
            planet.setImageResource(R.drawable.earth);
        }else if(selectedPlanet.equals("Mars")){
            planet.setImageResource(R.drawable.mars);
        }else if(selectedPlanet.equals("Jupiter")){
            planet.setImageResource(R.drawable.jupiter);
        }else if(selectedPlanet.equals("Saturn")){
            planet.setImageResource(R.drawable.saturn);
        }else if(selectedPlanet.equals("Uranus")){
            planet.setImageResource(R.drawable.uranus);
        }else if(selectedPlanet.equals("Neptune")){
            planet.setImageResource(R.drawable.neptune);
        }else if(selectedPlanet.equals("Pluto")){
            planet.setImageResource(R.drawable.pluto);
        }else if(selectedPlanet.equals("Moon")){
            planet.setImageResource(R.drawable.moon);
        }else if(selectedPlanet.equals("Sun")){
            planet.setImageResource(R.drawable.sun);
        }else{
            planet.setImageResource(R.drawable.solar_system);
        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }

}