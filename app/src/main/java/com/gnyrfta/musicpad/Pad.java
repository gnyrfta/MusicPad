package com.gnyrfta.musicpad;

import java.util.ArrayList;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import de.passsy.multitouch.MultiTouchActivity;

public class Pad extends MultiTouchActivity {
	public static com.gnyrfta.musicpad.SoundPoolHelper mSoundPoolHelper; 
	
	public static int soundIdUL=0;
	public static int soundIdUR=0;
	public static int soundIdLL=0;
	public static int soundIdLR=0;

	int soundIdTest=0; 	
	int soundIdTest2=0;
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pad_layout_2);
		mSoundPoolHelper = new com.gnyrfta.musicpad.SoundPoolHelper(2,this);
		//Create method that does this: 
		/*if(MainActivity.ULk.equals("Piano F"))
		{
			soundIdUL = mSoundPoolHelper.load(this, R.raw.f,2);
		}
		else
		{
			soundIdUL = mSoundPoolHelper.load(this, R.raw.c,2);	
		}*/
		//soundIdUL = mSoundPoolHelper.load(this, R.raw.c,2);
		String UpperLeftButton="";
		String UpperRightButton="";
		String LowerLeftButton="";
		String LowerRightButton="";
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
		    UpperLeftButton = extras.getString("ULk");
		    UpperRightButton = extras.getString("URk");
		    LowerLeftButton = extras.getString("LLk");
		    LowerRightButton = extras.getString("LRk");
		}
		
		loadSounds(UpperLeftButton,"UL");
		loadSounds(UpperRightButton,"UR");
		loadSounds(LowerLeftButton,"LR");
		loadSounds(LowerRightButton,"LL");
		
		soundIdTest = mSoundPoolHelper.load(this, R.raw.c,2);	
		soundIdTest2 = mSoundPoolHelper.load(this, R.raw.f,2);
		//soundIdUL = mSoundPoolHelper.load(this, R.raw.c,2);
		//soundIdUR = mSoundPoolHelper.load(this,R.raw.d,2);
		//soundIdLL = mSoundPoolHelper.load(this, R.raw.f,2);
		//soundIdLR = mSoundPoolHelper.load(this, R.raw.g,2);


		
		final TestButton buttonUpperLeft = (TestButton) findViewById(R.id.padUpperLeft);
        final TestButtonTwo buttonUpperRight = (TestButtonTwo) findViewById(R.id.padUpperRight);
		final TestButtonThree buttonLowerLeft = (TestButtonThree) findViewById(R.id.padLowerLeft);
		final TestButtonFour buttonLowerRight = (TestButtonFour) findViewById(R.id.padLowerRight);
		final Button looper = (Button) findViewById(R.id.looper);
		looper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	loop();
            }
        });
	}
	public void loop()
	{
		long startTime = System.nanoTime();
		long oneSecond = (long)-1000;
		long timePassedMilliSeconds=0;
		boolean firstTime=true;
		//Andante 72 bpm -> 60/72 s per not.
		//Detta är alltså typ långsam promenad.
		ArrayList<Integer> sounds = getSounds();
		ArrayList<Long> TimeIntervalls = getTimeIntervalls();
		Log.d("entering while","entering while");
		while(true)
		{
		while((timePassedMilliSeconds)<TimeIntervalls.get(0))
		{		
			if(firstTime)
			{
				mSoundPoolHelper.play(Pad.soundIdUL);
				firstTime=false;
			}
			long timePassed=System.nanoTime()-startTime;
			timePassedMilliSeconds = timePassed/1000000;
			//Log.d("time passed"," "+timePassedMilliSeconds);
		}
		startTime=0;
		firstTime=true;
		timePassedMilliSeconds=0;
		while((timePassedMilliSeconds)<TimeIntervalls.get(1))
		{
			if(firstTime==true)
			{
				mSoundPoolHelper.play(sounds.get(1));
				firstTime=false;
				//Second sound from array.
			}
			long timePassed=System.nanoTime()-startTime;
			timePassedMilliSeconds = absolute(timePassed/1000000);
		}
		startTime=System.nanoTime();
		firstTime=true;
		timePassedMilliSeconds=0;
		while((timePassedMilliSeconds)<TimeIntervalls.get(2))
		{
			if(firstTime==true)
			{
				mSoundPoolHelper.play(sounds.get(2));
				firstTime=false;
				//Second sound from array.
			}
			long timePassed=System.nanoTime()-startTime;
			timePassedMilliSeconds = absolute(timePassed/1000000);
		}
		startTime=System.nanoTime();
		firstTime=true;
		timePassedMilliSeconds=0;
		//etc

		}
		//read arraylist
		//play first sound
		//play second sound
		//play third sound
		//play fourth sound. 
		//loop for One-two-three-four...One-two-three-four...
		//read from arraylist with timelength for each play.
		//use TimerObject or getTime to control what time it is at close intervals. 
		//Play sound at apropriate time.
	}
	private ArrayList<Long> getTimeIntervalls() {
		long firstTimeInterval=1000;
		long secondTimeInterval=2000;
		long thirdTimeInterval=3000;
		ArrayList<Long> TimeIntervalls = new ArrayList<Long>();
		TimeIntervalls.add(firstTimeInterval);
		TimeIntervalls.add(secondTimeInterval);
		TimeIntervalls.add(thirdTimeInterval);
		return TimeIntervalls;
	}
	private long absolute(long a){
		if(a<0)
		{
			a=a*(-1);
		}
		return a;
	}
	public void loadSounds(String soundChosen, String pad)
	{
		if(pad.equals("UL")) 
		{
			if(soundChosen.equals("Clap"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.claps,2);	

			}
			else if(soundChosen.equals("Cowbell"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.cow_bell,2);	

			}
			else if(soundChosen.equals("Hihat Closed"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.hihat_closed,2);	

			}			
			else if(soundChosen.equals("Hihat Open"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.hihat_opn,2);	
				
			}
			else if(soundChosen.equals("Kick Drum"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.kick_drum,2);	
				
			}
			else if(soundChosen.equals("Snare Drum"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.snar_drum,2);	
				
			}
			else if(soundChosen.equals("Stick Drum"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.stick_drum,2);	
				
			}
			else if(soundChosen.equals("Piano C"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.c,2);	
				
			}
			else if(soundChosen.equals("Piano D"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.d,2);	
				
			}
			else if(soundChosen.equals("Piano F"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.f,2);	
				
			}
			else if(soundChosen.equals("Piano G"))
			{
				soundIdUL = mSoundPoolHelper.load(this, R.raw.g,2);	
				
			}
			else
			{
				Log.d("in loadSounds","no sound was recognized as chosen.");
			}
		}
		else if(pad.equals("UR"))
		{
			if(soundChosen.equals("Clap"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.claps,2);	

			}
			else if(soundChosen.equals("Cowbell"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.cow_bell,2);	

			}
			else if(soundChosen.equals("Hihat Closed"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.hihat_closed,2);	

			}			
			else if(soundChosen.equals("Hihat Open"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.hihat_opn,2);	
				
			}
			else if(soundChosen.equals("Kick Drum"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.kick_drum,2);	
				
			}
			else if(soundChosen.equals("Snare Drum"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.snar_drum,2);	
				
			}
			else if(soundChosen.equals("Stick Drum"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.stick_drum,2);	
				
			}
			else if(soundChosen.equals("Piano C"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.c,2);	
				
			}
			else if(soundChosen.equals("Piano D"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.d,2);	
				
			}
			else if(soundChosen.equals("Piano F"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.f,2);	
				
			}
			else if(soundChosen.equals("Piano G"))
			{
				soundIdUR = mSoundPoolHelper.load(this, R.raw.g,2);	
				
			}
			else
			{
				Log.d("in loadSounds","no sound was recognized as chosen.");
			}
		}
		else if(pad.equals("LL"))
		{
			if(soundChosen.equals("Clap"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.claps,2);	

			}
			else if(soundChosen.equals("Cowbell"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.cow_bell,2);	

			}
			else if(soundChosen.equals("Hihat Closed"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.hihat_closed,2);	

			}			
			else if(soundChosen.equals("Hihat Open"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.hihat_opn,2);	
				
			}
			else if(soundChosen.equals("Kick Drum"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.kick_drum,2);	
				
			}
			else if(soundChosen.equals("Snare Drum"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.snar_drum,2);	
				
			}
			else if(soundChosen.equals("Stick Drum"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.stick_drum,2);	
				
			}
			else if(soundChosen.equals("Piano C"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.c,2);	
				
			}
			else if(soundChosen.equals("Piano D"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.d,2);	
				
			}
			else if(soundChosen.equals("Piano F"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.f,2);	
				
			}
			else if(soundChosen.equals("Piano G"))
			{
				soundIdLL = mSoundPoolHelper.load(this, R.raw.g,2);	
				
			}
			else
			{
				Log.d("in loadSounds","no sound was recognized as chosen.");
			}
		}
		else if(pad.equals("LR"))
		{
			if(soundChosen.equals("Clap"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.claps,2);	

			}
			else if(soundChosen.equals("Cowbell"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.cow_bell,2);	

			}
			else if(soundChosen.equals("Hihat Closed"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.hihat_closed,2);	

			}			
			else if(soundChosen.equals("Hihat Open"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.hihat_opn,2);	
				
			}
			else if(soundChosen.equals("Kick Drum"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.kick_drum,2);	
				
			}
			else if(soundChosen.equals("Snare Drum"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.snar_drum,2);	
				
			}
			else if(soundChosen.equals("Stick Drum"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.stick_drum,2);	
				
			}
			else if(soundChosen.equals("Piano C"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.c,2);	
				
			}
			else if(soundChosen.equals("Piano D"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.d,2);	
				
			}
			else if(soundChosen.equals("Piano F"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.f,2);	
				
			}
			else if(soundChosen.equals("Piano G"))
			{
				soundIdLR = mSoundPoolHelper.load(this, R.raw.g,2);	
				
			}
			else
			{
				Log.d("in loadSounds","no sound was recognized as chosen.");
			}
		}
			
	}
	ArrayList<Integer> getSounds()
	{
		int soundId1,soundId2,soundId3;
		soundId1 = mSoundPoolHelper.load(this, R.raw.c,2);	
		soundId2 = mSoundPoolHelper.load(this, R.raw.f,2);	
		soundId3 = mSoundPoolHelper.load(this, R.raw.g,2);	
		ArrayList<Integer> thisWillBeFilled = new ArrayList<Integer>();
		thisWillBeFilled.add(soundId1);
		thisWillBeFilled.add(soundId2);
		thisWillBeFilled.add(soundId3);
		return thisWillBeFilled;
	}
}
