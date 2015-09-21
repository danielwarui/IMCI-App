package org.ministryofhealth.imci.assessment.counsel_mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import org.ministryofhealth.imci.R;

/**
 * Created by InclusionOne on 9/5/2015.
 */
public class Counsel_Mother_Fluids extends Activity implements View.OnClickListener {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("Counsel the mother");
        getActionBar().setSubtitle("Counsel the mother on fluids and when to return");
        setContentView(R.layout.fluids_counsel_mother);
        findViewById(R.id.followUp).setOnClickListener(this);
        findViewById(R.id.whenToRet).setOnClickListener(this);
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

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.followUp:
                intent = new Intent(Counsel_Mother_Fluids.this , CareForDevelopmentUniversal.class);
                intent.putExtra("CareForDevelopmentAndNvp", 13);
                startActivity(intent);
                break;
            case R.id.whenToRet:
                intent = new Intent(Counsel_Mother_Fluids.this , CareForDevelopmentUniversal.class);
                intent.putExtra("CareForDevelopmentAndNvp", 14);
                startActivity(intent);
                break;
        }
    }
}
