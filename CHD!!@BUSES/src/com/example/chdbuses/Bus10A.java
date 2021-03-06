package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus10A extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    					"Phase 11",
    					"Sec 65/64",
    					"Sec 48/49",
    					"Sec 47/46",
    					"Sec 31/32",
    					"Sec 29/30",
    					"Sec 27/26",
    					"Sec 26 Grain Market",
    					"Housing Board",
    					"Manimajra",
    					"MansaDevi",
    					"Railway Station",
    					"CTU Workshop",
    					"Sec 19/7",
    					"Sec 19/18",
    					"Sec 20/21",
    					"Sec 33/34",
    					"Sec 44/45",
    					"ISBT 43",
    					"Sec 51/52",
    					"Phase 7",
    					"ISBT Mohali",
    					"Sec 63",
    					"Sec 64",
    					"Phase10"
    		
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus10);
		lv = (ListView) findViewById(R.id.a_10);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus10, menu);
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
