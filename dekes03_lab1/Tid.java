package dekes03_lab1;

import java.util.Scanner;

public class Tid {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Ange antal sekunder: ");
		int sekunder = scan.nextInt();
		int timmar = sekunder / 3600;
		int nyttTal = sekunder - (timmar * 3600);
		int minuter = nyttTal / 60;
		int nyttTal2 = (minuter * 60) + (timmar * 3600);
		int sekund = sekunder - nyttTal2;

		System.out.printf("Detta motsvarar: %d timmar, %d minuter, %d sekunder.%n", timmar, minuter, sekund);
		
		scan.close();

	}

}
