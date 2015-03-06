package com.chai.imci.Assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_0_2Jaundice;
import com.chai.imci.Assessment.Fragment.Signs_0_2Jaundice;
import com.chai.imci.Assessment.Fragment.Treatment_0_2Jaundice;

public class TabsPagerAdapter0_2Jaundice extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2Jaundice(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_0_2Jaundice();
		case 1:
			// Games fragment activity
			return new Signs_0_2Jaundice();
		case 2:
			// Movies fragment activity
			return new Treatment_0_2Jaundice();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}