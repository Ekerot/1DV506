package dekes03_lab3;

public class TextAnalyzer {
	private String text = "";
	private char[] nyArray = new char[text.length()];

	public TextAnalyzer(String n) { // Ger vardet som skickats från main till
									// text och nyArray
		text = n;
		nyArray = n.toCharArray();

	}

	public int charCount() { // räknar antalet chars i strängen
		int antalChars = 0;

		for (int i = 0; i < text.length(); i++) {
			antalChars++;

		}
		return antalChars;
	}

	public int upperCaseCount() { // beräknar antalet stora bokstäver i strängen
		int antalStoraChars = 0;

		for (int j = 0; j < nyArray.length - 1; j++) {
			if (Character.isUpperCase(nyArray[j])) {
				antalStoraChars++;
			}

		}

		return antalStoraChars;
	}

	public int whitespaceCount() { // räknar antalet mellanslag i strängen
		int blanksteg = 0;

		for (int k = 0; k < nyArray.length - 1; k++) {
			if (Character.isSpaceChar(nyArray[k])) {
				blanksteg++;
			}

		}
		return blanksteg;

	}

	public int digitCount() { // räknar antalet siffror i strängen
		int antalDigits = 0;

		for (int l = 0; l < nyArray.length - 1; l++) {
			if (Character.isDigit(nyArray[l])) {
				antalDigits++;

			}

		}
		return antalDigits;

	}

	public boolean containsChar(char in) {

		for (int m = 0; m < nyArray.length - 1; m++) {
			if (nyArray[m] == in) {
				return true;
			}
		}
		return false;

	}

	public boolean containsString(String in) { // tittar om "nakin" finns i
												// strängen

		if (text.contains("nakin")) {
			return true;

		}
		return false;

	}

}
