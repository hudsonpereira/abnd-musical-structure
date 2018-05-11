package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.musicalstructure.adapter.ArtistAdapter;
import com.example.android.musicalstructure.pojo.Artist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView artistListView;

    List<Artist> artists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        artistListView = findViewById(R.id.artists_list_View);

        artists = new ArrayList<>();

        artists.add(new Artist("Jordan Rudess", R.drawable.ic_music_note_black_24dp, ArtistUtils.JORDAN_RUDESS_ID));
        artists.add(new Artist("Jon Lord", R.drawable.ic_music_note_black_24dp, ArtistUtils.JON_LORD_ID));
        artists.add(new Artist("Derek Sherinian", R.drawable.ic_music_note_black_24dp, ArtistUtils.DEREK_SHERINIAN_ID));
        artists.add(new Artist("Fabio Laguna", R.drawable.ic_music_note_black_24dp, ArtistUtils.FABIO_LAGUNA_ID));
        artists.add(new Artist("Jean Carllos", R.drawable.ic_music_note_black_24dp, ArtistUtils.JEAN_CARLLOS_ID));

        artistListView.setAdapter(new ArtistAdapter(artists));

        artistListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Artist artist = artists.get(position);
        Intent intent = new Intent(this, SongsActivity.class);

        intent.putExtra(SongsActivity.EXTRA_ARTIST, artist);

        startActivity(intent);
    }
}
