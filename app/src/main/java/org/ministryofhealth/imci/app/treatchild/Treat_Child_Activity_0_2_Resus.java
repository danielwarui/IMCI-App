package org.ministryofhealth.imci.app.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.utils.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Treat_Child_Activity_0_2_Resus extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.what_to_check);
        getActionBar().setTitle("Helping babies breathe");
        getActionBar().setSubtitle("Resuscitate the young infant");
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
        String evaluate, babyWarm, openAirway, noBreathing, noCrying, donotLeave, lessThan30, breathingGasping;
        evaluate = getResources().getString(R.string.evaluate_baby_breathing_one);
        babyWarm = getResources().getString(R.string.keep_baby_warm_one);
        openAirway = getResources().getString(R.string.open_airway_one);
        noBreathing = getResources().getString(R.string.if_still_no_breathing_one);
        noCrying = getResources().getString(R.string.breathing_or_crying_one);
        donotLeave = getResources().getString(R.string.leave_baby_one);
        lessThan30 = getResources().getString(R.string.breathing_less_severe_one);
        breathingGasping = getResources().getString(R.string.breathing_gasping_one);

        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Evaluate the baby's breathing after stimulation: ");
        listDataHeader.add("Keep the baby warm");
        listDataHeader.add("Open the airway");
        listDataHeader.add("If still no breathing, ventilate");
        listDataHeader.add("If breathing or crying, stop ventilating");
        listDataHeader.add("DO NOT LEAVE THE BABY ALONE");
        listDataHeader.add("If breathing less than 30 breaths per minute or severe chest indrawing:");
        listDataHeader.add("If no breathing or gasping at all after 20 minutes ventilation");


        List<String> listEvaluate = new ArrayList<String>();
        listEvaluate.add(evaluate);

        List<String> listWarm = new ArrayList<String>();
        listWarm.add(babyWarm);

        List<String> listAirway = new ArrayList<String>();
        listAirway.add(openAirway);

        List<String> listVentilate = new ArrayList<String>();
        listVentilate.add(noBreathing);

        List<String> listCrying = new ArrayList<String>();
        listCrying.add(noCrying);

        List<String> listLeaveAlone = new ArrayList<String>();

        List<String> listLessThan30 = new ArrayList<String>();
        listLessThan30.add(lessThan30);

        List<String> listGasping = new ArrayList<String>();
        listGasping.add(breathingGasping);


        listDataChild.put(listDataHeader.get(0), listEvaluate);
        listDataChild.put(listDataHeader.get(1), listWarm);
        listDataChild.put(listDataHeader.get(2), listAirway);
        listDataChild.put(listDataHeader.get(3), listVentilate);
        listDataChild.put(listDataHeader.get(4), listCrying);
        listDataChild.put(listDataHeader.get(5), listLeaveAlone);
        listDataChild.put(listDataHeader.get(6), listLessThan30);
        listDataChild.put(listDataHeader.get(7), listGasping);


        // data
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
                Intent intent = new Intent(Treat_Child_Activity_0_2_Resus.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----main activity---onStart---");
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

}
