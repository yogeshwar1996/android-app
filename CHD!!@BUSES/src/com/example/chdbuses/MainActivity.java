package com.example.chdbuses;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	ImageButton imgButton;
	ImageButton imgButton2;
	ImageButton imgButton_y;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imgButton = (ImageButton) findViewById(R.id.imageButton1);
	    Animation fade = AnimationUtils.loadAnimation(this, R.anim.fadein);
	    imgButton.startAnimation(fade);
		imgButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "BUSES",
						Toast.LENGTH_LONG).show();
				Intent i = new Intent(MainActivity.this, Buses.class);
				MainActivity.this.startActivity(i);

			}
		});
		imgButton2 = (ImageButton) findViewById(R.id.imageButton2);
		Animation fade2 = AnimationUtils.loadAnimation(this, R.anim.fadein);
	    imgButton2.startAnimation(fade2);
		
		imgButton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "ROUTES",
						Toast.LENGTH_LONG).show();
				Intent i = new Intent(MainActivity.this, Routes.class);
				MainActivity.this.startActivity(i);
			}
		});

		imgButton_y = (ImageButton) findViewById(R.id.image_y);
		Animation fade_y = AnimationUtils.loadAnimation(this, R.anim.fadein);
	    imgButton_y.startAnimation(fade_y);
		
		imgButton_y.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Images",
						Toast.LENGTH_LONG).show();
				Intent i = new Intent(MainActivity.this, I_Activity.class);
				MainActivity.this.startActivity(i);

			}
		});
	
	ImageButton imgButton4 = (ImageButton) findViewById(R.id.imageButton3);
	Animation fade4 = AnimationUtils.loadAnimation(this, R.anim.fadein);
    imgButton4.startAnimation(fade4);
	
	imgButton4.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Toast.makeText(getApplicationContext(), "BUSES",
					Toast.LENGTH_LONG).show();
			Intent i = new Intent(MainActivity.this, Buses.class);
			MainActivity.this.startActivity(i);

		}
	});
	ImageButton imgButton5 = (ImageButton) findViewById(R.id.imageButton3);
	Animation fade5 = AnimationUtils.loadAnimation(this, R.anim.fadein);
    imgButton5.startAnimation(fade5);
	
	imgButton5.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Toast.makeText(getApplicationContext(), "Options",
					Toast.LENGTH_LONG).show();
			Intent i = new Intent(MainActivity.this, Options.class);
			MainActivity.this.startActivity(i);

		}
	});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
