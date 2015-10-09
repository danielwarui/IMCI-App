package org.ministryofhealth.imci.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.counsel_mother.Counsel_Mother_Infant_Feeding;

public class CareForDevelopment extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setTitle("Age up to 2 months");
        getActionBar().setSubtitle("Care for development");
        setContentView(R.layout.care4development);
        TextView tv = (TextView) findViewById(R.id.care4dev3);
        tv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Counsel_Mother_Infant_Feeding.class);
                startActivity(intent);
            }
        });
    }


}
