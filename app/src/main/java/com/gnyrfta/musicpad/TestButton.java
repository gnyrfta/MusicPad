package com.gnyrfta.musicpad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageButton;


public class TestButton extends ImageButton {
	private int soundToPlay;
<<<<<<< Updated upstream:app/src/main/java/com/gnyrfta/musicpad/TestButton.java
	public TestButton(final Context context, final AttributeSet attrs) {
=======
	private int buttonNumber=0;
	private boolean playing=false;
	private int playingId=0;
	public MusicButton(final Context context, final AttributeSet attrs) {
>>>>>>> Stashed changes:app/src/main/java/com/gnyrfta/musicpad/MusicButton.java
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouchEvent(final MotionEvent event) {
		Log.v("tag", "I get touched");
		//setText("I recive a MotionEvent");
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
<<<<<<< Updated upstream:app/src/main/java/com/gnyrfta/musicpad/TestButton.java
			//setText("I can recive Move events outside of my View");
			Pad.mSoundPoolHelper.play(Pad.soundIdUL);
=======
				//setText("I can recive Move events outside of my View");
				Pad.mSoundPoolHelper.setLoop(false);
			Pad.turnLightOn(buttonNumber);
			Pad.mSoundPoolHelper.stop(playingId);
			playingId=Pad.mSoundPoolHelper.play(soundToPlay);
			playing = true;
				//Pad.mSoundPoolHelper.play(Pad.soundIdUL);

		}
		else if(event.getAction()==MotionEvent.ACTION_UP)
		{
			Pad.turnLightOff(buttonNumber);
>>>>>>> Stashed changes:app/src/main/java/com/gnyrfta/musicpad/MusicButton.java
		}
		return super.onTouchEvent(event);
	}
	public int setSoundId(int soundId)
	{
		soundToPlay=soundId;
		return soundToPlay;
	}
<<<<<<< Updated upstream:app/src/main/java/com/gnyrfta/musicpad/TestButton.java
=======
	public void setLoop(boolean looping)
	{
		if(looping)
		{
			Pad.mSoundPoolHelper.setLoop(true);
		}
		else
		{
			Pad.mSoundPoolHelper.setLoop(false);
		}
	}
	public void setButtonNumber(int buttonNumberIs)
	{
		buttonNumber=buttonNumberIs;
	}

>>>>>>> Stashed changes:app/src/main/java/com/gnyrfta/musicpad/MusicButton.java
}
