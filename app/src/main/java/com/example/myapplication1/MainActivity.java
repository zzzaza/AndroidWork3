package com.example.myapplication1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnPage1,btnPage2,btnPage3,btnPage4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnPage1 = findViewById(R.id.btnPage1);
        btnPage2 = findViewById(R.id.btnPage2);
        btnPage3 = findViewById(R.id.btnPage3);
        btnPage4 = findViewById(R.id.btnPage4);

        btnPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page1.class);
                startActivity(intent);
            }
        });

        btnPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page2.class);
                startActivity(intent);
            }
        });

        btnPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page3.class);
                startActivity(intent);
            }
        });

        btnPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Page4.class);
                startActivity(intent);
            }
        });

    }
}