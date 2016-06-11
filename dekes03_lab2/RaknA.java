package dekes03_lab2;

import java.util.Scanner;

public class RaknA {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println(
				"I det här programmet får du reda på hur många A eller a som ditt ord eller mening innehåller.\n\nSkriv in valfritt ord eller mening: ");
		String text = scan.nextLine();

		int antalSma = 0;
		int antalStora = 0;

		for (int i = 0; i < text.length(); i++) { // loopar så lång som texten
													// är
			if (text.charAt(i) == 'a') // om litet a hittas i index av Stringen
										// plussas talett ett på variabeln
										// antalSma
				antalSma++;

			if (text.charAt(i) == 'A')// om stort A hittas i index av Stringen
										// plussas talett ett på variabeln
										// antalStora
				antalStora++;

		}

		System.out.println("Antal a: " + antalSma + "\nAntal A: " + antalStora);

		scan.close();

	}

}
