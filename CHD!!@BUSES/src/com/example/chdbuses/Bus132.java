package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus132 extends Activity {

ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    						"Sec 12 PGI",
    						"Sec 11 Market",
    						"Sec 10/16",
    						"Sec 17/16",
    						"ISBT 17",
    						"Aroma Chowk @ 21/22",
    						"Sec 34/35",
    						"Sec 44/43",
    						"ISBT 43",
    						"Sec 53/52",
    						"Sec 51 YPS",
    						"Sec 51 Market",
    						"Sec 50 Market",
    						"Sec 49 Market",
    						"Sec 48 Market",
    						"Sec 48 Outer",
    						"Phase 2 Mohali",
    						"Railway Station Mohali"
    						
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus132);
		lv = (ListView) findViewById(R.id._132);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus132, menu);
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
