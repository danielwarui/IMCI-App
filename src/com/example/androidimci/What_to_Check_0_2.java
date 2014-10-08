package com.example.androidimci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.chai.imciapplication.R;

import android.app.Activity;
import android.app.Fragment;
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

public class What_to_Check_0_2 extends Activity {
String general_signs;
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> listDataChild;
	android.app.FragmentTransaction transaction;
	Fragment fragment;
	String checkGeneral;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        setContentView(R.layout.what_to_check);
        System.out.println("----Secondactivity activity---onCreates---");
        // Create custom dialog object
      /*  general_signs =  getResources().getString(R.string.general_danger_signs);
        final Dialog dialog = new Dialog(What_to_Check_0_2.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("General Danger Signs");
 
        
        // set values for custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        text.setText(general_signs);
        text.setBackgroundColor(Color.BLACK);
//        ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
        
        dialog.show();
         
         
        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
        // if decline button is clicked, close the custom dialog
        declineButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
            }
        });*/
   /*     Button declineButton1 = (Button) dialog.findViewById(R.id.followup);
        // if decline button is clicked, close the custom dialog
        declineButton1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            	fragment = new FollowUpCareFragment();
				// consider using Java coding conventions (upper first char
				// class names!!!)
				transaction = getFragmentManager().beginTransaction();

				// Replace whatever is in the fragment_container view with
				// this fragment,
				// and add the transaction to the back stack
				transaction.replace(R.id.drawer_layout, fragment);
				transaction.addToBackStack(null);

				// Commit the transaction
				transaction.commit();
            }
        });

*/

        
		// get the listview
		expListView = (ExpandableListView) findViewById(R.id.lvExp1);

		// preparing list data
		prepareListData();

		listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

		// setting list adapter
		expListView.setAdapter(listAdapter);
		expListView.expandGroup(0);
		expListView.expandGroup(1);
		expListView.expandGroup(2);

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
				if (groupPosition == 1 && childPosition == 0) {
					Intent intent = new Intent(What_to_Check_0_2.this,
							org.inclusion.imcione.Starter_0_2_Diarrhoea.class);
					startActivity(intent);

				}
				if (groupPosition == 2 && childPosition == 0) {
					Intent intent = new Intent(What_to_Check_0_2.this,
							org.inclusion.imcione.Starter_0_2_Severe_Disease.class);
					startActivity(intent);

				}
				if (groupPosition == 2 && childPosition == 1) {
					Intent intent = new Intent(What_to_Check_0_2.this,
							org.inclusion.imcione.Starter_0_2_Jaundice.class);
					startActivity(intent);

				}
				if (groupPosition == 2 && childPosition == 2) {
					Intent intent = new Intent(What_to_Check_0_2.this,
							org.inclusion.imcione.Starter_0_2_EyeInfection.class);
					startActivity(intent);

				}
				if (groupPosition == 2 && childPosition == 3) {
					Intent intent = new Intent(What_to_Check_0_2.this,
							org.inclusion.imcione.Starter_0_2_HIVExposure.class);
					startActivity(intent);

				}
				if (groupPosition == 2 && childPosition == 4) {
					Intent intent = new Intent(What_to_Check_0_2.this,
							org.inclusion.imcione.Starter_0_2_FeedingProblem.class);
					startActivity(intent);

				}
				if (groupPosition == 2 && childPosition == 5) {
					Intent intent = new Intent(What_to_Check_0_2.this,
							org.inclusion.imcione.Starter_0_2_SpecialTreatments.class);
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
checkGeneral = getResources().getString(R.string.ask_mother_young_infant);
		listDataHeader = new ArrayList<String>();
		listDataChild = new HashMap<String, List<String>>();

		// Adding child data
		listDataHeader.add("Check for general signs");
		listDataHeader.add("Then ask main symptoms");
		listDataHeader.add("Other conditions");

		// Adding child data
		List<String> generalsigns = new ArrayList<String>();
		// adding sublists to the entity top250
		generalsigns.add(checkGeneral);
		// top250 is an entry of the major list
		List<String> symptoms = new ArrayList<String>();
		// adding sublists to the entity top250
		symptoms.add("Does the young infant have diarrhoea?");
		List<String> conditions = new ArrayList<String>();
		// adding sublists to the entity top250
		conditions.add("Check for very severe disease");
		conditions.add("Check for jaundice");
		conditions.add("Check for eye infections");
		conditions.add("Check for HIV exposure and infection");
		conditions.add("Check for feeding problem, low weight or low birthweight");
		conditions.add("Check for special treatment needs");

		listDataChild.put(listDataHeader.get(0), generalsigns); // Header, Child
		listDataChild.put(listDataHeader.get(1), symptoms); 													
		listDataChild.put(listDataHeader.get(2), conditions); 													
		
		// data
	}
}
