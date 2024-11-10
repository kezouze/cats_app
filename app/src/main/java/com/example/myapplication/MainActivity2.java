package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView secondImage = findViewById(R.id.second_image);
        secondImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.meow2);
                mediaPlayer.start();
            }
        });

        ImageView thirdImage = findViewById(R.id.third_image);
        thirdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.meow3);
                mediaPlayer.start();
            }
        });

        ImageView fourthImage = findViewById(R.id.fourth_image);
        fourthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.meow4);
                mediaPlayer.start();
            }
        });

        ImageView fifthImage = findViewById(R.id.fifth_image);
        fifthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.meow5);
                mediaPlayer.start();
            }
        });


        ImageView sixthImage = findViewById(R.id.sixth_image);
        sixthImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.meow6);
                mediaPlayer.start();
            }
        });
    }
}