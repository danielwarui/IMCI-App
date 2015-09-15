package org.ministryofhealth.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.assessment.fragment.Classify_HIVExp;
import org.ministryofhealth.imci.assessment.fragment.Diagnosing_HIVExposure;
import org.ministryofhealth.imci.assessment.fragment.IDTreatment_HIVExp;

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
			
			return new Classify_HIVExp();
		case 2:
			
			return new IDTreatment_HIVExp();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
