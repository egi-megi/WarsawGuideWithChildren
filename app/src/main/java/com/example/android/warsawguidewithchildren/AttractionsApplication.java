package com.example.android.warsawguidewithchildren;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by egi-megi on 14.05.18.
 */

public class AttractionsApplication extends Application {
    // Here are declaring the 4 ArrayLists
    ArrayList<Attraction> restaurantsList;
    ArrayList<Attraction> playgroundsList;
    ArrayList<Attraction> sightseeingList;
    ArrayList<Attraction> parksList;

    public AttractionsApplication() {
        // Here are create 4 new ArrayLists for object Attraction
        this.restaurantsList = new ArrayList<>();
        this.playgroundsList = new ArrayList<>();
        this.sightseeingList = new ArrayList<>();
        this.parksList = new ArrayList<>();

    }

    //Here are used four methods which add attractions to 4 ArrayLists
    @Override
    public void onCreate() {
        super.onCreate();
        insertRestaurants();
        insertPlaygrounds();
        insertSightseeing();
        insertParks();
    }

    //Here is define method which adds all attraction on restaurantsList
    void insertRestaurants() {
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_nabo), getString(R.string.restaurants_text_nabo), getString(R.string.restaurants_phone_nabo), getString(R.string.restaurants_address_nabo), getString(R.string.restaurants_www_nabo), 52.189676, 21.068814, new int[]{R.drawable.restaurants_nabo_1, R.drawable.restaurants_nabo_2}));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_akademia), getString(R.string.restaurants_text_akademia), getString(R.string.restaurants_phone_akademia), getString(R.string.restaurants_address_akademia), getString(R.string.restaurants_www_akademia), 52.203653, 21.022559, new int[]{R.drawable.restaurants_akademia_1, R.drawable.restaurants_akademia_2}));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_benihana), getString(R.string.restaurants_text_benihana), getString(R.string.restaurants_phone_benihana), getString(R.string.restaurants_address_benihana), getString(R.string.restaurants_www_benihana), 52.235428, 21.001673, new int[]{R.drawable.restaurants_benihana_2}));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_boskapraga), getString(R.string.restaurants_text_boskapraga), getString(R.string.restaurants_phone_boskapraga), getString(R.string.restaurants_address_boskapraga), getString(R.string.restaurants_www_boskapraga), 52.250509, 21.033177, new int[]{R.drawable.restaurants_boskapraga_1, R.drawable.restaurants_boskapraga_2}));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_derelefant), getString(R.string.restaurants_text_derelefant), getString(R.string.restaurants_phone_derelefant), getString(R.string.restaurants_address_derelefant), getString(R.string.restaurants_www_derelefant), 52.241718, 21.003260, new int[]{R.drawable.restaurants_derelefant_1, R.drawable.restaurants_derelefant_2}));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_lif), getString(R.string.restaurants_text_lif), getString(R.string.restaurants_phone_lif), getString(R.string.restaurants_address_lif), getString(R.string.restaurants_www_lif), 52.196325, 21.014275, new int[]{R.drawable.restaurants_lif_1, R.drawable.restaurants_lif_2}));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_mizusushi), getString(R.string.restaurants_text_mizusushi), getString(R.string.restaurants_phone_mizusushi), getString(R.string.restaurants_address_mizusushi), getString(R.string.restaurants_www_mizusushi), 52.256792, 20.970086, new int[]{R.drawable.restaurants_mizusushi_1, R.drawable.restaurants_mizusushi_2}));
        restaurantsList.add(new Attraction(getString(R.string.restaurants_name_kofifi), getString(R.string.restaurants_text_kofifi), getString(R.string.restaurants_phone_kofifi), getString(R.string.restaurants_address_kofifi), getString(R.string.restaurants_www_kofifi), 52.266422, 20.989234, new int[]{R.drawable.restaurants_kofifi_1}));
    }

    //Here is define method which adds all attraction on playgroundsList
    void insertPlaygrounds() {
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_barcelonska), getString(R.string.playgrounds_text_barcelonska), getString(R.string.playgrounds_address_barcelonska), getString(R.string.playgrounds_www_barcelonska), 52.177327, 21.053196, new int[]{R.drawable.playgrounds_barcelonska_1, R.drawable.playgrounds_barcelonska_2, R.drawable.playgrounds_barcelonska_3, R.drawable.playgrounds_barcelonska_4, R.drawable.playgrounds_barcelonska_5, R.drawable.playgrounds_barcelonska_6, R.drawable.playgrounds_barcelonska_7}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_bielany), getString(R.string.playgrounds_text_bielany), getString(R.string.playgrounds_address_bielany), getString(R.string.playgrounds_www_bielany), 52.283506, 20.957171, new int[]{R.drawable.playgrounds_bielany_1, R.drawable.playgrounds_bielany_3, R.drawable.playgrounds_bielany_4, R.drawable.playgrounds_bielany_5, R.drawable.playgrounds_bielany_6}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_placwillsona), getString(R.string.playgrounds_text_placwillsona), getString(R.string.playgrounds_address_placwillsona), getString(R.string.playgrounds_www_placwillsona), 52.267170, 20.988859, new int[]{R.drawable.playgrounds_placwillsona_1, R.drawable.playgrounds_placwillsona_2, R.drawable.playgrounds_placwillsona_3, R.drawable.playgrounds_placwillsona_4, R.drawable.playgrounds_placwillsona_5, R.drawable.playgrounds_placwillsona_6, R.drawable.playgrounds_placwillsona_7, R.drawable.playgrounds_placwillsona_8}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_polemokotowskie), getString(R.string.playgrounds_text_polemokotowskie), getString(R.string.playgrounds_address_polemokotowskie), getString(R.string.playgrounds_www_polemokotowskie), 52.210802, 20.998934, new int[]{R.drawable.playgrounds_polamokotowskie_1, R.drawable.playgrounds_polamokotowskie_2, R.drawable.playgrounds_polamokotowskie_3, R.drawable.playgrounds_polamokotowskie_6, R.drawable.playgrounds_polamokotowskie_7}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_przybazantarnii), getString(R.string.playgrounds_text_przybazantarnii), getString(R.string.playgrounds_address_przybazantarnii), getString(R.string.playgrounds_www_przybazantarnii), 52.135963, 21.064354, new int[]{R.drawable.playgrounds_przybazantarnii_1, R.drawable.playgrounds_przybazantarnii_2, R.drawable.playgrounds_przybazantarnii_3, R.drawable.playgrounds_przybazantarnii_4, R.drawable.playgrounds_przybazantarnii_5, R.drawable.playgrounds_przybazantarnii_6}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_telekiego), getString(R.string.playgrounds_text_telekiego), getString(R.string.playgrounds_address_telekiego), getString(R.string.playgrounds_www_telekiego), 52.132848, 21.058993, new int[]{R.drawable.playgrounds_telekiego_1, R.drawable.playgrounds_telekiego_2, R.drawable.playgrounds_telekiego_3, R.drawable.playgrounds_telekiego_6, R.drawable.playgrounds_telekiego_7, R.drawable.playgrounds_telekiego_8}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_wilanow), getString(R.string.playgrounds_text_wilanow), getString(R.string.playgrounds_address_wilanow), getString(R.string.playgrounds_www_wilanow), 52.165715, 21.082550, new int[]{R.drawable.playgrounds_wilanow_2, R.drawable.playgrounds_wilanow_3, R.drawable.playgrounds_wilanow_4, R.drawable.playgrounds_wilanow_5, R.drawable.playgrounds_wilanow_6}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_zacisze), getString(R.string.playgrounds_text_zacisze), getString(R.string.playgrounds_address_zacisze), getString(R.string.playgrounds_www_zacisze), 52.289910, 21.057166, new int[]{R.drawable.playgrounds_zacisze_1, R.drawable.playgrounds_zacisze_2, R.drawable.playgrounds_zacisze_3, R.drawable.playgrounds_zacisze_4, R.drawable.playgrounds_zacisze_5, R.drawable.playgrounds_zacisze_6}));
        playgroundsList.add(new Attraction(getString(R.string.playgrounds_name_blonie), getString(R.string.playgrounds_text_blonie), getString(R.string.playgrounds_address_blonie), getString(R.string.playgrounds_www_blonie), 52.191811, 20.615826, new int[]{R.drawable.playgrounds_blonie_1, R.drawable.playgrounds_blonie_2, R.drawable.playgrounds_blonie_4, R.drawable.playgrounds_blonie_5, R.drawable.playgrounds_blonie_6, R.drawable.playgrounds_blonie_7, R.drawable.playgrounds_blonie_8}));
    }

    //Here is define method which adds all attraction on parksList
    void insertParks() {
        parksList.add(new Attraction(getString(R.string.parks_name_lazienki), getString(R.string.parks_text_lazienki), getString(R.string.parks_address_lazienki), getString(R.string.parks_www_lazienki), 52.215122, 21.031622, new int[]{R.drawable.parks_lazienki_1, R.drawable.parks_lazienki_2, R.drawable.parks_lazienki_3, R.drawable.parks_lazienki_4, R.drawable.parks_lazienki_5, R.drawable.parks_lazienki_6, R.drawable.parks_lazienki_7}));
        parksList.add(new Attraction(getString(R.string.parks_name_polemokotowskie), getString(R.string.parks_text_polemokotowskie), getString(R.string.parks_address_polemokotowskie), getString(R.string.parks_www_polemokotowskie), 52.212433, 21.003847, new int[]{R.drawable.parks_polemokotwskie_1, R.drawable.parks_polemokotwskie_2, R.drawable.parks_polemokotwskie_3}));
        parksList.add(new Attraction(getString(R.string.parks_name_wilanow), getString(R.string.parks_text_wilanow), getString(R.string.parks_address_wilanow), getString(R.string.parks_www_wilanow), 52.166397, 21.090960, new int[]{R.drawable.parks_wilanow_1, R.drawable.parks_wilanow_2, R.drawable.parks_wilanow_3, R.drawable.parks_wilanow_4, R.drawable.parks_wilanow_5, R.drawable.parks_wilanow_6, R.drawable.parks_wilanow_7}));
        parksList.add(new Attraction(getString(R.string.parks_name_parkbrodnowski), getString(R.string.parks_text_parkbrodnowski), getString(R.string.parks_address_parkbrodnowski), getString(R.string.parks_www_parkbrodnowski), 52.291184, 21.037514, new int[]{R.drawable.parks_parkbrodnowski_1, R.drawable.parks_parkbrodnowski_4, R.drawable.parks_parkbrodnowski_5, R.drawable.parks_parkbrodnowski_6, R.drawable.parks_parkbrodnowski_7}));
        parksList.add(new Attraction(getString(R.string.parks_name_lasbrodnowski), getString(R.string.parks_text_lasbrodnowski), getString(R.string.parks_address_lasbrodnowski), getString(R.string.parks_www_lasbrodnowski), 52.297266, 21.059296, new int[]{R.drawable.parks_lasbrodnowski_1, R.drawable.parks_lasbrodnowski_2, R.drawable.parks_lasbrodnowski_3, R.drawable.parks_lasbrodnowski_4}));
        parksList.add(new Attraction(getString(R.string.parks_name_skaryszewski), getString(R.string.parks_text_skaryszewski), getString(R.string.parks_address_skaryszewski), getString(R.string.parks_www_skaryszewski), 52.242491, 21.054736, new int[]{R.drawable.parks_skaryszewski_1, R.drawable.parks_skaryszewski_2, R.drawable.parks_skaryszewski_3, R.drawable.parks_skaryszewski_4, R.drawable.parks_skaryszewski_5, R.drawable.parks_skaryszewski_6, R.drawable.parks_skaryszewski_7}));
        parksList.add(new Attraction(getString(R.string.parks_name_laskabacki), getString(R.string.parks_text_laskabacki), getString(R.string.parks_address_laskabacki), getString(R.string.parks_www_laskabacki), 52.129543, 21.046044, new int[]{R.drawable.parks_laskabacki_1, R.drawable.parks_laskabacki_2, R.drawable.parks_laskabacki_3, R.drawable.parks_laskabacki_4}));
        parksList.add(new Attraction(getString(R.string.parks_name_kampinos), getString(R.string.parks_text_kampinos), getString(R.string.parks_address_kampinos), getString(R.string.parks_www_kampinos), 52.301724, 20.799020, new int[]{R.drawable.parks_kampinos_1, R.drawable.parks_kampinos_2, R.drawable.parks_kampinos_3}));
    }

    //Here is define method which adds all attraction on sightseeingList
    void insertSightseeing() {
        sightseeingList.add(new Attraction(getString(R.string.sightseeing_name_staremiasto), getString(R.string.sightseeing_text_staremiasto), getString(R.string.sightseeing_phone_staremiasto), getString(R.string.sightseeing_address_staremiasto), getString(R.string.sightseeing_www_staremiasto), getString(R.string.sightseeing_hours_staremiasto), getString(R.string.sightseeing_price_staremiasto), 52.247861, 21.014355, new int[]{R.drawable.sightseeing_staremiasto_1, R.drawable.sightseeing_staremiasto_2, R.drawable.sightseeing_staremiasto_3}));
        sightseeingList.add(new Attraction(getString(R.string.sightseeing_name_palackultury), getString(R.string.sightseeing_text_palackultury), getString(R.string.sightseeing_phone_palackultury), getString(R.string.sightseeing_address_palackultury), getString(R.string.sightseeing_www_palackultury), getString(R.string.sightseeing_hours_palackultury), getString(R.string.sightseeing_price_palackultury), 52.231873, 21.006087, new int[]{R.drawable.sightseeing_palackultury_1, R.drawable.sightseeing_palackultury_2, R.drawable.sightseeing_palackultury_3}));
        sightseeingList.add(new Attraction(getString(R.string.sightseeing_name_wilanow), getString(R.string.sightseeing_text_wilanow), getString(R.string.sightseeing_phone_wilanow), getString(R.string.sightseeing_address_wilanow), getString(R.string.sightseeing_www_wilanow), getString(R.string.sightseeing_hours_wilanow), getString(R.string.sightseeing_price_wilanow), 52.165121, 21.090478, new int[]{R.drawable.sightseeing_wilanow_1, R.drawable.sightseeing_wilanow_2, R.drawable.sightseeing_wilanow_4}));
        sightseeingList.add(new Attraction(getString(R.string.sightseeing_name_centrumnaukikopernik), getString(R.string.sightseeing_text_centrumnaukikopernik), getString(R.string.sightseeing_phone_centrumnaukikopernik), getString(R.string.sightseeing_address_centrumnaukikopernik), getString(R.string.sightseeing_www_centrumnaukikopernik), getString(R.string.sightseeing_hours_centrumnaukikopernik), getString(R.string.sightseeing_price_centrumnaukikopernik), 52.241604, 21.028628, new int[]{R.drawable.sightseeing_centrumnaukikopernik_2, R.drawable.sightseeing_centrumnaukikopernik_3, R.drawable.sightseeing_centrumnaukikopernik_4}));
        sightseeingList.add(new Attraction(getString(R.string.sightseeing_name_fontanny), getString(R.string.sightseeing_text_fontanny), getString(R.string.sightseeing_phone_fontanny), getString(R.string.sightseeing_address_fontanny), getString(R.string.sightseeing_www_fontanny), getString(R.string.sightseeing_hours_fontanny), getString(R.string.sightseeing_price_fontanny), 52.254288, 21.011290, new int[]{R.drawable.sightseeing_fontanny_1, R.drawable.sightseeing_fontanny_2, R.drawable.sightseeing_fontanny_3, R.drawable.sightseeing_fontanny_4}));
        sightseeingList.add(new Attraction(getString(R.string.sightseeing_name_swiatelkazima), getString(R.string.sightseeing_text_swiatelkazima), getString(R.string.sightseeing_phone_swiatelkazima), getString(R.string.sightseeing_address_swiatelkazima), getString(R.string.sightseeing_www_swiatelkazima), getString(R.string.sightseeing_hours_swiatelkazima), getString(R.string.sightseeing_price_swiatelkazima), 52.207181, 21.032605, new int[]{R.drawable.sightseeing_swiatelkazima_1, R.drawable.sightseeing_swiatelkazima_2, R.drawable.sightseeing_swiatelkazima_3, R.drawable.sightseeing_swiatelkazima_4}));
    }


    public ArrayList<Attraction> getRestaurantsList() {
        return restaurantsList;
    }

    public ArrayList<Attraction> getPlaygroundsList() {
        return playgroundsList;
    }

    public ArrayList<Attraction> getParksList() {
        return parksList;
    }

    public ArrayList<Attraction> getSightseeingList() {
        return sightseeingList;
    }
}
