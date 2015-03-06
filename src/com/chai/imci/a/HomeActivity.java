package com.chai.imci.a;

import android.app.Activity; 
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.chai.imciapplication.R;

public class HomeActivity extends Activity {
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		// referencing the buttons
		Button btnAssess = (Button) findViewById(R.id.btnAssessments);
		Button btnFollow = (Button) findViewById(R.id.btnFollowUp);
		Button btnNVP = (Button) findViewById(R.id.btnNVP);
		Button btnTreat = (Button) findViewById(R.id.btnTreatTheChild);
		Button btnCounsel = (Button) findViewById(R.id.btnCounselMother);
		

		btnAssess.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intent = new Intent(HomeActivity.this,
						com.chai.imci.Assessment.AssessmentActivity.class);
				startActivity(intent);
			}
		});
		btnFollow.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intent = new Intent(HomeActivity.this,
						com.chai.imci.a.FollowUpCareActivity.class);
				startActivity(intent);

			}
		});
		btnNVP.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intent = new Intent(HomeActivity.this,
						com.chai.imci.nvp.NVPMain.class);
				startActivity(intent);

			}
		});
	/*	btnPaeds.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intent = new Intent(HomeActivity.this,
						com.chai.imci.a.PaedsActivity.class);
				startActivity(intent);

			}
		});*/
		btnTreat.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intent = new Intent(HomeActivity.this,
						com.chai.imci.a.TreatTheChildActivity.class);
				startActivity(intent);

			}
		});
		
		btnCounsel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				intent = new Intent(HomeActivity.this,
						com.chai.imci.a.CounselMother.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("----Fragmentactivity---onStart---");
		overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
	}
}
