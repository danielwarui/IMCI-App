package org.ministryofhealth.imci.assessment.follow_up.starter;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.follow_up.adapters.YoungTabsPagerFollowThrushMouth;
import org.ministryofhealth.imci.assessment.follow_up.adapters.YoungTabsPagerFollowBacterial;
import org.ministryofhealth.imci.assessment.follow_up.adapters.YoungTabsPagerFollowDiarr;
import org.ministryofhealth.imci.assessment.follow_up.adapters.YoungTabsPagerFollowEyeInfection;
import org.ministryofhealth.imci.assessment.follow_up.adapters.YoungTabsPagerFollowFeeding;
import org.ministryofhealth.imci.assessment.follow_up.adapters.YoungTabsPagerFollowJaundice;
import org.ministryofhealth.imci.assessment.follow_up.adapters.YoungTabsPagerFollowLowWeight;

public class Starter_Follow_0_2 extends FragmentActivity
		implements ActionBar.TabListener {
	private ViewPager viewPager;
	int id;
	private YoungTabsPagerFollowBacterial Adapter;
	private YoungTabsPagerFollowEyeInfection Adapter1;
	private YoungTabsPagerFollowJaundice Adapter2;
	private YoungTabsPagerFollowDiarr Adapter3;
	private YoungTabsPagerFollowFeeding Adapter4;
	private YoungTabsPagerFollowLowWeight Adapter5;
	private YoungTabsPagerFollowThrushMouth Adapter6;

	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "Advice", "Treatment" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.starter_0_2);
		// Initialization
		setRowIdFromIntent();

		switch (id) {
		case 0:
			viewPager = (ViewPager) findViewById(R.id.pager);
			actionBar = getActionBar();
			Adapter = new YoungTabsPagerFollowBacterial(getSupportFragmentManager());

			viewPager.setAdapter(Adapter);
//			actionBar.setHomeButtonEnabled(true);
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

			break;
		case 1:
			viewPager = (ViewPager) findViewById(R.id.pager);
			actionBar = getActionBar();
			Adapter1 = new YoungTabsPagerFollowEyeInfection(getSupportFragmentManager());

			viewPager.setAdapter(Adapter1);
//			actionBar.setHomeButtonEnabled(true);
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			break;

		case 2:
			viewPager = (ViewPager) findViewById(R.id.pager);
			actionBar = getActionBar();
			Adapter2 = new YoungTabsPagerFollowJaundice(getSupportFragmentManager());

			viewPager.setAdapter(Adapter2);
//			actionBar.setHomeButtonEnabled(true);
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			break;

		case 3:
			viewPager = (ViewPager) findViewById(R.id.pager);
			actionBar = getActionBar();
			Adapter3 = new YoungTabsPagerFollowDiarr(getSupportFragmentManager());

			viewPager.setAdapter(Adapter3);
//			actionBar.setHomeButtonEnabled(true);
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			break;

		case 4:
			viewPager = (ViewPager) findViewById(R.id.pager);
			actionBar = getActionBar();
			Adapter4 = new YoungTabsPagerFollowFeeding(getSupportFragmentManager());

			viewPager.setAdapter(Adapter4);
//			actionBar.setHomeButtonEnabled(true);
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			break;

		case 5:
			viewPager = (ViewPager) findViewById(R.id.pager);
			actionBar = getActionBar();
			Adapter5 = new YoungTabsPagerFollowLowWeight(getSupportFragmentManager());

			viewPager.setAdapter(Adapter5);
//			actionBar.setHomeButtonEnabled(true);
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			break;

		case 6:
			viewPager = (ViewPager) findViewById(R.id.pager);
			actionBar = getActionBar();
			Adapter6 = new YoungTabsPagerFollowThrushMouth(getSupportFragmentManager());
			viewPager.setAdapter(Adapter6);
//			actionBar.setHomeButtonEnabled(true);
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			break;
		}
		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	private void setRowIdFromIntent() {
		Bundle extras = getIntent().getExtras();
		id = extras != null ? extras.getInt("Infant_Treatment_Position") : null;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("----Fragmentactivity---onStart---");
		overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
	}

}
