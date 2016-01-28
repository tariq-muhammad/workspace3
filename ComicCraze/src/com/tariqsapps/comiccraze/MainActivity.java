
package com.tariqsapps.comiccraze;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView header;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		header = (TextView) findViewById(R.id.textView1);
		Typeface komikax = Typeface.createFromAsset(getAssets(), getString(R.string.typeface_komikax));
		header.setTypeface(komikax);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.comic_apps) {
			
			Intent intent = new Intent(this, ComicApps.class);
			startActivity(intent);
			return true;
			
		}else if (id == R.id.movie_trailers){
			
			Intent intent = new Intent(this, MovieTrailers.class);
			startActivity(intent);
			return true;
			
		}else if (id == R.id.comic_resources){
			
			Intent intent = new Intent(this, ComicResources.class);
			startActivity(intent);
			return true;
		}else if (id == R.id.store_locator){
			
			Intent intent = new Intent(this, StoreLocator.class);
			startActivity(intent);
			return true;
			
		}
		return super.onOptionsItemSelected(item);
	}
}
