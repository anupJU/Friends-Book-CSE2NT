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

public class TomaCv extends Activity {
	Button btnPhone;

	ImageView imgToma;
	RoundImage roundImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toma_cv);

		imgToma = (ImageView) findViewById(R.id.imgToma);
		Bitmap bm = BitmapFactory.decodeResource(getResources(),
				R.drawable.toma);
		roundImage = new RoundImage(bm);

		imgToma.setImageDrawable(roundImage);

		btnPhone = (Button) findViewById(R.id.btnPhone);
		btnPhone.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent callIntent = new Intent(Intent.ACTION_CALL);
				callIntent.setData(Uri.parse("tel:01763676302"));
				startActivity(callIntent);

			}
		});
	}

}
