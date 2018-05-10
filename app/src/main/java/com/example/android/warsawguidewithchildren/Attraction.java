package com.example.android.warsawguidewithchildren;

/**
 * Created by egi-megi on 07.05.18.
 */

public class Attraction {

    private String mTitle;
    private String mShortText;
    private int mImageResourceId;


    public Attraction(String title, String shortText, int imageResourceId) {
        mTitle = title;
        mShortText = shortText;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }


    public String getShortText() {
        return mShortText;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "mTitle='" + mTitle + '\'' +
                ", mShortText='" + mShortText + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}