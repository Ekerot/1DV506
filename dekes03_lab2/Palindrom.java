package dekes03_lab2;

import java.util.Scanner;

public class Palindrom {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		String baklanges = "", nyMening = "";

		System.out.println("Skriv in ett ord eller en mening så får du veta om det är ett palindrom.");
		String mening = scan.nextLine();

		String smaBokstaver = mening.toLowerCase(); // omvandlar alla
													// stora bokstäver till små

		for (int i = 0; i < mening.length(); i++) {
			char bokstav = smaBokstaver.charAt(i); // gör varje bokstav i
													// strängen till en char

			if (Character.isLetterOrDigit(bokstav)) {
				nyMening = nyMening + smaBokstaver.charAt(i);

				// om "bokstav" inte är en bokstav eller siffra hoppar if-loopen
				// över och skriver inte in "bokstav" i "nyBokstav"

			}

		}

		for (int j = nyMening.length() - 1; j >= 0; j--) {

			baklanges = baklanges + nyMening.charAt(j); // bakvänder "nyMening"
														// för att sedan kunna
														// jämföra den med sig
														// själv och på så sätt
														// se om meningen/ ordet
														// är ett palindrom

		}

		if (nyMening.equals(baklanges)) {
			System.out.print("Meningen/ordet är ett palindrom.");
		} else {
			System.out.print("Meningen/ ordet är inte ett palindrom.");

		}
		scan.close();
	}

}
