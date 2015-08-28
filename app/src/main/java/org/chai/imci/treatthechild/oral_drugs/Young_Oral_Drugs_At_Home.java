package org.chai.imci.treatthechild.oral_drugs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import org.chai.imci.R;

public class Young_Oral_Drugs_At_Home extends Activity {
    private ListView vlist;
    EditText ara;
    String[] fiilliste;
    Intent intent;

    // String [] fiilliste=
    // getResources().getStringArray(R.array.fragment_array_treatment);
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.young_oral_drugs_at_home);
        fiilliste = getResources().getStringArray(R.array.young_oral_drugs);

        vlist = (ListView) findViewById(R.id.list1_oral);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice, fiilliste);

        vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        vlist.setAdapter(adapter);
        vlist.setItemsCanFocus(true);
        // vlist.setTextFilterEnabled(true);
        vlist.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                super.getClass();
                // TODO Auto-generated method stub
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplication(),
                                Oral_Antibiotic.class);
                        intent.putExtra("Position", 8);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplication(),
                                Oral_Antibiotic.class);
                        intent.putExtra("Position", 9);
                        startActivity(intent);
                        break;


                }
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

