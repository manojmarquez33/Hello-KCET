package com.manomar.gpacalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstYear extends AppCompatActivity {


    CardView card_sem1,card_sem2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);

        getSupportActionBar().setTitle("First Year");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        card_sem1 = findViewById(R.id.card_1year_sem1);
        card_sem2 = findViewById(R.id.card_1year_sem2);

        card_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstYear.this,SemesterOne.class);
                startActivity(intent);
            }
        });

     ;

        card_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FirstYear.this,SemesterTwo.class);
                startActivity(intent);
            }
        });

    }
}
