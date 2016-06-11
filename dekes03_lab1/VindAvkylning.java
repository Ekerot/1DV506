package dekes03_lab1;

import java.util.Scanner;
import java.lang.Math;

public class VindAvkylning {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Ange temperatur i Celsius: ");
		double temp = scan.nextDouble();

		System.out.println("Ange vindhastighet i m/s: ");
		double vind = scan.nextDouble();

		double upphojdVind = Math.pow(vind, 0.16);

		double effektivTemperatur = 13.126667 + 0.6215 * temp - 13.924748 * upphojdVind
				+ 0.4875195 * temp * upphojdVind;

		int avrundadTemperatur = (int) Math.round(effektivTemperatur);

		System.out.println("Den effektiva temperaturen är: " + avrundadTemperatur);
		
		scan.close();

	}
}