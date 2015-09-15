	package org.ministryofhealth.imci.assessment;

	import android.support.v4.app.Fragment;
	import android.support.v4.app.FragmentManager;
	import android.support.v4.app.FragmentPagerAdapter;

	import org.ministryofhealth.imci.assessment.fragment.Fragment_Vitamin_A;
	import org.ministryofhealth.imci.assessment.fragment.Immunization_Table;

	public class TabsPagerAdapterImmunization extends FragmentPagerAdapter {

	public TabsPagerAdapterImmunization(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Immunization_Table();
		case 1:
			
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
