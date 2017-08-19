package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the mymusic category
        TextView myMusic = (TextView) findViewById(R.id.mymusic);

        // Set a click listener on My Music View
        myMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MainActivity.this, MyMusicActivity.class);
                startActivity(myMusicIntent);
            }
        });

        // Find the View that shows the Search category
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on Search View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(myMusicIntent);
            }
        });

        // Find the View that shows the Payment category
        TextView payment = (TextView) findViewById(R.id.payment);

        // Set a click listener on Payment View
        payment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(myMusicIntent);
            }
        });

        // Find the View that shows the PlayList category
        TextView playList = (TextView) findViewById(R.id.playList);

        // Set a click listener on PlayList View
        playList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(myMusicIntent);
            }
        });

    }
}

