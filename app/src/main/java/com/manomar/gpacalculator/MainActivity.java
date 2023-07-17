package com.manomar.gpacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.manomar.gpacalculator.AIDS.AidsActivity;
import com.manomar.gpacalculator.BioTech.BioTechActivity;
import com.manomar.gpacalculator.CIVIL.CivilActivity;
import com.manomar.gpacalculator.CSE.CseActivity;
import com.manomar.gpacalculator.ECE.EceActivity;
import com.manomar.gpacalculator.EEE.EeeActivity;
import com.manomar.gpacalculator.IT.ITActivity;
import com.manomar.gpacalculator.MECHANIC.MechanicActivity;
import com.manomar.gpacalculator.MECHATRONICS.MechatronicsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    BottomNavigationView bottomNavigationView;

    DrawerLayout drawerLayout;
    CardView card1,card2,card3,card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem ) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        return true;

                    case R.id.about:
                        startActivity(new Intent(getApplicationContext()
                                ,AboutUs.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });

        card1 = findViewById(R.id.card_result);
        card2 = findViewById(R.id.card_gpa);
        card3 = findViewById(R.id.card_cgpa);
        card4 = findViewById(R.id.card_timetable);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

    }
        @Override
        public void onClick(View view) {
            Intent i;

            switch (view.getId()){
                case R.id.card_result:
                    i = new Intent(MainActivity.this,Sem_Result_Activity.class);
                    startActivity(i);
                    break;
                case R.id.card_gpa:
                    i = new Intent(MainActivity.this, GPA_Activity.class);
                    startActivity(i);
                    break;
                case R.id.card_cgpa:
                    i = new Intent(MainActivity.this, CGPAActivity.class);
                    startActivity(i);
                    break;
                case R.id.card_timetable:
                    i = new Intent(MainActivity.this, Class_Time_Table.class);
                    startActivity(i);
                    break;



            }
    }
}