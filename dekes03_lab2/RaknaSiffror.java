package dekes03_lab2;

import java.util.Scanner;

public class RaknaSiffror {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out
				.println("Mata in ett tal så beräknar programmet hur många 0:or, udda samt jämna tal som förekommer: ");

		int nollor = 0, udda = 0, jamna = 0;

		String tal = scan.nextLine();

		for (int i = 0; i < tal.length(); i++) { // loopar antal gånger som
													// stringen tal är långt

			if (tal.charAt(i) % 2 != 0) { // tittar på om char är jämnt, om
											// talet är jämt ökar variablen
											// jamnas värde med ett
				jamna++;

			}
			if (tal.charAt(i) % 2 == 1) { // tittar om char är udda, om talet är
											// udda ökar variablen udda värde
											// med ett
				udda++;

			}

			if (tal.charAt(i) == '0') { // tittar om char är en nolla, om talet
										// är en nolla ökar variablen nollas
										// värde med ett
				nollor++;
			}

		}

		System.out.printf("Antal nollor: %d\nAntaljämna tal: %d\nAntal udda tal:%d", nollor, jamna, udda);
		scan.close();
	}

}
