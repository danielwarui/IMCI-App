package org.chai.imci.treatthechild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import org.chai.imci.R;
import org.chai.imci.treatments.Young_Treatment_Jaundice;
import org.chai.imci.treatments.Young_Treatment_No_Jaundice;
import org.chai.imci.treatments.Young_Treatment_Severe_Jaundice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Young_Expand_Disease_Jaundice extends Activity {

    AdapterExpandable listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainforexplistview);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader,
                listDataChild);

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
                // TODO Auto-generated method stub
				/*Toast.makeText(
						getApplicationContext(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();*/
                if (groupPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_Severe_Jaundice/*Sypmtoms_and_treatment*/.class);
                    startActivity(intent);
                }
                if (groupPosition == 1) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_Jaundice/*Sypmtoms_and_treatment*/.class);
                    startActivity(intent);
                }
                if (groupPosition == 2) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_No_Jaundice/*Sypmtoms_and_treatment*/.class);
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


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Severe Jaundice");
        listDataHeader.add("Jaundice");
        listDataHeader.add("No Jaundice");

        // Adding child data
        // top250 is an entry of the major list
        List<String> malaria = new ArrayList<String>();
        // adding sublists to the entity top250
        malaria.add("Yellow palms and soles at any age");
        malaria.add("Any jaundice if age less than 24 hours OR more than 14 days of age");


        List<String> Dehydration = new ArrayList<String>();
        Dehydration.add("No yellow palms and soles ");
        Dehydration.add("Jaundice appearing between 24 hours and 14 days of age");

        List<String> Pneumonia = new ArrayList<String>();
        Pneumonia.add("No signs to classify as severe jaundice or jaundice");


        listDataChild.put(listDataHeader.get(0), malaria); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Dehydration);
        listDataChild.put(listDataHeader.get(2), Pneumonia);
    }
}
