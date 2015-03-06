package com.chai.imci.Assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_Ear_Infection;
import com.chai.imci.Assessment.Fragment.Signs_EarProblem;
import com.chai.imci.Assessment.Fragment.Treatment_EarProblem;

public class TabsPagerAdapterEarproblem extends FragmentPagerAdapter {

	public TabsPagerAdapterEarproblem(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_Ear_Infection();
		case 1:
			// Games fragment activity
			return new Signs_EarProblem();
		case 2:
			// Movies fragment activity
			return new Treatment_EarProblem();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
