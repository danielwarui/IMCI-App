package org.ministryofhealth.imci.assessment.treatchild;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import org.ministryofhealth.imci.R;

public class Treat_Child_Activity_0_2 extends Activity{
	int id;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getActionBar().setHomeButtonEnabled(true);
	getActionBar().setDisplayHomeAsUpEnabled(true);


	setRowIdFromIntent();
	if(id == 1){
		Log.i("Rescucitate", "1");
		getActionBar().setTitle("Resuscitate the young infant");
	setContentView(R.layout.resuscitate_young_infant);
	}
	else if(id == 2){
		Log.i("Keep Warm", "2");
		getActionBar().setTitle("Keep the young infant warm");
		setContentView(R.layout.keep_young_infant_warm);
	}
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
	private void setRowIdFromIntent() {
	Bundle extras = getIntent().getExtras();
	 id = extras != null
			? extras.getInt("position")
					: null;
}
}
