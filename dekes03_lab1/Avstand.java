package dekes03_lab1;

import java.lang.Math;
import java.util.Scanner;

public class Avstand {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Ange koordinat x på första destinationen: ");
		double x1 = scan.nextDouble();

		System.out.println("Ange koordinat y på första destinationen: ");
		double y1 = scan.nextDouble();

		System.out.println("Ange koordinat x på andra destinationen: ");
		double x2 = scan.nextDouble();

		System.out.println("Ange koordinat y på andra destinationen: ");
		double y2 = scan.nextDouble();

		double upphojtX = Math.pow((x1 - x2), 2);
		double upphojtY = Math.pow((y1 - y2), 2);

		double avstand = Math.sqrt(upphojtX + upphojtY);

		System.out.printf("Avståndet mellan destinationerna är %.3f", avstand);

	}

}
