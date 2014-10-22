package com.example.android.absfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class MainActivity extends SherlockFragmentActivity {

	ActionBar.Tab tab1, tab2, tab3, tab4;
	
	Fragment fragmentTab1 = new MySlidePageFragment(1);
	Fragment fragmentTab2 = new MySlidePageFragment(2);
	Fragment fragmentTab3 = new MySlidePageFragment(3);
	Fragment fragmentTab4 = new MySlidePageFragment(4);

	private ViewPager mPager;
	private MyPagerAdapter mPagerAdapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ActionBar actionBar = getSupportActionBar();

		mPager = (ViewPager) findViewById(R.id.my_pager);
		mPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),
				fragmentTab1, fragmentTab2, fragmentTab3, fragmentTab4);
		mPager.setAdapter(mPagerAdapter);
		
		// Hide Actionbar Icon
		actionBar.setDisplayShowHomeEnabled(true);

		// Hide Actionbar Title
		actionBar.setDisplayShowTitleEnabled(false);

		// Create Actionbar Tabs
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Set Tab Icon and Titles
		//tab1 = actionBar.newTab().setIcon(R.drawable.tab1);
		tab1 = actionBar.newTab().setText("Tab1");
		tab2 = actionBar.newTab().setText("Tab2");
		tab3 = actionBar.newTab().setText("Tab3");
		tab4 = actionBar.newTab().setText("Tab4");
		
		// Set Tab Listeners
		tab1.setTabListener(new TabListener(fragmentTab1, mPager));
		tab2.setTabListener(new TabListener(fragmentTab2, mPager));
		tab3.setTabListener(new TabListener(fragmentTab3, mPager));
		tab4.setTabListener(new TabListener(fragmentTab4, mPager));
		
		// Add tabs to actionbar
		actionBar.addTab(tab1);
		actionBar.addTab(tab2);
		actionBar.addTab(tab3);
		actionBar.addTab(tab4);
		
		mPager.setOnPageChangeListener(new OnPageChangeListener() {
			@Override
			public void onPageSelected(int position) {
				actionBar.setSelectedNavigationItem(position);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				
			}
		});
	}
}
