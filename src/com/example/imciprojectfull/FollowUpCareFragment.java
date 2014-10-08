package com.example.imciprojectfull;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.chai.imciapplication.R;
import com.example.androidimci.treatments.Treatments_List;
import com.example.androidimci.treatments.Treatments_List_Young;

public class FollowUpCareFragment extends Fragment {

	public FollowUpCareFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		 View rootView = inflater.inflate(R.layout.followupmain, container, false);
	        Button button60 = (Button) rootView.findViewById(R.id.btnfirst);
	        Button button2 = (Button) rootView.findViewById(R.id.btnsecond);

	        button60.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent	intent=new Intent(getActivity(), Treatments_List.class);
						startActivity(intent);
					}
			});
	        button2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent	intent=new Intent(getActivity(), Treatments_List_Young.class);
					startActivity(intent);	
				}
			});
	        return rootView;
	    }
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		 System.out.println("----Fragmentactivity---onStart---");
		    overridePendingTransition(R.anim.anim_in, R.anim.anim_out);     
	}

	private void overridePendingTransition(int animIn, int animOut) {
		// TODO Auto-generated method stub
		
	}


}
