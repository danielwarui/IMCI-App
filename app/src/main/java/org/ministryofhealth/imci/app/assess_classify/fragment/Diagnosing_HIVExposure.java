package org.ministryofhealth.imci.app.assess_classify.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.counsel_mother.CareForDevelopmentUniversal;

public class Diagnosing_HIVExposure extends Fragment {

    TextView tv_two;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.diagnose_hivexposure, container, false);
        tv_two = (TextView) rootView.findViewById(R.id.tv_two);
        tv_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CareForDevelopmentUniversal.class);
                intent.putExtra("CareForDevelopmentAndNvp", 5);
                startActivity(intent);
            }
        });
        return rootView;
    }

}