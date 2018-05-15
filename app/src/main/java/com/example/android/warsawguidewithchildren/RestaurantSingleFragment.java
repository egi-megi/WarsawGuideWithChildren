package com.example.android.warsawguidewithchildren;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;


public class RestaurantSingleFragment extends Fragment {

    Attraction attraction;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attraction=(Attraction) getArguments().getSerializable("attraction");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_restaurant_single, container, false);


        if (attraction != null) {
            // Find the TextView in the single_song_item.xml layout with the ID version_name
            TextView titleNameTextView = (TextView) rootView.findViewById(R.id.restaurant_name);
            // Get the version name from the current Song object and
            // set this text on the name TextView
            titleNameTextView.setText(attraction.getTitle());

            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView descriptionTextView = (TextView) rootView.findViewById(R.id.restaurant_description);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            descriptionTextView.setText(attraction.getShortText());

            // Find the ImageView in the single_song_item.xml layout with the ID version_number
            ImageView bandSingerImageView = (ImageView) rootView.findViewById(R.id.restaurant_image);
            // Get the version number from the current AndroidFlavor object and
            // set this image on the number ImageView
            bandSingerImageView.setImageResource(attraction.getImageResourceId());

            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView phoneTextView = (TextView) rootView.findViewById(R.id.restaurant_phone);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            phoneTextView.setText(attraction.getPhoneNumber());
            phoneTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", (attraction.getPhoneNumber()), null));
                    startActivity(intent);
                }
            });

            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView addressTextView = (TextView) rootView.findViewById(R.id.restaurant_address);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            addressTextView.setText(attraction.getAddress());

            // Find the TextView in the single_song_item.xml layout with the ID version_number
            TextView wwwAddressTextView = (TextView) rootView.findViewById(R.id.restaurant_wwwAddress);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            wwwAddressTextView.setText(attraction.getwwwAddress());
        }
        return rootView;

    }
}