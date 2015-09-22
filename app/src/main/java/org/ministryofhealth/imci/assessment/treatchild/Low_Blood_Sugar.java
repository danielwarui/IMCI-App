package org.ministryofhealth.imci.assessment.treatchild;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import org.ministryofhealth.imci.R;

public class Low_Blood_Sugar extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Treat for low blood sugar");
        setContentView(R.layout.low_blood_sugar);
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