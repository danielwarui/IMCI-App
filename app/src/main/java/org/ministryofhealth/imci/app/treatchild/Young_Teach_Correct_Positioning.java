package org.ministryofhealth.imci.app.treatchild;

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

public class Young_Teach_Correct_Positioning extends Activity{
	EditText ara;
	String[] fiilliste;
	Intent intent;
	ArrayAdapter<String> adapter;
	private ListView vlist;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getActionBar().setHomeButtonEnabled(true);
	getActionBar().setDisplayHomeAsUpEnabled(true);
	getActionBar().setTitle("Teach correct positioning and attachment, for breastfeed");
	setContentView(R.layout.young_teach_correct_positioning);
	fiilliste = getResources().getStringArray(R.array.young_teach_correct_positioning);

	vlist = (ListView) findViewById(R.id.list_correct_positioning);
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
				super.getClass();
			Intent intent = new Intent(getApplication(), Young_Teach_Correct_Positioning_Instruct.class);
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

