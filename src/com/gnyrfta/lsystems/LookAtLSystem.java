/*This is here for reference only. This was for a regular java app, not android. */

/*This class draws up the GUI where the user can set turning angle, replacement rules, et.c. If the "Draw" button is pressed, the main function of "DrawLSystem" is called. This is the main class of the program, but there are two main functions - one in the class DrawLSystem and one in this class. I assume this is not good practice but it works, so until a hurricany day I'll let it be.*/

package com.gnyrfta.lsystems;

import java.awt.*;
/*import java.awt.Graphics.*;
import javax.swing.*;
import java.awt.event.*;*/
import java.util.*;

public class LookAtLSystem /*extends JPanel implements ActionListener*/ {
/*
	public static String fractalChosen;
	public static int iterations;
	public static boolean warningIssued=false;
	public JLabel infoText;
	public JLabel infoText2;
	public JLabel infoText3;	
	public static JTextField replacementF;
	public static JTextField replacementX;
	public static JTextField replacementY;	
	public static JTextField jtf;

	public ArrayList <String> startingPattern;
	public static IntegerField itf;
	
	public LookAtLSystem() {
		super (new GridBagLayout());
		GridBagLayout gridbag = (GridBagLayout)getLayout();
		GridBagConstraints c = new GridBagConstraints();	
		
		
		JLabel iterations = new JLabel("Choose amount of Iterations:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		gridbag.setConstraints(iterations,c);
		add(iterations,c);

		String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
		
		JComboBox jc = new JComboBox(array);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		gridbag.setConstraints(jc,c);
		jc.setSelectedIndex(0);
		add(jc,c);
		jc.addActionListener(this);
		
		infoText = new JLabel("Choose Starting Pattern");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		gridbag.setConstraints(infoText,c);
		add(infoText,c);
		
		jtf = new JTextField("F-F-F-F");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		gridbag.setConstraints(jtf,c);
		jtf.setColumns(10);
		add(jtf,c);		
		
		infoText = new JLabel("Choose turning angle");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		gridbag.setConstraints(infoText,c);
		add(infoText,c);

		itf = new IntegerField(4);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		gridbag.setConstraints(itf,c);
		itf.setInt(90);
		add(itf,c);	
		
		infoText = new JLabel("Replacement Rule for F:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		gridbag.setConstraints(infoText,c);
		add(infoText,c);
		
		replacementF = new JTextField("F");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		gridbag.setConstraints(replacementF,c);
		replacementF.setColumns(30);
		add(replacementF,c);	
		
		infoText2 = new JLabel("Replacement Rule for X:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		gridbag.setConstraints(infoText2,c);
		add(infoText2,c);
		
		replacementX = new JTextField("X");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		gridbag.setConstraints(replacementX,c);
		replacementX.setColumns(30);
		add(replacementX,c);		
		
		infoText3 = new JLabel("Replacement Rule for Y:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		gridbag.setConstraints(infoText3,c);
		add(infoText3,c);
		
		replacementY = new JTextField("Y");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		gridbag.setConstraints(replacementY,c);
		replacementY.setColumns(30);
		add(replacementY,c);		
		
		JButton draw = new JButton("Draw");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 6;
		gridbag.setConstraints(draw,c);
		add(draw,c);
		
		draw.addActionListener(this);
		draw.setActionCommand("draw");				
	}

  public static void main(String s[]) {
      JFrame f = new JFrame("Draw L-Systems.");
 			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 			
 			JComponent newContentPane = new LookAtLSystem();   
 			f.setContentPane(newContentPane); 
      f.pack();
      f.setSize(new Dimension(960,400));     
      f.setVisible(true);
  }	
  
  public static ArrayList<String> stringToArrayList(String s){
  	char[] stringArray=s.toCharArray();
  	ArrayList<String> al = new ArrayList<String>();
  	for (char c : stringArray){
  		String string = ""+c;
  		al.add(string);
  	}	
  	return al;
  }
  
  public static ArrayList<String> getStartingPattern(){
  		ArrayList<String> startingPattern;
  		String startingString = jtf.getText();
			startingPattern = stringToArrayList(startingString);
			return startingPattern;
  }
  
  public static ArrayList<String> getFReplacementRule(){
  		ArrayList<String> FReplacementRule;
  		String string = replacementF.getText();
			FReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule"+string);			
			return FReplacementRule;
  }  
  
  public static ArrayList<String> getXReplacementRule(){
  		ArrayList<String> XReplacementRule;
  		String string = replacementX.getText();
			XReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule for X: "+string);			
			return XReplacementRule;
  }   
  
  public static ArrayList<String> getYReplacementRule(){
  		ArrayList<String> YReplacementRule;
  		String string = replacementY.getText();
			YReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule for Y: "+string);			
			return YReplacementRule;
  }    
  
  public static int getAngle(){
  	int chosenAngle;
		chosenAngle = itf.getInt();
		return chosenAngle;
  }
  
  public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JComboBox) {
			try{
  		JComboBox cb = (JComboBox)e.getSource();
  		iterations = cb.getSelectedIndex()+1;
  		System.out.println("This is iteration #: "+iterations);
  		}catch (Exception E){}
  	}  	
		if (e.getSource() instanceof JButton) {
if ("draw".equals(e.getActionCommand())){
				try{
					System.out.println("The program will attempt to draw a bracketed OL system.");
					DrawLSystem dls = new DrawLSystem();
					dls.main(null);
				} catch (Exception E){}				//Do stuff.
			}		
		}
										
	}*/
}	