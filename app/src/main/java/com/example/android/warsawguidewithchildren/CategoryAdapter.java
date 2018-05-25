package com.example.android.warsawguidewithchildren;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by egi-megi on 07.05.18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    //Setting the order of the tabs
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlaygroundsFragment();
        } else if (position == 1) {
            return new ParksFragment();
        } else if (position == 2) {
            return new SightseeingFragment();
        } else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    //Setting manes of the tabs
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.attraction_playgrounds);
        } else if (position == 1) {
            return mContext.getString(R.string.attraction_parks);
        } else if (position == 2) {
            return mContext.getString(R.string.attraction_sightseeing);
        } else {
            return mContext.getString(R.string.attraction_restaurants);
        }
    }

}
