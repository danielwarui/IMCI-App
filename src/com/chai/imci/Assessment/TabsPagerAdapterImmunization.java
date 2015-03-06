	package com.chai.imci.Assessment;

import android.support.v4.app.Fragment; 
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chai.imci.Assessment.Fragment.Diagnosing_Malnutrition;
import com.chai.imci.Assessment.Fragment.Fragment_Vitamin_A;
import com.chai.imci.Assessment.Fragment.Immunization_Table;
import com.chai.imci.Assessment.Fragment.Signs_Malnutrition;
import com.chai.imci.Assessment.Fragment.Treatment_Malnurtition;

public class TabsPagerAdapterImmunization extends FragmentPagerAdapter {

	public TabsPagerAdapterImmunization(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Immunization_Table();
		case 1:
			// Games fragment activity
			return new Fragment_Vitamin_A();
		
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}
