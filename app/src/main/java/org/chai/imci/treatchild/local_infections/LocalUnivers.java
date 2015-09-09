package org.chai.imci.treatchild.local_infections;

import android.app.Activity;
import android.os.Bundle;

import org.chai.imci.R;


public class LocalUnivers extends Activity {
	int id;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRowIdFromIntent();
		switch (id) {
		case 0:
			setContentView(R.layout.trt_eye_infection);
			break;
		case 1:
			setContentView(R.layout.dry_the_ear_by_wicking);
			break;
		case 2:
			setContentView(R.layout.trt_mouth_ulcers);
			break;
		case 3:
			setContentView(R.layout.trt_oral_thrush);
			break;
		case 4:
			setContentView(R.layout.trt_soothe_throat);
			break;
		}

	}

	private void setRowIdFromIntent() {
		Bundle extras = getIntent().getExtras();
		id = extras != null ? extras.getInt("LocalUnivers") : null;
	}

}