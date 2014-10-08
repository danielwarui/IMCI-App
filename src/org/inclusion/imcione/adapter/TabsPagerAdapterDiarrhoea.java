package org.inclusion.imcione.adapter;


import com.example.androidimci.fragments.Diagnosing_Diarrhoea;
import com.example.androidimci.fragments.Signs_Diarrhoea;
import com.example.androidimci.fragments.Treatment_Diarrhoea;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapterDiarrhoea extends FragmentPagerAdapter {

	public TabsPagerAdapterDiarrhoea(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_Diarrhoea();
		case 1:
			// Games fragment activity
			return new Signs_Diarrhoea();
		case 2:
			// Movies fragment activity
			return new Treatment_Diarrhoea();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
