package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus18A extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    		"ISBT 43",
			"Sec 44/43",
			"Sec 42/43",
			"Sec 36/35 Attawa",
			"Sec 23/22",
			"ISBT 17",
			"Sec 17/18",
			"Sec 9/8",
			"Sec 9 Market",
			"Sec 10/9",
			"MLA Flats Sec 4",
			"Civil secreteriat Punj. and Haryana",
			"Sec 1 High Court",
			"Sukhna Lake"
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus18_a);
		lv = (ListView) findViewById(R.id.a_18);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus18, menu);
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
