package com.example.android.warsawguidewithchildren;

import android.app.Application;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by egi-megi on 14.05.18.
 */

public class AttractionsApplication extends Application {
    // Here are declaring the components of the class SongsApplication
    ArrayList<Attraction> restaurantsList;
//    ArrayList<Attraction> playgroundsList;
//    ArrayList<Attraction> sightseeingList;
//    ArrayList<Attraction> parksList;

    public AttractionsApplication() {
        // Here are create 3 new ArrayLists for objects Song and Band included songs
        this.restaurantsList = new ArrayList<>();
//        this.playgroundsList = new ArrayList<>();
//        this.sightseeingList = new ArrayList<>();
//        this.parksList = new ArrayList<>();

    }

    @Override
    public void onCreate() {
        super.onCreate();
        insertRestaurants();
//        insertPlaygrounds();
//        insertSightseeing();
//        insertParks();
    }

    //Here are placed all songs for this Music Application
    void insertRestaurants() {
        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_nabo), getString(R.string.restaurants_text_nabo), R.drawable.warsaw, getString(R.string.restaurants_phone_nabo), getString(R.string.restaurants_address_nabo), getString(R.string.restaurants_www_nabo)));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_akademia), getString(R.string.restaurants_text_akademia), R.drawable.warsaw, getString(R.string.restaurants_phone_akademia), getString(R.string.restaurants_address_akademia), getString(R.string.restaurants_www_akademia)));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_benihana), getString(R.string.restaurants_text_benihana), R.drawable.warsaw, getString(R.string.restaurants_phone_benihana), getString(R.string.restaurants_address_benihana), getString(R.string.restaurants_www_benihana)));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_boskapraga), getString(R.string.restaurants_text_boskapraga), R.drawable.warsaw, getString(R.string.restaurants_phone_boskapraga), getString(R.string.restaurants_address_boskapraga), getString(R.string.restaurants_www_boskapraga)));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_derelefant), getString(R.string.restaurants_text_derelefant), R.drawable.warsaw, getString(R.string.restaurants_phone_derelefant), getString(R.string.restaurants_address_derelefant), getString(R.string.restaurants_www_derelefant)));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_lif), getString(R.string.restaurants_text_lif), R.drawable.warsaw, getString(R.string.restaurants_phone_lif), getString(R.string.restaurants_address_lif), getString(R.string.restaurants_www_lif)));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_mizusushi), getString(R.string.restaurants_text_mizusushi), R.drawable.warsaw, getString(R.string.restaurants_phone_mizusushi), getString(R.string.restaurants_address_mizusushi), getString(R.string.restaurants_www_mizusushi)));
    }

//    //Here are placed all songs for this Music Application
//    void insertPlaygrounds() {
//        playgroundsList.add(new Attraction("Plac zabaw 1", getString(R.string.restaurants_text_nabo), R.drawable.warsaw));
//        playgroundsList.add(new Attraction("Plac zabaw 2", getString(R.string.restaurants_text_akademia), R.drawable.warsaw));
//    }
//
//    //Here are placed all songs for this Music Application
//    void insertSightseeing() {
//        sightseeingList.add(new Attraction("Co zwiedzać 1", getString(R.string.restaurants_text_nabo), R.drawable.warsaw));
//        sightseeingList.add(new Attraction("Co zwiedzać 2", getString(R.string.restaurants_text_akademia), R.drawable.warsaw));
//    }
//
//    void insertParks() {
//        parksList.add(new Attraction("Park 1", getString(R.string.restaurants_text_nabo), R.drawable.warsaw));
//        parksList.add(new Attraction("Park 2", getString(R.string.restaurants_text_akademia), R.drawable.warsaw));
//    }

    public Attraction findSingleRestaurant(String titleNameSingleRestaurant) {
        for (int i = 0; i < restaurantsList.size(); i++) {
            Attraction attraction = restaurantsList.get(i);
            if (attraction.getTitle().equals(titleNameSingleRestaurant)) {
                return attraction;
            }
        }
        return null;
    }

    public ArrayList<Attraction> getRestaurantsList() {
        return restaurantsList;
    }
}
