package org.ministryofhealth.imci.app.assess_classify.tab_managers;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.app.assess_classify.fragment.Diagnosing_0_2Jaundice;
import org.ministryofhealth.imci.app.assess_classify.fragment.Infant_Classify_Jaundice;
import org.ministryofhealth.imci.app.assess_classify.fragment.Infant_IDTreatment_Jaundice;

public class TabsPagerAdapter0_2Jaundice extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2Jaundice(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Diagnosing_0_2Jaundice();
		case 1:
			
			return new Infant_Classify_Jaundice();
		case 2:
			
			return new Infant_IDTreatment_Jaundice();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
