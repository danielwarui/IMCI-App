package org.chai.imci.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.chai.imci.R;
import org.chai.imci.assessment.model.Product;
import org.chai.imci.assessment.model.Product.SubCategory;
import org.chai.imci.assessment.model.Product.SubCategory.ItemList;

import java.util.ArrayList;

public class Sign_0_2EyeInfection extends Fragment {

    private ArrayList<Product> pProductArrayList;
    private ArrayList<SubCategory> pSubItemArrayList;
    private ArrayList<SubCategory> pSubItemArrayList2;
    private ArrayList<SubCategory> pSubItemArrayList3;
    private LinearLayout mLinearListView;
    boolean isFirstViewClick = false;
    boolean isSecondViewClick = false;
    String signsPneumoniaSevere, signsPneumonia, noPneumonia, severeProlonged, possibleAbdominal;

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
        signsPneumoniaSevere = getString(R.string.signs_severe_pneumonia);
        signsPneumonia = getString(R.string.signs_pneumonia);
        noPneumonia = getString(R.string.signs_no_pneumonia);
        severeProlonged = getString(R.string.young_signs_severe_prolonged_diarrhoea);
        possibleAbdominal = getString(R.string.signs_dysentry);

        ArrayList<ItemList> mItemListArray = new ArrayList<ItemList>();
        mItemListArray.add(new ItemList("", signsPneumoniaSevere));
        ArrayList<ItemList> mItemListArrayP1 = new ArrayList<ItemList>();
        mItemListArrayP1.add(new ItemList("", signsPneumonia));
        ArrayList<ItemList> mItemListArrayP2 = new ArrayList<ItemList>();
        mItemListArrayP2.add(new ItemList("", noPneumonia));

        ArrayList<ItemList> mItemListArray2 = new ArrayList<ItemList>();
        mItemListArray2.add(new ItemList("", severeProlonged));

        ArrayList<ItemList> mItemListArray3 = new ArrayList<ItemList>();
        mItemListArray3.add(new ItemList("", possibleAbdominal));

        /**
         *
         */
        pSubItemArrayList = new ArrayList<SubCategory>();
        pSubItemArrayList2 = new ArrayList<SubCategory>();
        pSubItemArrayList3 = new ArrayList<SubCategory>();

        pSubItemArrayList.add(new SubCategory("SEVERE \n DEHYDRATION",
                mItemListArray));
        pSubItemArrayList.add(new SubCategory("SOME \n DEHYDRATION",
                mItemListArrayP1));
        pSubItemArrayList.add(new SubCategory("NO \n DEHYDRATION",
                mItemListArrayP2));

        pSubItemArrayList2.add(new SubCategory(
                "SEVERE \n PROLONGED \n DIARRHOEA", mItemListArray2));
        pSubItemArrayList3.add(new SubCategory(
                "POSSIBLE SERIOUS \n ABDOMINAL \n PROBLEM", mItemListArray3));
        /*
         * pSubItemArrayList.add(new SubCategory("Color", mItemListArray));
		 * pSubItemArrayList2.add(new SubCategory("Cloths", mItemListArray2));
		 *//**
         *
         */

        pProductArrayList = new ArrayList<Product>();
        pProductArrayList
                .add(new Product("for dehydration", pSubItemArrayList));
        pProductArrayList.add(new Product("if diarrhoea 7 days or more",
                pSubItemArrayList2));
        pProductArrayList.add(new Product("if blood in the stool",
                pSubItemArrayList3));

        /***
         * adding item into listview
         */
        for (int i = 0; i < pProductArrayList.size(); i++) {

            inflater = (LayoutInflater) getActivity().getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            View mLinearView = inflater.inflate(R.layout.row_first, null);

            final TextView mProductName = (TextView) mLinearView
                    .findViewById(R.id.textViewName);
            final RelativeLayout mLinearFirstArrow = (RelativeLayout) mLinearView
                    .findViewById(R.id.linearFirst);
            final ImageView mImageArrowFirst = (ImageView) mLinearView
                    .findViewById(R.id.imageFirstArrow);
            final LinearLayout mLinearScrollSecond = (LinearLayout) mLinearView
                    .findViewById(R.id.linear_scroll);

            if (isFirstViewClick == false) {
                mLinearScrollSecond.setVisibility(View.GONE);
                mImageArrowFirst
                        .setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
            } else {
                mLinearScrollSecond.setVisibility(View.VISIBLE);
                mImageArrowFirst
                        .setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
            }

            mLinearFirstArrow.setOnTouchListener(new OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    if (isFirstViewClick == false) {
                        isFirstViewClick = true;
                        mImageArrowFirst
                                .setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
                        mLinearScrollSecond.setVisibility(View.VISIBLE);

                    } else {
                        isFirstViewClick = false;
                        mImageArrowFirst
                                .setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
                        mLinearScrollSecond.setVisibility(View.GONE);
                    }
                    return false;
                }
            });

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

                TextView mSubItemName = (TextView) mLinearView2
                        .findViewById(R.id.textViewTitle);
                final RelativeLayout mLinearSecondArrow = (RelativeLayout) mLinearView2
                        .findViewById(R.id.linearSecond);
                final ImageView mImageArrowSecond = (ImageView) mLinearView2
                        .findViewById(R.id.imageSecondArrow);
                final LinearLayout mLinearScrollThird = (LinearLayout) mLinearView2
                        .findViewById(R.id.linear_scroll_third);

                if (isSecondViewClick == false) {
                    mLinearScrollThird.setVisibility(View.GONE);
                    mImageArrowSecond
                            .setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
                } else {
                    mLinearScrollThird.setVisibility(View.VISIBLE);
                    mImageArrowSecond
                            .setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
                }

                mLinearSecondArrow.setOnTouchListener(new OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {

                        if (isSecondViewClick == false) {
                            isSecondViewClick = true;
                            mImageArrowSecond
                                    .setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
                            mLinearScrollThird.setVisibility(View.VISIBLE);

                        } else {
                            isSecondViewClick = false;
                            mImageArrowSecond
                                    .setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
                            mLinearScrollThird.setVisibility(View.GONE);
                        }
                        return false;
                    }
                });

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
