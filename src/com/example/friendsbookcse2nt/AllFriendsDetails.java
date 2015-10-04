package com.example.friendsbookcse2nt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AllFriendsDetails extends Activity {
	Button btnToma,btnAnup,btnEmon,btnJueal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_friends);

		btnToma = (Button) findViewById(R.id.btnToma);
		btnAnup = (Button) findViewById(R.id.btnAnup);
		btnEmon=(Button)findViewById(R.id.btnEmon);
		btnJueal=(Button)findViewById(R.id.btnJueal);
		
		
		btnToma.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(),
						TomaCv.class);
				startActivity(intent);

			}
		});
		btnAnup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(getApplicationContext(),
						AnupCv.class);
				startActivity(intent);
			}
		});
		btnEmon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(),
						EmonCv.class);
				startActivity(intent);
				
			}
		});
		btnJueal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						JuealCv.class);
				startActivity(intent);
				
			}
		});
	}

}
