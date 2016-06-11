package dekes03_lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class OmvandOrdning {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		int i = 0;

		System.out.println("Skriv in ett heltal, vid negativt heltal stannar programmet.");

		while (i >= 0) { // loopar fram och scannar nya värden i arrayen tills
							// ett negativt helttal anges

			i = scan.nextInt();
			list.add(i);

		}

		ArrayList<Integer> reverse = new ArrayList<Integer>();

		for (i = list.size() - 1; i >= 0; i--) { // loopar från sista värdet i
													// arrayen och bakåt
			reverse.add(list.get(i)); // vänder ordningen på talen i arrayen

		}

		reverse.remove(0); // tar bort index = 0(det negativa heltalet)

		System.out.println("Antal positiva heltal: " + reverse.size()); // skriver
																		// ut
																		// antalet
																		// heltal
																		// som
																		// finns
																		// i
																		// arrayen

		System.out.print("Baklänges: "); // skriver ut den vända arrayen

		for (int j = 0; j < reverse.size(); j++) {

			System.out.print(reverse.get(j) + " ");

		}

		scan.close();

	}

}
