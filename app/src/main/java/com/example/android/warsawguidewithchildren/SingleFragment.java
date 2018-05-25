package com.example.android.warsawguidewithchildren;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.support.v4.app.Fragment;

/**
 * Created by egi-megi on 17.05.18.
 */

public class SingleFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnInfoWindowClickListener {


    protected int layout = R.layout.fragment_restaurant_single;

    Attraction attraction;

    protected int mColorResourceId;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attraction = (Attraction) getArguments().getSerializable("attraction");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(layout, container, false);

        if (attraction != null) {
            // Find the TextView in the fragment_single layout with the ID version_name
            TextView titleNameTextView = (TextView) rootView.findViewById(R.id.name);
            // Get the version name from the current Attraction object and
            // set this text on the name TextView
            titleNameTextView.setText(attraction.getTitle());

            // Find the TextView in the fragment_single layout with the ID version_number
            TextView descriptionTextView = (TextView) rootView.findViewById(R.id.description);
            // Get the version number from the current Attraction object and
            // set this text on the number TextView
            descriptionTextView.setText(attraction.getShortText());

            //Make gallery of images
            LinearLayout imagesGallery = (LinearLayout) rootView.findViewById(R.id.img_view);
            for (int imgId : attraction.getImagesResources()) {
                ImageView iv = new ImageView(inflater.getContext());
                iv.setImageResource(imgId);
                iv.setLayoutParams(
                        new ViewGroup.LayoutParams(
                                // or ViewGroup.LayoutParams.WRAP_CONTENT
                                ViewGroup.LayoutParams.WRAP_CONTENT,
                                // or ViewGroup.LayoutParams.WRAP_CONTENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                imagesGallery.addView(iv);
            }


            // Find the TextView in the fragment_single layout with the ID address
            TextView addressTextView = (TextView) rootView.findViewById(R.id.address);
            // Get the address from the current Attraction object and
            // set this text on the number TextView
            addressTextView.setText(attraction.getAddress());

            // Find the TextView in the fragment_single layout with the ID of website
            TextView wwwAddressTextView = (TextView) rootView.findViewById(R.id.wwwAddress);
            // Get the website from the current Attraction object and
            // set this text on the wwwAddress TextView
            wwwAddressTextView.setText(attraction.getwwwAddress());

            // Set the theme color for the single fragments' background
            View textContainer = (View) rootView.findViewById(R.id.fragment_single);
            // Find the color that the resource ID maps to
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            // Set the background color of the text container View
            textContainer.setBackgroundColor(color);

            //Set the map with localization of attraction
            SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);


        }
        return rootView;

    }

    //Set the localization of attraction and place there a marker
    @Override
    public void onMapReady(GoogleMap googleMap) {
        if (attraction != null) {
            LatLng attarctionPos = new LatLng(attraction.getLatitude(), attraction.getLongitude());
            googleMap.addMarker(new MarkerOptions().position(attarctionPos)
                    .title(attraction.getTitle()));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(attarctionPos, 13f));
            googleMap.setOnInfoWindowClickListener(this);
        }


    }

    //Set text which id display when someone click on localization marker placed on map
    @Override
    public void onInfoWindowClick(Marker marker) {
        Toast.makeText(getActivity(), marker.getTitle(),
                Toast.LENGTH_LONG).show();

    }
}