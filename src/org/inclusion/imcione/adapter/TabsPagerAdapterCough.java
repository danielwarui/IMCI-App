package org.inclusion.imcione.adapter;


import com.example.androidimci.fragments.Diagnosing_Cough;
import com.example.androidimci.fragments.Signs_Cough;
import com.example.androidimci.fragments.Treatment_Cough;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapterCough extends FragmentPagerAdapter {

	public TabsPagerAdapterCough(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_Cough();
		case 1:
			// Games fragment activity
			return new Signs_Cough();
		case 2:
			// Movies fragment activity
			return new Treatment_Cough();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
