package dekes03_lab2;

import java.util.Scanner;
import java.util.Random;

public class HighLow {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		Random rand = new Random();
		int slumpTal = rand.nextInt(101) + 1; // slumpar ett tal mellan 1-100

		for (int i = 0; i <= 9; i++) { // loopar 10gånger

			System.out.println("Gissa ett tal mellan 1 och 100");
			int skrivTal = scan.nextInt();

			if (i == 9) { // om användaren gissat tio gånger skrivs texten ut
							// och programmet avslutas
				System.out.println("Du har gissat 10 gånger utan att lyckas, ge upp!");
				break;

			}

			else if (slumpTal < skrivTal) { // om talet som gissats är lägre än
											// slumptalet skrivs texten ut och
											// programmet fortsätter
				System.out.println("Ledtråd: talet är lägre än: " + skrivTal);
				continue;

			}

			else if (slumpTal > skrivTal) { // om talet som gissats är högre än
											// slumptalet skrivs texten ut och
											// programmet fortsätter
				System.out.println("Ledtråd: talet är högra än: " + skrivTal);
				continue;

			}

			else if (slumpTal == skrivTal) { // om talet som gissats är lika med
												// slumptalet skrivs testen ut
												// och programmet avslutas
				System.out.printf("Rätt svar efter bara %d gissningar!", i + 1);
				break;

			}

		}
		scan.close();
	}
}
