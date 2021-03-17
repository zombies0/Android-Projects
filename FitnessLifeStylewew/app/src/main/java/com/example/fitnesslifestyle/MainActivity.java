package com.example.fitnesslifestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash_screen);


        int SPLASH_TIME_OUT = 4000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(MainActivity.this,SplashScreenActivity.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }

        }, SPLASH_TIME_OUT);



    }
}