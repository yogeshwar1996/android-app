package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus19A extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    		"ISBT 43","Sec 22/23",
			"ISBT 17","Aroma Chowk @21/22",
			"Sec 21 Market","Sec 20 Market","Sec 19/27",
			"Sec 27 Market",
			"Sec 28 Market",
			"CTU Workshop",
			"Railway Station Chandigarh",
			"Modern Complex",
			"MM Town",
			"Manimajra",
			"MansaDevi",

    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus19_a);
		lv = (ListView) findViewById(R.id.a_19);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus19, menu);
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
