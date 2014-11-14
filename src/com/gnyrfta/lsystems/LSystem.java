/*

The sequence produced by the rules F->F-F+F+FF-F-+F is an example of an Lindenmeyer system.
F = Move forward, draw a line of length 'd'. The state of the turtle changes to (x',y',a), where x'=x+dcosa,
y'=y+dsina.
+ = turn left an angle 90 degrees (?)
- = turn right an angle 90 degrees (?)
d=d/4 for every iteration.

Other examples include the Koch Snowflake, the Sierpinski triangle but also patterns that form images and shapes that 
look very much like some plants! For more info on this visit the wiki page: http://en.wikipedia.org/wiki/L-system

The class returns an arraylist with the fibonacci sequence for iteration set in main program. The main program 
is really only there for test purposes, and can be commented out. 
SEEMS TO RETURN ONE FIBONACCI SEQUENCE/NUMBER TOO HIGH!

This class contains a pattern method which takes as input amount of iterations, replacement rules for three variables called 
F(meaning move forward in the final array), X and Y (which have no meaning in the final array and are only interesting for
 controlling array development. + and - are simply replaced by themselves. This method can produce many 2D-L systems, 
 if there is a system which needs other variables than F,X or Y it would be easy to add to the pattern-functions below 
 an extra variable and replacement rule analagous to the ones already existing.
For 3D-L systems, more degrees of freedom exist (pitch up, down, roll left right, turn left right...) and orientation of 
the turtle in space becomes important. After having messed around a bit with this, I realized that a guy at MIT had 
already solved this and created a package called "Cheloniidae" for a 3D-turtle in java! It's a great program! There is 
not so much documentation too it yet, though. I built an application that lets you choose starting parameters and replacement
 rules for a 3D-turtle using "Cheloniidae", but unfortunately the only replacement rules I have found so far are for a 
 Hilbert Cube. Nothing wrong with a Hilbert Cube, I just wish there were more replacement rules easily found for 3D-L systems.
  A good continuation of the 3D-program would be adding leaf structure possibilities to it, as described in Aristid Lindenmeyer & 
  Co's great book "The Algorithmic beauty of Plants".
*/

package com.gnyrfta.lsystems;

import java.util.*;
public class LSystem {

	static int i;
	static int j;
	static int k;
	
	//This is a testfunction that draws a hard-coded pattern for a given iteration #:
	static ArrayList<String> pattern(int iteration){
	
   	ArrayList<String> pattern = new ArrayList<String>();//pattern.
   	pattern.add("F");
   	 	
   	ArrayList<String> pattern2 = new ArrayList<String>();//pattern2
   	//replacement rules:
   	for (j=0;j<iteration-1;j++){
   		for (k=0;k<pattern.size();k++){
		 		String test = pattern.get(k);
			 	if (test.equals("F")){
			 		pattern2.add("F");
   				pattern2.add("[");			 		
			 		pattern2.add("+");
	   			pattern2.add("F");		 		
			 		pattern2.add("]");
			   	pattern2.add("F"); 		
			 		pattern2.add("[");
			 		pattern2.add("-");
			   	pattern2.add("F"); 		
			 		pattern2.add("]");
			 		pattern2.add("F");
			 	}
			 	if (test.equals("-")){
			 		pattern2.add("-");
			 	}
			 	if (test.equals("+")){
			 		pattern2.add("+");
			 	}
			 }
			 pattern.clear();
			 	for (i=0;i<pattern2.size();i++){
			 		pattern.add(pattern2.get(i));
			 	}
			 	pattern2.clear();
		 	}
		 	
   	if (iteration==0){ //The zero case is special.
   	pattern.clear();
   	System.out.println("Not much happening with that low iteration #.");
   	}
   	
   	for (i=0;i<pattern.size();i++){
		 	System.out.println(pattern.get(i));
   	}

    return pattern;	
	}

//This is the function used by the program, it takes as input starting pattern, replacement rules and amount of iterations:
		static ArrayList<String> pattern(int iteration,ArrayList <String> al,ArrayList <String> rule1,ArrayList <String> rule2,ArrayList <String> rule3){
	// al contains starting pattern.
	//rule 1 contains rewriting rules for F.
	//rule 2 contains rewriting rules for X.
	//rule 3 contains rewriting rules for Y.	
   	ArrayList<String> pattern = new ArrayList<String>();//pattern.
   	pattern=al;
   	System.out.println("This is pattern size: "+pattern.size());
   	ArrayList<String> pattern2 = new ArrayList<String>();//pattern2
   	//replacement rules:
   	for (j=0;j<iteration-1;j++){
   		for (k=0;k<pattern.size();k++){
		 		String test = pattern.get(k);
					if (test.equals("F")){
						for (String s : rule1){
							pattern2.add(s);
						}
			 	}
			 	
			 	if (test.equals("X")){
						for (String s : rule2){
							pattern2.add(s);
						}
			 	}
			 	
			 	if (test.equals("Y")){
						for (String s : rule3){
							pattern2.add(s);
						}
			 	}			 	
			 	
			 	if (test.equals("-")){
			 		pattern2.add("-");
			 	}
			 	if (test.equals("+")){
			 		pattern2.add("+");
			 	}
			 	if (test.equals("[")){
			 		pattern2.add("[");
			 	}
			 	if (test.equals("]")){
			 		pattern2.add("]");
			 	}			 				 	
			 }
			 pattern.clear();
			 	for (i=0;i<pattern2.size();i++){
			 		pattern.add(pattern2.get(i));
			 	}
			 	pattern2.clear();
		 	}
		 	
   	if (iteration==0){ //The zero case is special.
   	pattern.clear();
   	System.out.println("");
   	}
   	
   	for (i=0;i<pattern.size();i++){
		 	System.out.println(pattern.get(i));
   	}

    return pattern;	
	}

	
	/*public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {	
			pattern(3);
			}						
		 });
	}*/

}
