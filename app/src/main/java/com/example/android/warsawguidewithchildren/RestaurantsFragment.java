package com.example.android.warsawguidewithchildren;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;



public class RestaurantsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);


        // Create an array of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.restaurants_title_nabo), getString(R.string.restaurants_text_nabo), R.drawable.warsaw));
        attractions.add(new Attraction(getString(R.string.restaurants_title_nabo), getString(R.string.restaurants_text_nabo), R.drawable.warsaw));
        attractions.add(new Attraction(getString(R.string.restaurants_title_nabo), getString(R.string.restaurants_text_nabo), R.drawable.warsaw));
        attractions.add(new Attraction(getString(R.string.restaurants_title_nabo), getString(R.string.restaurants_text_nabo), R.drawable.warsaw));
        attractions.add(new Attraction(getString(R.string.restaurants_title_nabo), getString(R.string.restaurants_text_nabo), R.drawable.warsaw));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.attraction_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_list_layout);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_restaurant_single, new RestaurantSingleFragment())
                        .commit();
            }
        });

        return rootView;
    }


}
