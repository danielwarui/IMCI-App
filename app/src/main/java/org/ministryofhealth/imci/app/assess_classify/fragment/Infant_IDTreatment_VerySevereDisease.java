package org.ministryofhealth.imci.app.assess_classify.fragment;

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
import org.ministryofhealth.imci.app.utils.model.Product;
import org.ministryofhealth.imci.app.utils.model.Product.SubCategory;
import org.ministryofhealth.imci.app.utils.model.Product.SubCategory.ItemList;

import java.util.ArrayList;

public class Infant_IDTreatment_VerySevereDisease extends Fragment {

    boolean isFirstViewClick = false;
    boolean isSecondViewClick = false;
    String signsSevereDehydration, signsSomeDehydration, noDehydration,
            severeProlonged, possibleAbdominal;
    private ArrayList<Product> pProductArrayList;
    private ArrayList<SubCategory> pSubItemArrayList, pSubItemArrayList2, pSubItemArrayList3, pSubItemArrayList4;
    private String signsSevereDiseases, signsLocalBacteria, signsUnlikelyBact, signsLowBodyTemp;
    private LinearLayout mLinearListView;

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

        signsSevereDiseases = getString(R.string.young_treatment_very_severe_disease);
        signsLocalBacteria = getString(R.string.young_treatment_local_bacterial_infection);
        signsUnlikelyBact = getString(R.string.young_treatment_unlikely_localbactandseveredisease);
        signsLowBodyTemp = getString(R.string.young_treatment_low_body_temperature);
		/*
         * Third level String variables
		 */
        ArrayList<ItemList> itemNothing = new ArrayList<ItemList>();
        itemNothing.add(new ItemList("", ""));

        /**
         * Second Level list items
         */
        pSubItemArrayList = new ArrayList<SubCategory>();
        pSubItemArrayList.add(new SubCategory(signsSevereDiseases, itemNothing));

        pSubItemArrayList2 = new ArrayList<SubCategory>();
        pSubItemArrayList2.add(new SubCategory(signsLocalBacteria, itemNothing));

        pSubItemArrayList3 = new ArrayList<SubCategory>();
        pSubItemArrayList3.add(new SubCategory(signsUnlikelyBact, itemNothing));

        pSubItemArrayList4 = new ArrayList<SubCategory>();
        pSubItemArrayList4.add(new SubCategory(signsLowBodyTemp, itemNothing));

		/*
         * pSubItemArrayList.add(new SubCategory("Color", mItemListArray));
		 * pSubItemArrayList2.add(new SubCategory("Cloths", mItemListArray2));
		 *//**
         * ArrayList<Product> means it is an arraylist of the object Product...First level String variables
         */

        pProductArrayList = new ArrayList<Product>();
        pProductArrayList.add(new Product("VERY SEVERE DISEASE", pSubItemArrayList));
        pProductArrayList.add(new Product("LOCAL BACTERIAL INFECTION", pSubItemArrayList2));
        pProductArrayList.add(new Product("VERY SEVERE DISEASE OR LOCAL BACTERIAL INFECTION UNLIKELY", pSubItemArrayList3));
        pProductArrayList.add(new Product("LOW BODY TEMPERATURE", pSubItemArrayList4));


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
                            .parseColor("#FFFF00")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#FFFF00")));

                }
                if (i == 2 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#90EE90")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#90EE90")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#90EE90")));

                }
                if (i == 3 && j == 0) {
                    mLinearView2.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mSubItemName.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
                    mLinearSecondArrow.setBackgroundColor((Color
                            .parseColor("#FFFF00")));
//                    mLinearScrollThird.setBackgroundColor((Color
//                            .parseColor("#FFFF00")));

                }

              /*  if (isSecondViewClick == false) {
                    mLinearScrollThird.setVisibility(View.GONE);
                    mImageArrowSecond.setBackgroundResource(R.drawable.arrow_points_right);
                } else {
                    mLinearScrollThird.setVisibility(View.VISIBLE);
                    mImageArrowSecond.setBackgroundResource(R.drawable.arrow_points_down);
                }*/

              /*  mLinearSecondArrow.setOnClickListener(new OnClickListener() {

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
                });*/

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
