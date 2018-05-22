package com.example.android.warsawguidewithchildren;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SightseeingSingleFragment extends SingleFragment {
    {
        layout = R.layout.fragment_sightseeing_single;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        if (attraction != null) {
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

            TextView hoursTextView = (TextView) rootView.findViewById(R.id.hours);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            hoursTextView.setText(attraction.getHours());

            TextView priceTextView = (TextView) rootView.findViewById(R.id.price);
            // Get the version number from the current Song object and
            // set this text on the number TextView
            priceTextView.setText(attraction.getPrice());

        }

        return rootView;
    }
}