package com.example.android.warsawguidewithchildren;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//This class is now not usable. It is for the future
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public Attraction attraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in restaurant and move the camera
        LatLng restaurantName = new LatLng(52.189676, 21.068814);
        //       LatLng restaurantName = new LatLng(attraction.getLatitude(), attraction.getLongitude());
        mMap.addMarker(new MarkerOptions().position(restaurantName).title(getString(R.string.restaurants_name_nabo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(restaurantName));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(restaurantName, 12));
    }
}
