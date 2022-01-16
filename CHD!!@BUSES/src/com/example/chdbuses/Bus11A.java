package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Bus11A extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    						"Sec 1 HighCourt",
    						"Sec 4/5",
    						"Sec 8/9",
    						"Sec17/18",
    						"ISBT 17",
    						"Sec 21/22",
    						"Sec 34/35",
    						"Sec 43/44",
    						"ISBT 43",
    						"Sec 52/51",
    						"Sec 61/62",
    						"Kumbra",
    						"Sohana",
    						"Law College",
    						"MC office",
    						"Cricket Stadium",
    						"Sec 63/64",
    						"Sec 50/49",
    						"Sec 45/46",
    						"Sec 32/33",
    						"Sec 20/30",
    						"Sec 19/27",
    						"Sec 7/26",
    						"Sec 7/6",
    						"Sec 5/6",
    						"Rock Garden"
    						
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bus11);
		lv = (ListView) findViewById(R.id.a_11);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bus11, menu);
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
