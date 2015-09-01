package org.chai.imci.follow_up.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.follow_up.Ad_Young_Follow_Up_LocalBacterial;
import org.chai.imci.follow_up.Young_Follow_Up_Local_BacterialInfection;

public class YoungTabsPagerFollowBacterial extends FragmentPagerAdapter {

	public YoungTabsPagerFollowBacterial(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Ad_Young_Follow_Up_LocalBacterial();
		case 1:
			// Games fragment activity
			return new Young_Follow_Up_Local_BacterialInfection();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}


}
