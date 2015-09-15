package org.ministryofhealth.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.assessment.fragment.Diagnosing_0_2Hiv;
import org.ministryofhealth.imci.assessment.fragment.Infant_Classify_HIVExposure;
import org.ministryofhealth.imci.assessment.fragment.Infant_IDTreatment_HIVExposure;

public class TabsPagerAdapter0_2Hiv extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2Hiv(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Diagnosing_0_2Hiv();
		case 1:
			
			return new Infant_Classify_HIVExposure();
		case 2:
			
			return new Infant_IDTreatment_HIVExposure();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
