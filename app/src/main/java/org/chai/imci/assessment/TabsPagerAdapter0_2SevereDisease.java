package org.chai.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.fragment.Diagnosing_0_2Severe_Disease;
import org.chai.imci.assessment.fragment.Infant_Classify_VerySevereDisease;
import org.chai.imci.assessment.fragment.Infant_IDTreatment_VerySevereDisease;

public class TabsPagerAdapter0_2SevereDisease extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2SevereDisease(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Diagnosing_0_2Severe_Disease();
		case 1:
			
			return new Infant_Classify_VerySevereDisease();
		case 2:
			
			return new Infant_IDTreatment_VerySevereDisease();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
