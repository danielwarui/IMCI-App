package org.chai.imci.followupcare.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.followupcare.Ad_Follow_Up_Malaria;
import org.chai.imci.followupcare.Follow_Up_Malaria;

public class TabsPagerFollowMalaria extends FragmentPagerAdapter {

    public TabsPagerFollowMalaria(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new Ad_Follow_Up_Malaria();
            case 1:
                // Games fragment activity
                return new Follow_Up_Malaria();

        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}
