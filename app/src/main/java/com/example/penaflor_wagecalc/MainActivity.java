package com.example.penaflor_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Title;
    TextView Num1;
    TextView Total;
    TextView Rate;
    TextView Noofhours;
    TextView Num2;
    TextView Gross;
    Button compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = findViewById(R.id.txtTitle);
        Num1 = findViewById(R.id.txtNum1);
        Total = findViewById(R.id.txtTotal);
        Rate = findViewById(R.id.txtRate);
        Noofhours = findViewById(R.id.txtNo_ofhours);
        Num2 = findViewById(R.id.txtNum2);
        Gross = findViewById(R.id.txtGross);
        compute = findViewById(R.id.btncompute);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rateStr = Num1.getText().toString();
                String hoursStr = Num2.getText().toString();

                if (!rateStr.isEmpty() && !hoursStr.isEmpty()) {

                    double rate = Double.parseDouble(rateStr);
                    double hours = Double.parseDouble(hoursStr);

                    double grossPay = rate * hours;

                    Total.setText("PHP " + String.format("%.2f", grossPay));
                } else {

                    Total.setText("enter both rate and hours.");
                }
            }
        });
    }
}