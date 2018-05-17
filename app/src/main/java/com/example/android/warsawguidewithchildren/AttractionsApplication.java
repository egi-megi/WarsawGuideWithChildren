package com.example.android.warsawguidewithchildren;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by egi-megi on 14.05.18.
 */

public class AttractionsApplication extends Application {
    // Here are declaring the components of the class SongsApplication
    ArrayList<Attraction> restaurantsList;
    ArrayList<Attraction> playgroundsList;
//    ArrayList<Attraction> sightseeingList;
//    ArrayList<Attraction> parksList;

    public AttractionsApplication() {
        // Here are create 3 new ArrayLists for objects Song and Band included songs
        this.restaurantsList = new ArrayList<>();
        this.playgroundsList = new ArrayList<>();
//        this.sightseeingList = new ArrayList<>();
//        this.parksList = new ArrayList<>();

    }

    @Override
    public void onCreate() {
        super.onCreate();
        insertRestaurants();
        insertPlaygrounds();
//        insertSightseeing();
//        insertParks();
    }

    //Here are placed all songs for this Music Application
    void insertRestaurants() {
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_nabo), getString(R.string.restaurants_text_nabo), R.drawable.warsaw, getString(R.string.restaurants_phone_nabo), getString(R.string.restaurants_address_nabo), getString(R.string.restaurants_www_nabo), 52.189676, 21.068814));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_akademia), getString(R.string.restaurants_text_akademia), R.drawable.warsaw, getString(R.string.restaurants_phone_akademia), getString(R.string.restaurants_address_akademia), getString(R.string.restaurants_www_akademia), 52.203653, 21.022559));
//        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_benihana), getString(R.string.restaurants_text_benihana), R.drawable.warsaw, getString(R.string.restaurants_phone_benihana), getString(R.string.restaurants_address_benihana), getString(R.string.restaurants_www_benihana), getString(R.string.restaurants_latitude_benihana), getString(R.string.restaurants_longitude_benihana)));
//        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_boskapraga), getString(R.string.restaurants_text_boskapraga), R.drawable.warsaw, getString(R.string.restaurants_phone_boskapraga), getString(R.string.restaurants_address_boskapraga), getString(R.string.restaurants_www_boskapraga), getString(R.string.restaurants_latitude_boskapraga), getString(R.string.restaurants_longitude_boskapraga)));
//        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_derelefant), getString(R.string.restaurants_text_derelefant), R.drawable.warsaw, getString(R.string.restaurants_phone_derelefant), getString(R.string.restaurants_address_derelefant), getString(R.string.restaurants_www_derelefant), getString(R.string.restaurants_latitude_derelefant), getString(R.string.restaurants_longitude_derelefant)));
//        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_lif), getString(R.string.restaurants_text_lif), R.drawable.warsaw, getString(R.string.restaurants_phone_lif), getString(R.string.restaurants_address_lif), getString(R.string.restaurants_www_lif), getString(R.string.restaurants_latitude_lif), getString(R.string.restaurants_longitude_lif)));
//        restaurantsList.add(new Attraction(getString(R.string.restaurants_title_mizusushi), getString(R.string.restaurants_text_mizusushi), R.drawable.warsaw, getString(R.string.restaurants_phone_mizusushi), getString(R.string.restaurants_address_mizusushi), getString(R.string.restaurants_www_mizusushi), getString(R.string.restaurants_latitude_mizusushi), getString(R.string.restaurants_longitude_mizusushi)));
    }

    //Here are placed all songs for this Music Application
    void insertPlaygrounds() {
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_barcelonska), getString(R.string.playgrounds_text_barcelonska), getString(R.string.playgrounds_address_barcelonska), getString(R.string.playgrounds_www_barcelonska), 52.189676, 21.068814, new int[]{R.drawable.playgrounds_barcelonska_1, R.drawable.playgrounds_barcelonska_2, R.drawable.playgrounds_barcelonska_3} ));
    }

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

    public ArrayList<Attraction> getPlaygroundsList() {
        return playgroundsList;
    }


}
