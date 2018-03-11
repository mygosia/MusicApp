package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class nowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button rewindButton = findViewById(R.id.rewind_btn);
        rewindButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rewinding", Toast.LENGTH_SHORT).show();
            }
        });
        Button pauseButton = findViewById(R.id.pause_btn);
        pauseButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pausing", Toast.LENGTH_SHORT).show();
            }
        });
        Button playButton = findViewById(R.id.play_btn);
        playButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Playing", Toast.LENGTH_SHORT).show();
            }
        });
        Button forwardButton = findViewById(R.id.forward_btn);
        forwardButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Forwarding", Toast.LENGTH_SHORT).show();
            }
        });
        //Setting onClickListener on Back button  and Intent to start Activity.
        Button toLibraryButton = findViewById(R.id.to_library_btn);
        toLibraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent toLibraryIntent = new Intent(nowPlaying.this, AudiobooksActivity.class);
                startActivity(toLibraryIntent);
            }
        });
        //Setting onClickListener on Shop button  and Intent to start Activity.
        Button toShopButton = findViewById(R.id.to_shop_btn);
        toShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.amazon.com";
                Intent buyMusicIntent = new Intent(Intent.ACTION_VIEW);
                buyMusicIntent.setData(Uri.parse(url));
                startActivity(buyMusicIntent);
            }
        });
    }
}
