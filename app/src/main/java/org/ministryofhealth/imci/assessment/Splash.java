package org.ministryofhealth.imci.assessment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import org.ministryofhealth.imci.R;

public class Splash extends Activity {
	private int displayTime = 2700;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		Thread splashThread = new Thread() {
			int wait = 0;

			@Override
			public void run() {
				try {
					super.run();

					while (wait < displayTime) {
						sleep(100);
						wait += 100;
					}
				} catch (Exception e) {
				}

				finally {
					Intent intent = new Intent(Splash.this, First_Main.class);
					startActivity(intent);
					finish();

				}

			}
		};
		splashThread.start();
	}
}
