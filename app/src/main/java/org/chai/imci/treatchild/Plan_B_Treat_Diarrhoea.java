package org.chai.imci.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.chai.imci.R;
import org.chai.imci.counsel_mother.CareForDevelopmentUniversal;

public class Plan_B_Treat_Diarrhoea extends Activity implements View.OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
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
}
