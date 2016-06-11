package dekes03_lab1;

import java.util.*;

public class KortNamn {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Vad är ditt förnamn: ");
		String forNamn = scan.next();

		System.out.println("Vad är ditt efternamn: ");
		String efterNamn = scan.next();

		char fNamn = forNamn.charAt(0);
		char punkt = '.';

		int tal = efterNamn.indexOf(efterNamn);

		if (tal >= 4) {
			String eNamn = efterNamn.substring(0, 4);
			System.out.println("\n:" +  fNamn + punkt +" "+ eNamn);
		} else {
			String eNamn = efterNamn;
			System.out.println("\n:" + fNamn + punkt + " " + eNamn);
		}
		
		scan.close();

	}

}
