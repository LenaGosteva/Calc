package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Discr extends MainActivity {

    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextC;
    private TextView textViewX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discr);
        editTextA = findViewById(R.id.a);
        editTextB = findViewById(R.id.b);
        editTextC = findViewById(R.id.c);
        textViewX = findViewById(R.id.x);

    }
    private  double get (EditText editTextA){
        if (editTextA.getText().toString().isEmpty()){
            Toast.makeText(this, "Поля не могут быть пустыми", Toast.LENGTH_SHORT).show();
            return 0.0;
        }

        return Double.parseDouble(editTextA.getText().toString());
    }

    public void click (View view){
        double a = get(editTextA);
        double b = get(editTextB);
        double c = get(editTextC);
        String x = "";

        if (a == 0){
            x += String.format("%.2f", -c/(double)b);
            textViewX.setText(x);
        }
        else{
            double d = (double) (b * b - 4 * a * c);
            if (d < 0) x += "Нет действительных корней";
            else if (d == 0) x += String.format("%.2f", -b / (double) (2 * a));
            else if (d > 0) {
                double x1 = (double) ((-b + Math.sqrt(d)) / (2 * a));
                double x2 = (double) ((-b - Math.sqrt(d)) / (2 * a));
                x +=  String.format("%.2f", x1) + ", " + String.format("%.2f", x2);
            }
            textViewX.setText("ОТВЕТ: "+x);
            Toast.makeText(this, a + "x^2 + " + b + "x + " + c + " = 0", Toast.LENGTH_LONG).show();
        }
    }
    public void back(View view) {
        Intent intent = new Intent(Discr.this, MainActivity.class);
        startActivity(intent);}
}