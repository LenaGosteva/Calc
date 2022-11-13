package com.example.calc;

import static java.lang.Double.NaN;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.ResultSet;

public class Linear extends MainActivity {

    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextC;
    private TextView textViewX;
    private boolean k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        editTextA = findViewById(R.id.a);
        editTextB = findViewById(R.id.b);
        editTextC = findViewById(R.id.c);
        textViewX = findViewById(R.id.x);

    }
//    private  Double get (EditText editTextA){
//        if (editTextA.getText().toString().isEmpty()){
//            if(!k) {
//                Toast.makeText(this, "Поля не могут быть пустыми", Toast.LENGTH_SHORT).show();
//            k = true;
//            }
//            return 0.0;
//        }
//        return Double.parseDouble(editTextA.getText().toString());
//    }
    public void click (View view){
        String sa = editTextA.getText().toString();
        String sb = editTextC.getText().toString();
        String sc = editTextC.getText().toString();
        if(!sa.isEmpty() && !sb.isEmpty() && !sc.isEmpty()) {
            double a = Double.parseDouble(sa);
            double b = Double.parseDouble(sb);
            double c = Double.parseDouble(sc);
            Toast.makeText(this, a + "x + " + b + " = " + c, Toast.LENGTH_LONG).show();
            if (a == 0) textViewX.setText("ОТВЕТ: Уравнение не имеет решений" );
            else {
                double x = (c-b)/(double)a;
                textViewX.setText("ОТВЕТ: " +String.valueOf(x));
            }
        }
        else {
            Toast.makeText(this, "Поля не могут быть пустыми", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    public void back(View view) {
        Intent intent = new Intent(Linear.this, MainActivity.class);
        startActivity(intent);}
}