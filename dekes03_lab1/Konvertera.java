package dekes03_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Konvertera {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		System.out.println("Ange temperatur i Farenheit: ");

		double farenheit = scan.nextDouble();
		double celsius = (farenheit - 32) * 5 / 9;
		DecimalFormat dFormat = new DecimalFormat("0.###");
		String treDecimaler = dFormat.format(celsius);

		System.out.println("Din angivna temperatur är " + treDecimaler + " i Celsius.");
		scan.close();
	}

}
