package org.inclusion.imcione;


import com.chai.imciapplication.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

	public class Disease_HIVInfection extends Fragment {

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			View rootView = inflater.inflate(R.layout.diagnose_hivexposure, container, false);
			
			return rootView;
		}

	}