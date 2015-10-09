package org.ministryofhealth.imci.app.follow_up.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.ministryofhealth.imci.R;


public class Activity_Follow_Up_2_60 extends Activity {

	EditText ara;
	String[] fiilliste;
	Intent intent;
	// String [] fiilliste=
	// getResources().getStringArray(R.array.fragment_array_treatment);
	ArrayAdapter<String> adapter;
	private ListView vlist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.treatments_list);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setSubtitle(getResources().getString(R.string.sixty_months));
		fiilliste = getResources().getStringArray(R.array.fragment_follow_up);

		vlist = (ListView) findViewById(R.id.list1);
		adapter = new ArrayAdapter<String>(this, R.layout.simple_list_check, fiilliste);

		vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		vlist.setAdapter(adapter);
		vlist.setItemsCanFocus(true);
		// vlist.setTextFilterEnabled(true);
		vlist.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplication(), Starter_Follow_0_60.class);
				i.putExtra("Treatment_Position", position);
				startActivity(i);
				
			}

		});
		

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		onBackPressed();
		return true;

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
