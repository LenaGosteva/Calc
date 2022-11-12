package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Linear extends MainActivity {

    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextC;
    private TextView textViewX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
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
        double x = (c-b)/(double)a;
        textViewX.setText(String.format("%.2f", x));
        Toast.makeText(this, a + "x + " + b + " = " + c, Toast.LENGTH_LONG).show();
    }

    public void back(View view) {
        Intent intent = new Intent(Linear.this, MainActivity.class);
        startActivity(intent);}
}