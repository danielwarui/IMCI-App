package org.ministryofhealth.imci.app.treatchild;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import org.ministryofhealth.imci.R;

public class Plan_C_Treat_Diarrhoea extends Activity {
	static final int NONE = 0;
	static final int DRAG = 1;
	static final int ZOOM = 2;
	ImageView imageDetail;
	 Matrix matrix = new Matrix();
	 Matrix savedMatrix = new Matrix();
	 PointF startPoint = new PointF();
	 PointF midPoint = new PointF();
	 float oldDist = 1f;
	 int mode = NONE;

	 /** Called when the activity is first created. */
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
		 getActionBar().setHomeButtonEnabled(true);
		 getActionBar().setDisplayHomeAsUpEnabled(true);
		 getActionBar().setTitle("Rehydration Therapy Plan C");
		 getActionBar().setSubtitle("Treat Severe Dehydration");
	  setContentView(R.layout.plan_c_treat);
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
	    return (float)Math.sqrt(x * x + y * y);
	   }

	   private void midPoint(PointF point, MotionEvent event) {
	    float x = event.getX(0) + event.getX(1);
	    float y = event.getY(0) + event.getY(1);
	    point.set(x / 2, y / 2);
	   }
	  });

	 }

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		System.out.println("----main activity---onStart---");
		overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		onBackPressed();
		return true;

	}
}
