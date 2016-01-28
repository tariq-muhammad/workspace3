package com.example.buttontest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	
    EditText et1, et2, et3;
    
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		et3 = (EditText) findViewById(R.id.editText3);
	
	}
	
	public void goToSecond (View v) {
		
		Intent intent = new Intent(this, SecondActivity.class);
		startActivityForResult(intent, 123);
	}
	
	 @Override
	    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	        // TODO Auto-generated method stub
	            if(requestCode == 123){
	                if(data.getStringExtra("numberCount") != null){
	                    et1.setText(data.getStringExtra("numberCount"));
	                }
	                if(data.getStringExtra("letterCount") != null){
	                    et2.setText(data.getStringExtra("letterCount"));
	                }
	                if(data.getStringExtra("reverse") != null){
	                    et3.setText(data.getStringExtra("reverse"));
	                }
	            }
	    }
	 

	
}
