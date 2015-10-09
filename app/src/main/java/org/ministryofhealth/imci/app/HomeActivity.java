package org.ministryofhealth.imci.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.assess_classify.AssessmentActivity;
import org.ministryofhealth.imci.app.counsel_mother.CounselMother_Main;
import org.ministryofhealth.imci.app.follow_up.FollowUpMain;
import org.ministryofhealth.imci.app.hiv_care_children.NVPMain;
import org.ministryofhealth.imci.app.treatchild.TreatTheChildActivity;

public class HomeActivity extends Activity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_home);

        // referencing the buttons
        findViewById(R.id.btnAssessments).setOnClickListener(this);
        findViewById(R.id.btnFollowUp).setOnClickListener(this);
        findViewById(R.id.btnNVP).setOnClickListener(this);
        findViewById(R.id.btnTreatTheChild).setOnClickListener(this);
        findViewById(R.id.btnCounselMother).setOnClickListener(this);

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
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAssessments:
                intent = new Intent(HomeActivity.this, AssessmentActivity.class);
                startActivity(intent);
                break;
            case R.id.btnFollowUp:
                intent = new Intent(HomeActivity.this, FollowUpMain.class);
                startActivity(intent);
                break;
            case R.id.btnNVP:
                intent = new Intent(HomeActivity.this, NVPMain.class);
                startActivity(intent);
                break;
            case R.id.btnTreatTheChild:
                intent = new Intent(HomeActivity.this, TreatTheChildActivity.class);
                startActivity(intent);
                break;
            case R.id.btnCounselMother:
                intent = new Intent(HomeActivity.this, CounselMother_Main.class);
                intent.putExtra("Expander", 0);
                startActivity(intent);
                break;

        }
    }
}
