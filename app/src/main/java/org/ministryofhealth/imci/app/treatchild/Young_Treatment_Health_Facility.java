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
import org.ministryofhealth.imci.app.treatchild.healthfacility.Young_Intramuscular_Antibiotic;

public class Young_Treatment_Health_Facility extends Activity{
	EditText ara;
	String[] fiilliste;
	Intent intent;
	// String [] fiilliste=
	// getResources().getStringArray(R.array.fragment_array_treatment);
	ArrayAdapter<String> adapter;
	private ListView vlist;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getActionBar().setHomeButtonEnabled(true);
	getActionBar().setDisplayHomeAsUpEnabled(true);
	getActionBar().setTitle("Treatments in health facility");
	setContentView(R.layout.treatment_healthy_facility);
	fiilliste = getResources().getStringArray(R.array.young_health_facility_only);

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
			switch (position) {
			case 0:
				Intent intent = new Intent(getApplicationContext(),Young_Intramuscular_Antibiotic.class);
				startActivity(intent);
				break;
			case 1:
				intent = new Intent(getApplicationContext(), Young_Low_Blood_Sugar.class);
				startActivity(intent);
				break;
			
			
			}
		}

	});
	
} @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.homePage:
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
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

