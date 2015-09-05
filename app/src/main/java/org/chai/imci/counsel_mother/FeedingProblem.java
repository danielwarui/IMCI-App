package org.chai.imci.counsel_mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import org.chai.imci.R;
import org.chai.imci.assessment.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by InclusionOne on 9/3/2015.
 */
public class FeedingProblem extends Activity {
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
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader,
                listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

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
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Expanded",
						Toast.LENGTH_SHORT).show();*/
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
				/*Toast.makeText(getApplicationContext(),
						listDataHeader.get(groupPosition) + " Collapsed",
						Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                if (groupPosition == 0 && childPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(), AgeSixMonths.class);
                    startActivity(intent);
                }
                if (groupPosition == 0 && childPosition == 1) {
                    Intent intent = new Intent(getApplicationContext(), AgeSixMonthstoTwelveMonths.class);
                    startActivity(intent);
                }
                if (groupPosition == 0 && childPosition == 2) {
                    Intent intent = new Intent(getApplicationContext(), AgeTwelveMonthstoTwoYears.class);
                    startActivity(intent);
                }
                if (groupPosition == 0 && childPosition == 3) {
                    Intent intent = new Intent(getApplicationContext(), AgeTwoYearsandOlder.class);
                    startActivity(intent);
                }
                if (groupPosition == 1) {
                    Intent intent = new Intent(getApplicationContext(), CareForDevelopmentUniversal.class);
                    intent.putExtra("CareForDevelopmentAndNvp", childPosition);
                    startActivity(intent);
                }

              /*  if(groupPosition == 2 && childPosition == 0){
                    Intent intent = new Intent(getApplicationContext(),Counsel_Mother_Infant_Feeding.class);
                    startActivity(intent);
                }
                if(groupPosition == 2 && childPosition == 1){
                    Intent intent = new Intent(getApplicationContext(),FeedingAdviceHIV.class);
                    intent.putExtra("CareForDevelopmentAndNvp", childPosition);
                    startActivity(intent);
                }
                if(groupPosition == 2 && childPosition == 2){
                    Intent intent = new Intent(getApplicationContext(),FeedingAdviceHIV.class);
                    intent.putExtra("CareForDevelopmentAndNvp", childPosition);
                    startActivity(intent);
                }*/

                if (groupPosition == 3 && childPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(), FeedingProblem.class);
                    startActivity(intent);
                }
                if (groupPosition == 4 && childPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(), CounselCareForDevelopment.class);
                    startActivity(intent);
                }
                if (groupPosition == 5 && childPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(), CounselMotherFluids.class);
                    startActivity(intent);
                }
                if (groupPosition == 6 && childPosition == 0) {
                    Intent intent = new Intent(getApplicationContext(), CounselMotherHerOwnHealth.class);
                    startActivity(intent);
                }
                /**
                 *
                 if (i == 3 && j == 0)
                 {
                 expandablelistview = new Intent(getApplicationContext(), com/example/androidimci/counselmother/Feeding_Problem);
                 startActivity(expandablelistview);
                 }
                 if (i == 4 && j == 0)
                 {
                 expandablelistview = new Intent(getApplicationContext(), com/example/androidimci/counselmother/Counsel_CareforDevelopment_Problems);
                 startActivity(expandablelistview);
                 }
                 if (i == 5 && j == 0)
                 {
                 expandablelistview = new Intent(getApplicationContext(), com/example/androidimci/counselmother/Counsel_Mother_Fluids);
                 startActivity(expandablelistview);
                 }
                 if (i == 6 && j == 0)
                 {
                 expandablelistview = new Intent(getApplicationContext(), com/example/androidimci/counselmother/Counsel_Mother_Her_Own_Health);
                 startActivity(expandablelistview);
                 }
                 */

                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        String lessMilk = getResources().getString(R.string.child_less_than_other_milk);
        String otherMilk = getResources().getString(R.string.milk_needs);
        String usingBottle = getResources().getString(R.string.using_bottle);
        String beingFed = getResources().getString(R.string.not_being_actively_fed);
        String blockedNose = getResources().getString(R.string.not_feeding_well);
        String lessHIV = getResources().getString(R.string.mixed_feeding);

        listDataHeader = new ArrayList();
        listDataChild = new HashMap();
        //0
        listDataHeader.add("If the mother reports difficulty with breastfeeding, assess breastfeeding as needed,show the mother correct positioning and attachment for breastfeeding.");
        //1
        listDataHeader.add("If the child is less than 6 months old and is taking other milk or foods:");
        //2
        listDataHeader.add("If other milk needs to be continued,counsel the mother to:");
        //3
        listDataHeader.add("If the mother is using a bottle to feed the child:");
        //4
        listDataHeader.add("If the child is not being fed actively, counsel the mother to:");
        //5
        listDataHeader.add("If the child is not feeding well during illness, counsel the mother to:");
        //6
        listDataHeader.add("If mixed feeding in the child less than 6 months whose mother is HIV positive:");
        //7
        listDataHeader.add("Follow-up any feeding problem in 5 days.");

        List<String> array0 = new ArrayList<String>();
        array0.add("");

        List<String> array1 = new ArrayList<String>();
        array1.add(lessMilk);

        List<String> array2 = new ArrayList<String>();
        array2.add(otherMilk);

        List<String> array3 = new ArrayList<String>();
        array3.add(usingBottle);

        List<String> array4 = new ArrayList<String>();
        array4.add(beingFed);

        List<String> array5 = new ArrayList<String>();
        array5.add(blockedNose);

        List<String> array6 = new ArrayList<String>();
        array6.add(lessHIV);

        List<String> array7 = new ArrayList<String>();
        array7.add("");

        listDataChild.put((String) listDataHeader.get(0), array0);
        listDataChild.put((String) listDataHeader.get(1), array1);
        listDataChild.put((String) listDataHeader.get(2), array2);
        listDataChild.put((String) listDataHeader.get(3), array3);
        listDataChild.put((String) listDataHeader.get(4), array4);
        listDataChild.put((String) listDataHeader.get(5), array5);
        listDataChild.put((String) listDataHeader.get(6), array6);
        listDataChild.put((String) listDataHeader.get(7), array7);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
	   /* switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	        NavUtils.navigateUpFromSameTask(this);
	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	*/
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
