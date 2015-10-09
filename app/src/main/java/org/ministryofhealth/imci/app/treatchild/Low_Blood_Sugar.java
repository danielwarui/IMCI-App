package org.ministryofhealth.imci.app.treatchild;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.utils.adapter.AdapterExpandable;

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
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.what_to_check_facility_low_blood_sugar);
        System.out.println("----Secondactivity activity---onCreates---");

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExpTreat);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        expListView.expandGroup(6);

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

            }
        });

        // Listview on child click listener
        expListView.setClickable(false);
        expListView.setFocusable(false);
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
    /*
     * Preparing the list data
     */

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        String nothing, ableBreastFeed, notAbleBreastFeed, notSwallow, suspBloodSugar, admitorRefer, pointsNote;
        ableBreastFeed = getResources().getString(R.string.old_ableBreastFeed);
        notAbleBreastFeed = getResources().getString(R.string.old_notAbleBreastFeed);
        notSwallow = getResources().getString(R.string.old_notSwallow);
        suspBloodSugar = getResources().getString(R.string.old_suspBloodSugar);
        pointsNote = getResources().getString(R.string.old_pointsToNoteBloodSugar);
        nothing = getResources().getString(R.string.nothing);


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("If the child is able to breastfeed: ");
        listDataHeader.add("If the child is not able to breastfeed but is able to swallow:");
        listDataHeader.add("To make sugar water: Dissolve 4 level teaspoons of sugar (20 grams) in a 200 ml cup of clean water");
        listDataHeader.add("If the child is not able to swallow:");
        listDataHeader.add("For suspected low blood sugar*");
        listDataHeader.add("Admit or Refer urgently to hospital");
        listDataHeader.add("Note better");



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

        List<String> listAdmit = new ArrayList<String>();
        listAdmit.add("");

        List<String> listPoints = new ArrayList<String>();
        listPoints.add(pointsNote);


        listDataChild.put(listDataHeader.get(0), listAble);
        listDataChild.put(listDataHeader.get(1), listNotAble);
        listDataChild.put(listDataHeader.get(2), listWater);
        listDataChild.put(listDataHeader.get(3), listnotSwallow);
        listDataChild.put(listDataHeader.get(4), listsuspected);
        listDataChild.put(listDataHeader.get(5), listAdmit);
        listDataChild.put(listDataHeader.get(6), listPoints);
        // data
    }



}