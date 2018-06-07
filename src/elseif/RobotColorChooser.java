//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot owo = new Robot();
		owo.setX(300);
		owo.penDown();
		owo.miniaturize();
		owo.setPenWidth(20);
		owo.setSpeed(300);
		//3. Ask the user what color they would like the robot to draw
		for(int i = 0; i<20; i++) {
		String ask = JOptionPane.showInputDialog("What color do you want to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(ask.equalsIgnoreCase("black")) {
			owo.setPenColor(0,0,0);
		}else if(ask.equalsIgnoreCase("red")) {
			owo.setPenColor(255,0,0);
		}else if(ask.equalsIgnoreCase("orange")) {
			owo.setPenColor(255,128,0);
		}else if(ask.equalsIgnoreCase("yellow")) {
			owo.setPenColor(255,255,0);
		}else if(ask.equalsIgnoreCase("green")) {
			owo.setPenColor(0,255,0);
		}else if(ask.equalsIgnoreCase("blue")) {
			owo.setPenColor(0,0,255);
		}else if(ask.equalsIgnoreCase("purple")) {
			owo.setPenColor(200,0,255);
		}else if(ask.equalsIgnoreCase("pink")) {
			owo.setPenColor(255,0,200);
		}else if(ask.equalsIgnoreCase("brown")) {
			owo.setPenColor(50,0,50);
		}else {
			JOptionPane.showMessageDialog(null, "Undeterminable. Recalibrating...");
			owo.setRandomPenColor();
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
	    //2. Make the robot draw a shape (this will take more than one line of code)
			owo.move(50);
			owo.turn(18);
	}
		JOptionPane.showMessageDialog(null, "Finished! What a masterpiece!");
	}}

