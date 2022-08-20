package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView calculator = findViewById(R.id.TV1);

        TextView result = findViewById(R.id.TV2);

        EditText Number1 = findViewById(R.id.ET1);
        EditText Number2 = findViewById(R.id.ET2);

        Button calculate = findViewById(R.id.button);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumber = Integer.parseInt(Number1.getText().toString()) ;
                int secondNumber = Integer.parseInt(Number2.getText().toString());

                int results = firstNumber + secondNumber;

                result.setText(String.valueOf(results));

            }
        });


    }
}