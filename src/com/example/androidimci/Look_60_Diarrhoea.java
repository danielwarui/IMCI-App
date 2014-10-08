package com.example.androidimci;

import com.chai.imciapplication.R;
import com.example.signs.Main_Signs_Diarrhoea;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Look_60_Diarrhoea extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.look_60_diarrhoea);
	}
	public void  ProceedToMainSigns(View view)
	{
	Intent	intent=new Intent(Look_60_Diarrhoea.this,Main_Signs_Diarrhoea.class);
		startActivity(intent);
	}
	}
