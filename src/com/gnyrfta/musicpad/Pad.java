package com.gnyrfta.musicpad;

import android.os.Bundle;
import android.util.Log;
import de.passsy.multitouch.MultiTouchActivity;

public class Pad extends MultiTouchActivity {
	public static com.gnyrfta.musicpad.SoundPoolHelper mSoundPoolHelper; 
	
	public static int soundIdUL=0;
	public static int soundIdUR=0;
	public static int soundIdLL=0;
	public static int soundIdLR=0;
	
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
		loadSounds(MainActivity.ULk,"UL");
		loadSounds(MainActivity.URk,"UR");
		loadSounds(MainActivity.LRk,"LR");
		loadSounds(MainActivity.LLk,"LL");
		//soundIdUL = mSoundPoolHelper.load(this, R.raw.c,2);
		//soundIdUR = mSoundPoolHelper.load(this,R.raw.d,2);
		//soundIdLL = mSoundPoolHelper.load(this, R.raw.f,2);
		//soundIdLR = mSoundPoolHelper.load(this, R.raw.g,2);
		
		final TestButton buttonUpperLeft = (TestButton) findViewById(R.id.padUpperLeft);
        final TestButtonTwo buttonUpperRight = (TestButtonTwo) findViewById(R.id.padUpperRight);
		final TestButtonThree buttonLowerLeft = (TestButtonThree) findViewById(R.id.padLowerLeft);
		final TestButtonFour buttonLowerRight = (TestButtonFour) findViewById(R.id.padLowerRight);
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
}
