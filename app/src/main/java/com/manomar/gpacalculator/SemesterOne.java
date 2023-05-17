package com.manomar.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SemesterOne extends AppCompatActivity {

    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8,spinner9;
    Button cal_gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_one);

        cal_gpa = findViewById(R.id.btn_gpa_sem1);
        getSupportActionBar().setTitle("Semester 1");
        getSupportActionBar().setTitle("GPA Result");


        spinner1 = findViewById(R.id.sem1_spin1);
        spinner2 = findViewById(R.id.sem1_spin2);
        spinner3 = findViewById(R.id.sem1_spin3);
        spinner4 = findViewById(R.id.sem1_spin4);
        spinner5 = findViewById(R.id.sem1_spin5);
        spinner6 = findViewById(R.id.sem1_spin6);
        spinner7 = findViewById(R.id.sem1_spin7);
        spinner8 = findViewById(R.id.sem1_spin8);
        spinner9 = findViewById(R.id.sem1_spin9);

        cal_gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateGPA();
            }

        });
    }
    public void calculateGPA(){

        try {


            String English = spinner1.getSelectedItem().toString();
            String Maths = spinner2.getSelectedItem().toString();
            String Physics = spinner3.getSelectedItem().toString();
            String POE = spinner4.getSelectedItem().toString();
            String Coding = spinner5.getSelectedItem().toString();
            String Chemistry = spinner6.getSelectedItem().toString();
            String Mat_lab = spinner7.getSelectedItem().toString();
            String Phy_lab = spinner8.getSelectedItem().toString();
            String Code_lab = spinner8.getSelectedItem().toString();


            int total_credits = 22;


            //English-----------------------------------------
            int sub1 = 0;
            if (English.equals("Your grade")) {
                Toast.makeText(this, "SH2101 is empty", Toast.LENGTH_SHORT).show();
            }else
            if (English.equals("O - Outstanding")) {
                sub1 = 3 * 10;
            } else if (English.equals("A+ - Excellent")) {
                sub1 = 3 * 9;
            } else if (English.equals("A - Very Good")) {
                sub1 = 3 * 8;
            } else if (English.equals("B+ - Good")) {
                sub1 = 3 * 7;
            } else if (English.equals("B - Average")) {
                sub1 = 3 * 6;
            } else if (English.equals("RA - Re-appear")) {
                sub1 = 3 * 0;
            } else if (English.equals("SA - Shortage attendence")) {
                sub1 = 3 * 0;
            } else if (English.equals("WH - Malpractice")) {
                sub1 = 3 * 0;
            }


            // Maths ---------------------------------------
            int sub2 = 0;

            if (Maths.equals("Your grade")) {
                Toast.makeText(this, "MA2101 is empty", Toast.LENGTH_SHORT).show();
            }else if (Maths.equals("O - Outstanding")) {
                sub2 = 4 * 10;
            } else if (Maths.equals("A+ - Excellent")) {
                sub2 = 4 * 9;
            } else if (Maths.equals("A - Very Good")) {
                sub2 = 4 * 8;
            } else if (Maths.equals("B+ - Good")) {
                sub2 = 4 * 7;
            } else if (Maths.equals("B - Average")) {
                sub2 = 4 * 6;
            } else if (Maths.equals("RA - Re-appear")) {
                sub2 = 4 * 0;
            } else if (Maths.equals("SA - Shortage attendence")) {
                sub2 = 4 * 0;
            } else if (Maths.equals("WH - Malpractice")) {
                sub2 = 4 * 0;
            }



            // Physics-----------------------------------------

            int sub3 = 0;
            if (Physics.equals("Your grade")) {
                Toast.makeText(this, "PH2101 is empty", Toast.LENGTH_SHORT).show();
            }else if (Physics.equals("O - Outstanding")) {
                sub3 = 3 * 10;
            } else if (Physics.equals("A+ - Excellent")) {
                sub3 = 3 * 9;
            } else if (Physics.equals("A - Very Good")) {
                sub3 = 3 * 8;
            } else if (Physics.equals("B+ - Good")) {
                sub3 = 3 * 7;
            } else if (Physics.equals("B - Average")) {
                sub3 = 3 * 6;
            } else if (Physics.equals("RA - Re-appear")) {
                sub3 = 3 * 0;
            } else if (Physics.equals("SA - Shortage attendence")) {
                sub3 = 3 * 0;
            } else if (Physics.equals("WH - Malpractice")) {
                sub3 = 3 * 0;
            }


            //POE-----------------------------------------
            int sub4 = 0;
            if (POE.equals("Your grade")) {
                Toast.makeText(this, "GE2101 is empty", Toast.LENGTH_SHORT).show();
            }else
            if (POE.equals("O - Outstanding")) {
                sub4 = 3 * 10;
            } else if (POE.equals("A+ - Excellent")) {
                sub4 = 3 * 9;
            } else if (POE.equals("A - Very Good")) {
                sub4 = 3 * 8;
            } else if (POE.equals("B+ - Good")) {
                sub4 = 3 * 7;
            } else if (POE.equals("B - Average")) {
                sub4 = 3 * 6;
            } else if (POE.equals("RA - Re-appear")) {
                sub4 = 3 * 0;
            } else if (POE.equals("SA - Shortage attendence")) {
                sub4 = 3 * 0;
            } else if (POE.equals("WH - Malpractice")) {
                sub4 = 3 * 0;
            }

            // Coding-----------------------------------------
            int sub5 = 0;
            if (Coding.equals("Your grade")) {
                Toast.makeText(this, "EM2101 is empty", Toast.LENGTH_SHORT).show();
            }else
            if (Coding.equals("O - Outstanding")) {
                sub5 = 3 * 10;
            } else if (Coding.equals("A+ - Excellent")) {
                sub5 = 3 * 9;
            } else if (Coding.equals("A - Very Good")) {
                sub5 = 3 * 8;
            } else if (Coding.equals("B+ - Good")) {
                sub5 = 3 * 7;
            } else if (Coding.equals("B - Average")) {
                sub5 = 3 * 6;
            } else if (Coding.equals("RA - Re-appear")) {
                sub5 = 3 * 0;
            } else if (Coding.equals("SA - Shortage attendence")) {
                sub5 = 3 * 0;
            } else if (Coding.equals("WH - Malpractice")) {
                sub5 = 3 * 0;
            }

            //Chemistry-----------------------------------------
            int sub6 = 0;
            if (Chemistry.equals("Your grade")) {
                Toast.makeText(this, "CY2101 is empty", Toast.LENGTH_SHORT).show();
            }else if (Chemistry.equals("O - Outstanding")) {
                sub6 = 3 * 10;
            } else if (Chemistry.equals("A+ - Excellent")) {
                sub6 = 3 * 9;
            } else if (Chemistry.equals("A - Very Good")) {
                sub6 = 3 * 8;
            } else if (Chemistry.equals("B+ - Good")) {
                sub6 = 3 * 7;
            } else if (Chemistry.equals("B - Average")) {
                sub6 = 3 * 6;
            } else if (Chemistry.equals("RA - Re-appear")) {
                sub6 = 3 * 0;
            } else if (Chemistry.equals("SA - Shortage attendence")) {
                sub6 = 3 * 0;
            } else if (Chemistry.equals("WH - Malpractice")) {
                sub6 = 3 * 0;
            }

            //Mat_lab-----------------------------------------
            int sub7 = 0;
            if (Mat_lab.equals("Your grade")) {
                Toast.makeText(this, "MA2102 is empty", Toast.LENGTH_SHORT).show();
            }else
            if (Mat_lab.equals("O - Outstanding")) {
                sub7 = 1 * 10;
            } else if (Mat_lab.equals("A+ - Excellent")) {
                sub7 = 1 * 9;
            } else if (Mat_lab.equals("A - Very Good")) {
                sub7 = 1 * 8;
            } else if (Mat_lab.equals("B+ - Good")) {
                sub7 = 1 * 7;
            } else if (Mat_lab.equals("B - Average")) {
                sub7 = 1 * 6;
            } else if (Mat_lab.equals("RA - Re-appear")) {
                sub7 = 1 * 0;
            } else if (Mat_lab.equals("SA - Shortage attendence")) {
                sub7 = 1 * 0;
            } else if (Mat_lab.equals("WH - Malpractice")) {
                sub7 = 1 * 0;
            }

            //Phy_lab-----------------------------------------
            int sub8 = 0;
            if (Phy_lab.equals("Your grade")) {
                Toast.makeText(this, "PH2102 is empty", Toast.LENGTH_SHORT).show();
            }else
            if (Phy_lab.equals("O - Outstanding")) {
                sub8 = 1 * 10;
            } else if (Phy_lab.equals("A+ - Excellent")) {
                sub8 = 1 * 9;
            } else if (Phy_lab.equals("A - Very Good")) {
                sub8 = 1 * 8;
            } else if (Phy_lab.equals("B+ - Good")) {
                sub8 = 1 * 7;
            } else if (Phy_lab.equals("B - Average")) {
                sub8 = 1 * 6;
            } else if (Phy_lab.equals("RA - Re-appear")) {
                sub8 = 1 * 0;
            } else if (Phy_lab.equals("SA - Shortage attendence")) {
                sub8 = 1 * 0;
            } else if (Phy_lab.equals("WH - Malpractice")) {
                sub8 = 1 * 0;
            }

            //Code_lab-----------------------------------------
            int sub9 = 0;
            if (Code_lab.equals("Your grade")) {
                Toast.makeText(this, "EM2102 is empty", Toast.LENGTH_SHORT).show();
            }else
            if (Code_lab.equals("O - Outstanding")) {
                sub9 = 1 * 10;
            } else if (Code_lab.equals("A+ - Excellent")) {
                sub9 = 1 * 9;
            } else if (Code_lab.equals("A - Very Good")) {
                sub9 = 1 * 8;
            } else if (Code_lab.equals("B+ - Good")) {
                sub9 = 1 * 7;
            } else if (Code_lab.equals("B - Average")) {
                sub9 = 1 * 6;
            } else if (Code_lab.equals("RA - Re-appear")) {
                sub9 = 1 * 0;
            } else if (Code_lab.equals("SA - Shortage attendence")) {
                sub9 = 1 * 0;
            } else if (Code_lab.equals("WH - Malpractice")) {
                sub9 = 1 * 0;
            }
            float total_sem3 = sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8+ sub9;
            double gpa_sem1 = total_sem3 / total_credits;


            cal_gpa.setClickable(true);
            Intent intent = new Intent(SemesterOne.this, ResultActivity.class);
            intent.putExtra("gpa", gpa_sem1);
            startActivity(intent);

        }catch (Exception e){
            Toast.makeText(this, "Some fields are empty", Toast.LENGTH_SHORT).show();


        }
    }
}


