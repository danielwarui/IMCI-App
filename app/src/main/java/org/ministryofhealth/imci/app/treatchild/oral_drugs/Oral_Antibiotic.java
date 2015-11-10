package org.ministryofhealth.imci.app.treatchild.oral_drugs;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.app.HomeActivity;

public class Oral_Antibiotic extends Activity {
    static final int NONE = 0;
    static final int DRAG = 1;
    static final int ZOOM = 2;
    ImageView imageDetail;
    Matrix matrix = new Matrix();
    Matrix savedMatrix = new Matrix();
    PointF startPoint = new PointF();
    PointF midPoint = new PointF();
    float oldDist = 1f;
    int id;
    int mode = NONE;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setRowIdFromIntent();
        switch (id) {
            case 0:
                getActionBar().setTitle("Oral antibiotic");
                setContentView(R.layout.oral_antibiotic);
                break;
            case 1:
                getActionBar().setTitle("Metronidazole");
                setContentView(R.layout.metronidazole);
                break;
            case 2:
                getActionBar().setTitle("Oral antimalarial");
                setContentView(R.layout.oral_antimalarial);
                break;
            case 3:
                getActionBar().setTitle("Vitamin A");
                setContentView(R.layout.vitamin_a);
                break;
            case 4:
                getActionBar().setTitle("Iron folate");
                setContentView(R.layout.iron_folate);
                break;
            case 5:
                getActionBar().setTitle("Zinc Sulphate");
                setContentView(R.layout.zinc_sulphate);
                break;
            case 6:
                getActionBar().setTitle("Paracetamol for fever");
                setContentView(R.layout.paracetamol_for_fever);
                break;
            case 7:
                getActionBar().setTitle("Mebendazole or albendazole");
                setContentView(R.layout.mebendazole_or_albendazole);
                break;
            case 8:
                getActionBar().setTitle("Oral antibiotic");
                setContentView(R.layout.young_appropriate_antibiotic);
                break;
            case 9:
                getActionBar().setTitle("Zinc sulphate");
                setContentView(R.layout.young_give_zinc_sulphate);
                break;
            case 10:
                getActionBar().setTitle("Immunization table");
                setContentView(R.layout.immunization_table_2_60);
                break;

        }
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
                                matrix.postScale(scale, scale, midPoint.x,
                                        midPoint.y);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
            case R.id.homePage:
                Intent intent = new Intent(Oral_Antibiotic.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private void setRowIdFromIntent() {
        Bundle extras = getIntent().getExtras();
        id = extras != null ? extras.getInt("Position") : null;
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        System.out.println("----main activity---onStart---");
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

}