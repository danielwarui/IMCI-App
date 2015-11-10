package org.ministryofhealth.imci.app.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.counsel_mother.CareForDevelopmentUniversal;

public class Plan_B_Treat_Diarrhoea extends Activity implements View.OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setTitle("Rehydration Therapy");
		getActionBar().setSubtitle("Plan B");
		setContentView(R.layout.plan_b_treat);
		findViewById(R.id.btn_ors).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.btn_ors:
				Intent intent = new Intent(Plan_B_Treat_Diarrhoea.this , CareForDevelopmentUniversal.class);
				intent.putExtra("CareForDevelopmentAndNvp", 12);
				startActivity(intent);
				break;
		}
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
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("----main activity---onStart---");
		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
	}
}
