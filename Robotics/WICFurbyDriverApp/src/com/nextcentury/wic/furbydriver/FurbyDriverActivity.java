package com.nextcentury.wic.furbydriver;

import com.nextcentury.wic.furbydriver.sound.PlaySound;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class FurbyDriverActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_furby_driver);
		
		PlaySound.playSound(getApplicationContext(), R.raw.furby_hypnotize_820);
	}
	
	public void furbyBurp( View v) {
		PlaySound.playSound(getApplicationContext(), R.raw.furby_burp_864);
	}
	
	public void furbyFart( View v) {
		PlaySound.playSound(getApplicationContext(), R.raw.furby_fart_865);
	}
	
	public void feedFurby( View v) {
		PlaySound.playSound(getApplicationContext(), R.raw.feedfurby_350);
	}

}
