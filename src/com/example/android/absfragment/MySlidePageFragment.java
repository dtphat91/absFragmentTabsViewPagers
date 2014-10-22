package com.example.android.absfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.app.SherlockFragment;

@SuppressLint("ValidFragment")
public class MySlidePageFragment extends SherlockFragment {

	private int position = 0;
	
	public MySlidePageFragment(int position) {
		super();
		this.position = position;
	}
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
    	
        ViewGroup rootView = null;
        if (position == 0) {
        	rootView = (ViewGroup) inflater.inflate(
                R.layout.fragmenttab1, container, false);
        } else if (position == 1) {
        	rootView = (ViewGroup) inflater.inflate(
                    R.layout.fragmenttab2, container, false);
        } else if (position == 2) {
        	rootView = (ViewGroup) inflater.inflate(
                    R.layout.fragmenttab3, container, false);
        } else {
        	rootView = (ViewGroup) inflater.inflate(
                    R.layout.fragmenttab1, container, false);
        }
        return rootView;
    }
}
