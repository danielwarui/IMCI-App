package org.ministryofhealth.imci.assessment.follow_up.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.assessment.follow_up.Ad_Young_Follow_Up_Diarrhoea;
import org.ministryofhealth.imci.assessment.follow_up.Young_Follow_Up_Diarrhoea;

public class YoungTabsPagerFollowDiarr extends FragmentPagerAdapter {

	public YoungTabsPagerFollowDiarr(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Ad_Young_Follow_Up_Diarrhoea();
		case 1:
			return new Young_Follow_Up_Diarrhoea();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}
