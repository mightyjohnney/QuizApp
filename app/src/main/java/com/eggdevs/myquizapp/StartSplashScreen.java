package com.eggdevs.myquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import maes.tech.intentanim.CustomIntent;

public class StartSplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartSplashScreen.this,
                        com.eggdevs.myquizapp.MainActivity.class);
                startActivity(intent);
                CustomIntent.customType(StartSplashScreen.this, "fadein-to-fadeout");
                finish();
            }
        }, 1100);

    }
}
