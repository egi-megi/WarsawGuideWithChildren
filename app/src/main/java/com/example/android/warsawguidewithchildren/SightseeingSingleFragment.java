package com.example.android.warsawguidewithchildren;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SightseeingSingleFragment extends SingleFragment {
    {
        layout = R.layout.fragment_sightseeing_single;
        mColorResourceId = R.color.attraction_sightseeing;
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

            //Get open hours in SingleFragment for sightseeing and
            // set this text on the hours TextView
            TextView hoursTextView = (TextView) rootView.findViewById(R.id.hours);
            hoursTextView.setText(attraction.getHours());

            //Get price in SingleFragment for sightseeing and
            // set this text on the price TextView
            TextView priceTextView = (TextView) rootView.findViewById(R.id.price);
            priceTextView.setText(attraction.getPrice());

        }

        return rootView;
    }
}