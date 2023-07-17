package com.manomar.gpacalculator;


import static com.google.android.play.core.install.model.AppUpdateType.IMMEDIATE;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//  import com.google.firebase.messaging.FirebaseMessaging;
import com.manomar.gpacalculator.AIDS.AidsActivity;
import com.manomar.gpacalculator.BioTech.BioTechActivity;
import com.manomar.gpacalculator.CIVIL.CivilActivity;
import com.manomar.gpacalculator.CSE.CseActivity;
import com.manomar.gpacalculator.ECE.EceActivity;
import com.manomar.gpacalculator.EEE.EeeActivity;
import com.manomar.gpacalculator.IT.ITActivity;
import com.manomar.gpacalculator.MECHANIC.MechanicActivity;
import com.manomar.gpacalculator.MECHATRONICS.MechatronicsActivity;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;

public class GPA_Activity extends AppCompatActivity implements View.OnClickListener {


    BottomNavigationView bottomNavigationView;

    DrawerLayout drawerLayout;
    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;
    private int REQUEST_CODE = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        getSupportActionBar().setTitle("GPA Calculator");

/*
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem ) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        return true;

                    case R.id.cgpa:
                        startActivity(new Intent(getApplicationContext()
                                ,CGPAActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.result:
                        startActivity(new Intent(getApplicationContext()
                                ,Sem_Result_Activity.class));
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
*/

        card1 = findViewById(R.id.card_1year);
        card2 = findViewById(R.id.card_cse);
        card3 = findViewById(R.id.card_aids);
        card4 = findViewById(R.id.card_it);
        card5 = findViewById(R.id.card_ece);
        card6 = findViewById(R.id.card_eee);
        card7 = findViewById(R.id.card_biotech);
        card8 = findViewById(R.id.card_mechanic);
        card9 = findViewById(R.id.card_mechatronics);
        card10 = findViewById(R.id.card_about);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);

   AppUpdateManager appUpdateManager = AppUpdateManagerFactory.create(GPA_Activity.this);
        Task<AppUpdateInfo> appUpdateInfoTask= appUpdateManager.getAppUpdateInfo();
        appUpdateInfoTask.addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() {
            @Override
            public void onSuccess(AppUpdateInfo result) {
                if(result.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE &&
                        result.isUpdateTypeAllowed(IMMEDIATE)){
                    try {
                        appUpdateManager.startUpdateFlowForResult(result,IMMEDIATE, GPA_Activity.this,REQUEST_CODE);
                    } catch (IntentSender.SendIntentException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            Toast.makeText(this, "Start Download", Toast.LENGTH_SHORT).show();

            if(resultCode != RESULT_OK){
                Log.d("mmm","update flow failed"+resultCode);
            }
        }

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.card_1year:
                i = new Intent(GPA_Activity.this,FirstYear.class);
                startActivity(i);
                break;
            case R.id.card_cse:
                i = new Intent(GPA_Activity.this,CseActivity.class);
                startActivity(i);
                break;
            case R.id.card_aids:
                i = new Intent(GPA_Activity.this, AidsActivity.class);
                startActivity(i);
                break;
            case R.id.card_it:
                i = new Intent(GPA_Activity.this, ITActivity.class);
                startActivity(i);
                break;
            case R.id.card_ece:
                i = new Intent(GPA_Activity.this,EceActivity.class);
                startActivity(i);
                break;
            case R.id.card_eee:
                i = new Intent(GPA_Activity.this,EeeActivity.class);
                startActivity(i);
                break;
            case R.id.card_biotech:
                i = new Intent(GPA_Activity.this,BioTechActivity.class);
                startActivity(i);
                break;
            case R.id.card_mechanic:
                i = new Intent(GPA_Activity.this,MechanicActivity.class);
                startActivity(i);
                break;
            case R.id.card_mechatronics:
                i = new Intent(GPA_Activity.this,MechatronicsActivity.class);
                startActivity(i);
                break;
            case R.id.card_about:
                i = new Intent(GPA_Activity.this, CivilActivity.class);
                startActivity(i);
                break;


        }
    }
}
