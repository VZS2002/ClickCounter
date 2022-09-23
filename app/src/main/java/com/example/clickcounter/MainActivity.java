package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView szamlalo;
    private Button plusz;
    private Button minusz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView szamlalo = findViewById(R.id.szamlalo);
        Button plusz = findViewById(R.id.plusz);
        Button minusz = findViewById(R.id.minusz);

        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int szam = Integer.parseInt(szamlalo.getText().toString());
            szamlalo.setText(szam+1);

            if (szam>=0){
                szamlalo.setTextColor(Color.GREEN);
            }

                else if (szam<0){
                    szamlalo.setTextColor(Color.RED);
                }

                    else if (szam==0){
                        szamlalo.setTextColor(Color.BLUE);
                    }
            }


        });

        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(szamlalo.getText().toString());
                szamlalo.setText(a-1);
            }

        });

        szamlalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(szamlalo.getText().toString());
                szamlalo.setText("0");
            }

        });
    }
}