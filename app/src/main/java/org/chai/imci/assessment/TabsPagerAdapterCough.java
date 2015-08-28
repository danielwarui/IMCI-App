package org.chai.imci.assessment;


import org.chai.imci.assessment.Fragment.Diagnosing_Cough;
import org.chai.imci.assessment.Fragment.Signs_Cough;
import org.chai.imci.assessment.Fragment.Treatment_Cough;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapterCough extends FragmentPagerAdapter {

	public TabsPagerAdapterCough(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Diagnosing_Cough();
		case 1:
			
			return new Signs_Cough();
		case 2:
			
			return new Treatment_Cough();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
