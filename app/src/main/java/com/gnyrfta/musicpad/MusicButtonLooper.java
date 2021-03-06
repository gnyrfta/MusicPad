package com.gnyrfta.musicpad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.ImageButton;

import android.os.Handler;


public class MusicButtonLooper extends ImageButton {
    private int soundToPlay=0;
    private int buttonNumber=0;
    int playingId=0;
    boolean playing=false;
    int soundPoolHelper=1;
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


           // if(Pad.baseLinePlaying)
          //  {
            if(!playing) {
                Log.d("in baseline", "bla bla" + Pad.baseLinePlayingIs + "");

               /* switch(Pad.baseLinePlayingIs)
                {
                    case 13: Pad.mSoundPoolHelper.stop(Pad.buttonThirteen.playingId);
                        break;
                    case 14: Pad.mSoundPoolHelper.stop(Pad.soundIdFourteen);
                        break;
                    case 15: Pad.mSoundPoolHelper.stop(Pad.soundIdFifteen);
                        break;
                    case 16: Pad.mSoundPoolHelper.stop(Pad.soundIdSixteen);
                        break;
                    default://do nothing
                }*/
                //  Pad.mSoundPoolHelper.stop(Pad.playingLoopId);
                // }
                if(soundPoolHelper==1) {
                    Pad.mSoundPoolHelper.setLoop(true);
                    playingId = Pad.mSoundPoolHelper.play(soundToPlay);
                }
                else if(soundPoolHelper==2)
                {
                    Pad.mSoundPoolHelper.setLoop(true);
                    playingId = Pad.mSoundPoolHelper.play(soundToPlay);
                }
                Pad.turnLightOn(buttonNumber);
                playing=true;
            }
            else if(playing)
            {
                if(soundPoolHelper==1)
                {
                    Pad.mSoundPoolHelper.stop(playingId);
                }
                else if(soundPoolHelper==2) {
                    Pad.mSoundPoolHelper.stop(playingId);
                }
           //     Pad.mSoundPoolHelper.unload(playingId);
                Pad.turnLightOff(buttonNumber);
                playing=false;

            }
           // Pad.baseLinePlaying=true;
          //  Pad.baseLinePlayingIs=buttonNumber;
            //Pad.mSoundPoolHelper.play(Pad.soundId
           // final Handler handler = new Handler();
            //final int mStreamID=0;
            //handler.postDelayed(new Runnable() {
              //  @Override
                //public void run() {
                  // Pad.playingLoopId =  Pad.mSoundPoolHelper.play(soundToPlay);
               // }}, 350);
        }
        return super.onTouchEvent(event);
    }
    public int setSoundId(int soundId)
    {
        soundToPlay=soundId;
        return soundToPlay;
    }
    public void setSoundPoolHelper(int input)
    {
        soundPoolHelper=input;
    }
    public void setButtonNumber(int buttonNumberIs)
    {
        buttonNumber=buttonNumberIs;
    }

}
