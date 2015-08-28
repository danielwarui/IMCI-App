package org.chai.imci.treatchild;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import org.chai.imci.R;
import org.chai.imci.assessment.Starter_0_2_FeedingProblem;
import org.chai.imci.assessment.Starter_0_2_SpecialTreatments;
import org.chai.imci.local_infections.Young_Local_Infections_At_Home;
import org.chai.imci.oral_drugs.Young_Oral_Drugs_At_Home;
import org.chai.imci.treatthechild.AdapterExpandable;
import org.chai.imci.treatthechild.zero_two.Treat_Child_Activity_0_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Oral_Drugs_0_2_At extends Activity {
    String general_signs;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    android.app.FragmentTransaction transaction;
    Fragment fragment;
    String checkGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        setContentView(R.layout.what_to_check);
        System.out.println("----Secondactivity activity---onCreates---");

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }

        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();*/
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                if (groupPosition == 0 && childPosition == 0) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Treat_Child_Activity_0_2.class);
                    intent.putExtra("position", 1);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 0) {

                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Treat_Child_Activity_0_2.class);
                    intent.putExtra("position", 2);
                    startActivity(intent);
					/*Intent intent = new Intent(Oral_Drugs_0_2_At.this,
							Keep_young_infant_warm.class);
					startActivity(intent);*/

                }
                if (groupPosition == 2 && childPosition == 0) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Young_Treatment_Health_Facility.class);
                    intent.putExtra("position", 3);
                    startActivity(intent);

                }
                if (groupPosition == 3 && childPosition == 0) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Young_Oral_Drugs_At_Home.class);
                    intent.putExtra("position", 4);
                    startActivity(intent);

                }
                if (groupPosition == 4 && childPosition == 0) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Young_Local_Infections_At_Home.class);
                    intent.putExtra("position", 5);
                    startActivity(intent);

                }
                if (groupPosition == 5 && childPosition == 0) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Young_Teach_Correct_Positioning.class);
                    intent.putExtra("position", 6);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 4) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Starter_0_2_FeedingProblem.class);
                    intent.putExtra("position", 7);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 5) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this,
                            Starter_0_2_SpecialTreatments.class);
                    intent.putExtra("position", 8);
                    startActivity(intent);

                }
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        checkGeneral = getResources().getString(R.string.ask_mother_young_infant);
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Resuscitate the young infant");
        listDataHeader.add("Keep the young infant warm");
        listDataHeader.add("Give the treatments in health facility only");
        listDataHeader.add("Teach the mother to give oral drugs at home");
        listDataHeader.add("Teach the mother how to treat local infections at home");
        listDataHeader.add("Teach correct positioning and attachment, for breastfeed");
        listDataHeader.add("Advise mother to give home care to the young infant");


        // Adding child data(the sudlists of the header expandable list
        List<String> resuscitate = new ArrayList<String>();
        resuscitate.add("Touch here to follow instructions to resuscitate the young infant");

        List<String> warm = new ArrayList<String>();
        warm.add("Touch and follow instructions to keeping the young infant warm");

        List<String> health_facility = new ArrayList<String>();
        health_facility.add("Touch and follow instructions to give the treatments in health facility");

        List<String> oral = new ArrayList<String>();
        oral.add("Touch and follow instructions to give oral drugs at home");

        List<String> infections = new ArrayList<String>();
        infections.add("Touch and follow instructions to treat local infections at home");

        List<String> positioning = new ArrayList<String>();
        positioning.add("Touch and follow instructions to teach correct positioning and attachment, for breastfeeding");

        List<String> home = new ArrayList<String>();
        home.add("Touch and follow instructions advising mother to give home care to the young infant");


        listDataChild.put(listDataHeader.get(0), resuscitate); // Header, Child
        listDataChild.put(listDataHeader.get(1), warm);
        listDataChild.put(listDataHeader.get(2), health_facility);
        listDataChild.put(listDataHeader.get(3), oral);
        listDataChild.put(listDataHeader.get(4), infections);
        listDataChild.put(listDataHeader.get(5), positioning);
        listDataChild.put(listDataHeader.get(6), home);

        // data
    }
}
