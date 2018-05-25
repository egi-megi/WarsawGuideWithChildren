package com.example.android.warsawguidewithchildren;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class RestaurantSingleFragment extends SingleFragment {
    //Change in Single Fragment the value of  variables layout and mColorResourceId
    {
        layout = R.layout.fragment_restaurant_single;
        mColorResourceId = R.color.attraction_restaurants;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        if (attraction != null) {
            //Get phoneNumber in SingleFragment for restaurant and
            // set this text on the phone TextView and make the phone number clickable
            TextView phoneTextView = (TextView) rootView.findViewById(R.id.phone);
            phoneTextView.setText(attraction.getPhoneNumber());
            phoneTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", (attraction.getPhoneNumber()), null));
                    startActivity(intent);
                }
            });

        }

        return rootView;
    }
}