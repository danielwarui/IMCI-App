package org.chai.imci.assessment.fragment;

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


public class TreatmentDiarrhoea extends Fragment {

	private ArrayList<Product> pProductArrayList;
	private ArrayList<SubCategory> pSubItemArrayList;
	private ArrayList<SubCategory> pSubItemArrayList2;
	private ArrayList<SubCategory> pSubItemArrayList3;
	private LinearLayout mLinearListView;
	boolean isFirstViewClick = false;
	boolean isSecondViewClick = false;
	String 
	treat_severe_dehydration, 
	treat_some_dehydration, 
	treat_no_dehydration, 
	treat_severe_persistent_diarrhoea, 
	treat_persistent_diarrhoea, 
	treat_dysentry;

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
		treat_severe_dehydration = getResources().getString(
				R.string.severe_dehydration);
		treat_some_dehydration = getResources().getString(
				R.string.some_dehydration_treatment);
		treat_no_dehydration = getResources().getString(
				R.string.no_dehydration_treatment);
		treat_severe_persistent_diarrhoea= getResources().getString(
				R.string.severe_persistent_diarrhoea_treatment);
		treat_persistent_diarrhoea= getResources().getString(
				R.string.persistent_diarrhoea_treatment);
		treat_dysentry= getResources().getString(
				R.string.dysentry_treatment);

		ArrayList<ItemList> mItemListArray = new ArrayList<ItemList>();
		mItemListArray.add(new ItemList("", treat_severe_dehydration));
		ArrayList<ItemList> mItemListArrayP1 = new ArrayList<ItemList>();
		mItemListArrayP1.add(new ItemList("", treat_some_dehydration));
		ArrayList<ItemList> mItemListArrayP2 = new ArrayList<ItemList>();
		mItemListArrayP2.add(new ItemList("", treat_no_dehydration));

		ArrayList<ItemList> mItemListArray2 = new ArrayList<ItemList>();
		mItemListArray2.add(new ItemList("", treat_severe_persistent_diarrhoea));
		ArrayList<ItemList> mItemListArray2P1 = new ArrayList<ItemList>();
		mItemListArray2P1.add(new ItemList("", treat_persistent_diarrhoea));

		ArrayList<ItemList> mItemListArray3 = new ArrayList<ItemList>();
		mItemListArray3.add(new ItemList("", treat_dysentry));

		/**
		 * 
		 */
		pSubItemArrayList = new ArrayList<SubCategory>();
		pSubItemArrayList2 = new ArrayList<SubCategory>();
		pSubItemArrayList3 = new ArrayList<SubCategory>();

		pSubItemArrayList.add(new SubCategory("SEVERE DEHYDRATION",mItemListArray));
		pSubItemArrayList.add(new SubCategory("SOME DEHYDRATION",mItemListArrayP1));
		pSubItemArrayList.add(new SubCategory("NO DEHYDRATION",mItemListArrayP2));

		pSubItemArrayList2.add(new SubCategory("SEVERE PERSISTENT DIARRHOEA", mItemListArray2));
		pSubItemArrayList2.add(new SubCategory("PERSISTENT DIARRHOEA", mItemListArray2P1));
		
		pSubItemArrayList3.add(new SubCategory("DYSENTERY", mItemListArray3));
		/*
		 * pSubItemArrayList.add(new SubCategory("Color", mItemListArray));
		 * pSubItemArrayList2.add(new SubCategory("Cloths", mItemListArray2));
		 *//**
		 * 
		 */

		pProductArrayList = new ArrayList<Product>();
		pProductArrayList.add(new Product("for dehydration", pSubItemArrayList));
		pProductArrayList.add(new Product("if diarrhoea 7 days or more",pSubItemArrayList2));
		pProductArrayList.add(new Product("if blood in the stool",pSubItemArrayList3));

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
						.setBackgroundResource(R.drawable.arrow_points_down);
			} else {
				mLinearScrollSecond.setVisibility(View.VISIBLE);
				mImageArrowFirst
						.setBackgroundResource(R.drawable.arrow_points_right);
			}

			mLinearFirstArrow.setOnTouchListener(new OnTouchListener() {

				@Override
				public boolean onTouch(View v, MotionEvent event) {

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
							.setBackgroundResource(R.drawable.arrow_points_down);
				} else {
					mLinearScrollThird.setVisibility(View.VISIBLE);
					mImageArrowSecond
							.setBackgroundResource(R.drawable.arrow_points_right);
				}

				mLinearSecondArrow.setOnTouchListener(new OnTouchListener() {

					@Override
					public boolean onTouch(View v, MotionEvent event) {

						if (isSecondViewClick == false) {
							isSecondViewClick = true;
							mImageArrowSecond
									.setBackgroundResource(R.drawable.arrow_points_down);
							mLinearScrollThird.setVisibility(View.VISIBLE);

						} else {
							isSecondViewClick = false;
							mImageArrowSecond
									.setBackgroundResource(R.drawable.arrow_points_right);
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