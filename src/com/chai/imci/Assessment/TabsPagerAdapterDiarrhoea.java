package com.chai.imci.Assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_Diarrhoea;
import com.chai.imci.Assessment.Fragment.SignDiarrhoea;
import com.chai.imci.Assessment.Fragment.TreatmentDiarrhoea;

public class TabsPagerAdapterDiarrhoea extends FragmentPagerAdapter {

	public TabsPagerAdapterDiarrhoea(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_Diarrhoea();
		case 1:
			// Games fragment activity
			return new SignDiarrhoea();
		case 2:
			// Movies fragment activity
			return new TreatmentDiarrhoea();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
