package com.chai.imci.Assessment.Fragment;

import java.util.ArrayList;  
import java.util.HashMap;
import java.util.List;

import com.chai.imciapplication.R;
import com.example.androidimci.AdapterExpandable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

public class Signs_Diarrhoea extends Fragment {
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
		elv.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
			/*	Toast.makeText(
						getActivity(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();*/
				/*
				if (groupPosition == 1 && childPosition == 0) {
					Intent intent = new Intent(getActivity(),
							org.inclusion.imcione.Starter_2_60_Cough.class);
					startActivity(intent);

				}
			

				}*/
				return false;
			}
		});
		
		return v;
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {

		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("for Dehydration");
		listDataHeader.add("if Diarrhoea 14days or more");
		listDataHeader.add("if blood in the stool");

		// Adding child data

		List<String> generalsigns = new ArrayList<String>();
		generalsigns.add("Severe Dehydration");
		generalsigns.add("Some Dehydration");
		generalsigns.add("No Dehydration");

		
		List<String> symptoms = new ArrayList<String>();
		symptoms.add("Severe Persistent Diarrhoea");
		symptoms.add("Persistent Diarrhoea");

		List<String> conditions = new ArrayList<String>();
		conditions.add("Dysentry");

		listDataChild.put(listDataHeader.get(0), generalsigns); // Header, Child
		listDataChild.put(listDataHeader.get(1), symptoms);
		listDataChild.put(listDataHeader.get(2), conditions);
	}
}
