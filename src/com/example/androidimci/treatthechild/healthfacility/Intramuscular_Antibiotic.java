package com.example.androidimci.treatthechild.healthfacility;

import com.chai.imciapplication.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Intramuscular_Antibiotic extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intramuscular_antibiotic);
		
		Button btnChloTable = (Button) findViewById(R.id.btnChloTable);
		btnChloTable.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
			Intent	intent = new Intent(Intramuscular_Antibiotic.this,
					com.example.androidimci.treatthechild.healthfacility.Chloramphenicol_Table.class);
				startActivity(intent);
			}
		});
	}

}