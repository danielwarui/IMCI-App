package com.chai.imci.Assessment;

import android.support.v4.app.Fragment; 
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_Anaemia;
import com.chai.imci.Assessment.Fragment.Signs_Anaemia;
import com.chai.imci.Assessment.Fragment.Treatment_Anaemia;

public class TabsPagerAdapterAnaemia extends FragmentPagerAdapter {

	public TabsPagerAdapterAnaemia(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
		
			return new Diagnosing_Anaemia();
		case 1:
			return new Signs_Anaemia();
		case 2:
			return new Treatment_Anaemia();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
