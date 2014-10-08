package com.example.imciprojectfull;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.chai.imciapplication.R;

public class CounselFragment extends Fragment
{
	Intent intent;
	RadioGroup rg;
	Button btn1, btn2;
	TextView textLink;
	public CounselFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_treatment, container, false);
		
        return rootView;
    }


}
