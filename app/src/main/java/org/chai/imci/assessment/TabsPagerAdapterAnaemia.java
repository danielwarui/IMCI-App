package org.chai.imci.assessment;

import android.support.v4.app.Fragment; 
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.Fragment.Diagnosing_Anaemia;
import org.chai.imci.assessment.Fragment.Signs_Anaemia;
import org.chai.imci.assessment.Fragment.Treatment_Anaemia;

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
