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
import android.widget.Toast;

import org.chai.imci.R;
import org.chai.imci.treatments.Young_Treatment_No_Dehydr;
import org.chai.imci.treatments.Young_Treatment_Serious_Adbominal;
import org.chai.imci.treatments.Young_Treatment_Severe_Prolonged_Diarrhoea;
import org.chai.imci.treatments.Young_Treatment_Severe_dehydr;
import org.chai.imci.treatments.Young_Treatment_Some_Dehydr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Young_Expand_Disease_Diarrhoea extends Activity {

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
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                if (groupPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_Severe_dehydr
                            /*Sypmtoms_and_treatment*/.class);
                    startActivity(intent);
                }
                if (groupPosition == 1) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_Some_Dehydr/*Sypmtoms_and_treatment*/.class);
                    startActivity(intent);
                }
                if (groupPosition == 2) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_No_Dehydr/*Sypmtoms_and_treatment*/.class);
                    startActivity(intent);
                }
                if (groupPosition == 3) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_Severe_Prolonged_Diarrhoea
                                /*Sypmtoms_and_treatment*/.class);
                    startActivity(intent);
                }
                if (groupPosition == 4) {
                    Intent intent = new Intent(getApplicationContext(),
                            Young_Treatment_Serious_Adbominal
				                /*Sypmtoms_and_treatment*/.class);
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
        listDataHeader.add("Severe Dehydration");
        listDataHeader.add("Some Dehydration");
        listDataHeader.add("No Dehydration");
        listDataHeader.add("Severe Prolonged Diarrhoea");
        listDataHeader.add("Possible Serious Abdominal Problem");

        // Adding child data
        // top250 is an entry of the major list
        List<String> malaria = new ArrayList<String>();
        // adding sublists to the entity top250
        malaria.add("Lethargic or unconscious");
        malaria.add("Sunken eyes ");
        malaria.add("Skin pinch goes back very slowly");


        List<String> Dehydration = new ArrayList<String>();
        Dehydration.add("Restless and irritable");
        Dehydration.add("Sunken eyes");
        Dehydration.add("Skin pinch goes back slowly");

        List<String> Pneumonia = new ArrayList<String>();
        Pneumonia.add("Not enough signs to classify as dehydration");

        List<String> severepro = new ArrayList<String>();
        severepro.add("Diarrhoea lasting 7 or more days");

        List<String> severe1pro = new ArrayList<String>();
        severe1pro.add("Blood in the stool.");

        listDataChild.put(listDataHeader.get(0), malaria); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Dehydration);
        listDataChild.put(listDataHeader.get(2), Pneumonia);
        listDataChild.put(listDataHeader.get(3), severepro);
        listDataChild.put(listDataHeader.get(4), severe1pro);
    }
}