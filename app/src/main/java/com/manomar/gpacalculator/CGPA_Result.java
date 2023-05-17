package com.manomar.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class CGPA_Result extends AppCompatActivity {

    double R_CGPA;
    TextView CGPA_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_result);

        R_CGPA = getIntent().getExtras().getDouble("cgpa");
        CGPA_Result = findViewById(R.id.cgpa_result);

        getSupportActionBar().setTitle("CGPA Result");

        CGPA_Result.setText(R_CGPA+"");
    }
}