package org.chai.imci.followupcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import org.chai.imci.R;
import org.chai.imci.treatments.Young_Treatment_Confirmed_Hiv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Follow_Up_Pneumonia extends Fragment {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater
                .inflate(R.layout.follow_up_pneumonia, container, false);
        // get the listview
        expListView = (ExpandableListView) rootView.findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

//		listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

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

            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {


            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub

                if (groupPosition == 0) {
                    Intent intent = new Intent(getActivity(),
                            Young_Treatment_Confirmed_Hiv/*Sypmtoms_and_treatment*/.class);
                    startActivity(intent);
                }

                return false;
            }
        });


        return rootView;
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        String one, two;
        one = getResources().getString(R.string.counsel_mother_on_infant_feeding_ARV);
        two = getResources().getString(R.string.counsel_mother_on_infant_feeding_replacement);


        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("1. Exclusive breastfeeding with ARVs");
        listDataHeader.add("2. Exclusive replacement feeding");

        // Adding child data
        // top250 is an entry of the major list
        List<String> malaria = new ArrayList<String>();
        // adding sublists to the entity top250
        malaria.add(one);

        List<String> Dehydration = new ArrayList<String>();
        Dehydration.add(two);

        listDataChild.put(listDataHeader.get(0), malaria); // Header, Child data
        listDataChild.put(listDataHeader.get(1), Dehydration);
    }
}