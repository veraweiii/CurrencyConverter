package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        setContentView(R.layout.activity_maintwo);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        double dollars = intent.getDoubleExtra("dollars", 0);
        //String str = intent.getStringExtra("message");
        double pounds = 0.77;
        double result = dollars * pounds ;
        //textView2.setText("Hello " + str);
        textView2.setText(result+" pounds");
        //TextView textView = (TextView)findViewById(R.id.resultText);

    }

}
