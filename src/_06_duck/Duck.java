package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
	int numOfFriends;
	String favFood;
	
	Duck(String favoriteFood, int numberOfFriends) {
        this.favFood = favoriteFood;
        this.numOfFriends = numberOfFriends;
	}
	
	void quack() {
		JOptionPane.showMessageDialog(null, "Quack! Quack! Quack!");
	}
	
	void info(String adj) {
		JOptionPane.showMessageDialog(null, "I'm a duck and my favorite food is " + favFood + ".");
		JOptionPane.showMessageDialog(null, "I have " + numOfFriends + " friends.");
		JOptionPane.showMessageDialog(null, "All my friends think I'm so " + adj + ".");
	}
	
}
