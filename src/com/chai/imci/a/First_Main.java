package com.chai.imci.a;


import com.chai.imciapplication.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class First_Main extends Activity {
	Intent intent;
	RadioGroup rg;
	Button btn1, btn2;
	TextView textLink;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
//		reference the button group
		 btn2 = (Button) findViewById(R.id.btnProceed);
		
		          /*  case R.id.radio0 :
		            	 Toast.makeText(getBaseContext(), value , Toast.LENGTH_SHORT).show();
		            	 intent=new Intent(First.this,What_to_Check_0_2.class);
				    		startActivity(intent);
				    		break;
		            case R.id.radio1 :
		            	Toast.makeText(getBaseContext(), value , Toast.LENGTH_SHORT).show();
		            	intent=new Intent(First.this,What_to_Check_2_60.class);
			    		startActivity(intent);*/
//		 /*  
//		     textLink=(TextView)findViewById(R.id.textView3);
//		    textLink.setText(Html.fromHtml("<a href='http://www.publichealth.go.ke'>publichealth.go.ke</a>"));
//		    textLink.setClickable(true);
//		    textLink.setMovementMethod(LinkMovementMethod.getInstance());
//		    textLink.setOnTouchListener(new View.OnTouchListener() {
//		        public boolean onTouch(View v, MotionEvent event) {
//		             TODO Auto-generated method stub
//		            Toast.makeText(getApplicationContext(), "publichealth.go.ke", Toast.LENGTH_SHORT).show();
//		      
//					Intent intentweb=new 
//					Intent(Intent.ACTION_VIEW,Uri.parse("http://www.publichealth.go.ke"));
//					startActivity(intentweb);
//		            return true;
//		        }*/
//		    });  */
	}
	public void NextActivity(View view)
	{
		switch (view.getId()){
	/* case R.id.btn0_2 :
    	 intent=new Intent(First.this,What_to_Check_0_2.class);
    		startActivity(intent);
    		break;*/
    case R.id.btnProceed :
    	intent=new Intent(First_Main.this,HomeActivity.class);
		startActivity(intent);
		}
	}
	  @Override
	    protected void onStart() {
	        // TODO Auto-generated method stub
	        super.onStart();
	        System.out.println("----main activity---onStart---");
	    overridePendingTransition(R.anim.anim_in, R.anim.anim_out);     
	  }

}
