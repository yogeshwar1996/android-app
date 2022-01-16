package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus12A extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    						"Phase 11",
    						"Sec 65",
    						"Sec 64",
    						"Sec 63",
    						"Sec 62/61",
    						"Sec 51/50",
    						"Sec 45/44",
    						"Sec 34/33",
    						"Sec 21/20",
    						"Sec 18/19",
    						"Sec 8/7",
    						"Sec 5/6",
    						"Sukhana Lake",
    						"RockGarden",
    						"Sec 1 HighCourt",
    						"Civil Secretariat Punjab and Haryana",
    						"Sector 1 MLA Flats",
    						"Sec 3/4",
    						"Sec 10/9",
    						"Sec 16/17",
    						"ISBT 17",
    						"Sec 22/23",
    						"Sec 35/36",
    						"Sec 42/43",
    						"ISBT 43",
    						"Sec 53/52",
    						"Sec 60/61",
    						"Sec 62",
    						"Sec 63",
    						"Sec 64",
    						"Sec 65",
    						"Phase11"
    						
    						
    						
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus12);
		lv = (ListView) findViewById(R.id.a_12);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus12, menu);
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
