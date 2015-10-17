package org.ministryofhealth.imci.app.treatchild.healthfacility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.counsel_mother.CareForDevelopmentUniversal;
import org.ministryofhealth.imci.app.utils.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Treatment_Severe_Malaria extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("Treat for Severe Malaria");
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.what_to_check_severe_malaria);
        System.out.println("----Secondactivity activity---onCreates---");

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

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
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                if (groupPosition == 1 && childPosition == 0) {
                    Intent intent = new Intent(Treatment_Severe_Malaria.this, CareForDevelopmentUniversal.class);
                    intent.putExtra("CareForDevelopmentAndNvp", 11);
                    startActivity(intent);
                }
                return false;
            }
        });

    }

    private void prepareListData() {
        String strArtesunate, strQuinine, strQuinineDilution, strQuinineSevere, strArtemether;
        strArtesunate = getResources().getString(R.string.artesunate_severe_malaria_short);
        strQuinine = getResources().getString(R.string.quinine_table);
        strQuinineDilution = getResources().getString(R.string.quinine_dilution_short);
        strQuinineSevere = getResources().getString(R.string.quinine_severe_malaria_short);
        strArtemether = getResources().getString(R.string.artemether_severe_malaria_short);


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("1. Artesunate for Severe Malaria");
        listDataHeader.add("2. Quinine for Severe Malaria");
        listDataHeader.add("      Quinine Dosage Table");
        listDataHeader.add("      Quinine Dilution");
        listDataHeader.add("3. Artemether for Severe Malaria");

        List<String> listArtesunate = new ArrayList<String>();
        listArtesunate.add(strArtesunate);

        List<String> listQuinineDosageTable = new ArrayList<String>();
        listQuinineDosageTable.add(strQuinine);

        List<String> listQuinineDilution = new ArrayList<String>();
        listQuinineDilution.add(strQuinineDilution);

        List<String> listQuinineSevere = new ArrayList<String>();
        listQuinineSevere.add(strQuinineSevere);

        List<String> listArtamether = new ArrayList<String>();
        listArtamether.add(strArtemether);


        listDataChild.put(listDataHeader.get(0), listArtesunate);
        // Quinine 2.
        listDataChild.put(listDataHeader.get(1), listQuinineSevere);
        // Quinine Dosage table
        listDataChild.put(listDataHeader.get(2), listQuinineDosageTable);
        // Quinine Dilution
        listDataChild.put(listDataHeader.get(3), listQuinineDilution);
        listDataChild.put(listDataHeader.get(4), listArtamether);
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
                Intent intent = new Intent(Treatment_Severe_Malaria.this, HomeActivity.class);
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