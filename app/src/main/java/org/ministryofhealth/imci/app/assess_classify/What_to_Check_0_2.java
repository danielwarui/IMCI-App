package org.ministryofhealth.imci.app.assess_classify;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.TextView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.CareForDevelopment;
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.assess_classify.frag_activity_container.Starter_Universal;
import org.ministryofhealth.imci.app.counsel_mother.CareForDevelopmentUniversal;
import org.ministryofhealth.imci.app.follow_up.FollowUpMain;
import org.ministryofhealth.imci.app.treatchild.Treat_Child_Activity_0_2;
import org.ministryofhealth.imci.app.utils.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class What_to_Check_0_2 extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    Fragment fragment;
    private TextView t, t0, t1, t2;
    private String checkGeneral;
    private String checkGeneralContinue;
    private String clickhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.what_to_check_0_2);

        getActionBar().setSubtitle("Age up to two months");
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        // Create custom dialog object


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);
        t = (TextView) findViewById(R.id.header0);
        t0 = (TextView) findViewById(R.id.text0);
        t1 = (TextView) findViewById(R.id.text0_1);
        t2 = (TextView) findViewById(R.id.text0_2);

        // preparing list data
        prepareListData();

        t1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(What_to_Check_0_2.this, FollowUpMain.class);
                startActivity(intent);
            }
        });
        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        expListView.expandGroup(0);
        expListView.setBackgroundColor(Color.TRANSPARENT);
        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                return false;
            }

        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
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

               /* if (groupPosition == 0 && childPosition == 1) {
                    Intent intent = new Intent(What_to_Check_0_2.this, FollowUpMain.class);
                    startActivity(intent);
                }*/

                if (groupPosition == 0 && childPosition == 0) {
                    //Severe Disease
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 6);
                    startActivity(intent);

                }
                if (groupPosition == 0 && childPosition == 1) {
                    //Jaundice
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 5);
                    startActivity(intent);

                }
                if (groupPosition == 0 && childPosition == 2) {
                    //Eye Infection
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 2);
                    startActivity(intent);

                }
                if (groupPosition == 0 && childPosition == 3) {
                    //Diarrhoea
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 1);
                    startActivity(intent);

                }
                if (groupPosition == 0 && childPosition == 4) {
                    //HIV
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 4);
                    startActivity(intent);

                }
                if (groupPosition == 0 && childPosition == 5) {
                    //Feeding Problem
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 3);
                    startActivity(intent);

                }
                if (groupPosition == 0 && childPosition == 6) {
                    Intent intent = new Intent(What_to_Check_0_2.this, CareForDevelopmentUniversal.class);
                    intent.putExtra("CareForDevelopmentAndNvp", 10);
                    startActivity(intent);
                }
                if (groupPosition == 0 && childPosition == 7) {
                    Intent intent = new Intent(What_to_Check_0_2.this, CareForDevelopment.class);
                    startActivity(intent);

                }
                if (groupPosition == 0 && childPosition == 8) {
                    //Special Treatment
                    Intent intent = new Intent(What_to_Check_0_2.this, Starter_Universal.class);
                    intent.putExtra("Whattocheck", 7);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 0) {
                    //Resuscitate
                    Intent intent = new Intent(What_to_Check_0_2.this, Treat_Child_Activity_0_2.class);
                    intent.putExtra("position", 1);
                    startActivity(intent);

                }
                if (groupPosition == 2 && childPosition == 0) {
                    //Keep younginfant warm

                    Intent intent = new Intent(What_to_Check_0_2.this, Treat_Child_Activity_0_2.class);
                    intent.putExtra("position", 2);
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
        t.setText("ASK THE MOTHER WHAT THE YOUNG INFANT'S PROBLEMS ARE:");
        t0.setText(checkGeneral);
        t1.setText(clickhere);
        t2.setText(checkGeneralContinue);

        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("CHECK FOR:");
        listDataHeader.add("Helping Babies Breathe:");
        listDataHeader.add("Keep the young infant warm");


        List<String> listCheckFor = new ArrayList<String>();
        listCheckFor.add("Very severe disease");
        listCheckFor.add("Jaundice");
        listCheckFor.add("Eye infections");
        listCheckFor.add("Does the young infant have diarrhoea?");
        listCheckFor.add("HIV exposure and infection");
        listCheckFor.add("Feeding problem, low weight or low birthweight");
        listCheckFor.add("Young infant's immunization status");
        listCheckFor.add("Care for development");
        listCheckFor.add("Special treatment needs");

        List<String> listBabiesBreathe = new ArrayList<String>();
        listBabiesBreathe.add("Touch here and follow instructions to resuscitate the young infant");

        List<String> listKeepWarm = new ArrayList<String>();
        listKeepWarm.add("Touch here and follow instructions to keep the young infant warm");

        listDataChild.put(listDataHeader.get(0), listCheckFor);
        listDataChild.put(listDataHeader.get(1), listBabiesBreathe);
        listDataChild.put(listDataHeader.get(2), listKeepWarm);


        // data
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
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
                return true;
            case R.id.homePage:
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
