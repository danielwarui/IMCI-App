package com.chai.imci.a;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

import com.chai.imciapplication.R;
import com.example.androidimci.AdapterExpandable;
import com.example.androidimci.counselmother.caredevelopment.CareForDevelopmentUniversal;
public class CounselMother extends Activity {
Intent intent;

ExpandableListAdapter listAdapter;
ExpandableListView expListView;
List<String> listDataHeader;
HashMap<String, List<String>> listDataChild;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainforexplistview);

		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp);

		// preparing list data
		prepareListData();

		listAdapter = new AdapterExpandable(this, listDataHeader,
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
				
				if(groupPosition == 0 && childPosition == 0){
					 Intent intent = new Intent(getApplicationContext(),
							 com.example.androidimci.counselmother.AgeSixMonths.class);
					    startActivity(intent);
				}
				if(groupPosition == 0 && childPosition == 1){
					 Intent intent = new Intent(getApplicationContext(),
							 com.example.androidimci.counselmother.AgeSixMonthstoTwelveMonths.class);
					    startActivity(intent);
				}
				if(groupPosition == 0 && childPosition == 2){
					 Intent intent = new Intent(getApplicationContext(),
							 com.example.androidimci.counselmother.AgeTwelveMonthstoTwoYears.class);
					    startActivity(intent);
				}
				if(groupPosition == 0 && childPosition == 3){
					 Intent intent = new Intent(getApplicationContext(),
							 com.example.androidimci.counselmother.AgeTwoYearsandOlder.class);
					    startActivity(intent);
				}
				if(groupPosition == 1){
					 Intent intent = new Intent(getApplicationContext(),
							 CareForDevelopmentUniversal.class);
					 intent.putExtra("CareForDevelopmentAndNvp", childPosition);
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
		listDataHeader.add("Recommendations for feeding during sickness and health");
		listDataHeader.add("Recommendations for Care for Development");
		listDataHeader.add("Feeding Options:HIV Exposed and Infected");
		listDataHeader.add("Counsel the caregiver about care for development problems");
		listDataHeader.add("Counsel the mother on fluids and when to return");
		listDataHeader.add("Counsel mother about her own health");
		// Adding child data
		List<String> malaria = new ArrayList<String>();
		// adding sublists to the entity top250
		malaria.add("Up to 6 months of age");
		malaria.add("6 months up to 12 months");
		malaria.add("12 months up to 2 years");
		malaria.add("2 years and older");
		
		List<String> careDev = new ArrayList<String>();
		// adding sublists to the entity top250
		careDev.add("Age up to 4 months");
		careDev.add("Age 4 up to six months");
		careDev.add("6 months up to 12 months");
		careDev.add("12 months up to 2 years");
		careDev.add("2 years and older");

		List<String> febrile = new ArrayList<String>();
		febrile.add("Follow for care for development problems");
		

		List<String> suspmeasles = new ArrayList<String>();
		suspmeasles.add("Counsel mother on infant feeding");
		suspmeasles.add("Feeding advice for a child of a HIV positive mothe who has chosen to breastfeed");
		suspmeasles.add("Feeding advice for a child of a HIV positive mother who has chosen not to breastfeed or child who cannot be breastfed");
		

		List<String> nomalaria = new ArrayList<String>();
		nomalaria.add("Follow for instructions on counselling the mother on fluids and when to return");

		
		List<String> compmeasles = new ArrayList<String>();
		compmeasles.add("Follow for instructions on counselling the mother about her health");
		
		
		
		
		listDataChild.put(listDataHeader.get(0), malaria); // Header, Child data
		listDataChild.put(listDataHeader.get(1), careDev);
		listDataChild.put(listDataHeader.get(2), suspmeasles);
		listDataChild.put(listDataHeader.get(3), febrile);
		listDataChild.put(listDataHeader.get(4), nomalaria);
		listDataChild.put(listDataHeader.get(5), compmeasles);
		
	}
		
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		 System.out.println("----Fragmentactivity---onStart---");
		    overridePendingTransition(R.anim.anim_in, R.anim.anim_out);     
	}
		
	}

