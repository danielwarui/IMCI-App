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
import org.ministryofhealth.imci.app.treatchild.Young_Home_Care;
import org.ministryofhealth.imci.app.treatchild.Young_Teach_Correct_Positioning;
import org.ministryofhealth.imci.app.utils.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by InclusionOne on 9/2/2015.
 */
public class CounselMother_0_2 extends Activity {
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
                /*
                 if (groupPosition == 3 && childPosition == 0) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this, Young_Teach_Correct_Positioning.class);
                    startActivity(intent);

                }
                if (groupPosition == 4 && childPosition == 0) {
                    Intent intent = new Intent(Oral_Drugs_0_2_At.this, Young_Home_Care.class);
                    intent.putExtra("position", 6);
                    startActivity(intent);
                }
                * */
                if (groupPosition == 0 && childPosition == 0) {
                    Intent intent = new Intent(CounselMother_0_2.this, Young_Teach_Correct_Positioning.class);
                    startActivity(intent);
                }
                if (groupPosition == 1 && childPosition == 0) {
                    Intent intent = new Intent(CounselMother_0_2.this, Young_Home_Care.class);
                    intent.putExtra("position", 6);
                    startActivity(intent);
                }
                if (groupPosition == 2 && childPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(), Counsel_Her_OwnHealth.class);
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
        listDataHeader.add("Teach correct positioning and attachment, for breastfeed");
        listDataHeader.add("Advise mother on when to return");
        listDataHeader.add("Counsel mother about her own health");

        // Adding child data

        List<String> positioning = new ArrayList<String>();
        positioning.add("Touch and follow instructions to teach correct positioning and attachment, for breastfeeding");

        List<String> home = new ArrayList<String>();
        home.add("Touch and follow instructions advising mother on when to return");

        List<String> compmeasles = new ArrayList<String>();
        compmeasles.add("Follow for instructions on counselling the mother about her health");

        listDataChild.put(listDataHeader.get(0), positioning);
        listDataChild.put(listDataHeader.get(1), home);
        listDataChild.put(listDataHeader.get(2), compmeasles);
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
                Intent intent = new Intent(CounselMother_0_2.this, HomeActivity.class);
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
