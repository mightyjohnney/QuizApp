package com.eggdevs.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import maes.tech.intentanim.CustomIntent;

public class male_female extends AppCompatActivity implements View.OnClickListener {

    Button male_button, female_button;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.male_female_layout);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        male_button = findViewById(R.id.male_button);
        female_button = findViewById(R.id.female_button);

        male_button.setOnClickListener(male_female.this);
        female_button.setOnClickListener(male_female.this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(male_female.this,
                com.eggdevs.myquizapp.question1.class);

        switch (v.getId()) {

            case R.id.male_button:
                gender = "male";
                male_button.setBackgroundColor(0xdae31c1c);
                break;
            case R.id.female_button :
                gender = "female";
                female_button.setBackgroundColor(0xdae31c1c);
                break;
        }

        intent.putExtra("gender", gender);
        startActivity(intent);
        CustomIntent.customType(male_female.this, "left-to-right");
        finish();

    }
}
