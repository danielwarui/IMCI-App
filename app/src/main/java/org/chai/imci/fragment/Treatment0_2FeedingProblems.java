package org.chai.imci.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.chai.imci.assessment.model.Product;
import org.chai.imci.assessment.model.Product.SubCategory;
import org.chai.imci.assessment.model.Product.SubCategory.ItemList;

import org.chai.imci.R;

import java.util.ArrayList;

public class Treatment0_2FeedingProblems extends Fragment {

    private ArrayList<Product> pProductArrayList;
    private ArrayList<SubCategory> pSubItemArrayList;
    private ArrayList<SubCategory> pSubItemArrayList2;
    private LinearLayout mLinearListView;
    boolean isFirstViewClick = false;
    boolean isSecondViewClick = false;
    String youngTreatmentFeeding, youngTreatmentNoFeeding, youngVeryLowBirthWeight, youngLowBirthWeight, youngNormalBirthWeight;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.universal_indicator,
                container, false);
        // mLinearListView = (LinearLayout) findViewById(R.id.linear_listview);
        mLinearListView = (LinearLayout) rootView
                .findViewById(R.id.linear_listview);
        /**
         * <string name="signs_severe_pneumonia"> � Any general danger sign\n�
         * Chest indrawing\n� Stridor in calm child\n� Fast breathing\n� No
         * signs of pneumonia or very severe disease. </string> <string
         * name="signs_pneumonia"> � Fast Breathing\n </string> <string
         * name="signs_no_pneumonia"> � No signs of pneumonia or very severe
         * disease.\n </string>
         */
        youngTreatmentFeeding = getString(R.string.young_treatment_feeding_problem);
        youngTreatmentNoFeeding = getString(R.string.young_treatment_no_feeding_problem);
        youngVeryLowBirthWeight = getString(R.string.young_treatment_very_low_birth);
        youngLowBirthWeight = getString(R.string.young_treatment_low_birth_weight);
        youngNormalBirthWeight = getString(R.string.young_treatment_normal_birth_weight);


        ArrayList<ItemList> mItemListArray = new ArrayList<ItemList>();
        mItemListArray.add(new ItemList("", youngTreatmentFeeding));

        ArrayList<ItemList> mItemListArray1 = new ArrayList<ItemList>();
        mItemListArray1.add(new ItemList("", youngTreatmentNoFeeding));


        ArrayList<ItemList> mItemListArrayP2 = new ArrayList<ItemList>();
        mItemListArrayP2.add(new ItemList("", youngVeryLowBirthWeight));
        ArrayList<ItemList> mItemListArrayP21 = new ArrayList<ItemList>();
        mItemListArrayP21.add(new ItemList("", youngLowBirthWeight));
        ArrayList<ItemList> mItemListArrayP22 = new ArrayList<ItemList>();
        mItemListArrayP22.add(new ItemList("", youngNormalBirthWeight));


        /**
         *
         */
        pSubItemArrayList = new ArrayList<SubCategory>();
        pSubItemArrayList2 = new ArrayList<SubCategory>();

        pSubItemArrayList.add(new SubCategory("FEEDING PROBLEM OR LOW BIRTH WEIGHT", mItemListArray));
        pSubItemArrayList.add(new SubCategory("NO FEEDING PROBLEM OR LOW BIRTH WEIGHT", mItemListArray1));

        pSubItemArrayList2.add(new SubCategory("VERY LOW BIRTH WEIGHT", mItemListArrayP2));
        pSubItemArrayList2.add(new SubCategory("LOW BIRTH WEIGHT", mItemListArrayP21));
        pSubItemArrayList2.add(new SubCategory("NORMAL BIRTH WEIGHT", mItemListArrayP22));

		/*
         * pSubItemArrayList.add(new SubCategory("Color", mItemListArray));
		 * pSubItemArrayList2.add(new SubCategory("Cloths", mItemListArray2));
		 *//**
         *
         */

        pProductArrayList = new ArrayList<Product>();
        pProductArrayList
                .add(new Product("Feeding Problem", pSubItemArrayList));
        pProductArrayList.add(new Product("Baby Less than One Week", pSubItemArrayList2));

        /***
         * adding item into listview
         */
        for (int i = 0; i < pProductArrayList.size(); i++) {

            inflater = (LayoutInflater) getActivity().getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            View mLinearView = inflater.inflate(R.layout.row_first, null);

            final TextView mProductName = (TextView) mLinearView.findViewById(R.id.textViewName);
            final RelativeLayout mLinearFirstArrow = (RelativeLayout) mLinearView.findViewById(R.id.linearFirst);
            final ImageView mImageArrowFirst = (ImageView) mLinearView.findViewById(R.id.imageFirstArrow);
            final LinearLayout mLinearScrollSecond = (LinearLayout) mLinearView.findViewById(R.id.linear_scroll);

            if (isFirstViewClick == false) {
                // Off View becomes invisible
                mLinearScrollSecond.setVisibility(View.GONE);

				/*
				 * if the button is clicked a second or first time
				 * If it is clicked a first time the switch boolean goes on the if pressed again the 
				 * switch boolean goes off
				 * Let's start from off to on 
				 * Off is false when clicked it is supposed to go on.
				 * */
                mImageArrowFirst.setBackgroundResource(R.drawable.arrow_points_right);
            } else {
                // On view becomes visible
                mLinearScrollSecond.setVisibility(View.VISIBLE);
                mImageArrowFirst.setBackgroundResource(R.drawable.arrow_points_down);
            }
            mLinearFirstArrow.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    if (isFirstViewClick == false) {
                        isFirstViewClick = true;
                        mImageArrowFirst
                                .setBackgroundResource(R.drawable.arrow_points_down);
                        mLinearScrollSecond.setVisibility(View.VISIBLE);

                    } else {
                        isFirstViewClick = false;
                        mImageArrowFirst
                                .setBackgroundResource(R.drawable.arrow_points_right);
                        mLinearScrollSecond.setVisibility(View.GONE);
                    }
                }
            });
