package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus202 extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    							"ISBT 43",
    							"Sec 35/36",
    							"Kisan Bhawan",
    							"Sec 22/23",
    							"ISBT 17",
    							"Sec 17/18",
    							"KC Residency",
    							"Sec 17/9",
    							"Sec 9 UT Secretariat",
    							"MLA FLats Sec 4",
    							"Civil Secretariat Punjab and Haryana",
    							"Sec 1 High Court",
    							"Sec 1 Rock Garden",
    							"Civil Secretariat Punjab and Haryana",
    							"Sec 9 UT Secretariat",
    							"Sec 16/17",
    							"ISBT 17",
    							"Sec 22/23",	"Kisan Bhawan","Sec 35/36","ISBT 43"
    		};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus202);
		lv = (ListView) findViewById(R.id._202);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus202, menu);
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
