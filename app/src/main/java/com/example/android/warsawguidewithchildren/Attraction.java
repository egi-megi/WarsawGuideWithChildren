package com.example.android.warsawguidewithchildren;

import java.io.Serializable;

/**
 * Created by egi-megi on 07.05.18.
 */

public class Attraction implements Serializable {

    private String mTitle;
    private String mShortText;
    private int mImageResourceId;
    private String mPhoneNumber;
    private String mAddress;
    private String mwwwAddress;


    public Attraction(String title, String shortText, int imageResourceId, String phoneNumber, String address, String wwwAddress) {
        mTitle = title;
        mShortText = shortText;
        mImageResourceId = imageResourceId;
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mwwwAddress = wwwAddress;
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

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getwwwAddress() {
        return mwwwAddress;
    }
}