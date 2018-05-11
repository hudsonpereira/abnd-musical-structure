package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.musicalstructure.adapter.SongAdapter;
import com.example.android.musicalstructure.pojo.Artist;
import com.example.android.musicalstructure.pojo.Song;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends AppCompatActivity {

    public static final String EXTRA_ARTIST = "EXTRA_ARTIST";

    ListView songsListView;

    List<Song> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        songsListView = findViewById(R.id.songs_list_view);

        Intent intent = getIntent();

        Artist artist = (Artist) intent.getSerializableExtra(EXTRA_ARTIST);


        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setTitle(artist.getName());
        }

        songs = new ArrayList<>();

        switch (artist.getId()) {
            case ArtistUtils.JORDAN_RUDESS_ID:
                songs.add(new Song("Dance on a Volcano"));
                songs.add(new Song("Truth"));
                songs.add(new Song("Furia Taurina"));
                songs.add(new Song("State of Grace"));
                songs.add(new Song("Fife and Drum"));
                break;
            case ArtistUtils.JON_LORD_ID:
                songs.add(new Song("Pictured Within"));
                songs.add(new Song("Out of my Mind"));
                songs.add(new Song("Sarabande"));
                songs.add(new Song("Bouree"));
                songs.add(new Song("Soldier of Fortune"));
                break;
            case ArtistUtils.DEREK_SHERINIAN_ID:
                songs.add(new Song("Atlantis Part 1. - Apocalypse 1470 B.C."));
                songs.add(new Song("Song of Yesterday"));
                songs.add(new Song("Atlantis Part 3. - Lost Island"));
                break;
            case ArtistUtils.FABIO_LAGUNA_ID:
                songs.add(new Song("Thoughts"));
                songs.add(new Song("Reflection of Weakness"));
                songs.add(new Song("Killing the Coldness, Killing the Fear"));
                songs.add(new Song("The Dawns End"));
                break;
            case ArtistUtils.JEAN_CARLLOS_ID:
                songs.add(new Song("Água Viva"));
                songs.add(new Song("Lágrimas"));
                songs.add(new Song("Confiar"));
                songs.add(new Song("Não ser"));
                songs.add(new Song("Meus Próprios Meios"));
        }


        songsListView.setAdapter(new SongAdapter(songs));
    }
}
