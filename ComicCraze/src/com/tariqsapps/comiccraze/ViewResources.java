package com.tariqsapps.comiccraze;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ViewResources extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_resources);
		
		WebView theWebView = (WebView) findViewById(R.id.webView1);
	   	theWebView.setWebViewClient(new WebViewClient());
	   	theWebView.loadUrl(getIntent().getExtras().getString("URL"));
	    WebSettings webSettings = theWebView.getSettings();
	    webSettings.setJavaScriptEnabled(true);    
	}
	
	

	
}
