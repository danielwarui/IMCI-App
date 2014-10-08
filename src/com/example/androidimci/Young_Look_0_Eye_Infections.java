package com.example.androidimci;

import com.chai.imciapplication.R;
import com.example.signs.Main_Signs_Cough;
import com.example.signs.Main_Ysigns_EyeInfection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Young_Look_0_Eye_Infections extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.look_60_cough);
	}
	public void  ProceedToMainSigns(View view)
	{
	Intent	intent=new Intent(Young_Look_0_Eye_Infections.this,Main_Ysigns_EyeInfection.class);
		startActivity(intent);
	}
	}
