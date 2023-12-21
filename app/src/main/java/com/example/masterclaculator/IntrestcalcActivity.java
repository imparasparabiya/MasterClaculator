package com.example.masterclaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class IntrestcalcActivity extends AppCompatActivity {

    TextInputEditText edtpamount, edtinterest, edtyears;
    Button btncalc;

    EditText edttotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrestcalc);

        edtpamount = findViewById(R.id.edtpamount);
        edtinterest = findViewById(R.id.edtinterest);
        edtyears = findViewById(R.id.edtyears);
        edttotal = findViewById(R.id.edttotal);
        btncalc = findViewById(R.id.btncalc);

        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
    }
}