package org.ministryofhealth.imci.assessment.fragment;

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

import org.ministryofhealth.imci.R;
import org.ministryofhealth.imci.assessment.model.Product;
import org.ministryofhealth.imci.assessment.model.Product.SubCategory;
import org.ministryofhealth.imci.assessment.model.Product.SubCategory.ItemList;

import java.util.ArrayList;

public class Infant_Classify_EyeInfections extends Fragment {

    private ArrayList<Product> pProductArrayList;
    private ArrayList<SubCategory> pSubItemArrayList, pSubItemArrayList2, pSubItemArrayList3, pSubItemArrayList4, pSubItemArrayList5, pSubItemArrayList6;
    private String signsSquint,signsCongenitalCancer,signsCongenitalGlaucoma,signsSevereEyeInfection
            ,signsEyeInfection,signsCongenitalConditionOREye;
    private LinearLayout mLinearListView;

    boolean isFirstViewClick = false;
    boolean isSecondViewClick = false;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.universal_indicator,
                container, false);
        // mLinearListView = (LinearLayout) findViewById(R.id.linear_listview);
        mLinearListView = (LinearLayout) rootView
                .findViewById(R.id.linear_listview);
        /*
         * Declaration of String variables
		 */

signsSquint = getString(R.string.young_signs_squint);
        signsCongenitalCancer = getString(R.string.young_signs_congenital_cancer_of_the_eye);
        signsCongenitalGlaucoma = getString(R.string.young_signs_congenital_glaucoma);
        signsSevereEyeInfection = getString(R.string.young_signs_severe_eye_infection);
        signsEyeInfection = getString(R.string.young_signs_eye_infection);
        signsCongenitalConditionOREye = getString(R.string.young_signs_unlikely_congenital);

        /*
         * Third level String variables
		 */
        ArrayList<ItemList> itemNothing = new ArrayList<ItemList>();
        itemNothing.add(new ItemList("", ""));

        /**
         * Second Level list items
         */
        pSubItemArrayList = new ArrayList<SubCategory>();
        pSubItemArrayList.add(new SubCategory(signsSquint, itemNothing));

        pSubItemArrayList2 = new ArrayList<SubCategory>();
        pSubItemArrayList2.add(new SubCategory(signsCongenitalCancer, itemNothing));

        pSubItemArrayList3 = new ArrayList<SubCategory>();
        pSubItemArrayList3.add(new SubCategory(signsCongenitalGlaucoma, itemNothing));

        pSubItemArrayList4 = new ArrayList<SubCategory>();
        pSubItemArrayList4.add(new SubCategory(signsSevereEyeInfection, itemNothing));

        pSubItemArrayList5 = new ArrayList<SubCategory>();
        pSubItemArrayList5.add(new SubCategory(signsEyeInfection, itemNothing));

        pSubItemArrayList6 = new ArrayList<SubCategory>();
        pSubItemArrayList6.add(new SubCategory(signsCongenitalConditionOREye, itemNothing));

		/*
         * pSubItemArrayList.add(new SubCategory("Color", mItemListArray));
		 * pSubItemArrayList2.add(new SubCategory("Cloths", mItemListArray2));
		 *//**
         * ArrayList<Product> means it is an arraylist of the object Product...First level String variables
         */

        pProductArrayList = new ArrayList<Product>();
        pProductArrayList.add(new Product("SQUINT", pSubItemArrayList));
        pProductArrayList.add(new Product("CONGENITAL CANCER OF THE EYE", pSubItemArrayList2));
        pProductArrayList.add(new Product("CONGENITAL GLAUCOMA", pSubItemArrayList3));
        pProductArrayList.add(new Product("SEVERE EYE INFECTION", pSubItemArrayList4));
        pProductArrayList.add(new Product("EYE INFECTION", pSubItemArrayList5));
        pProductArrayList.add(new Product("CONGENITAL CONDITION OR EYE INFECTION UNLIKELY", pSubItemArrayList6));


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
            final String name = pProductArrayList.get(i).getpName();
            mProductName.setText(name);

            for (int j = 0; j < pProductArrayList.get(i).getmSubCategoryList()
                    .size(); j++) {

                inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View mLinearView2 = inflater.inflate(R.layout.row_second_two, null);
                if (i == 0 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                }

                if (i == 1 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#FFFF00")));

                }
                if (i == 2 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#90EE90")));

                }
                if (i == 3 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#FFFF00")));

                }
                TextView mSubItemName = (TextView) mLinearView2.findViewById(R.id.textViewTitle);
                final RelativeLayout mLinearSecondArrow = (RelativeLayout) mLinearView2.findViewById(R.id.linearSecond);
//                final ImageView mImageArrowSecond = (ImageView) mLinearView2.findViewById(R.id.imageSecondArrow);
//                final LinearLayout mLinearScrollThird = (LinearLayout) mLinearView2.findViewById(R.id.linear_scroll_third);
                if (i == 0 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#ff69b4")));

                }
                if (i == 1 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#ff69b4")));

                }
                if (i == 2 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#90EE90")));

                }
                if (i == 3 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#ff69b4")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#90EE90")));

                }
                if (i == 4 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#90EE90")));

                }
                if (i == 5 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#90EE90")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#90EE90")));

                }


                final String catName = pProductArrayList.get(i).getmSubCategoryList().get(j).getpSubCatName();
                mSubItemName.setText(catName);

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
                }/*
                    TextView mItemName = (TextView) mLinearView3.findViewById(R.id.textViewItemName);
                    TextView mItemPrice = (TextView) mLinearView3.findViewById(R.id.textViewItemPrice);
                    final String itemName = pProductArrayList.get(i).getmSubCategoryList().get(j).getmItemListArray().get(k).getItemName();
                    final String itemPrice = pProductArrayList.get(i).getmSubCategoryList().get(j).getmItemListArray().get(k).getItemPrice();
                    mItemName.setText(itemName);
                    mItemPrice.setText(itemPrice);

//                    mLinearScrollThird.addView(mLinearView3);*/
//                }

                mLinearScrollSecond.addView(mLinearView2);

            }


            mLinearListView.addView(mLinearView);
        }

        return rootView;
    }
}
