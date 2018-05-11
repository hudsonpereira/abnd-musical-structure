package com.example.android.musicalstructure.pojo;

import java.io.Serializable;

/**
 * Created by hudson on 10/05/18.
 */

public class Artist implements Serializable{

    int id;

    String name;

    int imageResource;

    public Artist(String name, int imageResource, int id) {
        this.name = name;
        this.imageResource = imageResource;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getId() {
        return id;
    }
}
