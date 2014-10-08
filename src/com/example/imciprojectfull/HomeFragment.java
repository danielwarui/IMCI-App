package com.example.imciprojectfull;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.chai.imciapplication.R;

public class HomeFragment extends Fragment {
	android.app.FragmentTransaction transaction;
	Fragment fragment;

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_home, container,
				false);
		Button buttonAssessment = (Button) rootView
				.findViewById(R.id.btnAssessments);
		Button buttonHiv= (Button) rootView
				.findViewById(R.id.btnHivCare);
		Button buttonFollowUp= (Button) rootView
				.findViewById(R.id.btnFollowUp);
		

		buttonAssessment.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {

				case R.id.btnAssessments:
					fragment = new AssessmentFragment();
					// consider using Java coding conventions (upper first char
					// class names!!!)
					transaction = getFragmentManager().beginTransaction();

					// Replace whatever is in the fragment_container view with
					// this fragment,
					// and add the transaction to the back stack
					transaction.replace(R.id.drawer_layout, fragment);
					transaction.addToBackStack(null);

					// Commit the transaction
					transaction.commit();
					break;
				
				}
			}
		});
		
		buttonHiv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {

				case R.id.btnHivCare:
					fragment = new HIVCareFragment();
					// consider using Java coding conventions (upper first char
					// class names!!!)
					transaction = getFragmentManager().beginTransaction();

					// Replace whatever is in the fragment_container view with
					// this fragment,
					// and add the transaction to the back stack
					transaction.replace(R.id.drawer_layout, fragment);
					transaction.addToBackStack(null);

					// Commit the transaction
					transaction.commit();
					break;
				}
			}
		});
		buttonFollowUp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {

				case R.id.btnFollowUp:
					fragment = new FollowUpCareFragment();
					// consider using Java coding conventions (upper first char
					// class names!!!)
					transaction = getFragmentManager().beginTransaction();

					// Replace whatever is in the fragment_container view with
					// this fragment,
					// and add the transaction to the back stack
					transaction.replace(R.id.drawer_layout, fragment);
					transaction.addToBackStack(null);

					// Commit the transaction
					transaction.commit();
					break;
				
				}
			}
		});
	
		return rootView;
	}

}
