package com.example.friendsbookcse2nt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btnFriendsDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnFriendsDetails = (Button) findViewById(R.id.btnFriendsDetails);
        
        btnFriendsDetails.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getApplicationContext(), AllFriendsDetails.class);
				startActivity(intent);
				
			}
		});
    }

}
