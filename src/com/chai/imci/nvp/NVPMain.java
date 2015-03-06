package com.chai.imci.nvp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.chai.imciapplication.R;
import com.example.androidimci.counselmother.caredevelopment.CareForDevelopmentUniversal;
import com.example.androidimci.followupcare.starter.Starter_Follow_0_60;

public class NVPMain extends Activity {

	private ListView vlist;
	EditText ara;
	String[] fiilliste;
	Intent intent;

	// String [] fiilliste=
	// getResources().getStringArray(R.array.fragment_array_treatment);
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.treatments_list);
		fiilliste = getResources().getStringArray(R.array.nvp_items);

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
				position += 5;
				Intent i = new Intent(getApplication(), CareForDevelopmentUniversal.class);
				i.putExtra("CareForDevelopmentAndNvp", position);
				startActivity(i);
				
			}

		});
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		 System.out.println("----Fragmentactivity---onStart---");
		    overridePendingTransition(R.anim.anim_in, R.anim.anim_out);     
	}
		
	}

