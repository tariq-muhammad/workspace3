package com.tariqsapps.comiccraze;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AntMan extends Activity {

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ant_man);
		
		WebView myWebView = (WebView) findViewById(R.id.webView1);
	   	myWebView.setWebViewClient(new WebViewClient());
	   	myWebView.loadUrl("https://www.youtube.com/watch?v=1HpZevFifuo");
	    WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);                                         

	}

	
}
