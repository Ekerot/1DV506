package dekes03_lab1;

public class TelefonNummer {

	public static void main(String[] args) {

		int nummerEtt = (int) (Math.random() * 9) + 1;
		int nummerTva = (int) (Math.random() * 9) + 1;
		int nummerTre = (int) (Math.random() * 9) + 1;
		int nummerFyra = (int) (Math.random() * 8) + 2;
		int nummerFem = (int) (Math.random() * 9) + 1;
		int nummerSex = (int) (Math.random() * 9) + 1;
		int nummerSju = (int) (Math.random() * 9) + 1;
		int nummerAtta = (int) (Math.random() * 9) + 1;
		int nummerNio = (int) (Math.random() * 9) + 1;

		System.out.println("0" + nummerEtt + nummerTva + nummerTre + "-" + nummerFyra + nummerFem + nummerSex
				+ nummerSju + nummerAtta + nummerNio);

	}

}
