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
 * Created by InclusionOne on 9/3/2015.
 */
public class Counsel_Her_OwnHealth extends Activity {
    Intent intent;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainforexplistview);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setTitle("Counsel the mother");
        getActionBar().setSubtitle("Counsel the mother about her own health");

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader,
                listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

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
        expListView.setClickable(false);
        expListView.setFocusable(false);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        String motherSick = getResources().getString(R.string.mother_sick_provide);
        String sureAccess = getResources().getString(R.string.she_has_access_to);
        String motherHIV = getResources().getString(R.string.mother_hiv_positive);
        String babyMonths = getResources().getString(R.string.baby_less_than_two);

        listDataHeader = new ArrayList();
        listDataChild = new HashMap();
        //0
        listDataHeader.add("If the mother is sick, provide care for help, or refer for help");
        //1
        listDataHeader.add("Make sure she has access to:");
        //2
        listDataHeader.add("If the mother is HIV positive");
        //3
        listDataHeader.add("If baby is less than 2 months:");
        //4

        List<String> array0 = new ArrayList<String>();
        array0.add(motherSick);

        List<String> array1 = new ArrayList<String>();
        array1.add(sureAccess);

        List<String> array2 = new ArrayList<String>();
        array2.add(motherHIV);

        List<String> array3 = new ArrayList<String>();
        array3.add(babyMonths);




        listDataChild.put((String) listDataHeader.get(0), array0);
        listDataChild.put((String) listDataHeader.get(1), array1);
        listDataChild.put((String) listDataHeader.get(2), array2);
        listDataChild.put((String) listDataHeader.get(3), array3);
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
    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
