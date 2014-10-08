package com.example.imciprojectfull;


import com.chai.imciapplication.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MCHIntergrationFragment extends Fragment {
	
	public MCHIntergrationFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_mchintergration, container, false);
         
        return rootView;
    }
}
