package org.chai.imci.assessment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import org.chai.imci.R;
import org.chai.imci.counselmother.Counsel_Mother_Infant_Feeding;

public class CareForDevelopment extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.care4development);
        TextView tv = (TextView) findViewById(R.id.care4dev3);
        tv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(), Counsel_Mother_Infant_Feeding.class);
                startActivity(intent);
            }
        });
    }


}
