package org.chai.imci.follow_up.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.follow_up.Ad_Follow_Up_HivExposed;
import org.chai.imci.follow_up.Ad_Follow_Up_Persistent_Diarrhoea;
import org.chai.imci.follow_up.Follow_Up_HivExposed;
import org.chai.imci.follow_up.Follow_Up_Persistent_Diarrhoea;

public class TabsPagerFollowHivExposed extends FragmentPagerAdapter {

	public TabsPagerFollowHivExposed(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Ad_Follow_Up_HivExposed();
		case 1:
			// Games fragment activity
			return new Follow_Up_HivExposed();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}
