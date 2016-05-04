package com.gnyrfta.musicpad;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends ActionBarActivity {
	
	public String packageName;
	public int testMusicFileId=0;
	
	public static int soundIdULLoadThis;
	public static int soundIdURLoadThis;
	public static int soundIdLLLoadThis;
	public static int soundIdLRLoadThis;
	public static String ULk="";
	public static String URk="";
	public static String LRk="";
	public static String LLk="";
	
	public static com.gnyrfta.musicpad.SoundPoolHelper mSoundPoolHelper; 
	Context context;
	//public  TestButton buttonUpperLeft;
	//public TestButtonTwo tb2;
	
	/*MainActivity(Context context)
	{
		packageName = context.getPackageName();
	}*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Spinner spinnerOne = (Spinner) findViewById(R.id.instrumentPadOne_spinner);
		Spinner spinnerTwo = (Spinner) findViewById(R.id.instrumentPadTwo_spinner);
		Spinner spinnerThree = (Spinner) findViewById(R.id.instrumentPadThree_spinner);
		Spinner spinnerFour = (Spinner) findViewById(R.id.instrumentPadFour_spinner);
		//Adapts arrays for the spinners: 
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		R.array.sounds_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinnerOne.setAdapter(adapter);
		spinnerTwo.setAdapter(adapter);
		spinnerThree.setAdapter(adapter);
		spinnerFour.setAdapter(adapter);
		//THis is what I'm working on:
		
		spinnerOne.setOnItemSelectedListener(new OnItemSelectedListener() {
		    @Override
		    public void onItemSelected(AdapterView<?> parent, View selectedItemView, int pos, long id) {
		        // your code here
		    	
		    	ULk = parent.getItemAtPosition(pos).toString();
		    	//soundIdULLoadThis = getAndroidId(sound);
		    	
		    	//soundIdUL = mSoundPoolHelper.load(this, soundIdULTemp, 2);

		    	
		    	//Then load it.
		    }

			@Override
		    public void onNothingSelected(AdapterView<?> parentView) {
		        // your code here
		    }
		});
		spinnerTwo.setOnItemSelectedListener(new OnItemSelectedListener() {
		    @Override
		    public void onItemSelected(AdapterView<?> parent, View selectedItemView, int pos, long id) {
		        // your code here
		    	
		    	URk = parent.getItemAtPosition(pos).toString();
		    	//soundIdULLoadThis = getAndroidId(sound);
		    	
		    	//soundIdUL = mSoundPoolHelper.load(this, soundIdULTemp, 2);

		    	
		    	//Then load it.
		    }

			@Override
		    public void onNothingSelected(AdapterView<?> parentView) {
		        // your code here
		    }
		});
		spinnerThree.setOnItemSelectedListener(new OnItemSelectedListener() {
		    @Override
		    public void onItemSelected(AdapterView<?> parent, View selectedItemView, int pos, long id) {
		        // your code here
		    	
		    	LRk = parent.getItemAtPosition(pos).toString();
		    	//soundIdULLoadThis = getAndroidId(sound);
		    	
		    	//soundIdUL = mSoundPoolHelper.load(this, soundIdULTemp, 2);

		    	
		    	//Then load it.
		    }

			@Override
		    public void onNothingSelected(AdapterView<?> parentView) {
		        // your code here
		    }
		});
		spinnerFour.setOnItemSelectedListener(new OnItemSelectedListener() {
		    @Override
		    public void onItemSelected(AdapterView<?> parent, View selectedItemView, int pos, long id) {
		        // your code here
		    	
		    	LLk = parent.getItemAtPosition(pos).toString();
		    	//soundIdULLoadThis = getAndroidId(sound);
		    	
		    	//soundIdUL = mSoundPoolHelper.load(this, soundIdULTemp, 2);

		    	
		    	//Then load it.
		    }

			@Override
		    public void onNothingSelected(AdapterView<?> parentView) {
		        // your code here
		    }
		});
		//Create button to launch musicpad: 
		final Button button = (Button) findViewById(R.id.playButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(MainActivity.this,Pad.class);
            	i.putExtra("ULk", ULk);
            	i.putExtra("URk",URk);
            	i.putExtra("LLk",LLk);
            	i.putExtra("LRk",LRk);
            	startActivity(i);
            }
        });
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	static public int getAndroidId(String soundName){
	    int resourceId=Resources.getSystem().getIdentifier(soundName, "audio", "android");
	    if(resourceId==0){
	        return 0;
	    } else {
	        return resourceId;
	    }
	}
}
