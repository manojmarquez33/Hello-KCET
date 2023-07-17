package com.manomar.gpacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AboutUs extends AppCompatActivity {

    BottomNavigationView bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        bottom_navigation = findViewById(R.id.bottom_navigation);
        getSupportActionBar().setTitle("About");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        bottom_navigation.setSelectedItemId(R.id.about);
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem ) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), GPA_Activity.class));
                        overridePendingTransition(0,0);
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
    }
}