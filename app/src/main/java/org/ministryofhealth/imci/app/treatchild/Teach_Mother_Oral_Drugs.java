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
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.treatchild.oral_drugs.Oral_Antibiotic;

public class Teach_Mother_Oral_Drugs extends Activity{
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
	getActionBar().setTitle("Teach mother to give oral drugs at home");
	setContentView(R.layout.teach_mother_oral_drugs);
	fiilliste = getResources().getStringArray(R.array.trt_oral_drugs_at_home);

	vlist = (ListView) findViewById(R.id.list1);
	adapter = new ArrayAdapter<String>(this,R.layout.simple_list_check, fiilliste);

	vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
	vlist.setAdapter(adapter);
	vlist.setItemsCanFocus(true);
	vlist.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1,
				int position, long arg3) {
			Intent i = new Intent(getApplication(), Oral_Antibiotic.class);
			i.putExtra("Position", position);
			startActivity(i);

		}

	});
	

}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				onBackPressed();
			case R.id.homePage:
				Intent intent = new Intent(Teach_Mother_Oral_Drugs.this, HomeActivity.class);
				startActivity(intent);
				break;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("----main activity---onStart---");
		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
	}
}

