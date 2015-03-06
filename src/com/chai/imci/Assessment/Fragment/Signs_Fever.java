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

public class Signs_Fever extends Fragment {
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
		treat_severe_febrile_disease, 
		treat_malaria, 
		treat_fever_no_malaria, 
		treat_low_severe_febrile_disease, 
		treat_low_malaria, 
		treat_low_fever_no_malaria,
		treat_suspected_measles,
		treat_severe_complications_of_measles,
		treat_eye_mouth_complication,
		treat_no_eye_mouth;
		
		
		treat_severe_febrile_disease = getResources().getString(
				R.string.lblvery_severe_febrile);
		treat_malaria = getResources().getString(
				R.string.lblmalaria);
		treat_fever_no_malaria= getResources().getString(
				R.string.lblfever_no_malaria);
		treat_low_severe_febrile_disease = getResources().getString(
				R.string.lblvery_severe_febrile);
		treat_low_malaria= getResources().getString(
				R.string.lblmalaria);
		treat_low_fever_no_malaria= getResources().getString(
				R.string.lblfever_no_malaria);
		treat_suspected_measles= getResources().getString(
				R.string.lblsuspected_measles);
		treat_severe_complications_of_measles= getResources().getString(
				R.string.lblsevere_complications_of_measles);
		treat_eye_mouth_complication= getResources().getString(
				R.string.lbleye_mouth_complications);
		treat_no_eye_mouth= getResources().getString(
				R.string.lblno_eye_mouth_complications);
		
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("High Risk Malaria");
		listDataHeader.add("Low Risk Malaria & No Malaria Risk");
		listDataHeader.add("Classify Measles");
		listDataHeader.add("If Measles now or within the last 3 months, Classify");


		// Adding child data

		// Adding child data
		List<String> generalsigns = new ArrayList<String>();
		// adding sublists to the entity top250
		generalsigns.add(treat_severe_febrile_disease);
		generalsigns.add(treat_malaria);
		generalsigns.add(treat_fever_no_malaria);
		// top250 is an entry of the major list
		// top250 is an entry of the major list
		List<String> symptoms = new ArrayList<String>();
		// adding sublists to the entity top250
		symptoms.add(treat_severe_febrile_disease);
		symptoms.add(treat_malaria);
		symptoms.add(treat_fever_no_malaria);

		List<String> conditions = new ArrayList<String>();
		// adding sublists to the entity top250
		conditions.add(treat_suspected_measles);

		List<String> classify_measles = new ArrayList<String>();
		// adding sublists to the entity top250
		classify_measles.add(treat_severe_complications_of_measles);
		classify_measles.add(treat_eye_mouth_complication);
		classify_measles.add(treat_no_eye_mouth);

		listDataChild.put(listDataHeader.get(0), generalsigns); // Header, Child
		listDataChild.put(listDataHeader.get(1), symptoms);
		listDataChild.put(listDataHeader.get(2), conditions);
		listDataChild.put(listDataHeader.get(3), classify_measles);

	}
}
