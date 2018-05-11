package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicalstructure.pojo.Artist;
import com.example.android.musicalstructure.pojo.Song;

public class PlayActivity extends AppCompatActivity {

    public static final String EXTRA_ARTIST = "EXTRA_ARTIST";

    public static final String EXTRA_SONG = "EXTRA_SONG";

    TextView songTitleTextView;

    TextView artistNameTextView;

    ImageView artistImageView;

    ImageButton playPauseImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        songTitleTextView = findViewById(R.id.song_title_text_view);
        artistNameTextView = findViewById(R.id.artist_name_text_view);
        artistImageView = findViewById(R.id.artist_image);
        playPauseImageButton = findViewById(R.id.play_pause_image_button);

        Intent intent = getIntent();

        Song song = (Song) intent.getSerializableExtra(EXTRA_SONG);
        Artist artist = (Artist) intent.getSerializableExtra(EXTRA_ARTIST);

        songTitleTextView.setText(song.getTitle());
        artistNameTextView.setText(artist.getName());
        artistImageView.setImageResource(artist.getImageResource());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();

                return true;
        }

        return false;
    }
}
