package org.chai.imci.treatchild;

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
import org.chai.imci.treatthechild.oral_drugs.Oral_Antibiotic;

public class Teach_Mother_Oral_Drugs extends Activity {
    private ListView vlist;
    EditText ara;
    String[] fiilliste;
    Intent intent;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teach_mother_oral_drugs);
        fiilliste = getResources().getStringArray(R.array.trt_oral_drugs_at_home);

        vlist = (ListView) findViewById(R.id.list1);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice, fiilliste);

        vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        vlist.setAdapter(adapter);
        vlist.setItemsCanFocus(true);
        vlist.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                Intent i = new Intent(getApplication(), Oral_Antibiotic.class);
                i.putExtra("Position", position);
                startActivity(i);
            /*switch (position) {
            case 0:
				Intent intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Oral_Antibiotic.class);
				startActivity(intent);
				break;
			case 1:
				intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Metronidazole.class);
				startActivity(intent);
				break;
			case 2:
				intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Oral_Antimalarial.class);
				startActivity(intent);
				break;
			case 3:
				intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Vitamin_A.class);
				startActivity(intent);
				break;
			case 4:
				intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Iron_Folate.class);
				startActivity(intent);
				break;
			case 5:
				intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Zinc_Sulphate.class);
				startActivity(intent);
				break;
			case 6:
				intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Paracetamol_For_Fever_Or_Ear_Pain.class);
				startActivity(intent);
				break;
			case 7:
				intent = new Intent(getApplication(),
						com.example.androidimci.treatthechild.oral_drugs.Mebendazole_Or_Albendazole.class);
				startActivity(intent);
				break;
			
			default:
				break;
			}*/
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

