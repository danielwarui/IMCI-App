package org.chai.imci;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TreatTheChildActivity extends Activity implements View.OnClickListener{
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatthechild);

        Button btnTwo = (Button) findViewById(R.id.two_months);
        Button btnSixty = (Button) findViewById(R.id.sixty_months);

        btnTwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
        /*		intent = new Intent(TreatTheChildActivity.this,
						com.example.androidimci.treatthechild.Oral_Drugs_0_2_At.class);
				startActivity(intent);*/

            }
        });
        btnSixty.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
	/*			intent = new Intent(TreatTheChildActivity.this,
						com.example.androidimci.treatthechild.Oral_Drugs_2_60_At.class);
				startActivity(intent);*/

            }
        });
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.two_months:
 /*		intent = new Intent(TreatTheChildActivity.this,
						com.example.androidimci.treatthechild.Oral_Drugs_0_2_At.class);
				startActivity(intent);*/
                break;
            case R.id.sixty_months:
/*			intent = new Intent(TreatTheChildActivity.this,
						com.example.androidimci.treatthechild.Oral_Drugs_2_60_At.class);
				startActivity(intent);*/
                break;
        }
    }
}

