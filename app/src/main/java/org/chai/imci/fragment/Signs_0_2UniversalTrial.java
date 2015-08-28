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

import org.chai.imci.assessment.model.Product;
import org.chai.imci.assessment.model.Product.SubCategory;
import org.chai.imci.assessment.model.Product.SubCategory.ItemList;

import org.chai.imci.R;

import java.util.ArrayList;

public class Signs_0_2UniversalTrial extends Fragment {

    private ArrayList<Product> pProductArrayList;
    private ArrayList<SubCategory> pSubItemArrayList;
    private ArrayList<SubCategory> pSubItemArrayList2;
    private ArrayList<SubCategory> pSubItemArrayList3;
    private LinearLayout mLinearListView;
    boolean isFirstViewClick = false;
    boolean isSecondViewClick = false;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.universal_indicator, container, false);
        //mLinearListView = (LinearLayout) findViewById(R.id.linear_listview);
        mLinearListView = (LinearLayout) rootView.findViewById(R.id.linear_listview);
        /**
         *
         */

        ArrayList<ItemList> mItemListArray = new ArrayList<ItemList>();
        mItemListArray.add(new ItemList("Red", "20"));
        mItemListArray.add(new ItemList("Blue", "50"));
        mItemListArray.add(new ItemList("Red", "20"));
        mItemListArray.add(new ItemList("Blue", "50"));

        ArrayList<ItemList> mItemListArray2 = new ArrayList<ItemList>();
        mItemListArray2.add(new ItemList("Pant", "2000"));
        mItemListArray2.add(new ItemList("Shirt", "1000"));
        mItemListArray2.add(new ItemList("Pant", "2000"));
        mItemListArray2.add(new ItemList("Shirt", "1000"));
        mItemListArray2.add(new ItemList("Pant", "2000"));
        mItemListArray2.add(new ItemList("Shirt", "1000"));

        ArrayList<ItemList> mItemListArray3 = new ArrayList<ItemList>();
        mItemListArray3.add(new ItemList("Pant", "2000"));
        mItemListArray3.add(new ItemList("Shirt", "1000"));
        mItemListArray3.add(new ItemList("Pant", "2000"));
        mItemListArray3.add(new ItemList("Shirt", "1000"));
        mItemListArray3.add(new ItemList("Pant", "2000"));
        mItemListArray3.add(new ItemList("Shirt", "1000"));

        /**
         *
         */
        pSubItemArrayList = new ArrayList<SubCategory>();
        pSubItemArrayList2 = new ArrayList<SubCategory>();
        pSubItemArrayList3 = new ArrayList<SubCategory>();

        pSubItemArrayList.add(new SubCategory("Color", mItemListArray));
        pSubItemArrayList2.add(new SubCategory("Cloths", mItemListArray2));
        pSubItemArrayList3.add(new SubCategory("Color", mItemListArray3));
    /*
        pSubItemArrayList.add(new SubCategory("Color", mItemListArray));
		pSubItemArrayList2.add(new SubCategory("Cloths", mItemListArray2));
		*//**
         *
         */

        pProductArrayList = new ArrayList<Product>();
        pProductArrayList.add(new Product("Emotions", pSubItemArrayList));
        pProductArrayList.add(new Product("Garments", pSubItemArrayList2));
        pProductArrayList.add(new Product("Garments", pSubItemArrayList3));


        /***
         * adding item into listview
         */
        for (int i = 0; i < pProductArrayList.size(); i++) {

            inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View mLinearView = inflater.inflate(R.layout.row_first, null);

            final TextView mProductName = (TextView) mLinearView.findViewById(R.id.textViewName);
            final RelativeLayout mLinearFirstArrow = (RelativeLayout) mLinearView.findViewById(R.id.linearFirst);
            final ImageView mImageArrowFirst = (ImageView) mLinearView.findViewById(R.id.imageFirstArrow);
            final LinearLayout mLinearScrollSecond = (LinearLayout) mLinearView.findViewById(R.id.linear_scroll);

            if (isFirstViewClick == false) {
                mLinearScrollSecond.setVisibility(View.GONE);
                mImageArrowFirst.setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
            } else {
                mLinearScrollSecond.setVisibility(View.VISIBLE);
                mImageArrowFirst.setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
            }

            mLinearFirstArrow.setOnTouchListener(new OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event) {

                    if (isFirstViewClick == false) {
                        isFirstViewClick = true;
                        mImageArrowFirst.setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
                        mLinearScrollSecond.setVisibility(View.VISIBLE);

                    } else {
                        isFirstViewClick = false;
                        mImageArrowFirst.setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
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
            for (int j = 0; j < pProductArrayList.get(i).getmSubCategoryList().size(); j++) {

                inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View mLinearView2 = inflater.inflate(R.layout.row_second, null);

                TextView mSubItemName = (TextView) mLinearView2.findViewById(R.id.textViewTitle);
                final RelativeLayout mLinearSecondArrow = (RelativeLayout) mLinearView2.findViewById(R.id.linearSecond);
                final ImageView mImageArrowSecond = (ImageView) mLinearView2.findViewById(R.id.imageSecondArrow);
                final LinearLayout mLinearScrollThird = (LinearLayout) mLinearView2.findViewById(R.id.linear_scroll_third);

                if (isSecondViewClick == false) {
                    mLinearScrollThird.setVisibility(View.GONE);
                    mImageArrowSecond.setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
                } else {
                    mLinearScrollThird.setVisibility(View.VISIBLE);
                    mImageArrowSecond.setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
                }

                mLinearSecondArrow.setOnTouchListener(new OnTouchListener() {

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {

                        if (isSecondViewClick == false) {
                            isSecondViewClick = true;
                            mImageArrowSecond.setBackgroundResource(R.drawable.apptheme_btn_radio_on_holo_dark);
                            mLinearScrollThird.setVisibility(View.VISIBLE);

                        } else {
                            isSecondViewClick = false;
                            mImageArrowSecond.setBackgroundResource(R.drawable.apptheme_btn_radio_off_holo_dark);
                            mLinearScrollThird.setVisibility(View.GONE);
                        }
                        return false;
                    }
                });


                final String catName = pProductArrayList.get(i).getmSubCategoryList().get(j).getpSubCatName();
                mSubItemName.setText(catName);
                /**
                 *
                 */
                for (int k = 0; k < pProductArrayList.get(i).getmSubCategoryList().get(j).getmItemListArray().size(); k++) {

                    inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    View mLinearView3 = inflater.inflate(R.layout.row_third, null);

                    TextView mItemName = (TextView) mLinearView3.findViewById(R.id.textViewItemName);
                    TextView mItemPrice = (TextView) mLinearView3.findViewById(R.id.textViewItemPrice);
                    final String itemName = pProductArrayList.get(i).getmSubCategoryList().get(j).getmItemListArray().get(k).getItemName();
                    final String itemPrice = pProductArrayList.get(i).getmSubCategoryList().get(j).getmItemListArray().get(k).getItemPrice();
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
