package org.ministryofhealth.imci.assessment.counsel_mother;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import org.ministryofhealth.imci.R;

public class CareForDevelopmentUniversal extends Activity {
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
    int id = 0;
    private String HIVlbl;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        setRowIdFromIntent();
        HIVlbl = getResources().getString(R.string.lbl_hiv);
        if (id == 0) {
            getActionBar().setTitle("Recommendations for Care for Development");
            getActionBar().setSubtitle("Age up to 4 months");
            setContentView(R.layout.care_for_development_upto_4months);

        } else if (id == 1) {
            getActionBar().setTitle("Recommendations for Care for Development");
            getActionBar().setSubtitle("Age 4 months up to 6 months");
            setContentView(R.layout.care_for_development_4_6);

        } else if (id == 2) {
            getActionBar().setTitle("Recommendations for Care for Development");
            getActionBar().setSubtitle("6 months up to 12 months");
            setContentView(R.layout.care_for_development_upto_6_12);

        } else if (id == 3) {
            getActionBar().setTitle("Recommendations for Care for Development");
            getActionBar().setSubtitle("12 months up to 2 years");
            setContentView(R.layout.care_for_develpmont_upto_12_2years);

        } else if (id == 4) {
            getActionBar().setTitle("Recommendations for Care for Development");
            getActionBar().setSubtitle("2 years and older");
            setContentView(R.layout.care_for_development_upto_2years_and_older);

        }
//	  For the NVP Section
        else if (id == 5) {
            getActionBar().setTitle(HIVlbl);
            getActionBar().setSubtitle("Algorithm for Early diagnosis of HIV in Children(2009)");
            setContentView(R.layout.algo_for_early_diagnosis);

        } else if (id == 6) {
            getActionBar().setTitle(HIVlbl);
            getActionBar().setSubtitle("Guidelines on Nevirapine prophylaxis for HIV exposed infants");
            setContentView(R.layout.guidelines_on_nvp_prophylaxis);

        } else if (id == 7) {
            getActionBar().setTitle(HIVlbl);
            getActionBar().setSubtitle("Nevirapine prophylaxis dosage for HIV exposed infants");
            setContentView(R.layout.nvp_doses_for_infants);

        } else if (id == 8) {
            getActionBar().setTitle(HIVlbl);
            getActionBar().setSubtitle("Dose of prophylactic cotrimoxazole");
            setContentView(R.layout.dose_of_cotrimoxazole);

        } else if (id == 9) {
            getActionBar().setTitle(HIVlbl);
            getActionBar().setSubtitle("Paediatric ARV dosage(October 2014)");
            setContentView(R.layout.paeds_activity);

        }
        // end of nvp sections
        else if (id == 10) {
            getActionBar().setTitle("Infant Immunization Status");
            setContentView(R.layout.young_immunization_status);

        } else if (id == 11) {
            getActionBar().setSubtitle(" Quinine Dosage");
            setContentView(R.layout.quinine_dosage);

        }
        else if (id == 12) {
            getActionBar().setTitle("Rehydration Therapy Plan B");
            getActionBar().setSubtitle("ORS Dosage");
            setContentView(R.layout.ors_dosage);

        }
        else if (id == 13) {
            getActionBar().setTitle("Follow Up Visit");
            setContentView(R.layout.follow_up_visit);

        }
        else if (id == 14) {
            getActionBar().setTitle("When to Return");
            setContentView(R.layout.when_to_return);

        } else if (id == 15) {
            getActionBar().setTitle("Return for follow up");
            setContentView(R.layout.when_to_return);

        } else if (id == 16) {
            getActionBar().setTitle("Advice on when to return for any of the following signs");
            setContentView(R.layout.when_to_return);

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
                return (float) Math.sqrt(x * x + y * y);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }
}
