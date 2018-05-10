package com.example.android.musicalstructure.pojo;

/**
 * Created by hudson on 10/05/18.
 */

public class Artist {
    String name;

    int imageResource;

    public Artist(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}
