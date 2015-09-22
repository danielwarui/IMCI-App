package org.ministryofhealth.imci.assessment.treatchild.healthfacility;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.counsel_mother.CareForDevelopmentUniversal;

public class Treatment_Severe_Malaria extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		setContentView(R.layout.treatment_severe_malaria);
		Button btn3 = (Button) findViewById(R.id.btn_art_dos_tbl);
		btn3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Treatment_Severe_Malaria.this, CareForDevelopmentUniversal.class);
				intent.putExtra("CareForDevelopmentAndNvp", 11);
			}
		});
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