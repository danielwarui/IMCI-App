package org.chai.imci.counsel_mother;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import org.chai.imci.R;

/**
 * Created by InclusionOne on 9/5/2015.
 */
public class Counsel_Mother_Fluids extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fluids_counsel_mother);
        findViewById(R.id.followUp);
        findViewById(R.id.whenToRet);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.followUp:

                break;
            case R.id.whenToRet:

                break;
        }
    }
}
