package com.example.chdbuses;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ISBT17 extends Activity 
{
	ListView lv; //
	ArrayAdapter<String> adapter; //
	String[] Buses = { "Route1A", "Route1C", "Route2A", "Route2B", "Route2C",
			"Route2D", "Route2F", "Route4A", "Route4C", "Route7A", "Route7C",
			"Route17", "Route20", "Route22", "Route25", "Route26", "Route27",
			"Route28", "Route30", "Route32", "Route35B", "Route35", "Route37",
			"Route39", "Route40", "Route123A" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_isbt17);
		lv = (ListView) findViewById(R.id.listView1);//
		adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Buses);//
		lv.setAdapter(adapter);//
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.isbt17, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
