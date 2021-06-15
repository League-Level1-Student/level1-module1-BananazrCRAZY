package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryCon implements ActionListener {
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField tf = new JTextField(20);
	JButton b = new JButton("CONVERT");
	JLabel l = new JLabel();
	char theLetter;
	
	public void bc() {
		f.add(p);
		p.add(b);
		p.add(tf);
		p.add(l);
		
		b.addActionListener(this);
		
		f.setVisible(true);
		f.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String bin = tf.getText();
		String cbin = convert(bin);
		l.setText(cbin);
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
}
