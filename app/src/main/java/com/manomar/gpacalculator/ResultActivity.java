package com.manomar.gpacalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    double GPA;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        getSupportActionBar().setTitle("GPA Result");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        GPA = getIntent().getExtras().getDouble("gpa");
        Result = findViewById(R.id.result);

        
        if(GPA > 5)
            Result.setTextColor(Color.parseColor("#25ec0f"));
        else
            Result.setTextColor(Color.parseColor("#f11010"));
        Result.setText(String.format("%.2f",GPA));
    }
}