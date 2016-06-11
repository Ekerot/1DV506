package dekes03_lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RaknaTecken {

	public static void main(String[] args) throws IOException {

		StringBuilder text = new StringBuilder();
		text = add();
		rakna(text);

	}

	public static StringBuilder add() throws IOException {

		StringBuilder text = new StringBuilder();

		try { // läser in text från fil

			File file = new File("/Users/ekerot/Desktop/ChampagnenBlirDyrare.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNext()) { // läser in filen i stringbuilder
				String line = scan.nextLine();
				text.append(line);

			}

			scan.close();

		} catch (IOException e) { // exception om ingen fil hittas
			System.out.println(e.getMessage());
			System.exit(0);

		}

		return text;

	}

	public static void rakna(StringBuilder in) { // räknar antalet stora, små,
													// whitespace och överiga
													// bokstäver i SB:n
		int antalStora = 0, antalSma = 0, antalWhite = 0, antalOvriga = 0;

		for (int i = 0; i < in.length(); i++) {
			if (Character.isUpperCase(in.charAt(i))) {
				antalStora++;
			}

			else if (Character.isLowerCase(in.charAt(i))) {
				antalSma++;
			}

			else if (Character.isWhitespace(in.charAt(i))) { // programerar på
																// MAC och
																// resultatet på
																// whitespaces
																// blir då 420st
																// pga annan
																// formatering
																// av texten.
				antalWhite++;
			}

			else {
				antalOvriga++;
			}

		}

		System.out.println("Antal stora bokstäver: " + antalStora);
		System.out.println("Antal små bokstäver: " + antalSma);
		System.out.println("Antal \"whitespaces\": " + antalWhite);
		System.out.println("Antal övriga: " + antalOvriga);

	}

}
