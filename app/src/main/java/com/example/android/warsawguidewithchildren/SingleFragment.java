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

 //   private int mColorResourceId;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attraction = (Attraction) getArguments().getSerializable("attraction");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(layout, container, false);
 //       mColorResourceId = colorResourceId;

        if (attraction != null) {
            // Find the TextView in the single_song_item.xml layout with the ID version_name
            TextView titleNameTextView = (TextView) rootView.findViewById(R.id.name);
            // Get the version name from the current Song object and
            // set this text on the name TextView
            titleNameTextView.setText(attraction.getTitle());

            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView descriptionTextView = (TextView) rootView.findViewById(R.id.description);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            descriptionTextView.setText(attraction.getShortText());


            LinearLayout hsv = (LinearLayout) rootView.findViewById(R.id.img_view);
            for (int imgId : attraction.getImagesResources()) {
                ImageView iv = new ImageView(inflater.getContext());
                iv.setImageResource(imgId);
                iv.setLayoutParams(
                        new ViewGroup.LayoutParams(
                                // or ViewGroup.LayoutParams.WRAP_CONTENT
                                ViewGroup.LayoutParams.WRAP_CONTENT,
                                // or ViewGroup.LayoutParams.WRAP_CONTENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));
                hsv.addView(iv);
            }
            // Find the TextView in the single_song_item.xml layout with the ID version_number


            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView addressTextView = (TextView) rootView.findViewById(R.id.address);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            addressTextView.setText(attraction.getAddress());

            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView wwwAddressTextView = (TextView) rootView.findViewById(R.id.wwwAddress);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            wwwAddressTextView.setText(attraction.getwwwAddress());

            // Find the ImageView in the single_song_item.xml layout with the ID version_number
         /*   ImageView mapImageView = (ImageView) rootView.findViewById(R.id.map_image_view_restaurant);
            // Get the version number from the current AndroidFlavor object and
            // set this image on the number ImageView
            mapImageView.setImageResource(attraction.getImageResourceId());
            mapImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mapIntent = new Intent(getActivity().getApplication(), MapsActivity.class);
                    startActivity(mapIntent);
                }
            });*/

            SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

//            // Set the theme color for the list item
//            View textContainer = rootView.findViewById(R.id.fragment_single);
//            // Find the color that the resource ID maps to
//            int color = ContextCompat.getColor(getContext(), mColorResourceId);
//            // Set the background color of the text container View
//            textContainer.setBackgroundColor(color);

        }
        return rootView;

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        if (attraction != null) {
            LatLng attarctionPos = new LatLng(attraction.getLatitude(), attraction.getLongitude());
            googleMap.addMarker(new MarkerOptions().position(attarctionPos)
                    .title(attraction.getTitle()));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(attarctionPos, 12f));
            googleMap.setOnInfoWindowClickListener(this);
        }


    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        Toast.makeText(getActivity(), marker.getTitle(),
                Toast.LENGTH_LONG).show();

    }
}