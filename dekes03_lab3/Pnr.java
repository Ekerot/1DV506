
package dekes03_lab3;

public class Pnr {

	public static void main(String[] args) {

		String personnummer = "801011-2713";
		String personnummer2 = "800417-2913";
		String personnummer3 = "840417-2723";
		String personnummer4 = "800411-2713";

		// alla deklarationer som skickar till metoder

		String del1 = getFirstPart(personnummer);
		String del2 = getSecondPart(personnummer);
		boolean kvinna = isFemaleNumber(personnummer);
		boolean man = isMaleNumber(personnummer);
		boolean equal = areEqual(personnummer, personnummer2);
		// boolean korrekt = isCorrect(personnummer);

		// alla Systemprint samlade

		System.out.println(del1);

		System.out.println(del2);

		System.out.println("Personen är en kvinna: " + kvinna);

		System.out.println("Personen är en man: " + man);

		System.out.println("Personnummerna är samma: " + equal);

//		System.out.println("Personnumret är äkta: " + korrekt);

	}

	private static String getFirstPart(String in) { // plocka ut den första
													// delen ur personnumret
		String out = in.substring(0, 6);

		return out;
	}

	private static String getSecondPart(String in) { // plockar ut den andra
														// delen av personnumret
		String out = in.substring(7);

		return out;
	}

	private static boolean isFemaleNumber(String in) { // metoden tittar på om
														// personnumret är
														// kvinnligt

		if (in.charAt(9) % 2 == 0) { // om näst sista siffra i pnr är jämt är
										// det en kvinna - kontroll
			return true;

		}
		return false;
	}

	private static boolean isMaleNumber(String in) { // metoden tittar på om
														// personnumret är
														// manligt

		if (in.charAt(9) % 2 == 1) { // om näst sista siffra i pnr är ojämt är
										// det en man - kontroll
			return true;

		}
		return false;

	}

	private static boolean areEqual(String in, String in2) { // jämför om två
																// strängar är
																// lika

		if (in.contains(in2)) { // jämför två strängar/ personnummer
			return true;
		}

		return false;
	}

	// private static boolean isCorrect(String in) {
	// int[] delEtt = new int[6];
	// int[] delTva = new int[4];
	// String temp1 = delEtt.toString();
	// String manad = "";
	// String dag = "";
	// int manadInt = Integer.parseInt(manad);
	// int dagInt = Integer.parseInt(dag);
	//
	// for(int i = 2; i < 5; i++){
	// manad = (String) temp1.substring(2, 3);
	// dag = (String) temp1.substring(4, 5);
	//
	// }
	//
	// for (int i = 0; i < 6; i++) {
	// delEtt[i] = Character.getNumericValue(in.charAt(i));
	//
	// }
	//
	// for (int j = 0; j < 4; j++) {
	// delTva[j] = Character.getNumericValue(in.charAt(delEtt.length + j +1));
	//
	// }
	//
	// if (delEtt[2] > 1 || delEtt[3] > 2) {
	// System.err.println("Du har anget en månad som inte finns");
	// System.exit(0);
	//
	// }
	//
	//
	//// if (dagInt >= 31 && manadInt == ){
	////
	////
	//// }
	//
	//
	// return false;
	//
	// }

}
