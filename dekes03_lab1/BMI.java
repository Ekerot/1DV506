package dekes03_lab1;

import java.util.Scanner;

public class BMI {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Skriv in din längd i meter: ");
		double langd = scan.nextDouble();
		System.out.println("Skriv in din vikt i kg: ");
		double vikt = scan.nextDouble();
		double upphojd = (langd*langd);
		
		int resultat = (int) (vikt/upphojd);
		
		System.out.println("\nDin BMI är: " + resultat);
		
		scan.close();

	}

}
