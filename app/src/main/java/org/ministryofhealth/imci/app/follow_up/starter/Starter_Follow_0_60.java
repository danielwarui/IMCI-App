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
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowDysentry;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowEarInfection;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowEyeMouth;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowFeeding;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowFeverNoMalaria;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowHivExposed;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowLowWeight;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowMalaria;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowPallor;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowPersistentDiarrhoea;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowPneumonia;
import org.ministryofhealth.imci.app.follow_up.adapters.TabsPagerFollowWheezing;

public class Starter_Follow_0_60 extends FragmentActivity
        implements ActionBar.TabListener {
    int id;
    private ViewPager viewPager;
    private TabsPagerFollowPneumonia AdapterPneumonia;
    private TabsPagerFollowPersistentDiarrhoea AdapterDiarrhoea;
    private TabsPagerFollowDysentry AdapterDysentery;
    private TabsPagerFollowMalaria AdapterMalaria;
    private TabsPagerFollowFeverNoMalaria AdapterFevernoMalaria;
    private TabsPagerFollowEyeMouth AdapterEyeMouth;
    private TabsPagerFollowEarInfection AdapterEarInfection;
    private TabsPagerFollowHivExposed AdapterHivExposed;
    private TabsPagerFollowFeeding Adapter1Feeding;
    private TabsPagerFollowPallor AdapterPallor;
    private TabsPagerFollowLowWeight AdapterLowWeight;
    private TabsPagerFollowWheezing AdapterWheezing;

    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = {"Advice", "Treatment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starter_0_2);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        String Title = "Age 2 months to 5 years";
        // Initialization
        setRowIdFromIntent();

        switch (id) {
            case 0:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Pneumonia");
                AdapterPneumonia = new TabsPagerFollowPneumonia(getSupportFragmentManager());

                viewPager.setAdapter(AdapterPneumonia);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

                break;
            case 1:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Persistent Diarrhoea");
                AdapterDiarrhoea = new TabsPagerFollowPersistentDiarrhoea(getSupportFragmentManager());

                viewPager.setAdapter(AdapterDiarrhoea);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 2:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Dysentry");
                AdapterDysentery = new TabsPagerFollowDysentry(getSupportFragmentManager());

                viewPager.setAdapter(AdapterDysentery);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 3:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Wheezing");
                AdapterWheezing = new TabsPagerFollowWheezing(getSupportFragmentManager());

                viewPager.setAdapter(AdapterWheezing);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 4:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Malaria");
                AdapterMalaria = new TabsPagerFollowMalaria(getSupportFragmentManager());

                viewPager.setAdapter(AdapterMalaria);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 5:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Fever: No Malaria");
                AdapterFevernoMalaria = new TabsPagerFollowFeverNoMalaria(getSupportFragmentManager());

                viewPager.setAdapter(AdapterFevernoMalaria);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 6:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Eye or Mouth Complications of Measles");
                AdapterEyeMouth = new TabsPagerFollowEyeMouth(getSupportFragmentManager());

                viewPager.setAdapter(AdapterEyeMouth);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 7:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Ear Infection");
                AdapterEarInfection = new TabsPagerFollowEarInfection(getSupportFragmentManager());

                viewPager.setAdapter(AdapterEarInfection);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
// It's all fun and games until you find yourself working at 2:46 am Friday October 2015 and the instrumental your are listening says "Work for the night is coming"
            case 8:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> HIV Exposed and Infected Children");
                AdapterHivExposed = new TabsPagerFollowHivExposed(getSupportFragmentManager());

                viewPager.setAdapter(AdapterHivExposed);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;

            case 9:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Feeding Problem");
                Adapter1Feeding = new TabsPagerFollowFeeding(getSupportFragmentManager());

                viewPager.setAdapter(Adapter1Feeding);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            case 10:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Pallor");
                AdapterPallor = new TabsPagerFollowPallor(getSupportFragmentManager());

                viewPager.setAdapter(AdapterPallor);
                actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
                break;
            case 11:
                viewPager = (ViewPager) findViewById(R.id.pager);
                actionBar = getActionBar();
                actionBar.setTitle(Title);
                actionBar.setSubtitle("Child --> Very Low Weight");
                AdapterLowWeight = new TabsPagerFollowLowWeight(getSupportFragmentManager());

                viewPager.setAdapter(AdapterLowWeight);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.homePage:
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
