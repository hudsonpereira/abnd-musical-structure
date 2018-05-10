package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.musicalstructure.adapter.ArtistAdapter;
import com.example.android.musicalstructure.pojo.Artist;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView artistListView;

    List<Artist> artists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        artistListView = findViewById(R.id.artists_list_View);

        artists = new ArrayList<>();

        artists.add(new Artist("Jordan Rudess", R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist("Jon Lord", R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist("Derek Sherinian", R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist("Derek Sherinian", R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist("Fabio Laguna", R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist("Jean Carllos", R.drawable.ic_music_note_black_24dp));

        artistListView.setAdapter(new ArtistAdapter(artists));
    }
}
