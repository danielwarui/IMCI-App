package com.example.androidimci.treatthechild;

import com.chai.imciapplication.R;  
import com.example.androidimci.treatthechild.healthfacility.Convulsing_Now;
import com.example.androidimci.treatthechild.healthfacility.Intramuscular_Antibiotic;
import com.example.androidimci.treatthechild.healthfacility.Low_Blood_Sugar;
import com.example.androidimci.treatthechild.healthfacility.Treat_Wheezing;
import com.example.androidimci.treatthechild.healthfacility.Treatment_Severe_Malaria;
import com.example.androidimci.treatthechild.healthfacility.Young_Intramuscular_Antibiotic;
import com.example.androidimci.treatthechild.local_infections.Young_Local_Infection_Instruct;

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

public class Young_Teach_Correct_Positioning extends Activity{
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
	setContentView(R.layout.young_teach_correct_positioning);
	fiilliste = getResources().getStringArray(R.array.young_teach_correct_positioning);

	vlist = (ListView) findViewById(R.id.list_correct_positioning);
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
				super.getClass();
				Intent intent = new Intent(getApplication(),
						Young_Teach_Correct_Positioning_Instruct.class);
				intent.putExtra("Position", position);
				startActivity(intent);
			
			
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

