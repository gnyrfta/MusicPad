package com.gnyrfta.musicpad;

import java.util.ArrayList;

import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import de.passsy.multitouch.MultiTouchActivity;

public class Pad extends MultiTouchActivity {
	public static com.gnyrfta.musicpad.SoundPoolHelper mSoundPoolHelper; 
	
	public static int soundIdOne=0;
	public static int soundIdTwo=0;
	public static int soundIdThree=0;
	public static int soundIdFour=0;
	public static int soundIdFive=0;
	public static int soundIdSix=0;
	public static int soundIdSeven=0;
	public static int soundIdEight=0;
	public static int soundIdNine=0;
	public static int soundIdTen=0;
	public static int soundIdEleven=0;
	public static int soundIdTwelve=0;
	public static int soundIdThirteen=0;
	public static int soundIdFourteen=0;
	public static int soundIdFifteen=0;
	public static int soundIdSixteen=0;

	int soundIdTest=0; 	
	int soundIdTest2=0;
	static boolean baseLinePlaying=false;
	static int baseLinePlayingIs=0;
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pad_layout_2);
		Display display = getWindowManager().getDefaultDisplay();
		int width = display.getWidth();
		int height = display.getHeight();
		mSoundPoolHelper = new com.gnyrfta.musicpad.SoundPoolHelper(10,this);
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
		soundIdOne = mSoundPoolHelper.load(this,R.raw.ahh_relax_female,2);
		soundIdTwo = mSoundPoolHelper.load(this, R.raw.claps,2);
		soundIdThree = mSoundPoolHelper.load(this, R.raw.hihat_closed,2);
		soundIdFour = mSoundPoolHelper.load(this, R.raw.stick_drum,2);
		soundIdFive = mSoundPoolHelper.load(this,R.raw.cymbal,2);
		soundIdSix = mSoundPoolHelper.load(this,R.raw.hihat_opn,2);
		soundIdSeven = mSoundPoolHelper.load(this,R.raw.cymbal,2);
		soundIdEight = mSoundPoolHelper.load(this,R.raw.claps,2);
		soundIdNine = mSoundPoolHelper.load(this,R.raw.cow_bell,2);
		soundIdTen = mSoundPoolHelper.load(this,R.raw.hihat_opn,2);
		soundIdEleven = mSoundPoolHelper.load(this,R.raw.kick_drum,2);
		soundIdTwelve = mSoundPoolHelper.load(this,R.raw.claps,2);
		soundIdThirteen = mSoundPoolHelper.load(this,R.raw.hiphopbass2,2);
		soundIdFourteen = mSoundPoolHelper.load(this,R.raw.hiphopbass4,2);
		soundIdFifteen = mSoundPoolHelper.load(this,R.raw.hiphopbass13,2);
		soundIdSixteen = mSoundPoolHelper.load(this,R.raw.hiphopbass10,2);

		//soundIdUL = mSoundPoolHelper.load(this, R.raw.c,2);
		//soundIdUR = mSoundPoolHelper.load(this,R.raw.d,2);
		//soundIdLL = mSoundPoolHelper.load(this, R.raw.f,2);
		//soundIdLR = mSoundPoolHelper.load(this, R.raw.g,2);


		
		final MusicButton buttonOne = (MusicButton) findViewById(R.id.padOne);
		buttonOne.setSoundId(soundIdOne);

        final MusicButton buttonTwo = (MusicButton) findViewById(R.id.padTwo);
		buttonTwo.setSoundId(soundIdTwo);

		final MusicButton buttonThree =(MusicButton) findViewById(R.id.padThree);
		buttonThree.setSoundId(soundIdThree);

		final MusicButton buttonFour = (MusicButton) findViewById(R.id.padFour);
		buttonFour.setSoundId(soundIdFour);

		final MusicButton buttonFive = (MusicButton) findViewById(R.id.padFive);
		buttonFive.setSoundId(soundIdFive);

		final MusicButton buttonSix = (MusicButton) findViewById(R.id.padSix);
		buttonSix.setSoundId(soundIdSix);

		final MusicButton buttonSeven = (MusicButton) findViewById(R.id.padSeven);
		buttonSeven.setSoundId(soundIdSeven);

		final MusicButton buttonEight = (MusicButton) findViewById(R.id.padEight);
		buttonEight.setSoundId(soundIdEight);

		final MusicButton buttonNine = (MusicButton) findViewById(R.id.padNine);
		buttonNine.setSoundId(soundIdNine);

		final MusicButton buttonTen = (MusicButton) findViewById(R.id.padTen);
		buttonTen.setSoundId(soundIdTen);

		final MusicButton buttonEleven = (MusicButton) findViewById(R.id.padEleven);
		buttonEleven.setSoundId(soundIdEleven);
		final MusicButton buttonTwelve = (MusicButton) findViewById(R.id.padTwelve);
		buttonTwelve.setSoundId(soundIdTwelve);
		final MusicButtonLooper buttonThirteen = (MusicButtonLooper) findViewById(R.id.padThirteen);
		buttonThirteen.setSoundId(soundIdThirteen);
		final MusicButtonLooper buttonFourteen = (MusicButtonLooper) findViewById(R.id.padFourteen);
		buttonFourteen.setSoundId(soundIdFourteen);
		final MusicButtonLooper buttonFifteen = (MusicButtonLooper) findViewById(R.id.padFifteen);
		buttonFifteen.setSoundId(soundIdFifteen);
		final MusicButtonLooper buttonSixteen = (MusicButtonLooper) findViewById(R.id.padSixteen);
		buttonSixteen.setSoundId(soundIdSixteen);

		int buttonSize = (int)(width/4);

		buttonOne.requestLayout();
		buttonOne.getLayoutParams().width=buttonSize;
		buttonOne.getLayoutParams().height=buttonSize;

		buttonTwo.requestLayout();
		buttonTwo.getLayoutParams().width=buttonSize;
		buttonTwo.getLayoutParams().height=buttonSize;

		buttonThree.requestLayout();
		buttonThree.getLayoutParams().width=buttonSize;
		buttonThree.getLayoutParams().height=buttonSize;

		buttonFour.requestLayout();
		buttonFour.getLayoutParams().width=buttonSize;
		buttonFour.getLayoutParams().height=buttonSize;

		buttonFive.requestLayout();
		buttonFive.getLayoutParams().width=buttonSize;
		buttonFive.getLayoutParams().height=buttonSize;

		buttonSix.requestLayout();
		buttonSix.getLayoutParams().width=buttonSize;
		buttonSix.getLayoutParams().height=buttonSize;

		buttonSeven.requestLayout();
		buttonSeven.getLayoutParams().width=buttonSize;
		buttonSeven.getLayoutParams().height=buttonSize;

		buttonEight.requestLayout();
		buttonEight.getLayoutParams().width=buttonSize;
		buttonEight.getLayoutParams().height=buttonSize;

		buttonNine.requestLayout();
		buttonNine.getLayoutParams().width=buttonSize;
		buttonNine.getLayoutParams().height=buttonSize;

		buttonTen.requestLayout();
		buttonTen.getLayoutParams().width=buttonSize;
		buttonTen.getLayoutParams().height=buttonSize;

		buttonEleven.requestLayout();
		buttonEleven.getLayoutParams().width=buttonSize;
		buttonEleven.getLayoutParams().height=buttonSize;

		buttonTwelve.requestLayout();
		buttonTwelve.getLayoutParams().width=buttonSize;
		buttonTwelve.getLayoutParams().height=buttonSize;

		buttonThirteen.requestLayout();
		buttonThirteen.getLayoutParams().width=buttonSize;
		buttonThirteen.getLayoutParams().height=buttonSize;
		buttonThirteen.setButtonNumber(13);

		buttonFourteen.requestLayout();
		buttonFourteen.getLayoutParams().width=buttonSize;
		buttonFourteen.getLayoutParams().height=buttonSize;
		buttonFourteen.setButtonNumber(14);

		buttonFifteen.requestLayout();
		buttonFifteen.getLayoutParams().width=buttonSize;
		buttonFifteen.getLayoutParams().height=buttonSize;
		buttonFifteen.setButtonNumber(15);

		buttonSixteen.requestLayout();
		buttonSixteen.getLayoutParams().width=buttonSize;
		buttonSixteen.getLayoutParams().height=buttonSize;
		buttonSixteen.setButtonNumber(16);

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
				mSoundPoolHelper.play(Pad.soundIdOne);
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
	//pads should be in a grid of 4x5 or 5x5:
	public void loadSounds(String soundChosen, String pad)
	{
		if(pad.equals("UL"))
		{
			soundIdOne = mSoundPoolHelper.load(this,R.raw.cow_bell,2);
			/*
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
			}*/
		}
		if(pad.equals("UR"))
		{
			soundIdTwo = mSoundPoolHelper.load(this, R.raw.claps,2);
			/*
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
			}*/
		}
		else if(pad.equals("LL"))
		{
			soundIdFive = mSoundPoolHelper.load(this, R.raw.hihat_closed,2);
			/*
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
			}*/
		}
		else if(pad.equals("LR"))
		{
			soundIdSix = mSoundPoolHelper.load(this, R.raw.stick_drum,2);
			/*
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
			}*/
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
