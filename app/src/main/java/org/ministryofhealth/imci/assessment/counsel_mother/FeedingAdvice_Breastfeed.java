package org.ministryofhealth.imci.assessment.counsel_mother;

import android.app.Activity;
import android.os.Bundle;

import org.ministryofhealth.imci.R;

/**
 * Created by InclusionOne on 9/5/2015.
 */
public class FeedingAdvice_Breastfeed extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setSubtitle("HIV positive mother chosen to breastfeed");
        setContentView(R.layout.feeding_advice_breastfeeding);
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
