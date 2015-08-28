package org.chai.imci.assessment;


import org.chai.imci.assessment.Fragment.Diagnosing_HIVExposure;
import org.chai.imci.assessment.Fragment.Signs_HIVExposure;
import org.chai.imci.assessment.Fragment.Treatment_Hiv;

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
			
			return new Diagnosing_HIVExposure();
		case 1:
			
			return new Signs_HIVExposure();
		case 2:
			
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
