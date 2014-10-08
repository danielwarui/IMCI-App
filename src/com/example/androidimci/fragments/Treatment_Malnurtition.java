package com.example.androidimci.fragments;

import com.chai.imciapplication.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

	public class Treatment_Malnurtition extends Fragment {

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			View rootView = inflater.inflate(R.layout.treatment_malnutrition
					, container, false);
			
			return rootView;
		}

	}
