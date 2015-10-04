package com.example.friendsbookcse2nt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	private static int SPALASH_TIME_OUT = 4000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {

				Intent i = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(i);

				finish();

			}

		}, SPALASH_TIME_OUT);
	}

}
