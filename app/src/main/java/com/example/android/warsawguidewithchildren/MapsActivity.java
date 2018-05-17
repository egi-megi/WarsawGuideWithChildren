package com.example.android.warsawguidewithchildren;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public Attraction attraction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        String titleNameSingleRestaurant = getIntent().getStringExtra("titleNameSingleRestaurant");
        attraction = ((AttractionsApplication) this.getApplication()).findSingleRestaurant(titleNameSingleRestaurant);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in restaurant and move the camera
        LatLng restaurantName = new LatLng(52.189676, 21.068814);
 //       LatLng restaurantName = new LatLng(attraction.getLatitude(), attraction.getLongitude());
        mMap.addMarker(new MarkerOptions().position(restaurantName).title(getString(R.string.restaurants_name_nabo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(restaurantName));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(restaurantName, 12 ) );
    }
}
