package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus1A extends Activity
{
     ListView lv;
     ArrayAdapter<String> adapter;
     String[] Route={
					"Sec 12 PGI",
					"Sec 14/15",
					"Sec 15 Market",
					"Sec 16 Market",
					"Sec 17 ISBT",
					"Sec 18 Market",
					"Sec 19 Market",
					"Sec 27 Market",
					"Sec 28 Market",
					"CTU WorkShop Phase 1 Chd",
					"Railway Station Chandigarh",
					"Housing Board Chowk",
					"ManiMajra",
					"MM Town",
					"ModernComplex",
					"RailwayStation",
					"Sec 26 grain market",
					"Sec 26 GGSCollege",
					"Sec 7 Market",
					"Sec 8 Market",
					"Sec 9 Market",
					"Sec 10 Market",
					"Sec 11 Market",
					"OPD PGI",
					"Sec 12 PGI"
					
    };
     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus1_a);
		lv = (ListView) findViewById(R.id.a_1);//
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus1, menu);
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
