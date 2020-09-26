package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie x = new Movie("Megalodon","Vin Diesel", 98.9 ,18, "Thriller");

        Movie y = new Movie("Nemo", "Marlin", 90.8, 3, "Animation");


    }
}