package com.eggdevs.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView play_button, ivLogo;
    TextView tvTitle;

    Animation topAnim, bottomAnim, titleAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation_main);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation_main);
        titleAnim = AnimationUtils.loadAnimation(this, R.anim.fadein);

        play_button = findViewById(R.id.play_button);
        ivLogo = findViewById(R.id.ivLogo);
        tvTitle = findViewById(R.id.tvTitle);

        ivLogo.setAnimation(topAnim);
        play_button.setAnimation(bottomAnim);
        tvTitle.setAnimation(titleAnim);

        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,
                        com.eggdevs.myquizapp.male_female.class);

                Animation animation = AnimationUtils.loadAnimation(
                        MainActivity.this, R.anim.zoomin);
                play_button.startAnimation(animation);

                startActivity(intent);
                finish();


            }
        });
    }
}
