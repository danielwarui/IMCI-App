package org.ministryofhealth.imci.assessment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
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

        getActionBar().setSubtitle("Age 2 months to 5 years");
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

                // Check for Changes
                if (groupPosition == 1 && childPosition == 0) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 9);
                    startActivity(intent);
                    // Check for Changes
                }
                if (groupPosition == 1 && childPosition == 1) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 10);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 2) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 12);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 3) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 11);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 0) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 15);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 1) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 8);
                    startActivity(intent);

                }

                if (groupPosition == 2 && childPosition == 2) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 13);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 3) {
                    Intent intent = new Intent(What_to_Check_2_60.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 14);
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
        listDataHeader.add("Then ask main symptoms:");
        listDataHeader.add("Then check for:");


        // Adding child data

        // Adding child data
        List<String> generalsigns = new ArrayList<String>();
        generalsigns.add(checkGeneral);

        List<String> symptoms = new ArrayList<String>();
        symptoms.add("Does the child have cough or difficult breathing?");
        symptoms.add("Does the child have diarrhoea?");
        symptoms.add("Does the child have fever?");
        symptoms.add("Does the child have an ear problem?");


        List<String> conditions = new ArrayList<String>();
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }
}
