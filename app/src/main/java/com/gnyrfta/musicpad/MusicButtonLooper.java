package com.gnyrfta.musicpad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.ImageButton;


public class MusicButtonLooper extends ImageButton {
    private int soundToPlay;
    private int buttonNumber=0;
    public MusicButtonLooper (final Context context, final AttributeSet attrs) {
        super(context, attrs);

        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        Log.v("tag", "I get touched");
        //setText("I recive a MotionEvent");
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            //setText("I can recive Move events outside of my View");
            /*
            if(Pad.baseLinePlaying)
            {
                switch(Pad.baseLinePlayingIs)
                {
                    case 13: Pad.mSoundPoolHelper.stop(Pad.soundIdThirteen);
                        break;
                    case 14: Pad.mSoundPoolHelper.stop(Pad.soundIdFourteen);
                        break;
                    case 15: Pad.mSoundPoolHelper.stop(Pad.soundIdFifteen);
                        break;
                    case 16: Pad.mSoundPoolHelper.stop(Pad.soundIdSixteen);
                        break;
                    default://do nothing
                }
            }*/
            Pad.mSoundPoolHelper.setLoop(true);
            Pad.mSoundPoolHelper.play(soundToPlay);
            Pad.baseLinePlaying=true;
            Pad.baseLinePlayingIs=buttonNumber;
            //Pad.mSoundPoolHelper.play(Pad.soundIdUL);
        }
        return super.onTouchEvent(event);
    }
    public int setSoundId(int soundId)
    {
        soundToPlay=soundId;
        return soundToPlay;
    }
    public void setButtonNumber(int buttonNumberIs)
    {
        buttonNumber=buttonNumberIs;
    }

}
