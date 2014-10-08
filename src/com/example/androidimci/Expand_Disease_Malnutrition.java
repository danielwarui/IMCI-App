package com.example.androidimci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.chai.imciapplication.R;
import com.example.treatments.Treatment_Anaemia;
import com.example.treatments.Treatment_At_Risk_Acute_Malnutrition;
import com.example.treatments.Treatment_Moderate_Acute_Malnutrition;
import com.example.treatments.Treatment_No_Anaemia;
import com.example.treatments.Treatment_No_Malnutrition;
import com.example.treatments.Treatment_Severe_Acute_Malnutrition;
import com.example.treatments.Treatment_Severe_Anaemia;

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

public class Expand_Disease_Malnutrition extends Activity {

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
				if(groupPosition == 0){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_Severe_Acute_Malnutrition.class);
					    startActivity(intent);
					}
				if(groupPosition == 1){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_Moderate_Acute_Malnutrition.class);
					    startActivity(intent);
					}
				if(groupPosition == 2){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_At_Risk_Acute_Malnutrition.class);
					    startActivity(intent);
					}
				if(groupPosition == 3){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_No_Malnutrition.class);
					    startActivity(intent);
					}
				if(groupPosition == 4){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_Severe_Anaemia.class);
					    startActivity(intent);
					}
				if(groupPosition == 5){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_Anaemia.class);
					    startActivity(intent);
					}
				if(groupPosition == 6){
					 Intent intent = new Intent(getApplicationContext(),
							 Treatment_No_Anaemia.class);
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
		listDataHeader.add("Severe Acute Malnutrition");
		listDataHeader.add("Moderate Acute Malnutrition");
		listDataHeader.add("At Risk of Acute Malnutrition");
		listDataHeader.add("No Malnutrition");
		listDataHeader.add("Severe Anaemia");
		listDataHeader.add("Anaemia");
		listDataHeader.add("No Anaemia");

		// Adding child data
		// top250 is an entry of the major list
		List<String> SevAcute = new ArrayList<String>();
		SevAcute.add("With visible severe wasting");
		SevAcute.add("Oedema of both feet");
		SevAcute.add("less than -3 Z score(weight for age or weight of height/length)");
		SevAcute.add("MUAC less than 11.5cm");

		List<String> ModAcute = new ArrayList<String>();
		ModAcute.add("Static weight loss");
		ModAcute.add("less than -2 to -1 Z score");
		ModAcute.add("MUAC 11.5-12.5");

		List<String> RiskAcute = new ArrayList<String>();
		RiskAcute.add("Static weight loss");
		RiskAcute.add("-2 to less than-1 Z score ");
		RiskAcute.add("MUAC 12.5 to 13.5cm");
		
		List<String> NoMal = new ArrayList<String>();
		NoMal.add("-1 to +2 ");
		
		List<String> SevAnaemia = new ArrayList<String>();
		SevAnaemia.add("Severe palmar pallor");
		
		List<String> Anaemia = new ArrayList<String>();
		Anaemia.add("Some palmar pallor");
		
		List<String> NoAnaemia = new ArrayList<String>();
		NoAnaemia.add("No palmar pallor");

		listDataChild.put(listDataHeader.get(0), SevAcute); // Header, Child data
		listDataChild.put(listDataHeader.get(1), ModAcute);
		listDataChild.put(listDataHeader.get(2), RiskAcute);
		listDataChild.put(listDataHeader.get(3), NoMal);
		listDataChild.put(listDataHeader.get(4), SevAnaemia);
		listDataChild.put(listDataHeader.get(5), Anaemia);
		listDataChild.put(listDataHeader.get(6), NoAnaemia);
	}
}
