package com.example.android.warsawguidewithchildren;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by egi-megi on 21.05.18.
 */

public class CommonAdapter extends ArrayAdapter<Attraction> {

    /**
     * Resource ID for the background color for this list of attractions
     */
    public int mColorResourceId;


    public CommonAdapter(@NonNull Context context, @NonNull List<Attraction> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_name
        final TextView titleNameTextView = (TextView) listItemView.findViewById(R.id.title_name);
        // Get the title_name from the current Attraction object and
        // set this text on the title_name TextView
        titleNameTextView.setText(currentAttraction.getTitle());

        // Find the TextView in the list_item.xml layout with the ID text_main
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.text_main);
        // Get the text_main from the current Attraction object and
        // set this text on the text_main TextView
        descriptionTextView.setText(currentAttraction.getShortText());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the current Attraction object and
        // set this image on the image in ImageView
        imageView.setImageResource(currentAttraction.getImageResourceId());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}