package org.ministryofhealth.imci.assessment.follow_up;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Follow_Up_Pneumonia extends Fragment{
	String DDS;
	ExpandableListAdapter listAdapter;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.what_to_check, null);
		final ExpandableListView elv = (ExpandableListView) v
				.findViewById(R.id.lvExp1);
		// preparing list data
		prepareListData();
		//
		listAdapter = new AdapterExpandable(getActivity(), listDataHeader,
				listDataChild);
		// set the adapter
		elv.setAdapter(listAdapter);


		Log.d(DDS, "List adapter set!");
		elv.setOnGroupClickListener(new OnGroupClickListener() {

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
		elv.setOnGroupExpandListener(new OnGroupExpandListener() {

			@Override
			public void onGroupExpand(int groupPosition) {
			/*	Toast.makeText(getActivity(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();*/
			}
		});

		// Listview Group collasped listener
		elv.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {

			}
		});

		// Listview on child click listener
		elv.setClickable(false);
		return v;
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		String one, two, three;
		one = getResources().getString(R.string.followup_pneumonia_chest_indrawing);
		two = getResources().getString(R.string.followup_pneumonia_breathing_rate);
		three = getResources().getString(R.string.followup_pneumonia_breathing_slower);
		

		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Chest indrawing or a general sign");
		listDataHeader.add("Breathing rate, fever and eating not improved");
		listDataHeader.add("Breathing slower, less fever, or eating better");

		// Adding child data
		List<String> indrawing = new ArrayList<String>();
		indrawing.add(one);

		List<String> fever = new ArrayList<String>();
		fever.add(two);

		List<String> slower = new ArrayList<String>();
		slower.add(three);

		listDataChild.put(listDataHeader.get(0), indrawing); // Header, Child data
		listDataChild.put(listDataHeader.get(1), fever);
		listDataChild.put(listDataHeader.get(2), slower);
	}
}