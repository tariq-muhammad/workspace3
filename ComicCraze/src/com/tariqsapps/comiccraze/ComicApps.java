package com.tariqsapps.comiccraze;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ComicApps extends Activity {
	
	private TextView header;
	private Button marvel,dc,darkHorse,image,comicCon;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comic_apps);
		header = (TextView) findViewById(R.id.get_apps);
		marvel = (Button) findViewById(R.id.button1);
		dc = (Button) findViewById(R.id.button2);
		darkHorse = (Button) findViewById(R.id.button3);
		image = (Button) findViewById(R.id.button4);
		comicCon = (Button) findViewById(R.id.button5);
		
		
		Typeface komikax = Typeface.createFromAsset(getAssets(), getString(R.string.typeface_komikax));
		header.setTypeface(komikax);
		marvel.setTypeface(komikax);
		dc.setTypeface(komikax);
		darkHorse.setTypeface(komikax);
		image.setTypeface(komikax);
		comicCon.setTypeface(komikax);
		
	}
	
	public void launchMarvel(View v){
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.marvel.unlimited"));
        startActivity(intent);
		
	}
	
	public void launchDC(View v){
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.dccomics.comics"));
        startActivity(intent);
		
		
	}
	
	public void launchDarkHorse(View v){
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.darkhorse.digital"));
        startActivity(intent);
		
	}
	
	public void launchReader(View v){
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=net.kervala.comicsreader"));
        startActivity(intent);
		
		
	}
	public void launchCon(View v){
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.elementalbits.comiccon"));
        startActivity(intent);
	}

}
