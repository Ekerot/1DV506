package dekes03_lab2;

import java.util.Scanner;

public class StorstaK {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Mata in ett heltal: ");
		int n = scan.nextInt();

		int summa = 0, k = 0; // deklarerar variabler

		while (summa + k <= n) { // loopen snurrar så länge k är mindre eller
									// lika med n
			k = k + 2; // plussar på k med 2 varje gång loopen körs
			summa = summa + k; // plussar k med summa varje gång loopen körs,
								// detta för att while loopen ska avslutas när
								// största k har hittats

		}

		System.out.println(k);
		scan.close();

	}

}
