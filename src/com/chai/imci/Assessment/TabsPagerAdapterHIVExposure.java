package com.chai.imci.Assessment;


import com.chai.imci.Assessment.Fragment.Diagnosing_HIVExposure;
import com.chai.imci.Assessment.Fragment.Signs_HIVExposure;
import com.chai.imci.Assessment.Fragment.Treatment_Hiv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapterHIVExposure extends FragmentPagerAdapter {

	public TabsPagerAdapterHIVExposure(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_HIVExposure();
		case 1:
			// Games fragment activity
			return new Signs_HIVExposure();
		case 2:
			// Movies fragment activity
			return new Treatment_Hiv();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
