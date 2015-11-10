package org.ministryofhealth.imci.app.assess_classify.tab_managers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.ministryofhealth.imci.app.assess_classify.fragment.Classify_Anaemia;
import org.ministryofhealth.imci.app.assess_classify.fragment.Diagnosing_Anaemia;
import org.ministryofhealth.imci.app.assess_classify.fragment.IDTreatment_Anaemia;

public class TabsPagerAdapterAnaemia extends FragmentPagerAdapter {

	public TabsPagerAdapterAnaemia(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Diagnosing_Anaemia();
		case 1:
			return new Classify_Anaemia();
		case 2:
			return new IDTreatment_Anaemia();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
