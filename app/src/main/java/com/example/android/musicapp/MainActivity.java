package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find button that shows list of songs, set onClickListener on it and set Intent  to new Activity
        Button songs = findViewById(R.id.songsBtn);
        songs.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        //Find button that goes to music store, set onClickListener on it and set Intent  to new Store website
        Button buyMusic = findViewById(R.id.buyMusicBtn);
        buyMusic.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.amazon.com";
                Intent buyMusicIntent = new Intent(Intent.ACTION_VIEW);
                buyMusicIntent.setData(Uri.parse(url));
                startActivity(buyMusicIntent);
            }
        });

        //Find button that shows list of audiobooks, set onClickListener on it and set Intent  to new Activity
        Button audiobooks = findViewById(R.id.audiobookBtn);
        audiobooks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent audiobooksIntent = new Intent(MainActivity.this, AudiobooksActivity.class);
                startActivity(audiobooksIntent);
            }
        });

        //Find button that goes to audiobook store, set onClickListener on it and set Intent  to new Store website
        Button buyAudiobooks = findViewById(R.id.buyAudiobookBtn);
        buyAudiobooks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.amazon.com";
                Intent buyAudiobookIntent = new Intent(Intent.ACTION_VIEW);
                buyAudiobookIntent.setData(Uri.parse(url));
                startActivity(buyAudiobookIntent);
            }
        });
    }
}
