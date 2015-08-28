package org.chai.imci.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.followupcare.Ad_Follow_Up_Eye_Mouth;
import org.chai.imci.followupcare.Follow_Up_Eye_Mouth;

public class TabsPagerFollowEyeMouth extends FragmentPagerAdapter {

    public TabsPagerFollowEyeMouth(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new Ad_Follow_Up_Eye_Mouth();
            case 1:
                return new Follow_Up_Eye_Mouth();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }


}
