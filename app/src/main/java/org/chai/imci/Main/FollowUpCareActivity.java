package org.chai.imci.Main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.chai.imci.R;
import org.chai.imci.treatments.Treatments_List;
import org.chai.imci.treatments.Treatments_List_Young;

public class FollowUpCareActivity extends Activity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_up);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        Button btnTwo = (Button) findViewById(R.id.two_months);
        Button btnSixty = (Button) findViewById(R.id.sixty_months);

        btnSixty.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(
                        FollowUpCareActivity.this, Treatments_List.class);
                startActivity(intent);

            }
        });
        btnTwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(
                        FollowUpCareActivity.this, Treatments_List_Young.class);
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
        /*
         * switch (item.getItemId()) { // Respond to the action bar's Up/Home
		 * button case android.R.id.home: NavUtils.navigateUpFromSameTask(this);
		 * return true; } return super.onOptionsItemSelected(item);
		 */
    }

}
