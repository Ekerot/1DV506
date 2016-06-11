package dekes03_lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrunkenWalk {

	public static void main(String[] args) {

		int max, storlek, antal, ramlare = 0;

		Scanner scan = new Scanner(System.in); // scannar värdena som behövs för
												// spelet

		System.out.println("Ange storlek på plattformen: ");
		storlek = scan.nextInt();

		System.out.println("Ange max antal steg: ");
		max = scan.nextInt();

		System.out.println("Ange antal vandrare: ");
		antal = scan.nextInt();

		scan.close();

		for (int i = 0; i <= antal - 1; i++) { // loopar antalet steg som varje
												// person tar
			RandomWalk slump = new RandomWalk(max, storlek);
			slump.walk();
			if (!(slump.inBounds())) { // om en person inte håller sig innanför
										// plattformen plussas ramlare med ett
				ramlare++;

			}

		}

		double procent = (double) (ramlare * 100.0f / antal); // räknar
																// procenten för
																// ramlarna
		DecimalFormat decimaler = new DecimalFormat("#.00");

		System.out.println("Av " + antal + " onyktra personer, föll " + ramlare + " (" + decimaler.format(procent) + "%"
				+ ") " + "i vattnet.");

	}

}
