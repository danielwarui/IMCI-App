package org.ministryofhealth.imci.app.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;

public class Activity_immunization_table extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	getActionBar().setHomeButtonEnabled(true);
	getActionBar().setDisplayHomeAsUpEnabled(true);
	getActionBar().setTitle("Immunization table");
	setContentView(R.layout.immunization_table);
}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("----main activity---onStart---");
		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
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
                return true;
            case R.id.homePage:
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
