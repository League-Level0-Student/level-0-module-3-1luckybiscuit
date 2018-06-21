package methodwriting;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obdRobo {
	Robot owo = new Robot();
	public static void main(String[] args) {
		obdRobo owoo = new obdRobo();
		owoo.start();
	}
	void start() {
		owo.miniaturize();
		owo.setSpeed(200);
		owo.penDown();
		owo.setPenWidth(3);
		String shape = JOptionPane.showInputDialog("What shape do you want?\nSquare?\nTriangle?\nCircle?");
		String ask = JOptionPane.showInputDialog("What color?");
		//color
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
		//shape
		if(shape.equalsIgnoreCase("square")) {
			drawSquare();
		}else if(ask.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}else if(ask.equalsIgnoreCase("circle")) {
			drawCircle();
		}else {
			JOptionPane.showMessageDialog(null, "Undeterminable. ERROR 404");
		}
	}
	void drawSquare() {
		for(int i = 0;i<4;i++) {
		owo.move(100);
		owo.turn(90);
		}
		}
	void drawTriangle() {
	for(int i = 0;i<3;i++) {
		owo.move(100);
		owo.turn(120);
		}
	}
	void drawCircle() {
		for(int i = 0;i<180;i++) {
			owo.move(2);
			owo.turn(2);
			}
	}
}
