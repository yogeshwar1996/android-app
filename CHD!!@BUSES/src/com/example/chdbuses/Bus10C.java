package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus10C extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    						"ISBT 43",
    						"Sec 44/51 (44C)",
    						"Colony No.5",
    						"Sec 45 Market",
    						"Sec 46 Market",
    						"Sec 47 Market",
    						"Ram Darbar",
    						"Poultry Farm Indutrial Area",
    						"CTU Workshop Phase 1 Chd",
    						"Railway  Station ",
    						"Housing Board Chowk",
    						"Manimajra",
    						"MansaDevi"
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus10_c);
		lv = (ListView) findViewById(R.id.c_10);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus10_c, menu);
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
