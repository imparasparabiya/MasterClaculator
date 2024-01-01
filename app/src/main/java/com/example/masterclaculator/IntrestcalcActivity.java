package com.example.masterclaculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class IntrestcalcActivity extends AppCompatActivity {

    TextInputEditText edtpamount, edtinterest, edtyears;
    Button btncalc;

    ImageView backarrow;
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
        backarrow = findViewById(R.id.backarrow);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double principal = Double.parseDouble(edtpamount.getText().toString());
                double interest = Double.parseDouble(edtinterest.getText().toString());
                double years = Double.parseDouble(edtyears.getText().toString());
                double finaltotal;


                double totali = (principal * interest * years) / 100;


                finaltotal = principal + totali;

                edttotal.setText(String.format("%.2f", finaltotal));
            }
        });
    }
}