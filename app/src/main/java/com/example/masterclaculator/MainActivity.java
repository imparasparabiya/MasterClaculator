package com.example.masterclaculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView startapp, aboutus, txtshare, rateapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startapp = findViewById(R.id.startapp);
        aboutus = findViewById(R.id.aboutus);
        txtshare = findViewById(R.id.txtshare);
        rateapp = findViewById(R.id.rateapp);

        startapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StartAppActivity.class);
                startActivity(intent);
            }
        });
    }
}