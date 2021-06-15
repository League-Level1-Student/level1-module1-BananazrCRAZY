package _05_vault;

public class vault {
	int code = 123456;
	
	public void code(int num) {
		if (num < 1 || num > 1000000)
			System.out.println("Invalid Number");
		else
			code = num;
	}
	
	public void tryCode(int tCode) {
		if (tCode == code)
			System.out.println(tCode + " True");
		else
			System.out.println(tCode + " False");
	}
}
