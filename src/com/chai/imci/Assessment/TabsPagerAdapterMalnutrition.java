package com.chai.imci.Assessment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_Malnutrition;
import com.chai.imci.Assessment.Fragment.Signs_Malnutrition;
import com.chai.imci.Assessment.Fragment.Treatment_Malnurtition;

public class TabsPagerAdapterMalnutrition extends FragmentPagerAdapter {

	public TabsPagerAdapterMalnutrition(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
		
			return new Diagnosing_Malnutrition();
		case 1:
			return new Signs_Malnutrition();
		case 2:
			return new Treatment_Malnurtition();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
