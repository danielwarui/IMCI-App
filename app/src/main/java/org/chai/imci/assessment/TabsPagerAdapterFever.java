package org.chai.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.fragment.Classify_Fever;
import org.chai.imci.assessment.fragment.Diagnosing_Fever;
import org.chai.imci.assessment.fragment.IDTreatment_Fever;

public class TabsPagerAdapterFever extends FragmentPagerAdapter {

	public TabsPagerAdapterFever(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Diagnosing_Fever();
		case 1:
			return new Classify_Fever();
		case 2:
			return new IDTreatment_Fever();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
