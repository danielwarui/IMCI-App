package com.example.androidimci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.chai.imciapplication.R;
import com.example.treatments.Treatment_Dysentry;
import com.example.treatments.Treatment_No_Dehydration;
import com.example.treatments.Treatment_Persistent_Diarrhoea;
import com.example.treatments.Treatment_Severe_Dehydration;
import com.example.treatments.Treatment_Severe_Persistent_Diarrhoea;
import com.example.treatments.Treatment_Some_Dehydration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Expand_Disease_Diarrhoea extends Activity {

	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainforexplistview);

		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader,
				listDataChild);

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
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();
			}
		});

		// Listview Group collasped listener
		expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

			@Override
			public void onGroupCollapse(int groupPosition) {
				Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();

			}
		});

		// Listview on child click listener
		expListView.setOnChildClickListener(new OnChildClickListener() {

			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(
						getApplicationContext(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();
				if(groupPosition == 0 & childPosition == 0){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_Severe_Dehydration.class);
					    startActivity(intent);
					}
				if(groupPosition == 0 & childPosition == 1){
					 Intent intent = new Intent(getApplicationContext(),
				                Treatment_Some_Dehydration/*Sypmtoms_and_treatment*/.class);
					    startActivity(intent);
					}
				if(groupPosition == 0 & childPosition == 2){
					 Intent intent = new Intent(getApplicationContext(),
				                Treatment_No_Dehydration/*Sypmtoms_and_treatment*/.class);
					    startActivity(intent);
					}
				if(groupPosition == 1 & childPosition == 0){
					 Intent intent = new Intent(getApplicationContext(),
				                Treatment_Severe_Persistent_Diarrhoea/*Sypmtoms_and_treatment*/.class);
					    startActivity(intent);
				}
				if(groupPosition == 1 & childPosition == 1){
					 Intent intent = new Intent(getApplicationContext(),
				                Treatment_Persistent_Diarrhoea/*Sypmtoms_and_treatment*/.class);
					    startActivity(intent);
				}
				if(groupPosition == 2 & childPosition == 0){
					 Intent intent = new Intent(getApplicationContext(),
				                Treatment_Dysentry/*Sypmtoms_and_treatment*/.class);
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
		listDataHeader.add("For Dehydration");
		listDataHeader.add("If Diarrhoea has lasted 14 days or more");
		listDataHeader.add("If there's blood in the Stool");

		// Adding child data
		// top250 is an entry of the major list
		List<String> malaria = new ArrayList<String>();
		// adding sublists to the entity top250
		malaria.add("Severe Dehydration");
		malaria.add("Some Dehydration");
		malaria.add("No Dehydration");

		List<String> Dehydration = new ArrayList<String>();
		Dehydration.add("Severe Persistent Diarrhoea");
		Dehydration.add("Persistent Diarrhoea");

		List<String> Pneumonia = new ArrayList<String>();
		Pneumonia.add("Dysentry");
		

		listDataChild.put(listDataHeader.get(0), malaria); // Header, Child data
		listDataChild.put(listDataHeader.get(1), Dehydration);
		listDataChild.put(listDataHeader.get(2), Pneumonia);
	}
}
