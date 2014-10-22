package com.example.android.absfragment;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

public class TabListener implements ActionBar.TabListener {

	Fragment fragment;
	ViewPager pager;

	public TabListener(Fragment fragment, ViewPager pager) {
		this.fragment = fragment;
		this.pager = pager;
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		if (pager!=null) {
			pager.setCurrentItem(tab.getPosition(), true);
		}
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(fragment);
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		if (pager!=null) {
			pager.setCurrentItem(tab.getPosition(), true);
		}
	}
}