package com.example.imciprojectfull;


import com.chai.imciapplication.R;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class AssessmentFragment extends Fragment {

	public AssessmentFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_assessment,
				container, false);
		Button btnSecond = (Button) rootView.findViewById(R.id.btnsecond);
		Button btnFirst = (Button) rootView.findViewById(R.id.btnfirst);

		btnSecond.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(),
						com.example.androidimci.What_to_Check_0_2.class);
				startActivity(intent);

			}
		});
		btnFirst.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(getActivity(),
						com.example.androidimci.What_to_Check_2_60.class);
				startActivity(intent);

			}
		});
		return rootView;
	}

}
