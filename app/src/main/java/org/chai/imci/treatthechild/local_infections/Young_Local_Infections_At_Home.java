package org.chai.imci.treatthechild.local_infections;

import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.chai.imci.R;
import org.chai.imci.treatchild.Plan_A_Treat_Diarrhoea;
import org.chai.imci.treatchild.Plan_B_Treat_Diarrhoea;

public class Young_Local_Infections_At_Home extends Activity {
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
        fiilliste = getResources().getStringArray(
                R.array.young_local_infections_at_home);

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
                // TODO Auto-generated method stub
                if (position == 0 || position == 1 || position == 2) {
                    super.getClass();
                    Intent intent = new Intent(getApplication(),
                            Young_Local_Infection_Instruct.class);
                    intent.putExtra("Position", position);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder myDialog
                            = new AlertDialog.Builder(Young_Local_Infections_At_Home.this);

                    myDialog.setTitle("Treat local infections at home");

                    TextView dialogTxt_id = new TextView(Young_Local_Infections_At_Home.this);
                    LayoutParams dialogTxt_idLayoutParams
                            = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                    dialogTxt_id.setLayoutParams(dialogTxt_idLayoutParams);
//			            dialogTxt_id.setText("");

                    final EditText dialogC1_id = new EditText(Young_Local_Infections_At_Home.this);
                    LayoutParams dialogC1_idLayoutParams
                            = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
                    dialogC1_id.setLayoutParams(dialogC1_idLayoutParams);
//			            dialogC1_id.setText("");

                    final EditText dialogC2_id = new EditText(Young_Local_Infections_At_Home.this);
                    LayoutParams dialogC2_idLayoutParams
                            = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
                    dialogC2_id.setLayoutParams(dialogC2_idLayoutParams);
//			            dialogC2_id.setText("");

                    LinearLayout layout = new LinearLayout(Young_Local_Infections_At_Home.this);
                    layout.setOrientation(LinearLayout.VERTICAL);
                    layout.addView(dialogTxt_id);
                    layout.addView(dialogC1_id);
                    layout.addView(dialogC2_id);
                    myDialog.setView(layout);

                    myDialog.setPositiveButton("Immunize Infant as Needed", new DialogInterface.OnClickListener() {
                        // do something when the button is clicked
                        public void onClick(DialogInterface arg0, int arg1) {
                            Intent intent = new Intent(Young_Local_Infections_At_Home.this, Plan_B_Treat_Diarrhoea.class);
                            startActivity(intent);
                        }
                    });

                    myDialog.setNeutralButton("Treat Diarrhoea", new DialogInterface.OnClickListener() {
                        // do something when the button is clicked
                        public void onClick(DialogInterface arg0, int arg1) {
                            Intent intent = new Intent(Young_Local_Infections_At_Home.this, Plan_A_Treat_Diarrhoea.class);
                            startActivity(intent);
                        }
                    });

                    myDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        // do something when the button is clicked
                        public void onClick(DialogInterface arg0, int arg1) {

                        }
                    });

                    myDialog.show();
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
