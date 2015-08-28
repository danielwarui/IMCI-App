package org.chai.imci.assessment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import org.chai.imci.assessment.Fragment.Diagnosing_0_2EyeInfection;
import org.chai.imci.assessment.Fragment.Sign_0_2EyeInfection;
import org.chai.imci.assessment.Fragment.Treatment_0_2Eye_Infection;

public class TabsPagerAdapter0_2EyeInfection extends FragmentPagerAdapter {

    public TabsPagerAdapter0_2EyeInfection(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new Diagnosing_0_2EyeInfection();
            case 1:
                return new Sign_0_2EyeInfection();
            case 2:
                return new Treatment_0_2Eye_Infection();
        }

        return null;
    }


    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}
