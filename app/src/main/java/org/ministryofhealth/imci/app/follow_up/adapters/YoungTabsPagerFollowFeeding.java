package org.ministryofhealth.imci.app.follow_up.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.app.follow_up.Ad_Young_Follow_Up_Feeding;
import org.ministryofhealth.imci.app.follow_up.Young_Follow_Up_FeedingProblem;

public class YoungTabsPagerFollowFeeding extends FragmentPagerAdapter {

	public YoungTabsPagerFollowFeeding(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Ad_Young_Follow_Up_Feeding();
		case 1:
			return new Young_Follow_Up_FeedingProblem();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}


}
