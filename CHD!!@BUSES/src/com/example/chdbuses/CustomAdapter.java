package com.example.chdbuses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.*;
import android.view.View;

public class CustomAdapter extends ArrayAdapter<String> {

	Context c;
	String[] places;
	int[] images;
	LayoutInflater inflater;

	public CustomAdapter(Context context, String[] places, int[] images) {
		super(context, R.layout.row, places);

		this.c = context;
		this.places = places;
		this.images = images;

	}

	// THIS INNER CLASS SHALL HOLD OUR VIEW
	public class ViewHolder {
		TextView tv;
		ImageView img;
	}

	public View getView(int position, View convertView, ViewGroup parent) {// check
																			// if
																			// view
																			// is
																			// null
																			// ,if
																			// so
																			// then
																			// create
																			// it
		if (convertView == null) {
			inflater = (LayoutInflater) c
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.row, null);
		}
		// otherwise
		ViewHolder holder = new ViewHolder();
		// intialize our views
		holder.tv = (TextView) convertView.findViewById(R.id.textView1);
		holder.img = (ImageView) convertView.findViewById(R.id.imageView1);
		// THEN ASSIGN THEM DATA

		holder.tv.setText(places[position]);
		holder.img.setImageResource(images[position]);

		return convertView;

	}
}
