package com.example.androidimci.followupcare;

import com.chai.imciapplication.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Follow_Up_Fever_No_Malaria extends Fragment{
	

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater
				.inflate(R.layout.follow_up_fevernomalaria, container, false);
		

		return rootView;
	}

}