package com.example.masterclaculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DiscoundcalcActivity extends AppCompatActivity {

    EditText edtprice, edtdiscount, edtpriceafterdisc, edtsaveamount;
    Button btncount;

    ImageView backarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discoundcalc);

        edtprice = findViewById(R.id.edtprice);
        edtdiscount = findViewById(R.id.edtdiscount);
        edtpriceafterdisc = findViewById(R.id.edtpriceafterdisc);
        edtsaveamount = findViewById(R.id.edtsaveamount);
        btncount = findViewById(R.id.btncount);
        backarrow = findViewById(R.id.backarrow);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double price = Double.parseDouble(edtprice.getText().toString());
                double discount = Double.parseDouble(edtdiscount.getText().toString());
                double result;

                result = price - price * discount / 100;

                double save = price - result;

                edtpriceafterdisc.setText(String.format("%.2f", result));
                edtsaveamount.setText(String.format("%.2f",save));

            }
        });
    }
}