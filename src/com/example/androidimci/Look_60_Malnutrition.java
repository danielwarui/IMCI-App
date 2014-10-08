package com.example.androidimci;

import com.chai.imciapplication.R;
import com.example.signs.Main_Signs_Malnutrition;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Look_60_Malnutrition extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagnose_malnutrition);
	}
	public void  ProceedToMainSigns(View view)
	{
	Intent	intent=new Intent(Look_60_Malnutrition.this,Main_Signs_Malnutrition.class);
		startActivity(intent);
	}
	}
