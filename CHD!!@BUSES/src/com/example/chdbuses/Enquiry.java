package com.example.chdbuses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Enquiry extends Activity {
	ListView lv;
    ArrayAdapter<String> adapter;
    String[] Route= {
    		"Enquiry ISBT 17                 0172 2700006",
    		"Enquiry ISBT 43				   0172 2624413",
    		"Duty Inspector Depot 1		   0172 2650331",
    		"Duty Inspector Depot 2	   0172 2679255",
    		"Duty Inspector Depot 3	   0172 2701462"
    };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enquiry);
		lv = (ListView) findViewById(R.id._enq);
		adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Route);//
		lv.setAdapter(adapter);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enquiry, menu);
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
