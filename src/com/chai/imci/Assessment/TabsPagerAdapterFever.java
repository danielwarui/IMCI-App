package com.chai.imci.Assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_Fever;
import com.chai.imci.Assessment.Fragment.SignFever;
import com.chai.imci.Assessment.Fragment.TreatmentFever;

public class TabsPagerAdapterFever extends FragmentPagerAdapter {

	public TabsPagerAdapterFever(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Diagnosing_Fever();
		case 1:
			return new SignFever();
		case 2:
			return new TreatmentFever();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
