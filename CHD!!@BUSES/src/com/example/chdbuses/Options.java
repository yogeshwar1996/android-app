package com.example.chdbuses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Options extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
		
		ImageButton imgButton_o = (ImageButton) findViewById(R.id.imageButton_o);
		imgButton_o.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Ganna",Toast.LENGTH_LONG).show();
				Intent i = new Intent(Options.this,Gaana.class);
				Options.this.startActivity(i);

			}
		});
		ImageButton imgButton_d = (ImageButton) findViewById(R.id.imageButton_d);
		imgButton_d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Bus Fares",Toast.LENGTH_LONG).show();
				Intent i = new Intent(Options.this,Info.class);
				Options.this.startActivity(i);

			}
		});
		ImageButton imgButton_e = (ImageButton) findViewById(R.id.imageButton1);
		imgButton_e.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Enquiry",Toast.LENGTH_LONG).show();
				Intent i = new Intent(Options.this,Enquiry.class);
				Options.this.startActivity(i);

			}
		});
		ImageButton imgButton_f = (ImageButton) findViewById(R.id.imageButton2);
		imgButton_f.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Contacts",Toast.LENGTH_LONG).show();
				Intent intent = new Intent(Intent.ACTION_INSERT_OR_EDIT);
				intent.setType(Contacts.CONTENT_ITEM_TYPE);
				
				startActivity(intent);
				//intent = new Intent(Intent.ACTION_PICK);
				//intent.setData(Contacts.CONTENT_URI);
				//startActivity(intent);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options, menu);
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
