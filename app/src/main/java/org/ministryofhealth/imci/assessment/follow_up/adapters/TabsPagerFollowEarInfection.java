package org.ministryofhealth.imci.assessment.follow_up.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.assessment.follow_up.Ad_Follow_Up_Ear_Infection;
import org.ministryofhealth.imci.assessment.follow_up.Follow_Up_Ear_Infection;

public class TabsPagerFollowEarInfection extends FragmentPagerAdapter {

	public TabsPagerFollowEarInfection(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Ad_Follow_Up_Ear_Infection();
		case 1:
			// Games fragment activity
			return new Follow_Up_Ear_Infection();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}


}
