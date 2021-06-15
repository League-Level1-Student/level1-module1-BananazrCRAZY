package _03_harry_potter;

public class harryPotterRunner {
	public static void main(String[] args) {
		HarryPotter hp = new HarryPotter();
		hp.makeInvisible(true);
		hp.spyOnSnape();
		hp.makeInvisible(false);
		hp.castSpell("Hippopotamus");
	}
}
