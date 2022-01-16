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

public class ISBT43 extends Activity {

	ListView lv; //

	String[] Buses = { "Route4A", "Route4C", "Route5A", "Route5C", "Route7A",
			"Route7C", "Route8A", "Route10", "Route17", "Route18", "Route18A",
			"Route19A", "Route20", "Route202", "Route203", "Route205",
			"Route206A", "Route207", "Route22", "Route23", "Route23A",
			"Route24A", "Route24C", "Route27", "Route28", "Route29",
			"Route30A", "Route30B", "Route32A", "Route35B", "Route39",
			"Route45", "Route123A", };
	ArrayAdapter<String> adapter;//

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_isbt43);

		lv = (ListView) findViewById(R.id.listView1);//

		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, Buses);//

		lv.setAdapter(adapter);//

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.isbt43, menu);
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
