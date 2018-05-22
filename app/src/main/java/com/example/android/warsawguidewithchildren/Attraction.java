package com.example.android.warsawguidewithchildren;

import java.io.Serializable;

/**
 * Created by egi-megi on 07.05.18.
 */

public class Attraction implements Serializable {

    private String mTitle;
    private String mShortText;
    private int[] imagesResources;
    private String mPhoneNumber;
    private String mAddress;
    private String mwwwAddress;
    private String mHours;
    private String mPrice;
    private double mLatitude;
    private double mLongitude;


    public Attraction(String title, String shortText, String phoneNumber, String address,
                      String wwwAddress, double latitude, double  longitude, int[] imageResourceId) {
        mTitle = title;
        mShortText = shortText;
        imagesResources=new int[imageResourceId.length];
        for (int i=0; i<imagesResources.length;i++) {
            imagesResources[i]=imageResourceId[i];
        };
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mwwwAddress = wwwAddress;
        mLatitude = latitude;
        mLongitude = longitude;
    }





    public Attraction(String title, String shortText, String address,
                      String wwwAddress, double latitude, double  longitude,
                      int[] imageResourceId) {
        mTitle = title;
        mShortText = shortText;
        mAddress = address;
        mwwwAddress = wwwAddress;
        mLatitude = latitude;
        mLongitude = longitude;
        imagesResources=new int[imageResourceId.length];
        for (int i=0; i<imagesResources.length;i++) {
            imagesResources[i]=imageResourceId[i];
        };
    }

    public Attraction(String title, String shortText, String phoneNumber, String address,
                      String wwwAddress, String hours, String price, double latitude, double  longitude, int[] imageResourceId) {
        mTitle = title;
        mShortText = shortText;
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mwwwAddress = wwwAddress;
        mHours = hours;
        mPrice = price;
        mLatitude = latitude;
        mLongitude = longitude;
        imagesResources=new int[imageResourceId.length];
        for (int i=0; i<imagesResources.length;i++) {
            imagesResources[i]=imageResourceId[i];
        };
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

                '}';
    }



    public int[] getImagesResources() {
        return imagesResources;
    }

    public int getImageResourceId() {
        return imagesResources[0];
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

    public String getHours() {
        return mHours;
    }

    public String getPrice() {
        return mPrice;
    }

    public double getLatitude() {
        return mLatitude;
    }

        public double getLongitude() {
            return mLongitude;
        }

}