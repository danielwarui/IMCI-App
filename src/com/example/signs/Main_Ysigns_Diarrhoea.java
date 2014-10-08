package com.example.signs;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.chai.imciapplication.R;
import com.example.androidimci.Result_Signs_Cough;
import com.example.androidimci.Young_Result_Signs_Diarrhoea;

public class Main_Ysigns_Diarrhoea extends Activity implements
OnClickListener {
Button button;
ListView listView;
EditText inputSearch;
ArrayAdapter<String> adapter;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.main_ysigns_diarrhoea);



findViewsById();

String[] sports = getResources().getStringArray(R.array.array_diarrhoea);
adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_multiple_choice, sports);
listView.setChoiceMode(listView.CHOICE_MODE_MULTIPLE);
listView.setAdapter(adapter);	 
button.setOnClickListener(this);
/**
 * 
 * Enabling Search Filter
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Enabling Search Filter
 * */
inputSearch.addTextChangedListener(new TextWatcher() {
	
	@Override
	public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
		// When user changed the Text
		Main_Ysigns_Diarrhoea.this.adapter.getFilter().filter(cs);	
	}
	
	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub							
	}
});
}




private void findViewsById() {
listView = (ListView) findViewById(R.id.list);
button = (Button) findViewById(R.id.testbutton);
inputSearch = (EditText) findViewById(R.id.inputSearch);
}

public void onClick(View v) {
SparseBooleanArray checked = listView.getCheckedItemPositions();
ArrayList<String> selectedItems = new ArrayList<String>();
for (int i = 0; i < checked.size(); i++) {
    // Item position in adapter
    int position = checked.keyAt(i);
    // Add sport if it is checked i.e.) == TRUE!
    if (checked.valueAt(i))
        selectedItems.add(adapter.getItem(position));
}

String[] outputStrArr = new String[selectedItems.size()];

for (int i = 0; i < selectedItems.size(); i++) {
    outputStrArr[i] = selectedItems.get(i);
}

Intent intent = new Intent(getApplicationContext(),
        Young_Result_Signs_Diarrhoea.class);

// Create a bundle object
Bundle b = new Bundle();
b.putStringArray("selectedItems", outputStrArr);

// Add the bundle to the intent.
intent.putExtras(b);

// start the ResultActivity
startActivity(intent);
}


}
