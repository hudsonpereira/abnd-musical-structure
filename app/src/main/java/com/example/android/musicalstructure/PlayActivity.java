package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.musicalstructure.pojo.Song;

public class PlayActivity extends AppCompatActivity {

    public static final String EXTRA_ARTIST = "EXTRA_ARTIST";

    public static final String EXTRA_SONG = "EXTRA_SONG";

    TextView songTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        songTitleTextView = findViewById(R.id.song_title_text_view);

        Intent intent = getIntent();

        Song song = (Song) intent.getSerializableExtra(EXTRA_SONG);

        songTitleTextView.setText(song.getTitle());
    }
}
