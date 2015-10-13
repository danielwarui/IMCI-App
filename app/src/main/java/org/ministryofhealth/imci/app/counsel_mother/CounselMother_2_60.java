package org.ministryofhealth.imci.app.counsel_mother;

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
import org.ministryofhealth.imci.app.utils.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by InclusionOne on 9/2/2015.
 */
public class CounselMother_2_60 extends Activity {
    Intent intent;
    int id;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counsel_mother);
        setRowIdFromIntent();
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader,
                listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        if (id == 1) {
            expListView.expandGroup(1);
        }
        if (id == 0) {
        }


        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

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
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
				/*Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();*/
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
				/*Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                if(groupPosition == 0 && childPosition == 0){
                    Intent intent = new Intent(getApplicationContext(),AgeSixMonths.class);
                    startActivity(intent);
                }
                if(groupPosition == 0 && childPosition == 1){
                    Intent intent = new Intent(getApplicationContext(),AgeSixMonthstoTwelveMonths.class);
                    startActivity(intent);
                }
                if(groupPosition == 0 && childPosition == 2){
                    Intent intent = new Intent(getApplicationContext(),AgeTwelveMonthstoTwoYears.class);
                    startActivity(intent);
                }
                if(groupPosition == 0 && childPosition == 3){
                    Intent intent = new Intent(getApplicationContext(),AgeTwoYearsandOlder.class);
                    startActivity(intent);
                }
                if(groupPosition == 1){
                    Intent intent = new Intent(getApplicationContext(),CareForDevelopmentUniversal.class);
                    intent.putExtra("CareForDevelopmentAndNvp", childPosition);
                    startActivity(intent);
                }


                if(groupPosition == 2 && childPosition == 0){
                    Intent intent = new Intent(getApplicationContext(),Counsel_Mother_Infant_Feeding.class);
                    startActivity(intent);
                }
                if(groupPosition == 2 && childPosition == 1){
                    Intent intent = new Intent(getApplicationContext(),FeedingAdvice_Breastfeed.class);
                    startActivity(intent);
                }
                if(groupPosition == 2 && childPosition == 2){
                    Intent intent = new Intent(getApplicationContext(),FeedingAdvice_NotBreastfeed.class);
                    startActivity(intent);
                }


                if(groupPosition == 3 && childPosition == 0){
                    Intent intent = new Intent(getApplicationContext(),FeedingProblem.class);
                    startActivity(intent);
                }
                if(groupPosition == 4 && childPosition == 0){
                    Intent intent = new Intent(getApplicationContext(),Counsel_CareforDevelopment.class);
                    startActivity(intent);
                }
                if(groupPosition == 5 && childPosition == 0){
                    Intent intent = new Intent(getApplicationContext(),Counsel_Mother_Fluids.class);
                    startActivity(intent);
                }
                if(groupPosition == 6 && childPosition == 0){
                    Intent intent = new Intent(getApplicationContext(),Counsel_Her_OwnHealth.class);
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
        listDataHeader.add("Recommendations for feeding during sickness and health");
        listDataHeader.add("Recommendations for Care for Development");
        listDataHeader.add("Feeding Options:HIV Exposed and Infected");
        listDataHeader.add("Feeding Problems");
        listDataHeader.add("Counsel the caregiver about care for development problems");
        listDataHeader.add("Counsel the mother on fluids and when to return");
        listDataHeader.add("Counsel mother about her own health");
        // Adding child data
        List<String> malaria = new ArrayList<String>();
        malaria.add("Up to 6 months of age");
        malaria.add("6 months up to 12 months");
        malaria.add("12 months up to 2 years");
        malaria.add("2 years and older");

        List<String> careDev = new ArrayList<String>();
        careDev.add("Age up to 4 months");
        careDev.add("Age 4 months up to 6 months");
        careDev.add("6 months up to 12 months");
        careDev.add("12 months up to 2 years");
        careDev.add("2 years and older");

        List<String> febrile = new ArrayList<String>();
        febrile.add("Follow for care for development problems");


        List<String> suspmeasles = new ArrayList<String>();
        suspmeasles.add("Counsel mother on infant feeding");
        suspmeasles.add("Feeding advice for a child of a HIV positive mother who has chosen to breastfeed");
        suspmeasles.add("Feeding advice for a child of a HIV positive mother who has chosen not to breastfeed or child who cannot be breastfed");

        List<String> feedingProblems = new ArrayList<String>();
        feedingProblems.add("Follow for instructions on counselling the mother about her health");

        List<String> nomalaria = new ArrayList<String>();
        nomalaria.add("Follow for instructions on counselling the mother on fluids and when to return");


        List<String> compmeasles = new ArrayList<String>();
        compmeasles.add("Follow for instructions on counselling the mother about her health");




        listDataChild.put(listDataHeader.get(0), malaria); // Header, Child data
        listDataChild.put(listDataHeader.get(1), careDev);
        listDataChild.put(listDataHeader.get(2), suspmeasles);
        listDataChild.put(listDataHeader.get(3), feedingProblems);
        listDataChild.put(listDataHeader.get(4), febrile);
        listDataChild.put(listDataHeader.get(5), nomalaria);
        listDataChild.put(listDataHeader.get(6), compmeasles);

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
                Intent intent = new Intent(CounselMother_2_60.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setRowIdFromIntent() {
        Bundle extras = getIntent().getExtras();
        id = extras != null ? extras.getInt("Expander") : null;
    }
    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

}
