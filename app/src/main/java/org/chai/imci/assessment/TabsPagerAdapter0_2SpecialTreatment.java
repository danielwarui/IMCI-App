package org.chai.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.Fragment.Diagnosing_0_2SpecialTreatments;
import org.chai.imci.assessment.Fragment.Sign_0_2Special_Treatment;
import org.chai.imci.assessment.Fragment.Treatment_0_2Special_Treatment;

public class TabsPagerAdapter0_2SpecialTreatment extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2SpecialTreatment(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Diagnosing_0_2SpecialTreatments();
		case 1:
			
			return new Sign_0_2Special_Treatment();
		case 2:
			
			return new Treatment_0_2Special_Treatment();
		}

		return null;
	}


	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
