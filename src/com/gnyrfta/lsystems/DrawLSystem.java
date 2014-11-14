/*This is here for reference only. This was for a regular java app, not android. */


/*This class contains a main-function. It gives instructions to the Turtle and draws a line following the turtle (except when a state (coordinates) is popped from a stored state in which case the turtle simply jumps to that state without leaving a line behind it).*/
package com.gnyrfta.lsystems;

import java.util.ArrayList;
//import javax.swing.*;

public class DrawLSystem /*extends JPanel*/ {
	/*
ArrayList <String> drawingTemplate;

	public DrawLSystem() {
		//Empty Constructor	
	}

  public void paint(Graphics g) {

  	Graphics2D g2 = (Graphics2D) g;

  		int iterations = LookAtLSystem.iterations;
  		int startStepLength=20;
			Turtle.direction=0;//starting direction of turtle. Facing towards the right, as direction of zero degrees in unity circle.
			int[] stepLengths = {20,10,5,2,1,1,1,1,1,1,1};
			Turtle.stepLength=5;
			Turtle.x=400;
			Turtle.y=200;
			LSystem ls = new LSystem();

			drawingTemplate = ls.pattern(iterations,LookAtLSystem.getStartingPattern(),LookAtLSystem.getFReplacementRule(),LookAtLSystem.getXReplacementRule(),LookAtLSystem.getYReplacementRule()); //Generates the LSystem pattern for the amount of iterations chosen and th replacement rules chosen.
			int turningAngle = LookAtLSystem.getAngle();

			for(String i : drawingTemplate){
				if(i.equals("F")){
					int x,y;
					x = Turtle.x ;
					y = Turtle.y ;
					Turtle.move();
					g2.drawLine(x,y,Turtle.x,Turtle.y);	
					System.out.println(Turtle.x);
					System.out.println(Turtle.y);			
				}
				else if(i.equals("+")){
					Turtle.direction+=turningAngle;
				}
				else if(i.equals("-")){
					Turtle.direction-=turningAngle;
				}
				else if(i.equals("[")){
					Turtle.pushDownState();				
				} 
				else if(i.equals("]")){
					Turtle.popUpState();				
				} 				
				else {
				//Do nothing.
				}  		
			}




	} 	

  public static void main(String s[]) {
      JFrame f = new JFrame("A Drawing.");
      JComponent newContentPane = new DrawLSystem();
      f.setContentPane(newContentPane);
 			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 			
      f.setSize(new Dimension(800,400));
      f.setVisible(true);
  }	

	 */
}
