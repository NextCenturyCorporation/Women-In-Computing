package com.nextcentury.wic.furbydriver.sound;

import android.content.Context;
import android.media.MediaPlayer;

public class PlaySound {
	
	public static void playSound( Context context, int resId ) {
		
		MediaPlayer mediaPlayer = MediaPlayer.create( context, resId);
		mediaPlayer.start();
	}
	

}
