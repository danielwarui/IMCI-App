package org.ministryofhealth.imci.assessment.treatchild.local_infections;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import org.ministryofhealth.imci.R;


public class LocalUnivers extends Activity {
    int id;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setRowIdFromIntent();
        switch (id) {
            case 0:
                getActionBar().setTitle("Treat eye infection with Tetracycline");
                setContentView(R.layout.trt_eye_infection);
                break;
            case 1:
                getActionBar().setTitle("Dry the ear by wicking");
                setContentView(R.layout.dry_the_ear_by_wicking);
                break;
            case 2:
                getActionBar().setTitle("Treat mouth ulcers with gentian violet");
                setContentView(R.layout.trt_mouth_ulcers);
                break;
            case 3:
                getActionBar().setTitle("Treat oral thrush");
                setContentView(R.layout.trt_oral_thrush);
                break;
            case 4:
                getActionBar().setTitle("Soothe the throat, relieve the cough with safe remedy");
                setContentView(R.layout.trt_soothe_throat);
                break;
        }

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

    private void setRowIdFromIntent() {
        Bundle extras = getIntent().getExtras();
        id = extras != null ? extras.getInt("LocalUnivers") : null;
    }

}