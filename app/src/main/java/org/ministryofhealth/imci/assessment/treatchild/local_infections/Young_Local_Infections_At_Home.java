package org.ministryofhealth.imci.assessment.treatchild.local_infections;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.AssessmentActivity;
import org.ministryofhealth.imci.assessment.counsel_mother.CounselMother;
import org.ministryofhealth.imci.assessment.treatchild.Plan_A_Treat_Diarrhoea;

public class Young_Local_Infections_At_Home extends Activity {
    EditText ara;
    String[] fiilliste;
    Intent intent;
    // String [] fiilliste=
    // getResources().getStringArray(R.array.fragment_array_treatment);
    ArrayAdapter<String> adapter;
    private ListView vlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Teach mother to treat local infections at home");
        setContentView(R.layout.young_oral_drugs_at_home);
        fiilliste = getResources().getStringArray(R.array.young_local_infections_at_home);

        vlist = (ListView) findViewById(R.id.list1_oral);
        adapter = new ArrayAdapter<String>(this, R.layout.simple_list_check, fiilliste);

        vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        vlist.setAdapter(adapter);
        vlist.setItemsCanFocus(true);
        // vlist.setTextFilterEnabled(true);
        vlist.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        intent = new Intent(getApplication(), Young_Local_Infection_Instruct.class);
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplication(), Young_Local_Infection_Instruct.class);
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplication(), Young_Local_Infection_Instruct.class);
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        break;
                    // Immunize Every Young infant
                    case 3:
                        intent = new Intent(getApplication(), AssessmentActivity.class);
                        startActivity(intent);
                        break;
                    // To Diarrhoea
                    case 4:

                        intent = new Intent(getApplication(), Plan_A_Treat_Diarrhoea.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplication(), CounselMother.class);
                        intent.putExtra("Expander", 1);
                        startActivity(intent);
                        break;

                }
            }
        });
/*
            @Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				if (position == 0 || position == 1 || position == 2){
				super.getClass();
					Intent intent = new Intent(getApplication(), Young_Local_Infection_Instruct.class);
				intent.putExtra("Position", position);
				startActivity(intent);
				}else{
					AlertDialog.Builder myDialog = new AlertDialog.Builder(Young_Local_Infections_At_Home.this);

					myDialog.setTitle("Treat local infections at home");
			            
			            TextView dialogTxt_id = new TextView(Young_Local_Infections_At_Home.this);
					LayoutParams dialogTxt_idLayoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
					dialogTxt_id.setLayoutParams(dialogTxt_idLayoutParams);
			            
			            LinearLayout layout = new LinearLayout(Young_Local_Infections_At_Home.this);
			            layout.setOrientation(LinearLayout.VERTICAL);
			            layout.addView(dialogTxt_id);
			            myDialog.setView(layout);

					myDialog.setPositiveButton("Immunize \n Infant \nas Needed", new DialogInterface.OnClickListener() {
						// do something when the button is clicked
			                public void onClick(DialogInterface arg0, int arg1) {
			                	Intent intent = new Intent(Young_Local_Infections_At_Home.this,Plan_B_Treat_Diarrhoea.class);
								startActivity(intent);
			                 }
			                });

					myDialog.setNeutralButton("Treat \n Diarrhoea", new DialogInterface.OnClickListener() {
						// do something when the button is clicked
			                public void onClick(DialogInterface arg0, int arg1) {
			                	Intent intent = new Intent(Young_Local_Infections_At_Home.this,Plan_A_Treat_Diarrhoea.class);
								startActivity(intent);
			                 }
			                });
			            
			            myDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			                // do something when the button is clicked
			                public void onClick(DialogInterface arg0, int arg1) {

			                 }
			                });
			            
			            myDialog.show();
				}
			}
		});*/

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----main activity---onStart---");
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
