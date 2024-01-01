package com.example.masterclaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class SchoolResultActivity extends AppCompatActivity {

    ImageView backarrow;

    TextInputEditText edttotalmarks, edtyourmarks;

    Button btncalculate;

    EditText edtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_result);

        backarrow = findViewById(R.id.backarrow);
        edttotalmarks = findViewById(R.id.edttotalmarks);
        edtyourmarks = findViewById(R.id.edtyourmarks);
        btncalculate = findViewById(R.id.btncalculate);
        edtresult = findViewById(R.id.edtresult);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double totalmark = Double.parseDouble(edttotalmarks.getText().toString());
                double yourmark = Double.parseDouble(edtyourmarks.getText().toString());

                totalmark = totalmark / 100;

                double result = yourmark / totalmark;

                edtresult.setText(String.format("%.2f%%", result));
            }
        });
    }
}