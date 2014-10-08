package org.inclusion.imcione.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.androidimci.fragments.Diagnosing_Malnutrition;
import com.example.androidimci.fragments.Signs_Malnutrition;
import com.example.androidimci.fragments.Treatment_Malnurtition;

public class TabsPagerAdapterMalnutrition extends FragmentPagerAdapter {

	public TabsPagerAdapterMalnutrition(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_Malnutrition();
		case 1:
			// Games fragment activity
			return new Signs_Malnutrition();
		case 2:
			// Movies fragment activity
			return new Treatment_Malnurtition();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
