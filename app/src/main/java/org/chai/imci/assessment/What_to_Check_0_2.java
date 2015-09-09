package org.chai.imci.assessment;

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
import org.chai.imci.assessment.adapter.AdapterExpandable;
import org.chai.imci.counsel_mother.CareForDevelopmentUniversal;
import org.chai.imci.follow_up.FollowUpMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class What_to_Check_0_2 extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    Fragment fragment;
    String checkGeneral;
    String checkGeneralContinue;
    String clickhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.what_to_check);
        System.out.println("----Secondactivity activity---onCreates---");
        // Create custom dialog object


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        expListView.expandGroup(0);
        expListView.expandGroup(1);

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
              /*  Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
               /* // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();*/

                if (groupPosition == 0 && childPosition == 1) {
                    Intent intent = new Intent(What_to_Check_0_2.this, FollowUpMain.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 0) {
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_0_2_Severe_Disease.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 1) {
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_0_2_Jaundice.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 2) {
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_0_2_EyeInfection.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 3) {
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_0_2_Diarrhoea.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 4) {
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_0_2_HIVExposure.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 5) {
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_0_2_FeedingProblem.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 6) {
                    Intent intent = new Intent(What_to_Check_0_2.this, CareForDevelopmentUniversal.class);
                    intent.putExtra("CareForDevelopmentAndNvp", 10);
                    startActivity(intent);
                }
                if (groupPosition == 1 && childPosition == 7) {
                    Intent intent = new Intent(What_to_Check_0_2.this, CareForDevelopment.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 8) {
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_0_2_SpecialTreatments.class);
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
        clickhere = getResources().getString(R.string.click_here);
        checkGeneralContinue = getResources().getString(R.string.ask_mother_young_infant_continue);

        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("ASK THE MOTHER WHAT THE YOUNG INFANT'S PROBLEMS ARE:");
        listDataHeader.add("CHECK FOR:");

        // Adding child data
        List<String> generalsigns = new ArrayList<String>();
        generalsigns.add(checkGeneral);
        generalsigns.add(clickhere);
        generalsigns.add(checkGeneralContinue);

        List<String> listCheckFor = new ArrayList<String>();
        listCheckFor.add("Very severe disease");
        listCheckFor.add("Jaundice");
        listCheckFor.add("Eye infections");
        listCheckFor.add("Does the young infant have diarrhoea?");
        listCheckFor.add("HIV exposure and infection");
        listCheckFor.add("feeding problem, low weight or low birthweight");
        listCheckFor.add("Young infant's immunization status");
        listCheckFor.add("Care for development");
        listCheckFor.add("Special treatment needs");

        listDataChild.put(listDataHeader.get(0), generalsigns); // Header, Child
        listDataChild.put(listDataHeader.get(1), listCheckFor);

        // data
    }
    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

}
