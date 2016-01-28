package com.tariqsapps.comiccraze;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class SplashScreenActivity extends Activity {
	
	
    TextView tv;
	private static final int SPLASH_SHOW_TIME = 4000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	  
		setContentView(R.layout.activity_splash_screen);
		tv = (TextView) findViewById(R.id.textView1);
		Typeface komikax = Typeface.createFromAsset(getAssets(), getString(R.string.typeface_komikax));
		tv.setTypeface(komikax);
		
		Thread splashScreen = new Thread(){
			
			public void run(){
				
				
				try {
					
					sleep(SPLASH_SHOW_TIME);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{

					
					Intent i = new Intent(SplashScreenActivity.this,
							MainActivity.class);
					
					startActivity(i);
					finish();
				}
				
				
			}
		
		
		

	

	};
	splashScreen.start();

}
}