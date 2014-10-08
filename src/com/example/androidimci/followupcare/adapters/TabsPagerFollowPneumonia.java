package com.example.androidimci.followupcare.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.androidimci.followupcare.Ad_Follow_Up_Persistent_Diarrhoea;
import com.example.androidimci.followupcare.Ad_Follow_Up_Pneumonia;
import com.example.androidimci.followupcare.Follow_Up_Persistent_Diarrhoea;
import com.example.androidimci.followupcare.Follow_Up_Pneumonia;

public class TabsPagerFollowPneumonia extends FragmentPagerAdapter {

	public TabsPagerFollowPneumonia(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Ad_Follow_Up_Pneumonia();
		case 1:
			// Games fragment activity
			return new Follow_Up_Pneumonia();
	
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}
