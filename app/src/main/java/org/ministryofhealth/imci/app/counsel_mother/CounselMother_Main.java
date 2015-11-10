package org.ministryofhealth.imci.app.counsel_mother;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;

/**
 * Created by InclusionOne on 9/2/2015.
 */
public class CounselMother_Main extends Activity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        setContentView(R.layout.activity_counsel_main);
        findViewById(R.id.two_months).setOnClickListener(this);
        findViewById(R.id.sixty_months).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.two_months:
                intent = new Intent(CounselMother_Main.this, CounselMother_0_2.class);
                intent.putExtra("Expander", 0);
                startActivity(intent);
                break;
            case R.id.sixty_months:
                intent = new Intent(CounselMother_Main.this, CounselMother_2_60.class);
                intent.putExtra("Expander", 0);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----Fragmentactivity---onStart---");
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.homePage:
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
