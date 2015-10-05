package org.ministryofhealth.imci.assessment.treatchild;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Low_Blood_Sugar extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("Treat for low blood sugar");
        setContentView(R.layout.low_blood_sugar);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        // Create custom dialog object


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        expListView.setBackgroundColor(Color.TRANSPARENT);
        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                return false;
            }

        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
              /*  Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setClickable(false);
        expListView.setFocusable(false);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        String nothing, ableBreastFeed, notAbleBreastFeed, toMakeSugar, notSwallow, suspBloodSugar, admitorRefer, pointsNote;
        ableBreastFeed = getResources().getString(R.string.ableBreastFeed);
        notAbleBreastFeed = getResources().getString(R.string.notAbleBreastFeed);
        toMakeSugar = getResources().getString(R.string.toMakeSugar);
        notSwallow = getResources().getString(R.string.notSwallow);
        suspBloodSugar = getResources().getString(R.string.suspBloodSugar);
        pointsNote = getResources().getString(R.string.leave_baby_one);
        nothing = getResources().getString(R.string.nothing);


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("If the child is able to breastfeed: ");
        listDataHeader.add("If the child is not able to breastfeed but is able to swallow:");
        listDataHeader.add("To make sugar water: Dissolve 4 level teaspoons of sugar (20 grams) in a 200 ml cup of clean water");
        listDataHeader.add("If child is not able to swallow");
        listDataHeader.add("For suspected low blood sugar");
        listDataHeader.add("DO NOT LEAVE THE BABY ALONE");
        listDataHeader.add("If breathing less than 30 breaths per minute or severe chest indrawing:");
        listDataHeader.add("If no breathing or gasping at all after 20 minutes ventilation");


        List<String> listAble = new ArrayList<String>();
        listAble.add(ableBreastFeed);

        List<String> listNotAble = new ArrayList<String>();
        listNotAble.add(notAbleBreastFeed);

        List<String> listWater = new ArrayList<String>();
        listWater.add(nothing);

        List<String> listnotSwallow = new ArrayList<String>();
        listnotSwallow.add(notSwallow);

        List<String> listsuspected = new ArrayList<String>();
        listsuspected.add(suspBloodSugar);

        List<String> listLessThan = new ArrayList<String>();
        listLessThan.add(suspBloodSugar);

        List<String> listGasping = new ArrayList<String>();
        listGasping.add(pointsNote);


        listDataChild.put(listDataHeader.get(0), listAble);
        listDataChild.put(listDataHeader.get(1), listNotAble);
        listDataChild.put(listDataHeader.get(2), listWater);
        listDataChild.put(listDataHeader.get(3), listnotSwallow);
        listDataChild.put(listDataHeader.get(4), listsuspected);
        listDataChild.put(listDataHeader.get(5), listLessThan);
        listDataChild.put(listDataHeader.get(6), listGasping);


        // data
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----main activity---onStart---");
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}