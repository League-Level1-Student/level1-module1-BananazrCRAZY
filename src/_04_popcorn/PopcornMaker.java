package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String f = JOptionPane.showInputDialog("What flavor of Popcorn?");
		String t = JOptionPane.showInputDialog("How many minutes to microwave?");
		int time = Integer.parseInt(t);
		
		Popcorn p = new Popcorn(f);
		Microwave m = new Microwave();
		
		m.putInMicrowave(p);
		m.setTime(time);
		m.startMicrowave();
	}
}
