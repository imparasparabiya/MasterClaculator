package com.example.masterclaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class EMIcalcActivity extends AppCompatActivity {

    TextInputEditText edtpamount, edtinterest, edtyears;
    Button btnemi;
    EditText edttotal;

    ImageView backarrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emicalc);

        edtpamount = findViewById(R.id.edtpamount);
        edtinterest = findViewById(R.id.edtinterest);
        edtyears = findViewById(R.id.edtyears);
        edttotal = findViewById(R.id.edttotal);
        btnemi = findViewById(R.id.btnemi);
        backarrow = findViewById(R.id.backarrow);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double principal = Double.parseDouble(edtpamount.getText().toString());
                double irate = Double.parseDouble(edtinterest.getText().toString());
                double year = Double.parseDouble(edtyears.getText().toString());
                double interestamount;


                double monthlyinteres = irate / 100 / 12;

                year = year * 12;

                interestamount = (principal * monthlyinteres * Math.pow(1 + monthlyinteres, year))
                        / (Math.pow(1 + monthlyinteres, year) - 1);


                edttotal.setText(String.format("%.2f", interestamount));

            }
        });
    }
}