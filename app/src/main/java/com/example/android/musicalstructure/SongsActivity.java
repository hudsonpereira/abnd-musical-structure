package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.musicalstructure.pojo.Artist;

public class SongsActivity extends AppCompatActivity {

    public static final String EXTRA_ARTIST = "EXTRA_ARTIST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Intent intent = getIntent();

        Artist artist = (Artist) intent.getSerializableExtra(EXTRA_ARTIST);

        getSupportActionBar().setTitle(artist.getName());
    }
}
