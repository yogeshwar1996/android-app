package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus201 extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    					"ISBT 43",
    					"Sec 44/43",
    					"Sec 34/35",
    					"Sec 35 Kisan Bhawan",
    					"Sec 23/22",
    					"ISBT Sec 17",
    					"ARoma @ Sec 21/22",
    					"Sec 21 market",
    					"Sec 20 market",
    					"Sec 30 market",
    					"Sec 29 market",
    					"Elante Phase 1 Chd",
    					"Poultry Farm",
    					"Hallo Majra",
    					"Airport"
    					
    					
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus201);
		lv = (ListView) findViewById(R.id._201);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus201, menu);
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
