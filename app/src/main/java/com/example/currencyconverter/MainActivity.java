package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToPounds(View view){
        EditText editText = (EditText) findViewById(R.id.textField);
        int dollars = Integer.parseInt(editText.getText().toString());
        double pounds = 0.77;
        double result = dollars * pounds ;
        TextView textView = (TextView)findViewById(R.id.resultText);
        textView.setText(Double.toString(result)+" pounds");
        //Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
    }


}
