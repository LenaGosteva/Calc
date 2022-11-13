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
    {

        double f = get(first);
        double s = get(second);
        String ans = Double.toString(f+s);
        textView.setText("ОТВЕТ: "+ ans);
    }

    public void divide(View view)
    {
        double firstNum = get(first);
        double secondNum = get(second);

        if (secondNum != 0)
        {
            String ans = Double.toString(firstNum/secondNum);
            textView.setText("ОТВЕТ: "+ ans);
            return;
        }
        Toast.makeText(getApplicationContext(),  "На ноль делить нельзя",Toast.LENGTH_SHORT).show();

    }

    public void minus(View view)
    {
        double f = get(first);
        double s = get(second);
        String ans = Double.toString(f - s);
        textView.setText("ОТВЕТ: "+ ans);    }

    public void multi(View view)
    {

        double f = get(first);
        double s = get(second);

        String ans = Double.toString(f * s);
        textView.setText("ОТВЕТ: "+ ans);
    }
    public void square(View view) {
        double f = get(first);
        double s = get(second);
        String ans = String.format("%.2f", Math.pow(f, s));
        textView.setText("ОТВЕТ: "+ ans);
    }

    private boolean isStringEmpty( String first, String second)
    {
        return first.isEmpty() || second.isEmpty();
    }


    private double get (EditText a){
        if (a.getText().toString().isEmpty())
        {
            if(!k) {
                Toast.makeText(getApplicationContext(), "Одна из строк пустая", Toast.LENGTH_SHORT).show();
                k = true;
            }
            return 0.0;
        }
        return Float.parseFloat(a.getText().toString());
        }


    public void back(View view) {
        Intent intent = new Intent(Calc.this, MainActivity.class);
        startActivity(intent);}
}


