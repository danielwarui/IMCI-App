package org.chai.imci.counselmother;

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

import org.chai.imci.FollowUpCareActivity;
import org.chai.imci.R;
import org.chai.imci.assessment.Starter_0_2_Diarrhoea;
import org.chai.imci.assessment.Starter_0_2_EyeInfection;
import org.chai.imci.assessment.Starter_0_2_FeedingProblem;
import org.chai.imci.assessment.Starter_0_2_HIVExposure;
import org.chai.imci.assessment.Starter_0_2_Jaundice;
import org.chai.imci.assessment.Starter_0_2_Severe_Disease;
import org.chai.imci.assessment.adapter.AdapterExpandable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CounselMotherMain extends Activity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    Fragment fragment;
    String checkGeneral;
    String checkGeneralContinue;
    String clickhere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        setContentView(R.layout.what_to_check);
        System.out.println("----Secondactivity activity---onCreates---");
        // Create custom dialog object


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new AdapterExpandable(this, listDataHeader, listDataChild);

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
                if (groupPosition == 0 && childPosition == 1) {
                    Intent intent = new Intent(CounselMotherMain.this, FollowUpCareActivity.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 0) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_Severe_Disease.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 1) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_Jaundice.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 2) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_EyeInfection.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 3) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_Diarrhoea.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 4) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_HIVExposure.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 5) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_FeedingProblem.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 6) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_FeedingProblem.class);
                    startActivity(intent);

                }


                /*Underway*/
                if (groupPosition == 1 && childPosition == 7) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_FeedingProblem.class);
                    startActivity(intent);

                }
                if (groupPosition == 1 && childPosition == 8) {
                    Intent intent = new Intent(CounselMotherMain.this, Starter_0_2_FeedingProblem.class);
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
        listDataHeader = new ArrayList();
        listDataChild = new HashMap();
        listDataHeader.add("Recommendations for feeding during sickness and health");
        listDataHeader.add("Recommendations for Care for Development");
        listDataHeader.add("Feeding Options:HIV Exposed and Infected");
        listDataHeader.add("Feeding Problems");
        listDataHeader.add("Counsel the Caregiver About Care for Development Problems");
        listDataHeader.add("Counsel the mother on fluids and when to return");
        listDataHeader.add("Counsel mother about her own health");
        ArrayList arraylist = new ArrayList();
        arraylist.add("Up to 6 months of age");
        arraylist.add("6 months up to 12 months");
        arraylist.add("12 months up to 2 years");
        arraylist.add("2 years and older");
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add("Age up to 4 months");
        arraylist1.add("Age 4 up to 6 months");
        arraylist1.add("6 months up to 12 months");
        arraylist1.add("12 months up to 2 years");
        arraylist1.add("2 years and older");
        ArrayList arraylist2 = new ArrayList();
        arraylist2.add("Follow for care for development problems");
        ArrayList arraylist3 = new ArrayList();
        arraylist3.add("Follow for counsel on feeding problems");
        ArrayList arraylist4 = new ArrayList();
        arraylist4.add("Counsel mother on infant feeding");
        arraylist4.add("Feeding advice for a child of a HIV positive mother who has chosen to breastfeed");
        arraylist4.add("Feeding advice for a child of a HIV positive mother who has chosen not to breastfeed or child who cannot be breastfed");
        ArrayList arraylist5 = new ArrayList();
        arraylist5.add("Follow for instructions on counselling the mother on fluids and when to return");
        ArrayList arraylist6 = new ArrayList();
        arraylist6.add("Follow for instructions on counselling the mother about her health");
        listDataChild.put((String) listDataHeader.get(0), arraylist);
        listDataChild.put((String) listDataHeader.get(1), arraylist1);
        listDataChild.put((String) listDataHeader.get(2), arraylist4);
        listDataChild.put((String) listDataHeader.get(3), arraylist3);
        listDataChild.put((String) listDataHeader.get(4), arraylist2);
        listDataChild.put((String) listDataHeader.get(5), arraylist5);
        listDataChild.put((String) listDataHeader.get(6), arraylist6);
    }
}
