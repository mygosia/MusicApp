package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Track> musicList = new ArrayList<Track>();

        musicList.add(new Track("Wlazl kotek na plotek", "Zenek Martyniuk", 5.35));
        musicList.add(new Track("Call me", "Bolndie", 3.59));
        musicList.add(new Track("The Wall", "Pink Floyd", 10.45));
        musicList.add(new Track("Last Christmast", "Wham", 4.21));
        musicList.add(new Track("Cherry, cherry lady", "Modern Talking", 3.54));
        musicList.add(new Track("Boys", "Sabrina", 2.15));
        musicList.add(new Track("Bohemian rapsody", "Queen", 6.31));
        musicList.add(new Track("Tubulars Bells", "Mike Oldfield", 8.38));
        musicList.add(new Track("Never ending story", "Limahl", 4.34));
        musicList.add(new Track("One", "Metallica", 6.45));
        musicList.add(new Track("Bad", "Michael Jackson", 6.02));
        musicList.add(new Track("Fragile", "Sting", 4.07));
        musicList.add(new Track("The Best", "Tina Turner", 3.40));

        TrackAdapter adapter = new TrackAdapter(this, musicList);
        ListView listView = (ListView) findViewById(R.id.trackList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Button button = findViewById(R.id.playTrackBtn);

                button.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent audiobooksIntent = new Intent(SongsActivity.this, nowPlaying.class);
                        startActivity(audiobooksIntent);
                    }
                });
            }

        });

    }
}
