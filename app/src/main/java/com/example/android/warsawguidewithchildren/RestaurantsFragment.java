package com.example.android.warsawguidewithchildren;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class RestaurantsFragment extends Fragment {

    void setupList(View rootView) {

        final List<Attraction> attractions = ((AttractionsApplication) getActivity().getApplication()).getRestaurantsList();

        CommonAdapter adapter = new CommonAdapter(getActivity(), attractions, R.color.attraction_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.attraction_list_layout);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                RestaurantSingleFragment myFragment = new RestaurantSingleFragment();
                Bundle args = new Bundle();
                args.putSerializable("attraction", attractions.get(i));
                myFragment.setArguments(args);
                //Go back to the upper Fragment
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, myFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.
                attraction_list, container, false);
        setupList(rootView);

        return rootView;
    }


}
