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

public class AnupCv extends Activity {
	ImageView imgAnup;
	RoundImage roundImage;
	Button btnPhone,btnMailAnup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anup_cv);

		imgAnup = (ImageView) findViewById(R.id.imgAnup);
		Bitmap bm = BitmapFactory.decodeResource(getResources(),
				R.drawable.anup);
		roundImage = new RoundImage(bm);

		imgAnup.setImageDrawable(roundImage);
		btnPhone = (Button) findViewById(R.id.btnPhone);
		btnMailAnup=(Button)findViewById(R.id.btnMailAnup);
		btnPhone.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:01725228874"));
				startActivity(callIntent);

			}
		});
		btnMailAnup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent emailIntent = new Intent(Intent.ACTION_SEND);
				emailIntent.setData(Uri.parse("mailto:anupju.cse20@gmail.com"));
				emailIntent.setType("text/plain");
				emailIntent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"Recipient"});
				emailIntent.putExtra(Intent.EXTRA_SUBJECT, "subject");
				emailIntent.putExtra(Intent.EXTRA_TEXT   , "Message Body");
				startActivity(emailIntent);
				
			}
		});

	}

}
