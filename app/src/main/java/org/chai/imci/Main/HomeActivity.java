package org.chai.imci.Main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.chai.imci.AssessmentActivity;
import org.chai.imci.R;
import org.chai.imci.nvp.NVPMain;

public class HomeActivity extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);


        // referencing the buttons
        Button btnAssess = (Button) findViewById(R.id.btnAssessments);
        Button btnFollow = (Button) findViewById(R.id.btnFollowUp);
        Button btnNVP = (Button) findViewById(R.id.btnNVP);
        Button btnTreat = (Button) findViewById(R.id.btnTreatTheChild);
        Button btnCounsel = (Button) findViewById(R.id.btnCounselMother);


        btnAssess.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, AssessmentActivity.class);
                startActivity(intent);
            }
        });
        btnFollow.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, FollowUpCareActivity.class);
                startActivity(intent);

            }
        });
        btnNVP.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, NVPMain.class);
                startActivity(intent);

            }
        });
        btnTreat.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, TreatTheChildActivity.class);
                startActivity(intent);

            }
        });

        btnCounsel.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(HomeActivity.this, CounselMother.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
       /* switch (item.getItemId()) {
        // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	        NavUtils.navigateUpFromSameTask(this);
	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	*/
    }

}
