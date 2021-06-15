package _05_vault;

import javax.swing.JOptionPane;

public class JamesBond {
	public static void main(String[] args) {
		String yn = JOptionPane.showInputDialog("Would you like to set the code?\nY or N");
		
		vault v = new vault();
		
		if (yn.equalsIgnoreCase("y")) {
			String c = JOptionPane.showInputDialog("Input number from one to a million.");
			int num = Integer.parseInt(c);
			v.code(num);
		}
		
		for (int tCode = 1; tCode < 1000001; tCode++) {
			v.tryCode(tCode);
			if (tCode == v.code)
				break;
		}
	}
}
