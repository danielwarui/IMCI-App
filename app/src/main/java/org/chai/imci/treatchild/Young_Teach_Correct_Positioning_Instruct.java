package org.chai.imci.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.chai.imci.R;

public class Young_Teach_Correct_Positioning_Instruct extends Activity {
    Intent intent;
    int id;

    // String [] fiilliste=
    // getResources().getStringArray(R.array.fragment_array_treatment);
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setRowIdFromIntent();
        setContentView(R.layout.young_teach_correct_positioning_instruct);
        TextView instruct = (TextView) findViewById(R.id.young_teach_correct_positioning_instruct);


        if (id == 0) {
            int skinPustules = R.string.teach_correct_positioning_and_attachment;

            instruct.setText(skinPustules);
        } else if (id == 1) {
            int skinPustules = R.string.teach_mother_to_treat_breast_or_nipple;
//		int data4 = R.string.hotel1_cont;

            instruct.setText(skinPustules);
//		contacts.setText(data4);
            // Toast.makeText(getApplicationContext(), data,
            // Toast.LENGTH_LONG).show();
        } else if (id == 2) {
            int skinPustules = R.string.teach_mother_how_to_keep_young_infant_warm_with_low_weight;
//		int data4 = R.string.hotel1_cont;

            instruct.setText(skinPustules);
//		contacts.setText(data4);
            // Toast.makeText(getApplicationContext(), data,
            // Toast.LENGTH_LONG).show();
        }

    }

    private void setRowIdFromIntent() {
        Bundle extras = getIntent().getExtras();
        id = extras != null ? extras.getInt("Position") : null;
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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

