package dekes03_lab2;

import java.util.Scanner;

public class NastStorsta {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		int storsta = Integer.MIN_VALUE;
		int nastStorsta = Integer.MIN_VALUE;

		System.out.println("Mata in tio heltal: ");

		for (int i = 0; i <= 9; i++) { // loopar tio gånger = antal inmatningar

			int vardeScan = scan.nextInt();

			if (vardeScan > storsta) { // loopar om värdet i vardeScan är större
										// än värdet i storsta
				int temp = storsta; // sparar vardet i variabeln storsta i temp
				storsta = vardeScan; // skriver över värdet i storsta med värdet
										// i vardeScan
				nastStorsta = temp; // variabeln nastStorsta skrivs över med den
									// temporärt lagrade variabeln i temp

			}

		}

		System.out.print("Det näst största talet är: " + nastStorsta);
		scan.close();
	}

}
