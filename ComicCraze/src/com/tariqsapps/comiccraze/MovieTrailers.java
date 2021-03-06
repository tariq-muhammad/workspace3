package com.tariqsapps.comiccraze;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MovieTrailers extends ListActivity implements OnItemClickListener{
	

	ListView movieList;
	String[] someItems = {"Ant Man","Avengers: Age Of Ultron","Batman v Superman: Dawn Of Justice","Fantastic Four","Star Wars: The Force Awakens"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_movie_trailers);
		
		 movieList = getListView();
	     ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, someItems);
	     movieList.setAdapter(adapter);
	     movieList.setOnItemClickListener(this);
	     
	    
	     
	    
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		
		switch (position){
			
			
			case 0: Intent antMan = new Intent(this, AntMan.class);
			startActivity(antMan);
			break;
			case 1: Intent avengers = new Intent(this, Avengers.class);
			startActivity(avengers);
			break;
			case 2: Intent BatmanvSuperman = new Intent(this, BatmanvSuperman.class);
			startActivity(BatmanvSuperman);
			break;
			case 3: Intent fanFour = new Intent(this, FantasticFour.class);
			startActivity(fanFour);
			break;
			case 4: Intent starWars = new Intent(this, StarWars.class);
			startActivity(starWars);
			break;
			
	         
		}
		
		
	}

	
}
