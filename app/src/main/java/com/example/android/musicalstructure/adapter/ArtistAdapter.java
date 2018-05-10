package com.example.android.musicalstructure.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicalstructure.R;
import com.example.android.musicalstructure.pojo.Artist;

import java.util.List;

/**
 * Created by hudson on 10/05/18.
 */

public class ArtistAdapter extends BaseAdapter {

    List<Artist> artists;

    public ArtistAdapter(List<Artist> artists) {
        this.artists = artists;
    }

    @Override
    public int getCount() {
        return artists.size();
    }

    @Override
    public Object getItem(int position) {
        return artists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Artist artist = (Artist) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_artists_item, parent, false);

            ImageView artistImageView = convertView.findViewById(R.id.artist_image_view);
            TextView artistTextView = convertView.findViewById(R.id.artist_text_view);

            artistTextView.setText(artist.getName());
            artistImageView.setImageResource(artist.getImageResource());
        }

        return convertView;
    }
}
