package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class I_Activity extends Activity {
	ViewPager view_p;
	SwipeAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_i_);
		
		view_p=(ViewPager) findViewById(R.id.view_p);
		adapter= new SwipeAdapter(this);
		view_p.setAdapter(adapter);
	}

	
	
}
