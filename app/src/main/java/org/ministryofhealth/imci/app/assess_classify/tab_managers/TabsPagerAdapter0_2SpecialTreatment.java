package org.ministryofhealth.imci.app.assess_classify.tab_managers;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.app.assess_classify.fragment.Diagnosing_0_2SpecialTreatments;
import org.ministryofhealth.imci.app.assess_classify.fragment.Infant_Classify_SpecialTreatment;
import org.ministryofhealth.imci.app.assess_classify.fragment.Infant_IDTreatment_SpecialTreatment;

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
			
			return new Infant_Classify_SpecialTreatment();
		case 2:
			
			return new Infant_IDTreatment_SpecialTreatment();
		}

		return null;
	}


	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
