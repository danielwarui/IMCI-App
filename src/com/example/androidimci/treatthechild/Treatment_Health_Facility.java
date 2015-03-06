package com.example.androidimci.treatthechild;

import com.chai.imciapplication.R;  
import com.example.androidimci.treatthechild.healthfacility.Convulsing_Now;
import com.example.androidimci.treatthechild.healthfacility.Intramuscular_Antibiotic;
import com.example.androidimci.treatthechild.healthfacility.Low_Blood_Sugar;
import com.example.androidimci.treatthechild.healthfacility.Treat_Wheezing;
import com.example.androidimci.treatthechild.healthfacility.Treatment_Severe_Malaria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Treatment_Health_Facility extends Activity{
	private ListView vlist;
	EditText ara;
	String[] fiilliste;
	Intent intent;

	// String [] fiilliste=
	// getResources().getStringArray(R.array.fragment_array_treatment);
	ArrayAdapter<String> adapter;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.treatment_healthy_facility);
	fiilliste = getResources().getStringArray(R.array.health_facility_only);

	vlist = (ListView) findViewById(R.id.list1);
	adapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_single_choice, fiilliste);

	vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	vlist.setAdapter(adapter);
	vlist.setItemsCanFocus(true);
	// vlist.setTextFilterEnabled(true);
	vlist.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1,
				int position, long arg3) {
			// TODO Auto-generated method stub
			switch (position) {
			case 0:
				Intent intent = new Intent(getApplication(),
						Intramuscular_Antibiotic.class);
				startActivity(intent);
				break;
			case 1:
				intent = new Intent(getApplication(),
						Convulsing_Now.class);
				startActivity(intent);
				break;
			case 2:
				intent = new Intent(getApplication(),
						Treatment_Severe_Malaria.class);
				startActivity(intent);
				break;
			case 3:
				intent = new Intent(getApplication(),
						Treat_Wheezing.class);
				startActivity(intent);
				break;
			case 4:
				intent = new Intent(getApplication(),
						Low_Blood_Sugar.class);
				startActivity(intent);
				break;
			
			}
		}

	});
	
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
}
}

