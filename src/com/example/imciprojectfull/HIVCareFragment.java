package com.example.imciprojectfull;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chai.imciapplication.R;

public class HIVCareFragment extends Fragment {
	
	public HIVCareFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_hivcare, container, false);
         
        return rootView;
    }
}
