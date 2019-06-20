package com.aldindo.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
private Button usd,euro,pound,yen,baht,rubel,btc,riyal,won;
private TextView textView;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.Edittext);
        usd=findViewById(R.id.dollar);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        yen=findViewById(R.id.yen);
        baht=findViewById(R.id.thaibaht);
        rubel=findViewById(R.id.rubel);
        btc=findViewById(R.id.btc);
        riyal=findViewById(R.id.riyal);
        won=findViewById(R.id.won);

    }

    public void usdconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*0.014;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }
    public void euroconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*0.013;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }
    public void poundconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*0.011;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }
    public void yenconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*1.55;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }
    public void bahtconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*0.45;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }public void rubleconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*0.91 ;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }public void btcconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*0.0000015;
            DecimalFormat decimalFormat=new DecimalFormat("#.0000000");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }
    public void riyalconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*0.054;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }public void wonconverter(View view){
        String text=editText.getText().toString();
        if(TextUtils.isEmpty(text))
        {
            editText.setError("Invalid Input");
        }
        else {
            double parsedValue,finalValue;
            parsedValue=Double.parseDouble(text);
            textView.setText(null);
            finalValue=parsedValue*16.69;
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            textView.setText(""+decimalFormat.format(finalValue));


        }
    }






}
