package com.manomar.gpacalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.manomar.gpacalculator.CSE.CSE_Semester3;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class CGPAActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;
    EditText et1,et2,et3,et4,et5,et6,et7,et8;
    Spinner select_sem;
    Button cal_CGPA;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpaactivity);

        bottom_navigation = findViewById(R.id.bottom_navigation);
        getSupportActionBar().setTitle("CGPA Calculator");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        bottom_navigation.setSelectedItemId(R.id.cgpa);
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem ) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.cgpa:
                        return true;

                    case R.id.result:
                        startActivity(new Intent(getApplicationContext(),Sem_Result_Activity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    /*    et1 = findViewById(R.id.Semester1);
        et2 = findViewById(R.id.Semester2);
        et3 = findViewById(R.id.Semester3);
        et4 = findViewById(R.id.Semester4);
        et5 = findViewById(R.id.Semester5);
        et6 = findViewById(R.id.Semester6);
        et7 = findViewById(R.id.Semester7);
        et8 = findViewById(R.id.Semester8);
        select_sem = findViewById(R.id.spin_select_sem);

        cal_CGPA = findViewById(R.id.btn_Cgpa);



        cal_CGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double sem1 = Double.parseDouble(et1.getText().toString());
                double sem2 = Double.parseDouble(et2.getText().toString());
                double sem3 = Double.parseDouble(et3.getText().toString());
                double sem4 = Double.parseDouble(et4.getText().toString());
                double sem5 = Double.parseDouble(et5.getText().toString());
                double sem6 = Double.parseDouble(et6.getText().toString());
                double sem7 = Double.parseDouble(et7.getText().toString());
                double sem8 = Double.parseDouble(et8.getText().toString());

                String spin_sem = select_sem.getSelectedItem().toString();

                double CGPA = 0;
                if(spin_sem.equals("Semester 1"))
                   CGPA = sem1;
                else if(spin_sem.equals("Semester 2"))
                    CGPA = (sem1+sem2)/2;
                else if(spin_sem.equals("Semester 3"))
                    CGPA = (sem1+sem2+sem3)/3;
                else if(spin_sem.equals("Semester 4"))
                    CGPA = (sem1+sem2+sem3+sem4)/4;
                else if(spin_sem.equals("Semester 5"))
                    CGPA = (sem1+sem2+sem3+sem4+sem5)/5;
                else if(spin_sem.equals("Semester 6"))
                    CGPA = (sem1+sem2+sem3+sem4+sem5+sem6)/6;
                else if(spin_sem.equals("Semester 7"))
                    CGPA = (sem1+sem2+sem3+sem4+sem5+sem6+sem7)/7;
                else if(spin_sem.equals("Semester 8"))
                    CGPA = (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;

                double tot_CGPA = (CGPA);
                cal_CGPA.setClickable(true);
                Intent intent = new Intent(CGPAActivity.this, CGPA_Result.class);
                intent.putExtra("cgpa", tot_CGPA);
                startActivity(intent);
            }
        });
        */


    }
}