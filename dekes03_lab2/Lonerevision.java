package dekes03_lab2;

import java.util.*;

public class Lonerevision {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		ArrayList<Integer> loner = new ArrayList<Integer>();

		int index = 0, medellon = 0, medianlon = 0, tempTva = 0;
		String tal = "";

		System.out.println("Mata in löner (och avsluta med 'X'): ");

		while (tal.length() >= 0) { // scannar in string så länge runLoop är
									// sant

			tal = scan.nextLine();

			if (tal.equals("x")) // stannar loopen om string = x och avslutar då
									// scanning
				break;

			else {
				index = Integer.parseInt(tal); // gör om string till integer
				loner.add(index); // lägger till index till arrayen

			}
		}
		for (int j = 0; j <= loner.size() - 1; j++) { // räknar ut medellön
														// genom att plussa alla
														// index av arrayen och
														// dela dem på två
			int temp = loner.get(j);
			tempTva = tempTva + temp;
			medellon = tempTva / loner.size();
		}

		Collections.sort(loner); // sorterar arrayen

		if (loner.size() % 2 == 1) { // räknar ut medianlönen om antalet
										// inmatade tal är udda
			medianlon = loner.get(loner.size() / 2);
		}

		else { // räknar ut medianlönen om inmatade tal är jämna
			int tempMedianlon = loner.get(loner.size() / 2);
			medianlon = (tempMedianlon + loner.get(loner.size() / 2 - 1)) / 2;
		}

		int lonespridning = loner.get(loner.size() - 1) - loner.get(0); // räknar
																		// ut
																		// lönespridning

		System.out.println("\nLönespridning: " + lonespridning);
		System.out.println("\nMedellön: " + medellon);
		System.out.print("\nMedianlön: " + medianlon);

		scan.close();

	}

}
