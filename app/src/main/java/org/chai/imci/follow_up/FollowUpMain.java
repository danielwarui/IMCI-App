package org.chai.imci.follow_up;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import org.chai.imci.R;

public class FollowUpMain extends Activity implements View.OnClickListener {
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

		break;
	case R.id.sixty_months:

		break;
}
	}
}
