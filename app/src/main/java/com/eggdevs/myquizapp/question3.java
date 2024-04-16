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
import android.widget.TextView;

import maes.tech.intentanim.CustomIntent;

public class question3 extends AppCompatActivity implements View.OnClickListener {

    Button option1, option2, option3, option4;
    String question1, question2, question3, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3_layout);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        option1 = findViewById(R.id.question3_option1);
        option2 = findViewById(R.id.question3_option2);
        option3 = findViewById(R.id.question3_option3);
        option4 = findViewById(R.id.question3_option4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);

        gender = getIntent().getStringExtra("gender");
        question1 = getIntent().getStringExtra("question1");
        question2 = getIntent().getStringExtra("question2");
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(question3.this,
                com.eggdevs.myquizapp.question4.class);

        switch (v.getId()) {
            case R.id.question3_option1 :
                question3 = "option1";
                option1.setBackgroundColor(Color.parseColor("#58F868"));
                break;
            case R.id.question3_option2 :
                question3 = "option2";
                option2.setBackgroundColor(Color.parseColor("#58F868"));
                break;
            case R.id.question3_option3 :
                question3 = "option3";
                option3.setBackgroundColor(Color.parseColor("#58F868"));
                break;
            case R.id.question3_option4 :
                question3 = "option4";
                option4.setBackgroundColor(Color.parseColor("#58F868"));
                break;
        }

        intent.putExtra("gender", gender);
        intent.putExtra("question1", question1);
        intent.putExtra("question2", question2);
        intent.putExtra("question3", question3);
        startActivity(intent);
        CustomIntent.customType(question3.this, "left-to-right");
        finish();
    }
}
