package org.chai.imci.follow_up;

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

import org.chai.imci.R;
import org.chai.imci.assessment.adapter.AdapterExpandable;

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
//				elv.getChildAt(0).setBackgroundColor(Color.BLACK);

		/*		Toast.makeText(getActivity(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();*/

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
		String one,two;
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