package com.gnyrfta.musicpad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageButton;


public class TestButtonFour extends ImageButton {
	private int soundToPlay;
	public TestButtonFour(final Context context, final AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouchEvent(final MotionEvent event) {
		Log.v("tag", "I get touched");
		//setText("I recive a MotionEvent");
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			//setText("I can recive Move events outside of my View");
			Pad.mSoundPoolHelper.play(Pad.soundIdLR);
		}
		return super.onTouchEvent(event);
	}
	public int setSoundId(int soundId)
	{
		soundToPlay=soundId;
		return soundToPlay;
	}
}
