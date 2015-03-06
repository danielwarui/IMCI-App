package com.example.androidimci.counselmother.caredevelopment;

import com.chai.imciapplication.R;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class CareForDevelopmentUniversal extends Activity{
	 ImageView imageDetail;
	 Matrix matrix = new Matrix();
	 Matrix savedMatrix = new Matrix();
	 PointF startPoint = new PointF();
	 PointF midPoint = new PointF();
	 float oldDist = 1f;
	 static final int NONE = 0;
	 static final int DRAG = 1;
	 static final int ZOOM = 2;
	 int mode = NONE;
	 int id = 0;

	 /** Called when the activity is first created. */
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setRowIdFromIntent();
	  if (id == 0) {
		  setContentView(R.layout.care_for_development_upto_4months);

		} else if (id == 1) {
			  setContentView(R.layout.care_for_development_4_6);

		}
		else if (id == 2) {
			  setContentView(R.layout.care_for_development_upto_6_12);

		}
		else if (id == 3) {
			  setContentView(R.layout.care_for_develpmont_upto_12_2years);

		}
		else if (id == 4) {
			  setContentView(R.layout.care_for_development_upto_2years_and_older);

		}
//	  For the NVP Section
		else if (id == 5) {
			  setContentView(R.layout.algo_for_early_diagnosis);

		}
		else if (id == 6) {
			  setContentView(R.layout.guidelines_on_nvp_prophylaxis);

		}
		else if (id == 7) {
			  setContentView(R.layout.nvp_doses_for_infants);

		}
		else if (id == 8) {
			  setContentView(R.layout.dose_of_cotrimoxazole);

		}
		else if (id == 9) {
			  setContentView(R.layout.paeds_activity);

		}
//	  End of the NVP Section
	  imageDetail = (ImageView) findViewById(R.id.imageview_zoomview);
	  /**
	   * set on touch listner on image
	   */
	  imageDetail.setOnTouchListener(new View.OnTouchListener() {

	   @Override
	   public boolean onTouch(View v, MotionEvent event) {

	    ImageView view = (ImageView) v;
	    System.out.println("matrix=" + savedMatrix.toString());
	    switch (event.getAction() & MotionEvent.ACTION_MASK) {
	    case MotionEvent.ACTION_DOWN:

	     savedMatrix.set(matrix);
	     startPoint.set(event.getX(), event.getY());
	     mode = DRAG;
	     break;

	    case MotionEvent.ACTION_POINTER_DOWN:

	     oldDist = spacing(event);

	     if (oldDist > 10f) {
	      savedMatrix.set(matrix);
	      midPoint(midPoint, event);
	      mode = ZOOM;
	     }
	     break;

	    case MotionEvent.ACTION_UP:

	    case MotionEvent.ACTION_POINTER_UP:
	     mode = NONE;

	     break;

	    case MotionEvent.ACTION_MOVE:
	     if (mode == DRAG) {
	      matrix.set(savedMatrix);
	      matrix.postTranslate(event.getX() - startPoint.x,
	        event.getY() - startPoint.y);
	     } else if (mode == ZOOM) {
	      float newDist = spacing(event);
	      if (newDist > 10f) {
	       matrix.set(savedMatrix);
	       float scale = newDist / oldDist;
	       matrix.postScale(scale, scale, midPoint.x, midPoint.y);
	      }
	     }
	     break;

	    }
	    view.setImageMatrix(matrix);

	    return true;
	   }

	   private float spacing(MotionEvent event) {
	    float x = event.getX(0) - event.getX(1);
	    float y = event.getY(0) - event.getY(1);
	    return FloatMath.sqrt(x * x + y * y);
	   }

	   private void midPoint(PointF point, MotionEvent event) {
	    float x = event.getX(0) + event.getX(1);
	    float y = event.getY(0) + event.getY(1);
	    point.set(x / 2, y / 2);
	   }
	  });

	 }
	 private void setRowIdFromIntent() {
			Bundle extras = getIntent().getExtras();
			id = extras != null ? extras.getInt("CareForDevelopmentAndNvp") : null;
		}
		@Override
		protected void onStart() {
		    // TODO Auto-generated method stub
		    super.onStart();
		    System.out.println("----main activity---onStart---");
		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);     
		}
}
