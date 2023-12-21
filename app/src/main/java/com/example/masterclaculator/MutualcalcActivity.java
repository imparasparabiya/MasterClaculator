package com.example.masterclaculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MutualcalcActivity extends AppCompatActivity {
    TextInputEditText edtmontly, edtreturnpr, edttimeyr;
    Button btncalculate;
    EditText edtinvested, edtest, edttotalvalue;
    TextView txtclearall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutualcalc);

        edtmontly = findViewById(R.id.edtmontly);
        edtreturnpr = findViewById(R.id.edtreturnpr);
        edttimeyr = findViewById(R.id.edttimeyr);
        edtinvested = findViewById(R.id.edtinvested);
        edtest = findViewById(R.id.edtest);
        edttotalvalue = findViewById(R.id.edttotalvalue);
        txtclearall = findViewById(R.id.txtclearall);
        btncalculate = findViewById(R.id.btncalculate);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatemutualfund();
            }
        });
    }

    public void calculatemutualfund() {
        try {
            double investment = Double.parseDouble(edtmontly.getText().toString());
            double year = Double.parseDouble(edttimeyr.getText().toString());
            double annualrate;
            annualrate = Double.parseDouble(edtreturnpr.getText().toString());

            double totalvalue;

            year = year * 12;

            double monthlyrate = (annualrate / 100) / 12;

            investment = investment * year;


              totalvalue = investment * (Math.pow(1 + monthlyrate,year) - 1) / monthlyrate;
            double est = totalvalue - investment;

            edtinvested.setText(String.format("%.2f", investment));

            edttotalvalue.setText(String.format("%.2f", totalvalue));

            edtest.setText(String.format("%.2f", est));


        } catch (NumberFormatException e) {
            Toast.makeText(MutualcalcActivity.this, "Please enter all Values", Toast.LENGTH_SHORT).show();
        }
    }

}