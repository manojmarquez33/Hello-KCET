package com.manomar.gpacalculator;

import static com.manomar.gpacalculator.R.id.bottom_navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Sem_Result_Activity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;
    public WebView webview;
    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_result);

        progressBar = findViewById(           R.id.progress_circular);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        bottom_navigation = findViewById(R.id.bottom_navigation);
        getSupportActionBar().setTitle("Semester Result");

        bottom_navigation.setSelectedItemId(R.id.result);

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem ) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.cgpa:
                        startActivity(new Intent(getApplicationContext()
                                ,CGPAActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.result:
                        return true;


                }
                return false;
            }
        });

        webview = findViewById(R.id.website);
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }
        });
        webview.loadUrl("http://kamarajengg.edu.in/results");
    }

    @Override
    public void onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}