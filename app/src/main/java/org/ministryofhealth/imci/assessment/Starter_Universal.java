package org.ministryofhealth.imci.assessment;


import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import org.ministryofhealth.imci.R;

public class Starter_Universal extends FragmentActivity implements
        ActionBar.TabListener {
    private ViewPager viewPager;
    private TabsPagerAdapter0_2Diarrhoea mAdapter0_2Diarrhoea;
    private TabsPagerAdapter0_2EyeInfection mAdapter0_2EyeInfection;
    private TabsPagerAdapter0_2FeedingProblem mAdapter0_2Feeding;
    private TabsPagerAdapter0_2Hiv mAdapter0_2HIV;
    private TabsPagerAdapter0_2Jaundice mAdapter0_2Jaundice;
    private TabsPagerAdapter0_2SevereDisease mAdapter0_2SevereDisease;
    private TabsPagerAdapter0_2SpecialTreatment mAdapter0_2SpecialTreatment;
    private TabsPagerAdapterAnaemia mAdapter2_60Anaemia;
    private TabsPagerAdapterCough mAdapter2_60Cough;
    private TabsPagerAdapterDiarrhoea mAdapter2_60Diarr;
    private TabsPagerAdapterEarproblem mAdapter2_60Ear_Problem;
    private TabsPagerAdapterFever mAdapter2_60Fever;
    private TabsPagerAdapterHIVExposure mAdapter2_60HIV;
    private TabsPagerAdapterImmunization mAdapter2_60Immunization;
    private TabsPagerAdapterMalnutrition mAdapter2_60Malnutrition;

    private String Label;

    private ActionBar actionBar;
    private int id = 0;
    // Tab titles
    private String[] tabs = {"Assess", "Classify", "Identify treatment"};
    private String[] tabs1 = {"Immunization", "Vitamin A & Deworming"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starter_0_2);
        setRowIdFromIntent();
        // Initialization
        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        loadTabPagerAdapter(id);

        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

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

    private void loadTabPagerAdapter(int od) {
        switch (od) {
            case 1:
                Label = getResources().getString(R.string.lbl_diarrhoea);
                actionBar.setTitle(Label);
                mAdapter0_2Diarrhoea = new TabsPagerAdapter0_2Diarrhoea(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter0_2Diarrhoea);
                break;
            case 2:
                Label = getResources().getString(R.string.lbl_eyeproblem);
                actionBar.setTitle(Label);
                mAdapter0_2EyeInfection = new TabsPagerAdapter0_2EyeInfection(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter0_2EyeInfection);
                break;
            case 3:
                Label = getResources().getString(R.string.lbl_feeding);
                actionBar.setTitle(Label);
                mAdapter0_2Feeding = new TabsPagerAdapter0_2FeedingProblem(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter0_2Feeding);
                break;
            case 4:
                Label = getResources().getString(R.string.lbl_hiv);
                actionBar.setTitle(Label);
                mAdapter0_2HIV = new TabsPagerAdapter0_2Hiv(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter0_2HIV);
                break;
            case 5:
                Label = getResources().getString(R.string.lbl_jaundice);
                actionBar.setTitle(Label);
                mAdapter0_2Jaundice = new TabsPagerAdapter0_2Jaundice(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter0_2Jaundice);
                break;
            case 6:
                Label = getResources().getString(R.string.lbl_severedisease);
                actionBar.setTitle(Label);
                mAdapter0_2SevereDisease = new TabsPagerAdapter0_2SevereDisease(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter0_2SevereDisease);
                break;
            case 7:
                Label = getResources().getString(R.string.lbl_specialtreatment);
                actionBar.setTitle(Label);
                mAdapter0_2SpecialTreatment = new TabsPagerAdapter0_2SpecialTreatment(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter0_2SpecialTreatment);
                break;

            //2 months to 5 years
            case 8:
                Label = getResources().getString(R.string.lbl_anaemia);
                actionBar.setTitle(Label);
                mAdapter2_60Anaemia = new TabsPagerAdapterAnaemia(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60Anaemia);
                break;
            case 9:
                Label = getResources().getString(R.string.lbl_cough);
                actionBar.setTitle(Label);
                mAdapter2_60Cough = new TabsPagerAdapterCough(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60Cough);
                break;
            case 10:
                Label = getResources().getString(R.string.lbl_diarrhoea);
                actionBar.setTitle(Label);
                mAdapter2_60Diarr = new TabsPagerAdapterDiarrhoea(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60Diarr);
                break;
            case 11:
                Label = getResources().getString(R.string.lbl_ear_problem);
                actionBar.setTitle(Label);
                mAdapter2_60Ear_Problem = new TabsPagerAdapterEarproblem(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60Ear_Problem);
                break;
            case 12:
                Label = getResources().getString(R.string.lbl_fever);
                actionBar.setTitle(Label);
                mAdapter2_60Fever = new TabsPagerAdapterFever(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60Fever);
                break;
            case 13:
                Label = getResources().getString(R.string.lbl_hiv);
                actionBar.setTitle(Label);
                mAdapter2_60HIV = new TabsPagerAdapterHIVExposure(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60HIV);
                break;
            case 14:

                Label = getResources().getString(R.string.lbl_immunization);
                actionBar.setTitle(Label);

                mAdapter2_60Immunization = new TabsPagerAdapterImmunization(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60Immunization);
                break;
            case 15:
                Label = getResources().getString(R.string.lbl_malnutrition);
                actionBar.setTitle(Label);
                mAdapter2_60Malnutrition = new TabsPagerAdapterMalnutrition(getSupportFragmentManager());
                viewPager.setAdapter(mAdapter2_60Malnutrition);
                break;
        }
    }

    private void setRowIdFromIntent() {
        Bundle extras = getIntent().getExtras();
        id = extras != null ? extras.getInt("Whattocheck") : null;
    }
}
