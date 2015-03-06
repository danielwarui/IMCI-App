package org.inclusion.imcione.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.androidimci.fragments.Diagnosing_0_2Severe_Disease;
import com.example.androidimci.fragments.Signs_0_2Severe_Disease;
import com.example.androidimci.fragments.Treatment_0_2Severe_Disease;

public class TabsPagerAdapter0_2SevereDisease extends FragmentPagerAdapter {

	public TabsPagerAdapter0_2SevereDisease(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_0_2Severe_Disease();
		case 1:
			// Games fragment activity
			return new Signs_0_2Severe_Disease();
		case 2:
			// Movies fragment activity
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