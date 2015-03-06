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
import com.example.androidimci.followupcare.starter.YoungStarter_Follow_Bacterial;
import com.example.androidimci.followupcare.starter.YoungStarter_Follow_Diarrhoea;
import com.example.androidimci.followupcare.starter.YoungStarter_Follow_EyeInfection;
import com.example.androidimci.followupcare.starter.YoungStarter_Follow_FeedingProblem;
import com.example.androidimci.followupcare.starter.YoungStarter_Follow_Jaundice;
import com.example.androidimci.followupcare.starter.YoungStarter_Follow_LowWeight;
import com.example.androidimci.followupcare.starter.YoungStarter_Follow_ThrushMouthUlcers;

public class Treatments_List_Young extends Activity {

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
    setContentView(R.layout.young_treatments_list);
    fiilliste = getResources().getStringArray(R.array.fragment_young_follow_up); 
    
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
			Intent	intent=new Intent(getApplication(), YoungStarter_Follow_Bacterial.class);
			startActivity(intent);
			break;
		case 1:
				intent=new Intent(getApplication(), YoungStarter_Follow_EyeInfection.class);
			startActivity(intent);
			break;
		case 2:
				intent=new Intent(getApplication(), YoungStarter_Follow_Jaundice.class);
			startActivity(intent);
			break;
		case 3:
				intent=new Intent(getApplication(), YoungStarter_Follow_Diarrhoea.class);
			startActivity(intent);
			break;
		case 4:
			intent=new Intent(getApplication(), YoungStarter_Follow_FeedingProblem.class);
			startActivity(intent);
			break;
		case 5:
			intent=new Intent(getApplication(), YoungStarter_Follow_LowWeight.class);
			startActivity(intent);
			break;
		case 6:
			intent=new Intent(getApplication(), YoungStarter_Follow_ThrushMouthUlcers.class);
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

    	  Treatments_List_Young.this.adapter.getFilter().filter(cs);   
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
