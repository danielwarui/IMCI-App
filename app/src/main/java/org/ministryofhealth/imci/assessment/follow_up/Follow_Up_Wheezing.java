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


public class Follow_Up_Wheezing extends Fragment{
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
//				elv.getChildAt(0).setBackgroundColor(Color.BLACK);

		/*		Toast.makeText(getActivity(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();*/

			}
		});

		// Listview on child click listener
		elv.setFocusable(false);
		elv.setClickable(false);

		return v;
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {

		String one, two;
		one = getResources().getString(R.string.follow_up_wheezing_child_under_1);
		two = getResources().getString(R.string.follow_up_wheezing_child_year_over);

		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Child under 1 year");
		listDataHeader.add("Child 1 year and over");

		// Adding child data

		List<String> dehydrated = new ArrayList<String>();
		dehydrated.add(one);

		List<String> stools = new ArrayList<String>();
		stools.add(two);

		listDataChild.put(listDataHeader.get(0), dehydrated); // Header, Child
		listDataChild.put(listDataHeader.get(1), stools);
	}

}