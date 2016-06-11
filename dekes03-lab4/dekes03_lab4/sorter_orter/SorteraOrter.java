package dekes03_lab4.sorter_orter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorteraOrter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int antal = 0;

		try

		{ // läser in text från fil

			File file = new File("/Users/ekerot/Desktop/orter.dat"); // läser in
																		// filen
																		// orter.dat
			Scanner scan = new Scanner(file);
			System.out.println("Orterna läses in från dokumentet:" + file);
			ArrayList<Ort> orter = new ArrayList<Ort>(); // lista för att spara
															// orter och
															// postnummer i

			while (scan.hasNext()) { // läser in rad för rad från textfilen in i
										// listan

				antal++;
				String nyOrt = scan.nextLine();
				Ort ort = new Ort(nyOrt);
				orter.add(ort);

			}
			System.out.println("Antal orter: " + antal + "\n");

			Collections.sort(orter); // sorterar orterna med hjälp av metoden
										// compareTo i Ort.java

			for (int i = 0; i < orter.size(); i++) { // skriver ut ort för ort
														// som är sorterade
				System.out.println(orter.get(i));

			}
			scan.close();

		} catch (IOException e) // exxcepton om ingen fil hittas

		{
			System.out.println(e.getMessage());
			System.exit(0);

		}

		System.out.println();

	}

}
