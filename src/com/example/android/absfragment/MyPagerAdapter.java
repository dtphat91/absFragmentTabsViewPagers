package com.example.android.absfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
	
	Fragment fragmentTab1; 
	Fragment fragmentTab2; 
	Fragment fragmentTab3; 
	Fragment fragmentTab4;
	
    public MyPagerAdapter(FragmentManager fm, 
    		Fragment fragmentTab1, 
    		Fragment fragmentTab2, 
    		Fragment fragmentTab3, 
    		Fragment fragmentTab4) {
    	super(fm);
    }

    @Override
    public Fragment getItem(int position) {
    	return new MySlidePageFragment(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}