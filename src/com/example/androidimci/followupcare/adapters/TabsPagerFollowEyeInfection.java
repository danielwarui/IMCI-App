package com.example.androidimci.followupcare.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.androidimci.followupcare.Ad_Follow_Up_Eye_Infection;
import com.example.androidimci.followupcare.Ad_Follow_Up_Eye_Mouth;
import com.example.androidimci.followupcare.Follow_Up_Ear_Infection;
import com.example.androidimci.followupcare.Follow_Up_Eye_Infection;
import com.example.androidimci.followupcare.Follow_Up_Eye_Mouth;

public class TabsPagerFollowEyeInfection extends FragmentPagerAdapter {

	public TabsPagerFollowEyeInfection(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Ad_Follow_Up_Eye_Infection();
		case 1:
			// Games fragment activity
			return new Follow_Up_Eye_Infection();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}


}
