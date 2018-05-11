package com.example.android.warsawguidewithchildren;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainFragment extends Fragment {
     ViewPager viewPager;
    CategoryAdapter adapter;
    TabLayout tabLayout;
    @Override
    public void onResume() {
        super.onResume();
        viewPager = (ViewPager) getView().findViewById(R.id.viewpager);
        adapter = new CategoryAdapter(getActivity(), getActivity().getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        // Give the TabLayout the ViewPager
        tabLayout = (TabLayout) getView().findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        int i=tabLayout.getSelectedTabPosition();
        viewPager.setCurrentItem(i);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        adapter = new CategoryAdapter(getActivity(), getActivity().getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        tabLayout = (TabLayout) rootView.findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        return rootView;
    }




}
