package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicapp.R.id.misunderstoodButton;
import static com.example.android.musicapp.R.id.start_play_list;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        // Find the View that shows the playList category
        Button playnowList = (Button) findViewById(start_play_list);

        // Set a click listener on missunderstood View
        playnowList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(PlayListActivity.this, NowPlayingActivity.class);
                startActivity(myMusicIntent);
            }
        });
    }
}
