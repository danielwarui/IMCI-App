package com.example.androidimci.treatments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.chai.imciapplication.R;
import com.example.androidimci.followupcare.starter.Starter_Follow_Dysentry;
import com.example.androidimci.followupcare.starter.Starter_Follow_EarInfection;
import com.example.androidimci.followupcare.starter.Starter_Follow_EyeMouth;
import com.example.androidimci.followupcare.starter.Starter_Follow_Feeding;
import com.example.androidimci.followupcare.starter.Starter_Follow_FeverNoMalaria;
import com.example.androidimci.followupcare.starter.Starter_Follow_HivExposed;
import com.example.androidimci.followupcare.starter.Starter_Follow_LowWeight;
import com.example.androidimci.followupcare.starter.Starter_Follow_Malaria;
import com.example.androidimci.followupcare.starter.Starter_Follow_Pallor;
import com.example.androidimci.followupcare.starter.Starter_Follow_Persistent_Diarrhoea;
import com.example.androidimci.followupcare.starter.Starter_Follow_Pneumonia;
import com.example.androidimci.followupcare.starter.Starter_Follow_Wheezing;

public class Treatments_List extends Activity {

	private ListView vlist;
	EditText ara;
	String[] fiilliste;
	Intent intent;

	// String [] fiilliste=
	// getResources().getStringArray(R.array.fragment_array_treatment);
	ArrayAdapter<String> adapter;

	@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.treatments_list);
    fiilliste = getResources().getStringArray(R.array.fragment_follow_up); 
    
  vlist=(ListView)findViewById(R.id.list1);
   adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice, fiilliste);

 vlist.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
vlist.setAdapter(adapter);
vlist.setItemsCanFocus(true); 
//  vlist.setTextFilterEnabled(true);
  vlist.setOnItemClickListener(new OnItemClickListener() {

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		switch (position){
		case 0:
			Intent	intent=new Intent(getApplication(), Starter_Follow_Pneumonia.class);
			startActivity(intent);
			break;
		case 1:
				intent=new Intent(getApplication(), Starter_Follow_Persistent_Diarrhoea.class);
			startActivity(intent);
			break;
		case 2:
				intent=new Intent(getApplication(), Starter_Follow_Dysentry.class);
			startActivity(intent);
			break;
		case 3:
				intent=new Intent(getApplication(), Starter_Follow_Wheezing.class);
			startActivity(intent);
			break;
		case 4:
			intent=new Intent(getApplication(), Starter_Follow_Malaria.class);
			startActivity(intent);
			break;
		case 5:
			intent=new Intent(getApplication(), Starter_Follow_FeverNoMalaria.class);
			startActivity(intent);
			break;
		case 6:
			intent=new Intent(getApplication(), Starter_Follow_EyeMouth.class);
			startActivity(intent);
			break;
		case 7:
			intent=new Intent(getApplication(), Starter_Follow_EarInfection.class);
			startActivity(intent);
			break;
		case 8:
			intent=new Intent(getApplication(), Starter_Follow_HivExposed.class);
			startActivity(intent);
			break;
		case 9:
			intent=new Intent(getApplication(), Starter_Follow_Feeding.class);
			startActivity(intent);
			break;
		case 10:
			intent=new Intent(getApplication(), Starter_Follow_Pallor.class);
			startActivity(intent);
			break;
		case 11:
			intent=new Intent(getApplication(), Starter_Follow_LowWeight.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
	  
});
  /*
 ara.addTextChangedListener(new TextWatcher(){

      public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
          // When user changed the Text

    	  Treatments_List.this.adapter.getFilter().filter(cs);   
      }

    @Override
    public void afterTextChanged(Editable arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
            int arg3) {
        // TODO Auto-generated method stub

    }
 });
*/
	
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


}
