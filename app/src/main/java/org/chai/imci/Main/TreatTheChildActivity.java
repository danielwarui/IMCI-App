package org.chai.imci.Main;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.chai.imci.R;
import org.chai.imci.treatchild.Oral_Drugs_0_2_At;
import org.chai.imci.treatchild.Oral_Drugs_2_60_At;

public class TreatTheChildActivity extends Activity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatthechild);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        Button btnTwo = (Button) findViewById(R.id.two_months);
        Button btnSixty = (Button) findViewById(R.id.sixty_months);

        btnTwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(TreatTheChildActivity.this, Oral_Drugs_0_2_At.class);
                startActivity(intent);

            }
        });
        btnSixty.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(TreatTheChildActivity.this, Oral_Drugs_2_60_At.class);
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

