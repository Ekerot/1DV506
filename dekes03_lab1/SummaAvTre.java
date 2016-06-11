package dekes03_lab1;

import java.util.Scanner;

public class SummaAvTre {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Ange ett tresiffrigt heltal: ");
		int treSiffror = scan.nextInt();

		int forstaDividering = treSiffror / 100;
		int siffraEtt = forstaDividering % 100;

		int andraDividering = treSiffror / 10;
		int siffraTva = andraDividering % 10;

		int siffraTre = treSiffror % 10;

		int summan = siffraEtt + siffraTva + siffraTre;

		System.out.println("Summan av heltalen i siffrorna är: " + summan);
		
		scan.close();
	}

}
