package org.inclusion.imcione.adapter;

import org.inclusion.imcione.Disease_HIVInfection;

import com.example.androidimci.fragments.Diagnosing_HIVExposure;
import com.example.androidimci.fragments.Signs_HIVExposure;
import com.example.androidimci.fragments.Treatment_Hiv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapterHIVExposure extends FragmentPagerAdapter {

	public TabsPagerAdapterHIVExposure(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Diagnosing_HIVExposure();
		case 1:
			// Games fragment activity
			return new Signs_HIVExposure();
		case 2:
			// Movies fragment activity
			return new Treatment_Hiv();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}