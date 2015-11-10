package org.ministryofhealth.imci.app.assess_classify.tab_managers;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.app.assess_classify.fragment.Classify_Cough_Difficulty;
import org.ministryofhealth.imci.app.assess_classify.fragment.Diagnosing_Cough;
import org.ministryofhealth.imci.app.assess_classify.fragment.IDTreatment_Cough_Difficulty;

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
			
			return new Classify_Cough_Difficulty();
		case 2:
			
			return new IDTreatment_Cough_Difficulty();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
