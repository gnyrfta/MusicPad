package com.gnyrfta.musicpad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawLSystemAndroid extends View {

	Paint p = new Paint();
	public DrawLSystemAndroid(Context context) {
		super(context);
		setFocusable(true);
	}
	protected void onDraw(Canvas canvas)
	{
		p.setColor(Color.BLACK);
		canvas.drawLine(0,0,100,100,p);
	}
	
}
