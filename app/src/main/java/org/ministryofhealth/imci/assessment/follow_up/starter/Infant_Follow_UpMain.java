package org.ministryofhealth.imci.assessment.follow_up.starter;

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

public class Infant_Follow_UpMain extends Activity {

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
        getActionBar().setSubtitle(getResources().getString(R.string.two_months));
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
		Intent i = new Intent(getApplication(), Starter_Follow_0_2.class);
		i.putExtra("Infant_Treatment_Position", position);
		startActivity(i);
	}
	  
});
  /*
 ara.addTextChangedListener(new TextWatcher(){

      public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
          // When user changed the Text

    	  Infant_Follow_UpMain.this.adapter.getFilter().filter(cs);
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
