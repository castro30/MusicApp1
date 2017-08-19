package com.example.android.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.attr.onClick;
import static com.example.android.musicapp.R.id.flowerPlayButton;
import static com.example.android.musicapp.R.id.misunderstoodButton;
import static com.example.android.musicapp.R.id.playList;
import static com.example.android.musicapp.R.id.uramiButton;
import static com.example.android.musicapp.R.raw.misunderstood;

public class MyMusicActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);


        mp = MediaPlayer.create(MyMusicActivity.this, R.raw.flowerofcarnage);

        // Find the View that shows the missunderstood category
        Button playnowMis = (Button) findViewById(misunderstoodButton);

        // Set a click listener on missunderstood View
        playnowMis.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MyMusicActivity.this, NowPlayingActivity.class);
                startActivity(myMusicIntent);
            }
        });

        // Find the View that shows the flower category
        Button playnowFlower = (Button) findViewById(flowerPlayButton);

        // Set a click listener on flower View
        playnowFlower.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MyMusicActivity.this, NowPlayingActivity.class);
                startActivity(myMusicIntent);
            }
        });

        // Find the View that shows the urami category
        Button playnowUrami = (Button) findViewById(uramiButton);

        // Set a click listener on urami View
        playnowUrami.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MyMusicActivity.this, NowPlayingActivity.class);
                startActivity(myMusicIntent);
            }
        });


    }

    public void play(View view) {
        mp.start();
    }

    public void stop(View view) {
        mp.stop();
    }

}

