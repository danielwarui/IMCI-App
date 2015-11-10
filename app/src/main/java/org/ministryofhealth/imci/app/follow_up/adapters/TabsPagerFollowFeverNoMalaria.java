package org.ministryofhealth.imci.app.follow_up.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.app.follow_up.Ad_Follow_Up_Fever_No_Malaria;
import org.ministryofhealth.imci.app.follow_up.Follow_Up_Fever_No_Malaria;

public class TabsPagerFollowFeverNoMalaria extends FragmentPagerAdapter {

	public TabsPagerFollowFeverNoMalaria(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Ad_Follow_Up_Fever_No_Malaria();
		case 1:
			return new Follow_Up_Fever_No_Malaria();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}


}
