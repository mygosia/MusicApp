package com.example.android.musicapp;

/**
 * Created by mygosia on 07.03.18.
 */
//Creating new class to making new Objects - tracks

public class Track {
    private String mTitle;
    private String mAuthor;
    private double mDuration;

    public Track(String title, String author, double duration) {
        mTitle = title;
        mAuthor = author;
        mDuration = duration;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public double getDuration() {
        return mDuration;
    }
}
