package com.okeino2;

/**
 * Created by okeinomcgowan on 14/05/2017.
 */
public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
@Override
    public String toString() {
       return this.title+": "+ this.duration;
 }



}
