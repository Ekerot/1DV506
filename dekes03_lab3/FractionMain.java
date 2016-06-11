package dekes03_lab3;

public class FractionMain {

	public static void main(String[] args) {

		Fraction braktal = new Fraction(3, 9); // anger värden på det första
												// bråktalet
		Fraction braktal2 = new Fraction(3, 9); // anger värden på det andra
												// bråktalet

		if (braktal.isNegative() == true) { // om nämnaren är negativt eller 0
											// avslutas programmet och "Nämnaren
											// är negativ!"skrivs ut
			System.err.println("Nämnaren är negativ!");
			System.exit(0);

		}

		// Utskrifter till de olika metoderna som vi vill ha värden/Strängar
		// utskrivna från

		System.out.println("Det första bråktalet: " + braktal + "\n");
		System.out.println("Det andra bråktalet: " + braktal2 + "\n");
		System.out.println("Om du adderar bråktalen får du: " + braktal.add(braktal2) + "\n");
		System.out.println("Om du subraherar bråktalen får du: " + braktal.subtract(braktal2) + "\n");
		System.out.println("Om du multiplicerar bråktalen får du: " + braktal.multiply(braktal2) + "\n");
		System.out.println("Om du dividerar bråktalen får du: " + braktal.divide(braktal2) + "\n");

		if (braktal.isEqualTo(braktal2) == true) { // om bråktalen är equal
													// skrivs strängen ut
			System.out.println("Bråktalen är samma");

		}

	}

}
