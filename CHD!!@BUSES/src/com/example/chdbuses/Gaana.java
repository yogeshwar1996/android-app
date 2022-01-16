package com.example.chdbuses;

import java.io.IOException;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Gaana extends Activity {
	MediaPlayer mplayer=new MediaPlayer();
	AssetFileDescriptor audio;
		@Override
	protected void onCreate(Bundle savedInstanceState) 
		{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gaana);
	}
	@Override
  protected void onResume()
 {
		super.onResume();
		try{
			audio=getAssets().openFd("bus_song.mp3");
			mplayer.setDataSource(audio.getFileDescriptor(),audio.getStartOffset(),audio.getLength());
			mplayer.prepare();
			mplayer.start();
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
}
	@Override
protected void onPause(){
	super.onPause();
	mplayer.release();
}


}
