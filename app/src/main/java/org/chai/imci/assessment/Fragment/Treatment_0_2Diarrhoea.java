package org.chai.imci.assessment.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

import org.chai.imci.R;
import org.chai.imci.assessment.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Treatment_0_2Diarrhoea extends Fragment {
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
				Toast.makeText(getActivity(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		elv.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
				// elv.getChildAt(0).setBackgroundColor(Color.BLACK);

				Toast.makeText(getActivity(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		elv.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(
						getActivity(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();
				/*
				 * if (groupPosition == 1 && childPosition == 0) { Intent intent
				 * = new Intent(getActivity(),
				 * org.inclusion.imcione.Starter_2_60_Cough.class);
				 * startActivity(intent);
				 * 
				 * } if (groupPosition == 1 && childPosition == 1) { Intent
				 * intent = new Intent(getActivity(),
				 * org.inclusion.imcione.Starter_2_60_Diarr.class);
				 * startActivity(intent);
				 * 
				 * } if (groupPosition == 1 && childPosition == 2) { Intent
				 * intent = new Intent(getActivity(),
				 * org.inclusion.imcione.Starter_2_60_Fever.class);
				 * startActivity(intent);
				 * 
				 * } if (groupPosition == 1 && childPosition == 3) { Intent
				 * intent = new Intent( getActivity(),
				 * org.inclusion.imcione.Starter_2_60_Ear_Problem.class);
				 * startActivity(intent);
				 * 
				 * } if (groupPosition == 2 && childPosition == 0) { Intent
				 * intent = new Intent( getActivity(),
				 * org.inclusion.imcione.Starter_2_60_Malnutrition.class);
				 * startActivity(intent);
				 * 
				 * } if (groupPosition == 2 && childPosition == 1) { Intent
				 * intent = new Intent(getActivity(),
				 * org.inclusion.imcione.Starter_2_60_Hiv.class);
				 * startActivity(intent);
				 * 
				 * }
				 */
				return false;
			}
		});
		return v;
	}

	/*
	 * Preparing the list data
	 */
	private void prepareListData() {
		String 
		treat_severe_dehydration, 
		treat_some_dehydration, 
		treat_no_dehydration, 
		treat_severe_prolonged_diarrhoea, 
		treat_persistent_diarrhoea, 
		treat_dysentry;
		treat_severe_dehydration = getResources().getString(
				R.string.young_treatment_severe_dehydration);
		treat_some_dehydration = getResources().getString(
				R.string.young_treatment_some_dehydration);
		treat_no_dehydration = getResources().getString(
				R.string.young_treatment_no_dehydration);
		treat_severe_prolonged_diarrhoea= getResources().getString(
				R.string.young_treatment_severe_prolonged_diarrhoea);
		treat_dysentry= getResources().getString(
				R.string.young_treatment_severe_abdominal_problem);

		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("for Dehydration");
		listDataHeader.add("if Diarrhoea 14days or more");
		listDataHeader.add("if blood in the stool");

		// Adding child data

		// Adding child data
		List<String> generalsigns = new ArrayList<String>();
		// adding sublists to the entity top250
		generalsigns.add(treat_severe_dehydration);
		generalsigns.add(treat_some_dehydration);
		generalsigns.add(treat_no_dehydration);
		// top250 is an entry of the major list
		// top250 is an entry of the major list
		List<String> symptoms = new ArrayList<String>();
		// adding sublists to the entity top250
		symptoms.add(treat_severe_prolonged_diarrhoea);

		List<String> conditions = new ArrayList<String>();
		// adding sublists to the entity top250
		conditions.add(treat_dysentry);

		listDataChild.put(listDataHeader.get(0), generalsigns); // Header, Child
		listDataChild.put(listDataHeader.get(1), symptoms);
		listDataChild.put(listDataHeader.get(2), conditions);
	}
}
