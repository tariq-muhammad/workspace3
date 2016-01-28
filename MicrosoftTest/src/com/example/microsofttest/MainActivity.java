package com.example.microsofttest;

import java.util.Hashtable;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	
	String string = "hellokkworld" ;
	Character answer;
	int[] iniArray = {2,4,6,8,1,3,5,7,};
	int[] oddArray = {};
	int[] evenArray = {};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		answer = findFirstNonRepeated(string);
		Log.d("MainActivity",answer.toString());
		Log.e("MainActivity",iniArray.toString());
		
		
	}
	public static Character findFirstNonRepeated( String input) {
		// create a new hashtable:
		Hashtable hashChar = new Hashtable( );

		int j, strLength;
		Character chr;
		Integer intgr;

		strLength = input.length( );

		for (j =0; j < strLength; j++)
		{
		  chr = new Character(input.charAt( j ) );
		  intgr = (Integer) hashChar.get(chr);
		  if (intgr == null) {
		     hashChar.put(chr, new Integer(1));
		  }
		  else
		  {
		    hashChar.put(chr, new Integer(intgr.intValue( ) + 1) );
		  }
		}

		/* go through hashtable and search for the first 
		    nonrepeated char:
		*/
		  
		for(j = 0; j < strLength; j++)
		{
		  chr = new Character(input.charAt(j));
		  if (((Integer) hashChar.get(chr)).intValue( ) == 1)
		    return chr;
		}
		/* this only returns if the loop above doesn't find
		   a nonrepeated character.
		*/
		return null;
	}
	
    public void sortArray(){
	 
    	for (int i = 0; i < iniArray.length; i++) {
    	     if (iniArray[i]% 2 == 1) {
    	        oddArray[i] = iniArray[i];
    	     }
    	     
    	for (int j = 0; j < iniArray.length; j++){
    		
    		if (iniArray[j] % 2 == 0){
    		
    			evenArray[j] = iniArray[j];
    		}
    	  }
    	}
    	
    	String lastArray = oddArray.toString() + evenArray.toString();
    	Log.d("MainActivity",lastArray);
    }
	
 }
