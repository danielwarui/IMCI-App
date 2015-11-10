package org.ministryofhealth.imci.app.counsel_mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;

/**
 * Created by InclusionOne on 9/5/2015.
 */
public class Counsel_Mother_Fluids extends Activity implements View.OnClickListener {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
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
