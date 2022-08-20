package com.example.myapplication;

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
         Button x=findViewById(R.id.button2);
        EditText hamza=findViewById(R.id.edittxst);
        EditText edittxst1=findViewById(R.id.edittxst1);
        TextView omar=findViewById(R.id.textView5);

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Z= Integer.parseInt(hamza.getText().toString());
                int r= Integer .parseInt(edittxst1.getText().toString());
                int result=Z+r;
                omar.setText(String.valueOf(result));

            }
        });
    }
}