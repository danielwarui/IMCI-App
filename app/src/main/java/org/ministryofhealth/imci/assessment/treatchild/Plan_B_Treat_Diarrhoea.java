package org.ministryofhealth.imci.assessment.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.counsel_mother.CareForDevelopmentUniversal;

public class Plan_B_Treat_Diarrhoea extends Activity implements View.OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setTitle("Rehydration Therapy");
		getActionBar().setSubtitle("Plan B");
		setContentView(R.layout.plan_b_treat);
		findViewById(R.id.btn_ors).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.btn_ors:
				Intent intent = new Intent(Plan_B_Treat_Diarrhoea.this , CareForDevelopmentUniversal.class);
				intent.putExtra("CareForDevelopmentAndNvp", 12);
				startActivity(intent);
				break;
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
}
