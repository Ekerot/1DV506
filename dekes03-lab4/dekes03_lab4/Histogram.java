package dekes03_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Läser heltal från filen: /Users/ekerot/Desktop/heltal.dat");

		ArrayList<Integer> heltal = new ArrayList<Integer>();
		heltal = add();

		underHundra(heltal);
		histogram(heltal);

	}

	public static ArrayList<Integer> add() { // läser in heltal från filen
												// heltal.dat och matar listan
												// heltal med talen

		ArrayList<Integer> temp = new ArrayList<Integer>();

		try {
			File file = new File("/Users/ekerot/Desktop/heltal.dat");

			Scanner scan = new Scanner(file);

			while (scan.hasNext()) {
				int tal = scan.nextInt();
				temp.add(tal);

			}

			scan.close();

		} catch (FileNotFoundException e) { // exception om ingen fil hittas
			System.out.println(e.getMessage());
			System.exit(0);
			;

		}

		return temp;

	}

	public static void underHundra(ArrayList<Integer> in) { // räknar hur värden
															// i listan som är i
															// intervallet 1
															// till 100 samt
															// antalet tal över
															// intervallet
		int antal = 0;
		int antalOvriga = 0;

		for (int i = 0; i < in.size(); i++)

		{
			if (in.get(i) <= 100) {
				antal++;
			} else {
				antalOvriga++;
			}

		}
		System.out.println("Antal i intervallet [1,100]: " + antal);
		System.out.println("Övriga: " + antalOvriga);

	}

	public static void histogram(ArrayList<Integer> heltal) { // skriver ut ett
																// histogram av
																// värdena i
																// filen i
																// 10tals
																// intervall

		System.out.println("\nHistogram\n");

		System.out.print("1   - 10  | ");

		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) <= 10) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("11  - 20  | ");

		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 10 && heltal.get(j) <= 20) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("21  - 20  | ");

		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 20 && heltal.get(j) <= 30) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("31  - 40  | ");
		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 30 && heltal.get(j) <= 40) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("41  - 50  | ");
		for (

		int j = 0; j < heltal.size(); j++)

		{

			if (heltal.get(j) > 40 && heltal.get(j) <= 50) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("51  - 60  | ");
		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 50 && heltal.get(j) <= 60) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("61  - 70  | ");
		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 60 && heltal.get(j) <= 70) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("71  - 80  | ");

		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 70 && heltal.get(j) <= 80) {
				System.out.print("*");
			}
		}

		System.out.println();
		System.out.print("81  - 90  | ");
		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 80 && heltal.get(j) <= 90) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.print("91  - 100" + " | ");
		for (

		int j = 0; j < heltal.size(); j++)

		{
			if (heltal.get(j) > 90 && heltal.get(j) <= 100) {
				System.out.print("*");
			}
		}

	}

}
