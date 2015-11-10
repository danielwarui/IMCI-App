package org.ministryofhealth.imci.app.hiv_care_children;


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
import org.ministryofhealth.imci.app.counsel_mother.CareForDevelopmentUniversal;

public class NVPMain extends Activity {

    EditText ara;
    String[] fiilliste;
    Intent intent;
    // String [] fiilliste=
    // getResources().getStringArray(R.array.fragment_array_treatment);
    ArrayAdapter<String> adapter;
    private ListView vlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.treatments_list);
        fiilliste = getResources().getStringArray(R.array.nvp_items);

        vlist = (ListView) findViewById(R.id.list1);
        adapter = new ArrayAdapter<String>(this, R.layout.simple_list_check, fiilliste);

        vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        vlist.setAdapter(adapter);
        vlist.setItemsCanFocus(true);
        // vlist.setTextFilterEnabled(true);
        vlist.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                position += 5;
                Intent i = new Intent(getApplication(), CareForDevelopmentUniversal.class);
                i.putExtra("CareForDevelopmentAndNvp", position);
                startActivity(i);

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

