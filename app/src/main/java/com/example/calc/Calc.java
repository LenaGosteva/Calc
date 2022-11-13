package com.example.calc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calc<first> extends AppCompatActivity {

    EditText first;
    EditText second;
    TextView info;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        first = findViewById(R.id.editFirst);
        second  = findViewById(R.id.editSecond);
        info = findViewById(R.id.textV);
        textView = findViewById(R.id.textV);


    }
    boolean k = false;

    public void plus(View view)
    {   String sf = first.getText().toString();
        String ss = second.getText().toString();
        if(!sf.isEmpty() && !ss.isEmpty()) {
            double f = Double.parseDouble(sf);
            double s = Double.parseDouble(ss);
            String ans = Double.toString(f + s);
            textView.setText("ОТВЕТ: " + ans);
        }
        else{
            Toast.makeText(getApplicationContext(), "Одна из строк пустая", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void divide(View view)
    {
        String sf = first.getText().toString();
        String ss = second.getText().toString();
        if(!sf.isEmpty() && !ss.isEmpty()) {
            double f = Double.parseDouble(sf);
            double s = Double.parseDouble(ss);
            if (s != 0)
            {
                String ans = Double.toString(f/s);
                textView.setText("ОТВЕТ: "+ ans);
                return;
            }
            Toast.makeText(getApplicationContext(),  "На ноль делить нельзя",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Одна из строк пустая", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    public void minus(View view)
    {String sf = first.getText().toString();
        String ss = second.getText().toString();
        if(!sf.isEmpty() && !ss.isEmpty()) {
            double f = Double.parseDouble(sf);
            double s = Double.parseDouble(ss);
            String ans = Double.toString(f - s);
            textView.setText("ОТВЕТ: " + ans);
        }
        else{
            Toast.makeText(getApplicationContext(), "Одна из строк пустая", Toast.LENGTH_SHORT).show();
            return;
        }}

    public void multi(View view)
    {
        String sf = first.getText().toString();
        String ss = second.getText().toString();
        if(!sf.isEmpty() && !ss.isEmpty()) {
            double f = Double.parseDouble(sf);
            double s = Double.parseDouble(ss);
            String ans = Double.toString(f * s);
            textView.setText("ОТВЕТ: " + ans);
        }
        else{
            Toast.makeText(getApplicationContext(), "Одна из строк пустая", Toast.LENGTH_SHORT).show();
            return;
        }
    }
    public void square(View view) {
        String sf = first.getText().toString();
        String ss = second.getText().toString();
        if(!sf.isEmpty() && !ss.isEmpty()) {
            double f = Double.parseDouble(sf);
            double s = Double.parseDouble(ss);
            String ans = Double.toString(Math.pow(f, s));
            textView.setText("ОТВЕТ: " + ans);
        }
        else{
            Toast.makeText(getApplicationContext(), "Одна из строк пустая", Toast.LENGTH_SHORT).show();
            return;
        }
    }


//
//    private double get (EditText a){
//        if (a.getText().toString().isEmpty())
//        {
//
//            Toast.makeText(getApplicationContext(),  "Одна из строк пустая", Toast.LENGTH_SHORT).show();
//            return 0.0;
//        }
//        return Float.parseFloat(a.getText().toString());
//        }
//

    public void back(View view) {
        Intent intent = new Intent(Calc.this, MainActivity.class);
        startActivity(intent);}
}