/*
			mLinearFirstArrow.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {

					if (isFirstViewClick == false) {
						isFirstViewClick = true;
						mImageArrowFirst
								.setBackgroundResource(R.drawable.arrow_right);
						mLinearScrollSecond.setVisibility(View.VISIBLE);

					} else {
						isFirstViewClick = false;
						mImageArrowFirst
								.setBackgroundResource(R.drawable.arrow_right);
						mLinearScrollSecond.setVisibility(View.GONE);
					}
					return false;
				}
			});
*/
            final String name = pProductArrayList.get(i).getpName();
            mProductName.setText(name);

            /**
             *
             */
            for (int j = 0; j < pProductArrayList.get(i).getmSubCategoryList()
                    .size(); j++) {

                inflater = (LayoutInflater) getActivity().getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
                View mLinearView2 = inflater.inflate(R.layout.row_second, null);
                if (j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                }
                if (j == 1) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#FFFF00")));

                }
                if (j == 2) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#90EE90")));

                }
                TextView mSubItemName = (TextView) mLinearView2
                        .findViewById(R.id.textViewTitle);
                final RelativeLayout mLinearSecondArrow = (RelativeLayout) mLinearView2
                        .findViewById(R.id.linearSecond);
                final ImageView mImageArrowSecond = (ImageView) mLinearView2
                        .findViewById(R.id.imageSecondArrow);
                final LinearLayout mLinearScrollThird = (LinearLayout) mLinearView2
                        .findViewById(R.id.linear_scroll_third);
                if (j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mLinearScrollThird.setBackgroundColor((Color
                            .parseColor("#ff69b4")));

                }
                if (j == 1) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mLinearScrollThird.setBackgroundColor((Color
                            .parseColor("#FFFF00")));

                }
                if (j == 2) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mLinearScrollThird.setBackgroundColor((Color
                            .parseColor("#90EE90")));

                }
                if (i == 0 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mLinearScrollThird.setBackgroundColor((Color
                            .parseColor("#FFFF00")));

                }
                if (i == 0 && j == 1) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mLinearScrollThird.setBackgroundColor((Color
                            .parseColor("#90EE90")));

                }

                if (isSecondViewClick == false) {
                    mLinearScrollThird.setVisibility(View.GONE);
                    mImageArrowSecond
                            .setBackgroundResource(R.drawable.arrow_points_right);
                } else {
                    mLinearScrollThird.setVisibility(View.VISIBLE);
                    mImageArrowSecond
                            .setBackgroundResource(R.drawable.arrow_points_down);
                }

                mLinearSecondArrow.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        if (isSecondViewClick == false) {
                            isSecondViewClick = true;
                            // mLinearFirstArrow.setBackgroundColor(Color.parseColor("#FF0000"));
                            mImageArrowSecond
                                    .setBackgroundResource(R.drawable.arrow_points_down);
                            mLinearScrollThird.setVisibility(View.VISIBLE);

                        } else {
                            isSecondViewClick = false;
                            mImageArrowSecond
                                    .setBackgroundResource(R.drawable.arrow_points_right);
                            mLinearScrollThird.setVisibility(View.GONE);
                        }
                    }
                });
			/*	mLinearSecondArrow.setOnTouchListener(new OnTouchListener() {

					@Override
					public boolean onTouch(View v, MotionEvent event) {

						if (isSecondViewClick == false) {
							isSecondViewClick = true;
							// mLinearFirstArrow.setBackgroundColor(Color.parseColor("#FF0000"));
							mImageArrowSecond
									.setBackgroundResource(R.drawable.arrow_down);
							mLinearScrollThird.setVisibility(View.VISIBLE);

						} else {
							isSecondViewClick = false;
							mImageArrowSecond
									.setBackgroundResource(R.drawable.arrow_right);
							mLinearScrollThird.setVisibility(View.GONE);
						}
						return false;
					}
				});
*/
                final String catName = pProductArrayList.get(i)
                        .getmSubCategoryList().get(j).getpSubCatName();
                mSubItemName.setText(catName);
                /**
                 *
                 */
                for (int k = 0; k < pProductArrayList.get(i)
                        .getmSubCategoryList().get(j).getmItemListArray()
                        .size(); k++) {

                    inflater = (LayoutInflater) getActivity().getSystemService(
                            Context.LAYOUT_INFLATER_SERVICE);
                    View mLinearView3 = inflater.inflate(R.layout.row_third,
                            null);
                    if (j == 0) {
                        mLinearView3.setBackgroundColor((Color
                                .parseColor("#ff69b4")));
                    }
                    if (j == 1) {
                        mLinearView3.setBackgroundColor((Color
                                .parseColor("#FFFF00")));

                    }
                    if (j == 2) {
                        mLinearView3.setBackgroundColor((Color
                                .parseColor("#90EE90")));

                    }
                    if (i == 0 && j == 0) {
                        mLinearView3.setBackgroundColor((Color
                                .parseColor("#FFFF00")));

                    }
                    if (i == 0 && j == 1) {
                        mLinearView3.setBackgroundColor((Color
                                .parseColor("#90EE90")));

                    }
                    TextView mItemName = (TextView) mLinearView3
                            .findViewById(R.id.textViewItemName);
                    TextView mItemPrice = (TextView) mLinearView3
                            .findViewById(R.id.textViewItemPrice);
                    final String itemName = pProductArrayList.get(i)
                            .getmSubCategoryList().get(j).getmItemListArray()
                            .get(k).getItemName();
                    final String itemPrice = pProductArrayList.get(i)
                            .getmSubCategoryList().get(j).getmItemListArray()
                            .get(k).getItemPrice();
                    mItemName.setText(itemName);
                    mItemPrice.setText(itemPrice);

                    mLinearScrollThird.addView(mLinearView3);
                }

                mLinearScrollSecond.addView(mLinearView2);

            }


            mLinearListView.addView(mLinearView);
        }

        return rootView;
    }
}