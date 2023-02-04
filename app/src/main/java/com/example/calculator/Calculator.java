package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Calculator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);
        ImageButton plus = findViewById(R.id.plus);
        ImageButton minus = findViewById(R.id.minus);
        ImageButton times = findViewById(R.id.times);
        ImageButton division = findViewById(R.id.division);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "pls put number" , Toast.LENGTH_SHORT).show();
                } else {
                    int no1 = Integer.parseInt(number1);
                    int no2 = Integer.parseInt(number2);

                    int total = no1 + no2;

                    String totalText = String.valueOf(total);

                    Toast.makeText(getApplicationContext(), "Total : " + totalText , Toast.LENGTH_SHORT).show();
                }

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "pls put number" , Toast.LENGTH_SHORT).show();
                } else {
                    int no1 = Integer.parseInt(number1);
                    int no2 = Integer.parseInt(number2);

                    int total = no1 - no2;

                    String totalText = String.valueOf(total);

                    Toast.makeText(getApplicationContext(), "Total : " + totalText , Toast.LENGTH_SHORT).show();
                }

            }
        });

        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "pls put number" , Toast.LENGTH_SHORT).show();
                } else {
                    int no1 = Integer.parseInt(number1);
                    int no2 = Integer.parseInt(number2);

                    int total = no1 * no2;

                    String totalText = String.valueOf(total);

                    Toast.makeText(getApplicationContext(), "Total : " + totalText , Toast.LENGTH_SHORT).show();
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                if (number1.isEmpty() || number2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "pls put number" , Toast.LENGTH_SHORT).show();
                } else {
                    double no1 = Double.parseDouble(number1);
                    double no2 = Double.parseDouble(number2);

                    double total = no1 / no2;

                    String totalText = String.valueOf(total);

                    Toast.makeText(getApplicationContext(), "Total : " + totalText , Toast.LENGTH_SHORT).show();

//                    Toast.makeText(getApplicationContext(), "Total : " + new DecimalFormat("##.##").format(totalText) , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}