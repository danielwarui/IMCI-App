package org.ministryofhealth.imci.assessment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class What_to_Check_2_60 extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    String checkGeneral;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.what_to_check);
        System.out.println("----Secondactivity activity---onCreates---");


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        expListView.expandGroup(0);
        expListView.expandGroup(1);
        expListView.expandGroup(2);
        expListView.setBackgroundColor(Color.TRANSPARENT);
//		expListView..setBackgroundColor(Color.GRAY);


//		Set background to 

//		expListView.setBackgroundColor(Color.CYAN);
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
               /* Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();*/
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

               /* Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

              /*  // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();*/
                if (groupPosition == 1 && childPosition == 0) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Cough.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 1) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Diarr.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 2) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Fever.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 3) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Ear_Problem.class);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 0) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Malnutrition.class);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 1) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Anaemia.class);
                    startActivity(intent);

                }

                if (groupPosition == 2 && childPosition == 2) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Hiv.class);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 3) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_2_60_Immunization.class);
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


        checkGeneral = getResources().getString(R.string.check_general);


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Check for general signs");
        listDataHeader.add("Then Ask Main Symptoms");
        listDataHeader.add("Other Conditions");


        // Adding child data

        // Adding child data
        List<String> generalsigns = new ArrayList<String>();
        // adding sublists to the entity top250
        generalsigns.add(checkGeneral);
        // top250 is an entry of the major list
        // top250 is an entry of the major list
        List<String> symptoms = new ArrayList<String>();
        // adding sublists to the entity top250
        symptoms.add("Does the child have cough or difficult breathing?");
        symptoms.add("Does the child have diarrhoea?");
        symptoms.add("Does the child have fever?");
        symptoms.add("Does the child have an ear problem?");


        List<String> conditions = new ArrayList<String>();
        // adding sublists to the entity top250
        conditions.add("Check for malnutrition");
        conditions.add("Check for anaemia");
        conditions.add("Check for HIV exposure and infection");
        conditions.add("Check the child's immunization,vitamin A & deworming status");

        listDataChild.put(listDataHeader.get(0), generalsigns);// Header, Child
        listDataChild.put(listDataHeader.get(1), symptoms);
        listDataChild.put(listDataHeader.get(2), conditions);

    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

}
