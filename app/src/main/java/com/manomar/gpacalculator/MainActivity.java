package com.manomar.gpacalculator;



import static com.google.android.play.core.install.model.AppUpdateType.IMMEDIATE;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

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

import com.google.android.material.navigation.NavigationView;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    BottomNavigationView bottomNavigationView;

    DrawerLayout drawerLayout;
    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;
    private int REQUEST_CODE = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("GPA Calculator");

        //FirebaseMessaging.getInstance().subscribeToTopic("notification");

        /*Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav,
                R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                Toast.makeText(this, "Logout!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_settings:
                Toast.makeText(this, "Setting!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                Toast.makeText(this, "share!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_about:
                Toast.makeText(this, "About!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_logout:
                Toast.makeText(this, "Logout!", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

*/

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


                }
                return false;
            }
        });


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

   AppUpdateManager appUpdateManager = AppUpdateManagerFactory.create(MainActivity.this);
        Task<AppUpdateInfo> appUpdateInfoTask= appUpdateManager.getAppUpdateInfo();
        appUpdateInfoTask.addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() {
            @Override
            public void onSuccess(AppUpdateInfo result) {
                if(result.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE &&
                        result.isUpdateTypeAllowed(IMMEDIATE)){
                    try {
                        appUpdateManager.startUpdateFlowForResult(result,IMMEDIATE,MainActivity.this,REQUEST_CODE);
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
                i = new Intent(MainActivity.this,FirstYear.class);
                startActivity(i);
                break;
            case R.id.card_cse:
                i = new Intent(MainActivity.this,CseActivity.class);
                startActivity(i);
                break;
            case R.id.card_aids:
                i = new Intent(MainActivity.this, AidsActivity.class);
                startActivity(i);
                break;
            case R.id.card_it:
                i = new Intent(MainActivity.this, ITActivity.class);
                startActivity(i);
                break;
            case R.id.card_ece:
                i = new Intent(MainActivity.this,EceActivity.class);
                startActivity(i);
                break;
            case R.id.card_eee:
                i = new Intent(MainActivity.this,EeeActivity.class);
                startActivity(i);
                break;
            case R.id.card_biotech:
                i = new Intent(MainActivity.this,BioTechActivity.class);
                startActivity(i);
                break;
            case R.id.card_mechanic:
                i = new Intent(MainActivity.this,MechanicActivity.class);
                startActivity(i);
                break;
            case R.id.card_mechatronics:
                i = new Intent(MainActivity.this,MechatronicsActivity.class);
                startActivity(i);
                break;
            case R.id.card_about:
                i = new Intent(MainActivity.this, CivilActivity.class);
                startActivity(i);
                break;


        }
    }
}
