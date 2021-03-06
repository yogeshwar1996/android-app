package com.example.chdbuses;

import android.os.Bundle;
import android.view.Menu;

import android.view.MenuItem;
import android.app.Activity;
import android.widget.*;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.content.Intent;

public class Splash_Screen extends Activity {

	ImageView Splash_;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash__screen);

		// object initialisation
		Splash_ = (ImageView) findViewById(R.id.imageView1);

		// animation
		Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.slide_out_left);

		// assign animation to the image
		Splash_.setAnimation(anim);

		// define what happens when animation completes
		anim.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {
			}

			@Override
			public void onAnimationRepeat(Animation animation) {
			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent i = new Intent(Splash_Screen.this, MainActivity.class);
				Splash_Screen.this.startActivity(i);
				finish();
			}
		});
	}

}
