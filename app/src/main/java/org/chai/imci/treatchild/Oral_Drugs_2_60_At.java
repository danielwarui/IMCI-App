package org.chai.imci.treatchild;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

import org.chai.imci.R;
import org.chai.imci.assessment.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Oral_Drugs_2_60_At extends Activity {
    String general_signs;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    String checkGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        setContentView(R.layout.what_to_check);
        System.out.println("----Secondactivity activity---onCreates---");

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        /*
		 * expListView.expandGroup(0); expListView.expandGroup(1);
		 * expListView.expandGroup(2); expListView.expandGroup(3);
		 * expListView.expandGroup(4);
		 */

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
				/*Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();*/
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
				/*Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
				/*Toast.makeText(
						getApplicationContext(),
						listDataHeader.get(groupPosition)
								+ " : "
								+ listDataChild.get(
										listDataHeader.get(groupPosition)).get(
										childPosition), Toast.LENGTH_SHORT)
						.show();*/
			/*	if (groupPosition == 0 && childPosition == 0) {
					Intent intent = new Intent(
							Oral_Drugs_2_60_At.this,
							com.chai.imci.treatchild.Teach_Mother_Oral_Drugs.class);
					startActivity(intent);

				}
*/
			/*	if (groupPosition == 1 && childPosition == 0) {
					Intent intent = new Intent(
							Oral_Drugs_2_60_At.this,
							com.chai.imci.treatchild.Teach_Mother_Local_Infections.class);
					startActivity(intent);

				}*/
				/*if (groupPosition == 2 && childPosition == 0) {
					Intent intent = new Intent(
							Oral_Drugs_2_60_At.this,
							com.chai.imci.treatchild.Treatment_Health_Facility.class);
					startActivity(intent);

				}*/
				/*if (groupPosition == 3 && childPosition == 0) {
					Intent intent = new Intent(
							Oral_Drugs_2_60_At.this,
							com.chai.imci.treatchild.Plan_A_Treat_Diarrhoea.class);
					startActivity(intent);

				}*/
			/*	if (groupPosition == 3 && childPosition == 1) {
					Intent intent = new Intent(
							Oral_Drugs_2_60_At.this,
							com.chai.imci.treatchild.Plan_B_Treat_Diarrhoea.class);
					startActivity(intent);

				}*/
				/*if (groupPosition == 3 && childPosition == 2) {
					Intent intent = new Intent(
							Oral_Drugs_2_60_At.this,
							com.chai.imci.treatchild.Plan_C_Treat_Diarrhoea.class);
					startActivity(intent);

				}*/
				/*if (groupPosition == 4 && childPosition == 0) {
					Intent intent = new Intent(Oral_Drugs_2_60_At.this,
							Rehydration_Severe_Malnutrition.class);
					startActivity(intent);

				}*/
				/*if (groupPosition == 5 && childPosition == 0) {
					Intent intent = new Intent(Oral_Drugs_2_60_At.this,
							Supplement_multivitamin.class);
					startActivity(intent);

				}*/

                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        String instruction;
        instruction = "Click here and follow instructions given";
        checkGeneral = getResources().getString(
                R.string.ask_mother_young_infant);
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Teach mother to give oral drugs at home");
        listDataHeader.add("Treat the mother to treat local infections at home");
        listDataHeader.add("Give these treatment in health facility only");
        listDataHeader.add("Rehydration therapy & feeding for diarrhoea");
        listDataHeader.add("Rehydration therapy for diarrhoea for children with severe malnutrition");
        listDataHeader.add("Give multivitamin/ mineral supplement for persistent diarrhoea");
        // Adding child data
        List<String> oralDrugs = new ArrayList<String>();
        oralDrugs.add(instruction);

        List<String> localInfections = new ArrayList<String>();
        localInfections.add(instruction);

        List<String> healthFacility = new ArrayList<String>();
        healthFacility.add(instruction);

        List<String> rehydrationTherapy = new ArrayList<String>();
        rehydrationTherapy.add("Plan A");
        rehydrationTherapy.add("Plan B");
        rehydrationTherapy.add("Plan C");

        List<String> malnutrition = new ArrayList<String>();
        malnutrition.add(instruction);

        List<String> supp = new ArrayList<String>();
        supp.add(instruction);

        listDataChild.put(listDataHeader.get(0), oralDrugs); // Header, Child
        listDataChild.put(listDataHeader.get(1), localInfections);
        listDataChild.put(listDataHeader.get(2), healthFacility);
        listDataChild.put(listDataHeader.get(3), rehydrationTherapy);
        listDataChild.put(listDataHeader.get(4), malnutrition);
        listDataChild.put(listDataHeader.get(5), supp);

        // data
    }
}
