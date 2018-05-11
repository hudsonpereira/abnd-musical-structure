package com.example.android.musicalstructure.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicalstructure.R;
import com.example.android.musicalstructure.pojo.Artist;
import com.example.android.musicalstructure.pojo.Song;

import java.util.List;

/**
 * Created by hudson on 11/05/18.
 */

public class SongAdapter extends BaseAdapter {

    List<Song> songs;

    public SongAdapter(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return songs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Song song = (Song) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_artists_item, parent, false);

            ImageView artistImageView = convertView.findViewById(R.id.artist_image_view);
            TextView artistTextView = convertView.findViewById(R.id.artist_text_view);

            artistTextView.setText(song.getTitle());
            artistImageView.setImageResource(R.drawable.ic_music_note_black_24dp);
        }

        return convertView;
    }
}
