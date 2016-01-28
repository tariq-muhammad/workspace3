package com.example.buttontest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {
	
	EditText et;
	int count;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		et = (EditText) findViewById(R.id.editText1);
	}
	
	public void returnDigits (View v){
		
		String input = et.getText().toString();
        int count = 0;
        for(int i=0; i< input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                count++;
            }
        }
		
		Intent output = new Intent();
        output.putExtra("numberCount", "Count: " + count);
        setResult(123, output);
        finish();
		
		
		
	}
	
	public void returnLetters (View v){
		
		 String input = et.getText().toString();
	        int count = 0;
	        for(int i=0; i< input.length();i++){
	            if(!Character.isDigit(input.charAt(i))){
	                count++;
	            }
	        }
		
		 Intent output = new Intent();
	        output.putExtra("letterCount", "Count: " + count);
	        setResult(123, output);
	        finish();
		
		
	}
	
	public void returnReverse (View v){
		
		
		 String input = et.getText().toString();
		 
	        String revStr = new StringBuilder(input).reverse().toString();
		Intent reverses = new Intent();
		reverses.putExtra("reverse", revStr);
		setResult(123,reverses);
		finish();
		
		
		
	}

}
