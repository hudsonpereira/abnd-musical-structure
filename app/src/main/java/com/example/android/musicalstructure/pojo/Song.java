package com.example.android.musicalstructure.pojo;

import java.io.Serializable;

/**
 * Created by hudson on 11/05/18.
 */

public class Song implements Serializable {
    String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
