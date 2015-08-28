package org.chai.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.fragment.Diagnosing_0_2Severe_Disease;
import org.chai.imci.assessment.fragment.Sign_0_2Severe_Disease;
import org.chai.imci.assessment.fragment.Treatment_0_2Severe_Disease;

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
			
			return new Sign_0_2Severe_Disease();
		case 2:
			
			return new Treatment_0_2Severe_Disease();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
