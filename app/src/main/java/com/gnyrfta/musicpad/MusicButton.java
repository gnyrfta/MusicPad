package com.gnyrfta.musicpad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.ImageButton;


public class MusicButton extends ImageButton {
	private int soundToPlay;
	public MusicButton(final Context context, final AttributeSet attrs) {
		super(context, attrs);

		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouchEvent(final MotionEvent event) {
		Log.v("tag", "I get touched");
		//setText("I recive a MotionEvent");
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			//setText("I can recive Move events outside of my View");
			Pad.mSoundPoolHelper.setLoop(false);
			Pad.mSoundPoolHelper.play(soundToPlay);
			//Pad.mSoundPoolHelper.play(Pad.soundIdUL);
		}
		return super.onTouchEvent(event);
	}
	public int setSoundId(int soundId)
	{
		soundToPlay=soundId;
		return soundToPlay;
	}
	public void setLoop(boolean looping)
	{
		if(looping)
		{
			Pad.mSoundPoolHelper.setLoop(true);
		}
	}
}
