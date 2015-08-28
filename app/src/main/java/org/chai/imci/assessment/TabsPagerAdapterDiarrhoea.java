package org.chai.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.fragment.Diagnosing_Diarrhoea;
import org.chai.imci.assessment.fragment.SignDiarrhoea;
import org.chai.imci.assessment.fragment.TreatmentDiarrhoea;

public class TabsPagerAdapterDiarrhoea extends FragmentPagerAdapter {

	public TabsPagerAdapterDiarrhoea(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Diagnosing_Diarrhoea();
		case 1:
			
			return new SignDiarrhoea();
		case 2:
			
			return new TreatmentDiarrhoea();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
