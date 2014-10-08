package org.inclusion.imcione.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.androidimci.fragments.Diagnosing_Fever;
import com.example.androidimci.fragments.Signs_Fever;
import com.example.androidimci.fragments.Treatment_Fever;

public class TabsPagerAdapterFever extends FragmentPagerAdapter {

	public TabsPagerAdapterFever(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Diagnosing_Fever();
		case 1:
			return new Signs_Fever();
		case 2:
			return new Treatment_Fever();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
