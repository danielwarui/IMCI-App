package org.ministryofhealth.imci.assessment.treatchild.local_infections;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import org.ministryofhealth.imci.R;


public class Young_Local_Infection_Instruct extends Activity{
	int id = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getActionBar().setHomeButtonEnabled(true);
	getActionBar().setDisplayHomeAsUpEnabled(true);
	
	setRowIdFromIntent();
	setContentView(R.layout.young_local_infection_instruct);
	TextView instruct = (TextView) findViewById(R.id.young_local_infection_instruct);
	
	
	
	
	if (id == 0) {
		getActionBar().setTitle("Treat skin pustules or umbilical infection");
		int skinPustules = R.string.to_treat_skin_pustules;

		instruct.setText(skinPustules);
	} else if (id == 1) {
		getActionBar().setTitle("Treat thrush");

		int skinPustules = R.string.to_treat_thrush;
//		int data4 = R.string.hotel1_cont;

		instruct.setText(skinPustules);
//		contacts.setText(data4);
		// Toast.makeText(getApplicationContext(), data,
		// Toast.LENGTH_LONG).show();
	}
	else if (id == 2) {
		getActionBar().setTitle("Treat eye infection with tetracycline eye ointment");

		int skinPustules = R.string.treat_eye_infection_with_tetracycline;
//		int data4 = R.string.hotel1_cont;

		instruct.setText(skinPustules);
//		contacts.setText(data4);
		// Toast.makeText(getApplicationContext(), data,
		// Toast.LENGTH_LONG).show();
	}
	
	
}
private void setRowIdFromIntent() {
	Bundle extras = getIntent().getExtras();
	id = extras != null ? extras.getInt("Position") : null;
}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		onBackPressed();
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
