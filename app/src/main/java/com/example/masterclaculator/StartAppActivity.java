package com.example.masterclaculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class StartAppActivity extends AppCompatActivity {
    CardView crdmutual, crdintrest, crddiscound, crdemi, crdresult, crdx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);
        crdmutual = findViewById(R.id.crdmutual);
        crdintrest = findViewById(R.id.crdintrest);
        crddiscound = findViewById(R.id.crddiscound);
        crdemi = findViewById(R.id.crdemi);
        crdresult = findViewById(R.id.crdresult);
        crdx2 = findViewById(R.id.crdx2);

        crdmutual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartAppActivity.this,MutualcalcActivity.class);
                startActivity(intent);
            }
        });
        crdintrest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(StartAppActivity.this, IntrestcalcActivity.class);
            startActivity(intent);
            }
        });
        crddiscound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartAppActivity.this,DiscoundcalcActivity.class);
                startActivity(intent);
            }
        });
        crdemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartAppActivity.this,EMIcalcActivity.class);
                startActivity(intent);
            }
        });
        crdresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(StartAppActivity.this,SchoolResultActivity.class);
            startActivity(intent);
            }
        });
        crdx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}