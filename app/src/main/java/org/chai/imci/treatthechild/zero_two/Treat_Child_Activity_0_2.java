package org.chai.imci.treatthechild.zero_two;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import org.chai.imci.R;

public class Treat_Child_Activity_0_2 extends Activity {
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        setRowIdFromIntent();
        if (id == 1) {
            Log.i("Rescucitate", "1");
            setContentView(R.layout.resuscitate_young_infant);
        } else if (id == 2) {
            Log.i("Keep Warm", "2");
            setContentView(R.layout.keep_young_infant_warm);
        }
    }

    private void setRowIdFromIntent() {
        Bundle extras = getIntent().getExtras();
        id = extras != null
                ? extras.getInt("position")
                : null;
    }
}
