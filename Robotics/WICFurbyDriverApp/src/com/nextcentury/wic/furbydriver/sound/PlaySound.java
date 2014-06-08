package com.nextcentury.wic.furbydriver.sound;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

public class PlaySound {
	
	public static void playSound( Context context, int resId ) {
		
		MediaPlayer mediaPlayer = MediaPlayer.create( context, resId);
		mediaPlayer.start();
		mediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mediaPlayer) {
				mediaPlayer.release();
			}
		});
	}
	

}
