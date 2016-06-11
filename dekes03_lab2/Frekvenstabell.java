package dekes03_lab2;

import java.util.Random;

public class Frekvenstabell {

	public static void main(String[] args) {

		int[] diceStrokes = new int[6000]; // arrayen ges ett värde av 6000
		int i, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;

		for (i = 1; i <= diceStrokes.length - 1; i++) { // loopen körs 6000
														// gånger

			Random rand = new Random();
			int stroke = rand.nextInt(6) + 1; // för varje gång loopen körs
												// slumpas ett tal mellan 1-6
			diceStrokes[i] = stroke; // talet från slumpgeneratorn lagras i
										// diceStrokes(array)

		}

		for (i = 1; i <= diceStrokes.length - 1; i++) { // i loopen räknas hur
														// många ettor som
														// slagits, hur många
														// tvåor som slagits etc
			if (diceStrokes[i] == 1) {
				one++;
			} else if (diceStrokes[i] == 2) {
				two++;
			} else if (diceStrokes[i] == 3) {
				three++;
			} else if (diceStrokes[i] == 4) {
				four++;
			} else if (diceStrokes[i] == 5) {
				five++;
			} else {
				six++;
			}

		}

		System.out.printf("Antal förekomster av:\n\nEttor: %d\nTvåor %d\nTreor: %d\nFyror: %d\nFemmor: %d\nSexor: %d",
				one, two, three, four, five, six);

	}
}
