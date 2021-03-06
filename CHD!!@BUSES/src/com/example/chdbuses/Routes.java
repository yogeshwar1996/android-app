package com.example.chdbuses;

import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.SearchView.OnQueryTextListener;

import java.util.*;

public class Routes extends ListActivity// Activity
{
	String place;
	// ListView lv;
	// SearchView sv;
	String[] places = { "ISBT 17", "ISBT 43", "ISBT Panchkula Sector 4",
			"ISBT Mohali", "PGI Sector12", "NEW OPD", "Elante Mall Phase1 Chd",
			"IVY Hospital Mohali(72/71)", "Derabassi", "Naya Gaon", "Sector15",
			"Sector 16/10(16Hospital)", "Sector32/30(32 Hospital)"

	};//
	// String names[].....
	int[] images = { R.drawable.tashkent, R.drawable.tonga, R.drawable.turkey,
			R.drawable.peru, R.drawable.tashkent, R.drawable.tonga,
			R.drawable.turkey, R.drawable.peru, R.drawable.tashkent,
			R.drawable.tonga, R.drawable.turkey, R.drawable.peru,
			R.drawable.yougosalavia };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_routes);

		CustomAdapter adapter = new CustomAdapter(this, places, images);
		setListAdapter(adapter);
		/*
		 * lv=(ListView) findViewById(R.id.listView1); sv=(SearchView)
		 * findViewById(R.id.searchView1);
		 * 
		 * final Adapter adapter= new Adapter(this, getPlayers());
		 * lv.setAdapter(adapter);
		 * 
		 * sv.setOnQueryTextListener(new OnQueryTextListener() {
		 * 
		 * @Override public boolean onQueryTextSubmit(String query) { return
		 * false; }
		 * 
		 * @Override public boolean onQueryTextChange(String query) {
		 * adapter.getFilter().filter(query); return false; } });
		 */
	}

	/*
	 * private ArrayList<Player> getPlayers() { ArrayList<Player> players= new
	 * ArrayList<Player>(); Player p;
	 * 
	 * for(int i=0;i<names.length;i++) { p= new Player(names[i],images[i]);
	 * players.add(p); } return players; }
	 */
	// //////////////////////////////////////////////////////////////////////

	protected void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(this, l.getItemAtPosition(position).toString(),
				Toast.LENGTH_SHORT).show();
		place = l.getItemAtPosition(position).toString();

		switch (place) {
		case "ISBT 17":

			Intent bus_stand_ = new Intent(Routes.this, ISBT17.class);
			Routes.this.startActivity(bus_stand_);
			break;
		case "ISBT 43":
			Intent bus_stand = new Intent(Routes.this, ISBT43.class);
			Routes.this.startActivity(bus_stand);
			break;

		case "PGI Sector12":
			Intent Tur = new Intent(Routes.this, PGI.class);
			Routes.this.startActivity(Tur);
			break;
		default:
			System.out.println("wrong Choice");
		}
	}

	// /////////////////////////////////////////////////////////////////
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.routes, menu);
		return true;
	}

	// /////////////////////////////////////////////////////////////////
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
