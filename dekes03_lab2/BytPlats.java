package dekes03_lab2;

public class BytPlats {

	public static void main(String[] args) {

		char[] letters = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D' }; // array
																									// med
																									// tecken

		char temp;

		System.out.println(letters);

		for (int i = 0; i < letters.length / 2; i++) { // kör arrayens
														// halvalängd

			temp = letters[letters.length - i - 1]; // lagrar sista tecknet i
													// arrayen i en ny variabel

			letters[letters.length - i - 1] = letters[i]; // skriver över det
															// sista tecknet i
															// arrayen med den
															// första

			letters[i] = temp; // skriver över det första tecknet i arrayen med
								// den som lagrats i temp

		}

		System.out.print(letters);
	}

}
