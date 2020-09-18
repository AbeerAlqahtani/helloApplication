package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

//abeer
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        TextView V = (TextView) findViewById(R.id.textView);
        Intent i = getIntent();
        V.setText("Hello, " + i.getStringExtra("personName"));
    }
}