package org.chai.imci.follow_up;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import org.chai.imci.R;
import org.chai.imci.follow_up.starter.Follow_UpMainTwo;
import org.chai.imci.follow_up.starter.Infant_Follow_UpMain;

public class FollowUpMain extends Activity implements View.OnClickListener {
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_follow_up);
		findViewById(R.id.two_months).setOnClickListener(this);
		findViewById(R.id.sixty_months).setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
switch (v.getId()){
	case R.id.two_months:
		intent = new Intent(FollowUpMain.this,
			Infant_Follow_UpMain.class);
		startActivity(intent);
		break;
	case R.id.sixty_months:
		intent = new Intent(FollowUpMain.this,
				Follow_UpMainTwo.class);
		startActivity(intent);
		break;
}
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
