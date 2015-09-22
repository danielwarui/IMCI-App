package org.ministryofhealth.imci.assessment.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.ministryofhealth.imci.R;

public class Young_Teach_Correct_Positioning_Instruct extends Activity{
	Intent intent;
	int id;

	ArrayAdapter<String> adapter;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getActionBar().setHomeButtonEnabled(true);
	getActionBar().setDisplayHomeAsUpEnabled(true);
	setRowIdFromIntent();
	setContentView(R.layout.young_teach_correct_positioning_instruct);
	TextView instruct = (TextView) findViewById(R.id.young_teach_correct_positioning_instruct);
	
	
	
	
	if (id == 0) {
		getActionBar().setTitle("Teach correct positioning and attachment for breastfeeding");
		int skinPustules = R.string.teach_correct_positioning_and_attachment;

		instruct.setText(skinPustules);
	} else if (id == 1) {
		getActionBar().setTitle("Teach mother to treat breast or nipple problems");
		int skinPustules = R.string.teach_mother_to_treat_breast_or_nipple;

		instruct.setText(skinPustules);
	}
	else if (id == 2) {
		getActionBar().setTitle("HIV positive mother who has chosen not to breastfeed");
		int skinPustules = R.string.feeding_advice_hiv_mother_chose_not_breastfeed;

		instruct.setText(skinPustules);
	} else if (id == 3) {
		getActionBar().setTitle("Teach mother how to keep young infant with low weight");
		int skinPustules = R.string.teach_mother_how_to_keep_young_infant_warm_with_low_weight;

		instruct.setText(skinPustules);
	}
}
private void setRowIdFromIntent() {
	Bundle extras = getIntent().getExtras();
	id = extras != null ? extras.getInt("Position") : null;
}
@Override
protected void onStart() {
    // TODO Auto-generated method stub
    super.onStart();
    System.out.println("----main activity---onStart---");
overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);     
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
}

