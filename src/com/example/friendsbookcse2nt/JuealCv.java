package com.example.friendsbookcse2nt;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class JuealCv extends Activity {
	ImageView imgJueal;
	RoundImage roundImage;
	Button btnPhone,btnMailJueal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jueal_cv);

		imgJueal = (ImageView) findViewById(R.id.imgJueal);
		Bitmap bm = BitmapFactory.decodeResource(getResources(),
				R.drawable.jueal);
		roundImage = new RoundImage(bm);

		imgJueal.setImageDrawable(roundImage);
		btnPhone = (Button) findViewById(R.id.btnPhone);
		btnMailJueal=(Button)findViewById(R.id.btnMailJueal);
		btnPhone.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:01675913863"));
				startActivity(callIntent);

			}
		});
		btnMailJueal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent emailIntent = new Intent(Intent.ACTION_SEND);
				emailIntent.setData(Uri.parse("mailto:mjueal02@gmail.com"));
				emailIntent.setType("text/plain");
				emailIntent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"Recipient"});
				emailIntent.putExtra(Intent.EXTRA_SUBJECT, "subject");
				emailIntent.putExtra(Intent.EXTRA_TEXT   , "Message Body");
				startActivity(emailIntent);
				
			}
		});

	}

}
