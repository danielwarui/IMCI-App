package org.ministryofhealth.imci.assessment.treatchild.local_infections;

import org.ministryofhealth.imci.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Young_Local_Infection_Instruct extends Activity{
	int id = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	
	setRowIdFromIntent();
	setContentView(R.layout.young_local_infection_instruct);
	TextView instruct = (TextView) findViewById(R.id.young_local_infection_instruct);
	
	
	
	
	if (id == 0) {
		int skinPustules = R.string.to_treat_skin_pustules;

		instruct.setText(skinPustules);
	} else if (id == 1) {
		int skinPustules = R.string.to_treat_thrush;
//		int data4 = R.string.hotel1_cont;

		instruct.setText(skinPustules);
//		contacts.setText(data4);
		// Toast.makeText(getApplicationContext(), data,
		// Toast.LENGTH_LONG).show();
	}
	else if (id == 2) {
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
protected void onStart() {
    // TODO Auto-generated method stub
    super.onStart();
    System.out.println("----main activity---onStart---");
overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);     
}
}
