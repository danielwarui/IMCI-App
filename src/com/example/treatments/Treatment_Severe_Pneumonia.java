package com.example.treatments;


import com.chai.imciapplication.R;

import android.app.Activity;
import android.os.Bundle;

public class Treatment_Severe_Pneumonia extends Activity {
	int id;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setRowIdFromIntent();
		switch(id){
		case 0:
	setContentView(R.layout.treatment_severe_pneumonia);
	break;
		case 1:
			setContentView(R.layout.treatment_pneumonia);
			break;

		case 2:
			setContentView(R.layout.treatment_no_pneumonia);
			break;


		case 3:
			break;


		case 4:
			break;


		case 5:
			break;


		case 6:
			break;

			
		}
	
	}
	private void setRowIdFromIntent() {
		Bundle extras = getIntent().getExtras();
		id = extras != null
				? extras.getInt("Position")
						: null;
	}
}
