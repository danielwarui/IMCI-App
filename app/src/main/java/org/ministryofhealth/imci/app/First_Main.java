package org.ministryofhealth.imci.app;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.ministryofhealth.imci.R;

public class First_Main extends Activity {
	Intent intent;
	RadioGroup rg;
	Button btn2;
	TextView textLink;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		 btn2 = (Button) findViewById(R.id.btnProceed);

	}
	public void NextActivity(View view)
	{
		switch (view.getId()){
    case R.id.btnProceed :
    	intent=new Intent(First_Main.this,HomeActivity.class);
		startActivity(intent);
		}
	}
	  @Override
	    protected void onStart() {
	        // TODO Auto-generated method stub
	        super.onStart();
	        System.out.println("----main activity---onStart---");
	    overridePendingTransition(R.anim.anim_in, R.anim.anim_out);     
	  }

}
