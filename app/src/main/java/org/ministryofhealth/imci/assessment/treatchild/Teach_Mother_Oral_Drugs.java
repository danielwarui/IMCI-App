package org.ministryofhealth.imci.assessment.treatchild;

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

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.treatchild.oral_drugs.Oral_Antibiotic;

public class Teach_Mother_Oral_Drugs extends Activity{
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

