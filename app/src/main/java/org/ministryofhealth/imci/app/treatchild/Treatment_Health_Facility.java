package org.ministryofhealth.imci.app.treatchild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.treatchild.healthfacility.Convulsing_Now;
import org.ministryofhealth.imci.app.treatchild.healthfacility.Intramuscular_Antibiotic;
import org.ministryofhealth.imci.app.treatchild.healthfacility.Treat_Wheezing;
import org.ministryofhealth.imci.app.treatchild.healthfacility.Treatment_Severe_Malaria;

public class Treatment_Health_Facility extends Activity {
    EditText ara;
    String[] fiilliste;
    Intent intent;
    ArrayAdapter<String> adapter;
    private ListView vlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Give this treatments in health facility only");
        setContentView(R.layout.treatment_healthy_facility);
        fiilliste = getResources().getStringArray(R.array.health_facility_only);

        vlist = (ListView) findViewById(R.id.list1);
        adapter = new ArrayAdapter<String>(this,R.layout.simple_list_check, fiilliste);

        vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        vlist.setAdapter(adapter);
        vlist.setItemsCanFocus(true);
        // vlist.setTextFilterEnabled(true);
        vlist.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplication(), Intramuscular_Antibiotic.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplication(), Convulsing_Now.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplication(), Treatment_Severe_Malaria.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplication(), Treat_Wheezing.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplication(), Low_Blood_Sugar.class);
                        startActivity(intent);
                        break;

                }
            }

        });

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
            case R.id.homePage:
                Intent intent = new Intent(Treatment_Health_Facility.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----main activity---onStart---");
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}

