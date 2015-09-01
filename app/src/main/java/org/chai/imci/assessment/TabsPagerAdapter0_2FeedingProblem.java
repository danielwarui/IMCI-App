package org.chai.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.fragment.Diagnosing_0_2FeedingProblems;
import org.chai.imci.assessment.fragment.Infant_Classify_FeedingLow;
import org.chai.imci.assessment.fragment.Infant_IDTreatment_FeedingLow;

public class TabsPagerAdapter0_2FeedingProblem extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2FeedingProblem(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			
			return new Diagnosing_0_2FeedingProblems();
		case 1:
			
			return new Infant_Classify_FeedingLow();
		case 2:
			
			return new Infant_IDTreatment_FeedingLow();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
