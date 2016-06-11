package dekes03_lab2;

import java.util.Scanner;

public class Triangle {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Skriv in ett udda heltal:");
		int tal = scan.nextInt();

		if ((tal & 1) == 0) { // om talet inte är udda skrivs strängen ut

			System.out.println("Kan du inte läsa? UDDA heltal!");
			return;
		}
		for (int i = 0; i < tal; i++) { // loopar antalet gånger som det udda
										// heltalet som skrivits in

			for (int j = tal; j >= 0; j--) { // loopar samma baklänges

				if (j > i) { // varjegång j är större än i skrivs ett mellanslag
								// ut

					System.out.print(" ");
				}

				else { // om j är mindre än i skrivs en * ut
					System.out.print("*");

				}

			}
			System.out.println("");

		}

		System.out.println("");
		int talLikbent = tal / 2 + 1; // tar antalet udda heltal som skrivits ut
										// och dividerar det med 2 + sedan på en
										// 1:a

		for (int k = 0; k < talLikbent; k++) { // kör loopen så länge k är
												// mindre än variabeln
												// talLikbent

			for (int l = talLikbent; l >= 0; l--) { // kör loopen baklänges

				if (k < l) { // om k är mindre än l skrivs ett mellanslag ut

					System.out.print(" ");
				}

				else { // annars skrivs en * programmet behöver alltså inte
						// skriva ut några mellan slag på högersidan av
						// triangeln utan bara på vänstersidan, man lägger sedan
						// till * på högersidan så man får en likbenttriangel
					System.out.print("*");

					if (l >= 1) {
						System.out.print("*");

					}

				}

			}

			System.out.println("");

		}
		scan.close();
	}
}
