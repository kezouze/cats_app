package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération du bouton à partir de son identifiant
        button1 = findViewById(R.id.button1);

        // Ajout d'un écouteur d'événements sur le bouton
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Création d'une nouvelle instance de l'intention (Intent)
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Démarrage de l'activité MainActivity2
                startActivity(intent);
            }
        });

        ImageView firstImage = findViewById(R.id.first_image);
        firstImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.meow1);
                mediaPlayer.start();
            }
        });
    }

}
