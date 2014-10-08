package com.example.androidimci;

import com.chai.imciapplication.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Young_Result_Signs_SpecialTreatment extends Activity {
	ListView lv;
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.results);
		
		Bundle b = getIntent().getExtras();
		String[] resultArr = b.getStringArray("selectedItems");
		findViewsById();

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, resultArr);
		lv.setAdapter(adapter);
		
	}
	public void GoToNext(View view)
	{
		 
        // start the ResultActivity
        Intent intent = new Intent(getApplicationContext(),
        		Young_Expand_SpecialTreatment/*Sypmtoms_and_treatment*/.class);
 
    
        startActivity(intent);	
	}

	private void findViewsById() {
		lv = (ListView) findViewById(R.id.outputList3);
	}

}
