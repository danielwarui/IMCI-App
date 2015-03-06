package com.chai.imci.Assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_0_2Diarrhoea;
import com.chai.imci.Assessment.Fragment.Sign_0_2Diarrhoea;
import com.chai.imci.Assessment.Fragment.Treatment0_2Diarrhoea;

public class TabsPagerAdapter0_2Diarrhoea extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2Diarrhoea(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_0_2Diarrhoea();
		case 1:
			// Games fragment activity
			return new Sign_0_2Diarrhoea();
		case 2:
			// Movies fragment activity
			return new Treatment0_2Diarrhoea();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
