package dekes03_lab2;

import java.util.Scanner;

public class Baklanges {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Mata in ett ord eller en mening: ");
		String text = scan.nextLine();

		String omvandText = ""; // variabel för den stringen baklänges

		for (int i = text.length() - 1; i >= 0; i--) { // kör strängen baklänges

			omvandText += text.charAt(i); // skriver in varje tecken för sig som
											// sparas eftervarandra i variabel
											// omvändtext

		}

		System.out.println(omvandText);

		scan.close();

	}

}
