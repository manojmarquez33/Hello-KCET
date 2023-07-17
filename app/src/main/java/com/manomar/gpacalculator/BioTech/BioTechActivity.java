package com.manomar.gpacalculator.BioTech;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.manomar.gpacalculator.R;

public class BioTechActivity extends AppCompatActivity implements View.OnClickListener {
    CardView card1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_tech);

        getSupportActionBar().setTitle("BioTechnology");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        card1 = findViewById(R.id.card_BT_sem3);
        card2 = findViewById(R.id.card_BT_sem4);
        card3 = findViewById(R.id.card_BT_sem5);
        card4 = findViewById(R.id.card_BT_sem6);
        card5 = findViewById(R.id.card_BT_sem7);
        card6 = findViewById(R.id.card_BT_sem8);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.card_BT_sem3:
                i = new Intent(BioTechActivity.this,BT_sem3.class);
                startActivity(i);
                break;
            case R.id.card_BT_sem4:
                i = new Intent(BioTechActivity.this, BT_sem4.class);
                startActivity(i);
                break;
            case R.id.card_BT_sem5:
                i = new Intent(BioTechActivity.this, BT_sem5.class);
                startActivity(i);
                break;
            case R.id.card_BT_sem6:
                i = new Intent(BioTechActivity.this, BT_sem6.class);
                startActivity(i);
                break;
            case R.id.card_BT_sem7:
                i = new Intent(BioTechActivity.this, BT_sem7.class);
                startActivity(i);
                break;
            case R.id.card_BT_sem8:
                i = new Intent(BioTechActivity.this, BT_sem8.class);
                startActivity(i);
                break;

        }

    }
}