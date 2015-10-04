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

public class EmonCv extends Activity {
	ImageView imgEmon;
	RoundImage roundImage;
	Button btnPhone,btnMailEmon;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.emon_cv);

		imgEmon = (ImageView) findViewById(R.id.imgEmon);
		Bitmap bm = BitmapFactory.decodeResource(getResources(),
				R.drawable.emon);
		roundImage = new RoundImage(bm);

		imgEmon.setImageDrawable(roundImage);
		btnPhone = (Button) findViewById(R.id.btnPhone);
		btnMailEmon=(Button)findViewById(R.id.btnMailEmon);
		btnPhone.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:01760568639"));
				startActivity(callIntent);

			}
		});
		btnMailEmon.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent emailIntent = new Intent(Intent.ACTION_SEND);
				emailIntent.setData(Uri.parse("mailto:ahmedemoncse20@gmail.com"));
				emailIntent.setType("text/plain");
				emailIntent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"Recipient"});
				emailIntent.putExtra(Intent.EXTRA_SUBJECT, "subject");
				emailIntent.putExtra(Intent.EXTRA_TEXT   , "Message Body");
				startActivity(emailIntent);
				
			}
		});

	}

}
