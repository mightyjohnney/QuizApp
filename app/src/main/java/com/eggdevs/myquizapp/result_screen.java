package com.eggdevs.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import maes.tech.intentanim.CustomIntent;

public class result_screen extends AppCompatActivity {

    ImageView image_preview;
    TextView tvFinalResult, tvCharacterDesc;
    Button btMainMenu, btPlayAgain;
    String question1, question2, question3, question4, question5,
            gender, character, description;

    int harry = 0, loki = 0, shinchan = 0, tony = 0, anna = 0, annabelle = 0, hermione = 0, widow = 0,
           dora = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_screen_layout);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        image_preview = findViewById(R.id.image_preview);
        tvFinalResult = findViewById(R.id.tvFinalResult);
        tvCharacterDesc = findViewById(R.id.tvCharacterDesc);
        btMainMenu = findViewById(R.id.btMainMenu);
        btPlayAgain = findViewById(R.id.btPlayAgain);

        gender = getIntent().getStringExtra("gender");
        question1 = getIntent().getStringExtra("question1");
        question2 = getIntent().getStringExtra("question2");
        question3 = getIntent().getStringExtra("question3");
        question4 = getIntent().getStringExtra("question4");
        question5 = getIntent().getStringExtra("question5");

    /*    if (gender.equals("male")) {

            if ((question1.equals("option1") || question1.equals("option2") || question3.equals("option4"))
                    && question4.equals("option1")) {

                character = getString(R.string.shinchan);
                description = getString(R.string.shinchan_desc);
                image_preview.setImageResource(R.drawable.shinchan);
            }

            else if (question1.equals("option4") || question3.equals("option1")) {

                character = getString(R.string.tony);
                description = getString(R.string.tony_desc);
                image_preview.setImageResource(R.drawable.tony_stark);
            }

            else if (question1.equals("option2") && (question4.equals("option3") || question4.equals("option2"))) {

                character = getString(R.string.loki);
                description = getString(R.string.loki_desc);
                image_preview.setImageResource(R.drawable.loki);
            }

            else if ((question2.equals("option1") || question2.equals("option3")) &&
                    (question3.equals("option2") || question5.equals("option2"))) {

                character = getString(R.string.harry);
                description = getString(R.string.harry_desc);
                image_preview.setImageResource(R.drawable.harry);
            }

            else if (question5.equals("option3") || question4.equals("option3")) {

                character = getString(R.string.loki);
                description = getString(R.string.loki_desc);
                image_preview.setImageResource(R.drawable.loki);
            }

            else if (question4.equals("option1")) {

                character = getString(R.string.shinchan);
                description = getString(R.string.shinchan_desc);
                image_preview.setImageResource(R.drawable.shinchan);
            }

            else if (question5.equals("option2")) {

                if(question4.equals("option4") || question1.equals("option2")) {

                    character = getString(R.string.harry);
                    description = getString(R.string.harry_desc);
                    image_preview.setImageResource(R.drawable.harry);
                }

                if (question4.equals("option2") || question4.equals("option4")) {

                    character = getString(R.string.tony);
                    description = getString(R.string.tony_desc);
                    image_preview.setImageResource(R.drawable.tony_stark);
                }
            }
            else if (question5.equals("option4")) {

                character = getString(R.string.loki);
                description = getString(R.string.loki_desc);
                image_preview.setImageResource(R.drawable.loki);
            }

            else if ((question3.equals("option3") || question5.equals("option1"))
                    && (question4.equals("option4"))) {

                character = getString(R.string.shinchan);
                description = getString(R.string.shinchan_desc);
                image_preview.setImageResource(R.drawable.shinchan);
            }

            else if (question2.equals("option2") && question4.equals("option2")) {

                character = getString(R.string.tony);
                description = getString(R.string.tony_desc);
                image_preview.setImageResource(R.drawable.tony_stark);
            }
        }

        if (gender.equals("female")){

            if (question4.equals("option1") || question4.equals("option4")) {

                character = getString(R.string.anna);
                description = getString(R.string.anna_desc);
                image_preview.setImageResource(R.drawable.anna);
            }

            else if (question1.equals("option2") && question3.equals("option3")) {

                character = getString(R.string.dora);
                description = getString(R.string.dora_desc);
                image_preview.setImageResource(R.drawable.dora);
            }

            else if (question1.equals("option4") && question3.equals("option1")) {

                character = getString(R.string.hermione);
                description = getString(R.string.hermione_desc);
                image_preview.setImageResource(R.drawable.hermione);
            }

            else if (question2.equals("option4") || question1.equals("option1")) {

                character = getString(R.string.widow);
                description = getString(R.string.widow_desc);
                image_preview.setImageResource(R.drawable.black_widow);
            }

            else if (question2.equals("option2") || question5.equals("option4")) {

                character = getString(R.string.annabelle);
                description = getString(R.string.annabelle_desc);
                image_preview.setImageResource(R.drawable.annabelle);
            }

            else if (question3.equals("option4")) {

                character = getString(R.string.anna);
                description = getString(R.string.anna_desc);
                image_preview.setImageResource(R.drawable.anna);
            }
            else if (question5.equals("option2")) {

                character = getString(R.string.widow);
                description = getString(R.string.widow_desc);
                image_preview.setImageResource(R.drawable.black_widow);
            }

            else if (question3.equals("option3") || question5.equals("option1")) {

                character = getString(R.string.dora);
                description = getString(R.string.dora_desc);
                image_preview.setImageResource(R.drawable.dora);
            }

            else {

                character = getString(R.string.annabelle);
                description = getString(R.string.annabelle_desc);
                image_preview.setImageResource(R.drawable.annabelle);
            }
        }

     */

        if (gender.equals("male")) {

            switch (question1) {

                case "option1" : shinchan++;
                    break;

                case "option2" : shinchan++; loki++;
                    break;

                case "option3" :
                    break;

                case "option4" : tony++;
                    break;
            }

            switch (question2) {

                case "option1" : harry++;
                    break;

                case "option2" : shinchan++;
                    break;

                case "option3" : tony++;
                    break;

                case "option4" : loki++;
                    break;
            }

            switch (question3) {

                case "option1" : tony++;
                    break;

                case "option2" : harry++;
                    break;

                case "option3" : loki++;
                    break;

                case "option4" : shinchan++;
                    break;
            }

            switch (question4) {

                case "option1" : shinchan++;
                    break;

                case "option2" : loki++; tony++;
                    break;

                case "option3" : loki++;
                    break;

                case "option4" : harry++;
                    break;
            }

            switch (question5) {

                case "option1" : shinchan++;
                    break;

                case "option2" : harry++; tony++;
                    break;

                case "option3" : loki++;
                    break;

                case "option4" : shinchan++; loki++;
                    break;
            }

            if( (harry >= shinchan) && (harry >= loki) && (harry >= tony) ) {
                    character = getString(R.string.harry);
                    description = getString(R.string.harry_desc);
                    image_preview.setImageResource(R.drawable.harry);

               } else if ( (harry <= shinchan) && (shinchan >= loki) && (shinchan >= tony) ) {
                    character = getString(R.string.shinchan);
                    description = getString(R.string.shinchan_desc);
                    image_preview.setImageResource(R.drawable.shinchan);

               } else if ( (loki >= shinchan) && (harry <= loki) && (loki >= tony) ) {
                    character = getString(R.string.loki);
                    description = getString(R.string.loki_desc);
                    image_preview.setImageResource(R.drawable.loki);

               } else {
                character = getString(R.string.tony);
                description = getString(R.string.tony_desc);
                image_preview.setImageResource(R.drawable.tony_stark);
               }
        }

        if (gender.equals("female")) {

            switch (question1) {

                case "option1" : widow++;
                    break;

                case "option2" : anna++; dora++;
                    break;

                case "option3" : annabelle++;
                    break;

                case "option4" : hermione++;
                    break;
            }

            switch (question2) {

                case "option1" : hermione++; anna++;
                    break;

                case "option2" :

                case "option3" :
                    annabelle++;
                    break;

                case "option4" : widow++;
                    break;
            }

            switch (question3) {

                case "option1" : hermione++;
                    break;

                case "option2" :
                    break;

                case "option3" : widow++; annabelle++; dora++;
                    break;

                case "option4" : anna++;
                    break;
            }

            switch (question4) {

                case "option1" :

                case "option4" :
                    anna++;
                    break;

                case "option2" : annabelle++; hermione++;
                    break;

                case "option3" : dora++;
                    break;
            }

            switch (question5) {

                case "option1" : hermione++;
                    break;

                case "option2" : anna++; widow++;
                    break;

                case "option3" : dora++;
                    break;

                case "option4" : annabelle++;
                    break;
            }
            if( (anna >= widow) && (anna >= dora) && (hermione <= anna) && (anna >= annabelle) ) {
                character = getString(R.string.anna);
                description = getString(R.string.anna_desc);
                image_preview.setImageResource(R.drawable.anna);

               } else if( (hermione >= widow) && (hermione >= dora) && (hermione >= anna) && (hermione >= annabelle) ) {
                character = getString(R.string.hermione);
                description = getString(R.string.hermione_desc);
                image_preview.setImageResource(R.drawable.hermione);

               } else if( (dora >= widow) && (hermione <= dora) && (dora >= anna) && (dora >= annabelle) ) {
                character = getString(R.string.dora);
                description = getString(R.string.dora_desc);
                image_preview.setImageResource(R.drawable.dora);

               } else if ( (hermione <= widow) && (widow >= dora) && (widow >= anna) && (widow >= annabelle) ) {
                character = getString(R.string.widow);
                description = getString(R.string.widow_desc);
                image_preview.setImageResource(R.drawable.black_widow);

               } else {
                character = getString(R.string.annabelle);
                description = getString(R.string.annabelle_desc);
                image_preview.setImageResource(R.drawable.annabelle);

               }
        }


        tvCharacterDesc.setText(description);
        tvFinalResult.setText(character);

        btPlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(result_screen.this,
                        com.eggdevs.myquizapp.male_female.class);
                startActivity(intent);
                CustomIntent.customType(result_screen.this, "up-to-bottom");
                finish();
            }
        });


        btMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(result_screen.this,
                        com.eggdevs.myquizapp.MainActivity.class);
                startActivity(intent);
                CustomIntent.customType(result_screen.this, "fadein-to-fadeout");
                finish();
            }
        });
    }
}
