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
import org.chai.imci.treatthechild.local_infections.Dry_Ear_By_Wicking;
import org.chai.imci.treatthechild.local_infections.Soothe_Throat;
import org.chai.imci.treatthechild.local_infections.Trt_Eye_Infection;
import org.chai.imci.treatthechild.local_infections.Trt_Mouth_Ulcers;
import org.chai.imci.treatthechild.local_infections.Trt_Oral_Thrush;

public class Teach_Mother_Local_Infections extends Activity {
    private ListView vlist;
    EditText ara;
    String[] fiilliste;
    Intent intent;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teach_mother_local_infection);
        fiilliste = getResources().getStringArray(R.array.trt_mother_local_infection);

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
                switch (position) {
                    case 1:
                        Intent intent = new Intent(getApplication(),
                                Dry_Ear_By_Wicking.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplication(),
                                Soothe_Throat.class);
                        startActivity(intent);
                        break;
                    case 0:
                        intent = new Intent(getApplication(),
                                Trt_Eye_Infection.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplication(),
                                Trt_Mouth_Ulcers.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplication(),
                                Trt_Oral_Thrush.class);
                        startActivity(intent);
                        break;

                    default:
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

