package com.manomar.gpacalculator.CSE;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import com.facebook.ads.InterstitialAd;
import com.manomar.gpacalculator.R;
import com.manomar.gpacalculator.GPA_ResultActivity;

import io.github.muddz.styleabletoast.StyleableToast;

public class CSE_Semester3 extends AppCompatActivity {

    Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8;
    Button cal_gpa;
    private InterstitialAd interstitialAd;
    String TAG = "Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_semester3);

        cal_gpa = findViewById(R.id.btn_gpa_sem3);



        getSupportActionBar().setTitle("CSE Semester 3");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        spinner1 = findViewById(R.id.cse_sem3_spin1);
        spinner2 = findViewById(R.id.cse_sem3_spin2);
        spinner3 = findViewById(R.id.cse_sem3_spin3);
        spinner4 = findViewById(R.id.cse_sem3_spin4);
        spinner5 = findViewById(R.id.cse_sem3_spin5);
        spinner6 = findViewById(R.id.cse_sem3_spin6);
        spinner7 = findViewById(R.id.cse_sem3_spin7);
        spinner8 = findViewById(R.id.cse_sem3_spin8);


        cal_gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateGPA();
                //showInterstitial();
            }

        });
    }

    /*
    //FB INTERSTITIAL ADS : STARTED

    public void showInterstitial(){
        interstitialAd = new InterstitialAd(CSE_Semester3.this, getResources().getString(R.string.Facebook_Interstitial_placement));

        interstitialAd = new InterstitialAd(this, getResources().getString(R.string.Facebook_Interstitial_placement));
        // Set listeners for the Interstitial Ad
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener(){
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad

            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                Log.d(TAG, "Interstitial ad impression logged!");
            }
        };

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd.loadAd();
    }


    private void showInterstitialAds() {
        if (interstitialAd != null && interstitialAd.isAdLoaded()) {
            interstitialAd.show();
        }
    }


    //FB INTERSTITIAL ADS : END
*/



    public void calculateGPA() {

        String subject1 = spinner1.getSelectedItem().toString();
        String subject2 = spinner2.getSelectedItem().toString();
        String subject3 = spinner3.getSelectedItem().toString();
        String subject4 = spinner4.getSelectedItem().toString();
        String subject5 = spinner5.getSelectedItem().toString();
        String subject6 = spinner6.getSelectedItem().toString();
        String subject7 = spinner7.getSelectedItem().toString();
        String subject8 = spinner8.getSelectedItem().toString();

        if (subject1.equals("Your grade") || subject2.equals("Your grade") || subject3.equals("Your grade")
                || subject4.equals("Your grade") || subject5.equals("Your grade") || subject6.equals("Your grade")
                || subject7.equals("Your grade") || subject8.equals("Your grade")) {
            StyleableToast.makeText(this, "Some fields are empty", R.style.errotToast).show();
        } else {

            int total_credits = 23;

            // subject1 ---------------------------------------
            int sub1 = 0;

            if (subject1.equals("O - Outstanding")) {
                sub1 = 4 * 10;
            } else if (subject1.equals("A+ - Excellent")) {
                sub1 = 4 * 9;
            } else if (subject1.equals("A - Very Good")) {
                sub1 = 4 * 8;
            } else if (subject1.equals("B+ - Good")) {
                sub1 = 4 * 7;
            } else if (subject1.equals("B - Average")) {
                sub1 = 4 * 6;
            } else if (subject1.equals("RA - Re-appear")) {
                sub1 = 4 * 0;
            } else if (subject1.equals("SA - Shortage attendence")) {
                sub1 = 4 * 0;
            } else if (subject1.equals("WH - Malpractice")) {
                sub1 = 4 * 0;
            }

            //subject2-----------------------------------------
            int sub2 = 0;
             if (subject2.equals("O - Outstanding")) {
                sub2 = 3 * 10;
            } else if (subject2.equals("A+ - Excellent")) {
                sub2 = 3 * 9;
            } else if (subject2.equals("A - Very Good")) {
                sub2 = 3 * 8;
            } else if (subject2.equals("B+ - Good")) {
                sub2 = 3 * 7;
            } else if (subject2.equals("B - Average")) {
                sub2 = 3 * 6;
            } else if (subject2.equals("RA - Re-appear")) {
                sub2 = 3 * 0;
            } else if (subject2.equals("SA - Shortage attendence")) {
                sub2 = 3 * 0;
            } else if (subject2.equals("WH - Malpractice")) {
                sub2 = 3 * 0;
            }

            // subject3-----------------------------------------

            int sub3 = 0;
            if (subject3.equals("O - Outstanding")) {
                sub3 = 3 * 10;
            } else if (subject3.equals("A+ - Excellent")) {
                sub3 = 3 * 9;
            } else if (subject3.equals("A - Very Good")) {
                sub3 = 3 * 8;
            } else if (subject3.equals("B+ - Good")) {
                sub3 = 3 * 7;
            } else if (subject3.equals("B - Average")) {
                sub3 = 3 * 6;
            } else if (subject3.equals("RA - Re-appear")) {
                sub3 = 3 * 0;
            } else if (subject3.equals("SA - Shortage attendence")) {
                sub3 = 3 * 0;
            } else if (subject3.equals("WH - Malpractice")) {
                sub3 = 3 * 0;
            }

            //subject4-----------------------------------------
            int sub4 = 0;
            if (subject4.equals("O - Outstanding")) {
                sub4 = 3 * 10;
            } else if (subject4.equals("A+ - Excellent")) {
                sub4 = 3 * 9;
            } else if (subject4.equals("A - Very Good")) {
                sub4 = 3 * 8;
            } else if (subject4.equals("B+ - Good")) {
                sub4 = 3 * 7;
            } else if (subject4.equals("B - Average")) {
                sub4 = 3 * 6;
            } else if (subject4.equals("RA - Re-appear")) {
                sub4 = 3 * 0;
            } else if (subject4.equals("SA - Shortage attendence")) {
                sub4 = 3 * 0;
            } else if (subject4.equals("WH - Malpractice")) {
                sub4 = 3 * 0;
            }
            // Subject 5-----------------------------------------
            int sub5 = 0;
             if (subject5.equals("O - Outstanding")) {
                sub5 = 3 * 10;
            } else if (subject5.equals("A+ - Excellent")) {
                sub5 = 3 * 9;
            } else if (subject5.equals("A - Very Good")) {
                sub5 = 3 * 8;
            } else if (subject5.equals("B+ - Good")) {
                sub5 = 3 * 7;
            } else if (subject5.equals("B - Average")) {
                sub5 = 3 * 6;
            } else if (subject5.equals("RA - Re-appear")) {
                sub5 = 3 * 0;
            } else if (subject5.equals("SA - Shortage attendence")) {
                sub5 = 3 * 0;
            } else if (subject5.equals("WH - Malpractice")) {
                sub5 = 3 * 0;
            }

            //subject6-----------------------------------------
            int sub6 = 0;
            if (subject6.equals("O - Outstanding")) {
                sub6 = 4 * 10;
            } else if (subject6.equals("A+ - Excellent")) {
                sub6 = 4 * 9;
            } else if (subject6.equals("A - Very Good")) {
                sub6 = 4 * 8;
            } else if (subject6.equals("B+ - Good")) {
                sub6 = 4 * 7;
            } else if (subject6.equals("B - Average")) {
                sub6 = 4 * 6;
            } else if (subject6.equals("RA - Re-appear")) {
                sub6 = 4 * 0;
            } else if (subject6.equals("SA - Shortage attendence")) {
                sub6 = 4 * 0;
            } else if (subject6.equals("WH - Malpractice")) {
                sub6 = 4 * 0;
            }

            // subject7-----------------------------------------

            int sub7 = 0;

             if (subject7.equals("O - Outstanding")) {
                sub7 = 1 * 10;
            } else if (subject7.equals("A+ - Excellent")) {
                sub7 = 1 * 9;
            } else if (subject7.equals("A - Very Good")) {
                sub7 = 1 * 8;
            } else if (subject7.equals("B+ - Good")) {
                sub7 = 1 * 7;
            } else if (subject7.equals("B - Average")) {
                sub7 = 1 * 6;
            } else if (subject7.equals("RA - Re-appear")) {
                sub7 = 1 * 0;
            } else if (subject7.equals("SA - Shortage attendence")) {
                sub7 = 1 * 0;
            } else if (subject7.equals("WH - Malpractice")) {
                sub7 = 1 * 0;
            }

            //subject8-----------------------------------------
            int sub8 = 0;
           if (subject8.equals("O - Outstanding")) {
                sub8 = 2 * 10;
            } else if (subject8.equals("A+ - Excellent")) {
                sub8 = 2 * 9;
            } else if (subject8.equals("A - Very Good")) {
                sub8 = 2 * 8;
            } else if (subject8.equals("B+ - Good")) {
                sub8 = 2 * 7;
            } else if (subject8.equals("B - Average")) {
                sub8 = 2 * 6;
            } else if (subject8.equals("RA - Re-appear")) {
                sub8 = 2 * 0;
            } else if (subject8.equals("SA - Shortage attendence")) {
                sub8 = 2 * 0;
            } else if (subject8.equals("WH -WithHeld")) {
                sub8 = 2 * 0;
            }


            float total_sem3 = sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8;
            double gpa_sem3 = total_sem3 / total_credits;


            cal_gpa.setClickable(true);
            Intent intent = new Intent(CSE_Semester3.this, GPA_ResultActivity.class);
            intent.putExtra("gpa", gpa_sem3);
            startActivity(intent);

        }
    }

}

