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


public class Follow_Up_Dysentry extends Fragment{
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

		String one, two, three, four, excpone, excptwo, excpthree;
		one = getResources().getString(R.string.young_dysentry_child_dehydrated);
		two = getResources().getString(R.string.young_dysentry_child_no_stools);
		three = getResources().getString(R.string.young_dysentry_child_conditions_same);
		excpone = getResources().getString(R.string.young_dysentry_exception);
		excptwo = getResources().getString(R.string.young_dysentry_exception_two);
		excpthree = getResources().getString(R.string.young_dysentry_exception_three);
		four = getResources().getString(R.string.young_dysentry_child_fewer);

		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Dehydrated");
		listDataHeader.add("number of stools, amount of blood in stools...");
		listDataHeader.add("the condition is the same");
		listDataHeader.add("fewer stools, less blood in the stools, less fever, less abdominal pain, and eating better");
		listDataHeader.add("Exception: Admit or refer URGENTLY to hospital");

		// Adding child data

		List<String> dehydrated = new ArrayList<String>();
		dehydrated.add(one);

		List<String> stools = new ArrayList<String>();
		stools.add(two);

		List<String> condition = new ArrayList<String>();
		condition.add(three);

		List<String> fewerStools = new ArrayList<String>();
		fewerStools.add(four);

		List<String> exception = new ArrayList<String>();
		exception.add(excpone);
		exception.add(excptwo);
		exception.add(excpthree);

		listDataChild.put(listDataHeader.get(0), dehydrated); // Header, Child
		listDataChild.put(listDataHeader.get(1), stools);
		listDataChild.put(listDataHeader.get(2), condition);
		listDataChild.put(listDataHeader.get(3), fewerStools);
		listDataChild.put(listDataHeader.get(4), exception);
	}

}