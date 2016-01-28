package com.tariqsapps.comiccraze;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BatmanvSuperman extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_batmanv_superman);
		
		WebView myWebView = (WebView) findViewById(R.id.webView1);
	   	myWebView.setWebViewClient(new WebViewClient());
	   	myWebView.loadUrl("https://www.youtube.com/watch?v=IwfUnkBfdZ4");
	    WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true); 
	}

   
}
