package com.example.android.warsawguidewithchildren;

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
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class RestaurantSingleFragment extends SingleFragment {
    {
        layout=R.layout.fragment_restaurant_single;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=super.onCreateView(inflater, container, savedInstanceState);
         if(attraction!=null) {
             TextView phoneTextView = (TextView) rootView.findViewById(R.id.phone);
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

         }

        return rootView;
    }
}