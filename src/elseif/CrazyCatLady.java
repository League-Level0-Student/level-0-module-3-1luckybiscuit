//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String ask = JOptionPane.showInputDialog("What is the quantity of feline mammals currently inhabiting your household?");
		// 2. Convert their answer into an int
		int as = Integer.parseInt(ask);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(as >= 3) {
			JOptionPane.showMessageDialog(null, "Since you have a high amount of felines in your vicinity, I will now proceed to make fun of you and call you a \"crazy cat lady\".");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		else if(as < 3 && as > 0) {
			playVideo("https://www.youtube.com/watch?v=JI7cIYcnTRU");
		}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		else {
			playVideo("https://www.youtube.com/watch?v=jAZZTE9t7g0");
			JOptionPane.showInputDialog("How do you feel now?");
			JOptionPane.showMessageDialog(null, "I don't care. Here's another:");
			playVideo("https://www.youtube.com/watch?v=g-lFZObPxIU");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

