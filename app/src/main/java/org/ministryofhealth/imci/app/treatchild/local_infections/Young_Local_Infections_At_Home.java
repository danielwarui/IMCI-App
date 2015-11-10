package org.ministryofhealth.imci.app.treatchild.local_infections;

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
import android.widget.Toast;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;
import org.ministryofhealth.imci.app.assess_classify.AssessmentActivity;
import org.ministryofhealth.imci.app.counsel_mother.CounselMother_2_60;
import org.ministryofhealth.imci.app.treatchild.Oral_Drugs_2_60_At;

public class Young_Local_Infections_At_Home extends Activity {
    EditText ara;
    String[] fiilliste;
    Intent intent;
    // String [] fiilliste=
    // getResources().getStringArray(R.array.fragment_array_treatment);
    ArrayAdapter<String> adapter;
    private ListView vlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("Teach mother to treat local infections at home");
        setContentView(R.layout.young_treat_local_infections_home);
        fiilliste = getResources().getStringArray(R.array.young_local_infections_at_home);

        vlist = (ListView) findViewById(R.id.listmakeaway);
        adapter = new ArrayAdapter<String>(this, R.layout.simple_list_check, fiilliste);

        vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        vlist.setAdapter(adapter);
        vlist.setItemsCanFocus(true);
        // vlist.setTextFilterEnabled(true);
        vlist.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        intent = new Intent(getApplication(), Young_Local_Infection_Instruct.class);
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplication(), Young_Local_Infection_Instruct.class);
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplication(), Young_Local_Infection_Instruct.class);
                        intent.putExtra("Position", position);
                        startActivity(intent);
                        break;
                    // Immunize Every Young infant
                    case 3:
                        Toast.makeText(getApplicationContext(), "Check for immunization status for either age.", Toast.LENGTH_LONG).show();
                        intent = new Intent(getApplicationContext(), AssessmentActivity.class);
                        startActivity(intent);
                        break;

                    // To Diarrhoea
                    case 4:
                        intent = new Intent(getApplication(), Oral_Drugs_2_60_At.class);
                        intent.putExtra("oral_drugs", 1);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplication(), CounselMother_2_60.class);
                        intent.putExtra("Expander", 1);
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
                Intent intent = new Intent(Young_Local_Infections_At_Home.this, HomeActivity.class);
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
