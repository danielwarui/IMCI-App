package org.ministryofhealth.imci.app.follow_up.starter;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.follow_up.adapters.YoungTabsPagerFollowBacterial;
import org.ministryofhealth.imci.app.follow_up.adapters.YoungTabsPagerFollowDiarr;
import org.ministryofhealth.imci.app.follow_up.adapters.YoungTabsPagerFollowEyeInfection;
import org.ministryofhealth.imci.app.follow_up.adapters.YoungTabsPagerFollowFeeding;
import org.ministryofhealth.imci.app.follow_up.adapters.YoungTabsPagerFollowJaundice;
import org.ministryofhealth.imci.app.follow_up.adapters.YoungTabsPagerFollowLowWeight;
import org.ministryofhealth.imci.app.follow_up.adapters.YoungTabsPagerFollowThrushMouth;

public class Starter_Follow_0_2 extends FragmentActivity
        implements ActionBar.TabListener {
    int id;
    private ViewPager viewPager;
    private YoungTabsPagerFollowBacterial AdapterBacterial;
    private YoungTabsPagerFollowEyeInfection AdapterEyeInfection;
    private YoungTabsPagerFollowJaundice AdapterJaundice;
    private YoungTabsPagerFollowDiarr AdapterDiarrhoea;
    private YoungTabsPagerFollowFeeding AdapterFeeding;
    private YoungTabsPagerFollowLowWeight AdapterLowWeight;
    private YoungTabsPagerFollowThrushMouth AdapterThrush;

    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = {"Advice", "Treatment"};
    private String[] activitySubTitles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        setContentView(R.layout.starter_0_2);

        String Title = "Age up to 2 months";
        activitySubTitles = getResources().getStringArray(R.array.fragment_young_follow_up);
        // Initialization
        setRowIdFromIntent();
        viewPager = (ViewPager) findViewById(R.id.pager);
        switch (id) {
            // Local Bacterial Infection
            case 0:
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle(activitySubTitles[id]);
                AdapterBacterial = new YoungTabsPagerFollowBacterial(getSupportFragmentManager());
                viewPager.setAdapter(AdapterBacterial);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

                break;
            // Eye Infection
            case 1:
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle(activitySubTitles[id]);
                AdapterEyeInfection = new YoungTabsPagerFollowEyeInfection(getSupportFragmentManager());

                viewPager.setAdapter(AdapterEyeInfection);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            //Jaundice
            case 2:
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle(activitySubTitles[id]);
                AdapterJaundice = new YoungTabsPagerFollowJaundice(getSupportFragmentManager());
                viewPager.setAdapter(AdapterJaundice);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            // Diarrhoea
            case 3:
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle(activitySubTitles[id]);
                AdapterDiarrhoea = new YoungTabsPagerFollowDiarr(getSupportFragmentManager());
                viewPager.setAdapter(AdapterDiarrhoea);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            // Feeding Problem
            case 4:
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle(activitySubTitles[id]);
                AdapterFeeding = new YoungTabsPagerFollowFeeding(getSupportFragmentManager());
                viewPager.setAdapter(AdapterFeeding);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            // Low Weight or Low Birth Weight
            case 5:
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle(activitySubTitles[id]);
                AdapterLowWeight = new YoungTabsPagerFollowLowWeight(getSupportFragmentManager());
                viewPager.setAdapter(AdapterLowWeight);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            // Thrush or Mouth Ulcers
            case 6:
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle(activitySubTitles[id]);
                AdapterThrush = new YoungTabsPagerFollowThrushMouth(getSupportFragmentManager());
                viewPager.setAdapter(AdapterThrush);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
            case R.id.homePage:
                Intent intent = new Intent(Starter_Follow_0_2.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

}
