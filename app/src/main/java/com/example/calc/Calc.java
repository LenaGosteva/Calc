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

public class Calc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
    EditText first;
    EditText second;

    public void plus(View view)
    {
        TextView info = findViewById(R.id.textV);
        first = findViewById(R.id.editFirst);
        second = findViewById(R.id.editSecond);

        if (isStringEmpty(first.getText().toString(), second.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),  "Одна из строк пустая\nПопробуйте заново", Toast.LENGTH_SHORT).show();
            return;
        }

        if ((isStringCorrect(first.getText().toString()) || isStringCorrect(second.getText().toString())))
        {
            Toast.makeText(getApplicationContext(), "В строке не число\nПопробуйте заново", Toast.LENGTH_SHORT).show();
            return;
        }
        Float answer = Float.parseFloat(first.getText().toString()) + Float.parseFloat(second.getText().toString());
        String ans = Float.toString(answer);
        info.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        info.setText(ans);
    }

    public void divide(View view)
    {
        first = findViewById(R.id.editFirst);
        second = findViewById(R.id.editSecond);
        TextView info = findViewById(R.id.textV);

        if (isStringEmpty(first.getText().toString(), second.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),  "Одна из строк пустая\nПопробуйте заново", Toast.LENGTH_SHORT).show();
            return;
        }

        float firstNum = Float.parseFloat(first.getText().toString());
        float secondNum = Float.parseFloat(second.getText().toString());

        if (secondNum != 0)
        {
            String ans = Float.toString(firstNum/secondNum);
            info.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
            info.setText(ans);
            return;
        }
        Toast.makeText(getApplicationContext(),  "На ноль делить нельзя",Toast.LENGTH_SHORT).show();

    }

    public void minus(View view)
    {
        first = findViewById(R.id.editFirst);
        second = findViewById(R.id.editSecond);
        TextView info = findViewById(R.id.textV);

        if (isStringEmpty(first.getText().toString(), second.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),  "Одна из строк пустая\nПопробуйте заново", Toast.LENGTH_SHORT).show();
            return;
        }

        float answer = Float.parseFloat(first.getText().toString()) - Float.parseFloat(second.getText().toString());
        String ans = Float.toString(answer);
        info.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        info.setText(ans);
    }

    public void multi(View view)
    {
        first = findViewById(R.id.editFirst);
        second = findViewById(R.id.editSecond);
        TextView info = findViewById(R.id.textV);

        if (isStringEmpty(first.getText().toString(), second.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),  "Одна из строк пустая\nПопробуйте заново", Toast.LENGTH_SHORT).show();
            return;
        }
        float answer = Float.parseFloat(first.getText().toString()) * Float.parseFloat(second.getText().toString());
        String ans = Float.toString(answer);
        info.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        info.setText(ans);
    }
    public void square(View view) {
        first = findViewById(R.id.editFirst);
        second = findViewById(R.id.editSecond);
        TextView info = findViewById(R.id.textV);

        if (isStringEmpty(first.getText().toString(), second.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),  "Одна из строк пустая\nПопробуйте заново", Toast.LENGTH_SHORT).show();
            return;
        }
        Double answer = Math.pow(Double.parseDouble(first.getText().toString()), Double.parseDouble(second.getText().toString()));
        String ans = Double.toString(answer);
        info.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        info.setText(ans);
    }

    private boolean isStringEmpty( String first, String second)
    {
        if (first.isEmpty() || second.isEmpty())
        {
            return true;
        }
        return false;
    }
    private boolean isStringCorrect(String str) {
        int flag = 0;
        int len = str.length();
        int i;
        for (i = 0; i < len - 1; ++i) {
            if ("0123456789".contains(str.substring(i, i + 1))) {
                continue;
            }
            if (str.substring(i, i + 1) == "." || i != 0) {
                flag++;
                continue;
            }
            return false;
        }
        if (flag != 1) {
            return false;
        }
        return true;
    }
    public void back(View view) {
        Intent intent = new Intent(Calc.this, MainActivity.class);
        startActivity(intent);}
}

