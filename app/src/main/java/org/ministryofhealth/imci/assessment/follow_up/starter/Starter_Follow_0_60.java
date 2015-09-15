package org.ministryofhealth.imci.assessment.follow_up.starter;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowDysentry;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowEarInfection;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowEyeMouth;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowFeeding;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowFeverNoMalaria;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowHivExposed;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowLowWeight;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowMalaria;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowPallor;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowPersistentDiarrhoea;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowPneumonia;
import org.ministryofhealth.imci.assessment.follow_up.adapters.TabsPagerFollowWheezing;

public class Starter_Follow_0_60 extends FragmentActivity
        implements ActionBar.TabListener {
    private ViewPager viewPager;
    int id;
    private TabsPagerFollowPneumonia Adapter1;
    private TabsPagerFollowPersistentDiarrhoea Adapter2;
    private TabsPagerFollowDysentry Adapter3;
    private TabsPagerFollowMalaria Adapter5;
    private TabsPagerFollowFeverNoMalaria Adapter6;
    private TabsPagerFollowEyeMouth Adapter7;
    private TabsPagerFollowEarInfection Adapter8;
    private TabsPagerFollowHivExposed Adapter9;
    private TabsPagerFollowFeeding Adapter10;
    private TabsPagerFollowPallor Adapter11;
    private TabsPagerFollowLowWeight Adapter12;
    private TabsPagerFollowWheezing Adapter4;

    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = {"Advice", "Treatment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starter_0_2);
        // Initialization
        setRowIdFromIntent();

        switch (id) {
            case 0:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Pneumonia");
                Adapter1 = new TabsPagerFollowPneumonia(getSupportFragmentManager());

                viewPager.setAdapter(Adapter1);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

                break;
            case 1:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Persistent Diarrhoea");
                Adapter2 = new TabsPagerFollowPersistentDiarrhoea(
                        getSupportFragmentManager());

                viewPager.setAdapter(Adapter2);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 2:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Dysentry");
                Adapter3 = new TabsPagerFollowDysentry(getSupportFragmentManager());

                viewPager.setAdapter(Adapter3);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 3:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Wheezing");
                Adapter4 = new TabsPagerFollowWheezing(getSupportFragmentManager());

                viewPager.setAdapter(Adapter4);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 4:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Malaria");
                Adapter5 = new TabsPagerFollowMalaria(getSupportFragmentManager());

                viewPager.setAdapter(Adapter5);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 5:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Fever: No Malaria");
                Adapter6 = new TabsPagerFollowFeverNoMalaria(
                        getSupportFragmentManager());

                viewPager.setAdapter(Adapter6);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 6:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Eye or Mouth Complications of Measles");
                Adapter7 = new TabsPagerFollowEyeMouth(getSupportFragmentManager());

                viewPager.setAdapter(Adapter7);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 7:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Ear Infection");
                Adapter8 = new TabsPagerFollowEarInfection(
                        getSupportFragmentManager());

                viewPager.setAdapter(Adapter8);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 8:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> HIV Exposed");
                Adapter9 = new TabsPagerFollowHivExposed(
                        getSupportFragmentManager());

                viewPager.setAdapter(Adapter9);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 9:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Feeding Problem");
                Adapter10 = new TabsPagerFollowFeeding(getSupportFragmentManager());

                viewPager.setAdapter(Adapter10);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            case 10:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Pallor");
                Adapter11 = new TabsPagerFollowPallor(getSupportFragmentManager());

                viewPager.setAdapter(Adapter11);
//			actionBar.setHomeButtonEnabled(true);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            case 11:
                viewPager = (ViewPager) findViewById(R.id.pager);
                getActionBar().setHomeButtonEnabled(true);
                getActionBar().setDisplayHomeAsUpEnabled(true);
                actionBar = getActionBar();
                actionBar.setSubtitle("Child --> Very Low Weight");
                Adapter12 = new TabsPagerFollowLowWeight(
                        getSupportFragmentManager());

                viewPager.setAdapter(Adapter12);
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
        id = extras != null ? extras.getInt("Treatment_Position") : null;
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }

}
