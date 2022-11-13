package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View view) {
                Intent intent = new Intent(MainActivity.this, Linear.class);
                startActivity(intent);
    }
    public void click2(View view) {
                Intent intent = new Intent(MainActivity.this, Discr.class);
                startActivity(intent);
        }

    public void click3(View view) {
        Intent intent = new Intent(MainActivity.this, Calc.class);
        startActivity(intent);
    }
}
