package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    public void convertToPounds(View view)  {
        EditText editText = (EditText) findViewById(R.id.textField);
        double dollars = Integer.parseInt(editText.getText().toString());
//        double pounds = 0.77;
//        double result = dollars * pounds ;
        goToActivity2(dollars);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
//        Log.i("Info", "Button pressed!");
    }

    public void goToActivity2(Double s) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("dollars", s);
        startActivity(intent);
    }

//    public void convertToPounds(View view){
//        EditText editText = (EditText) findViewById(R.id.textField);
//        int dollars = Integer.parseInt(editText.getText().toString());
//        double pounds = 0.77;
//        double result = dollars * pounds ;
//        TextView textView = (TextView)findViewById(R.id.resultText);
//        textView.setText(Double.toString(result)+" pounds");
//        //Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
//    }


}
