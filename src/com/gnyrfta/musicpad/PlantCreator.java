package com.gnyrfta.musicpad;

import java.util.ArrayList;

public class PlantCreator {
	long startTime=0;
	long stopTime=0;
	
	ArrayList<Long> timeStamps = new ArrayList<Long>();
	ArrayList<String> whatSound = new ArrayList<String>();//Or int to recognize Id.  
	
	public long start()
	{
		startTime=System.currentTimeMillis();
		return startTime;
	}
	public long stop()
	{
		stopTime=System.currentTimeMillis();
		return stopTime;
	}
	public void addSound(long currentTime,String instrument)
	{
		long timeStamp=currentTime-startTime;
		timeStamps.add(timeStamp);
		whatSound.add(instrument);
	}
	public void create()
	{
	 	
		//higher frequency of button presses -> more branching.
		//higher frequency of tones > sharper angles (more directed sound).
		//stronger pressed buttons =>?
		//instrument groupings => ? 
	}
}
