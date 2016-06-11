package dekes03_lab3;

public class Fraction {

	private int numerator = 0;
	private int denominator = 1;

	public Fraction(int x, int y) {
		this.setNumerator(x);
		this.setDenominator(y);

	}

	public int getNumerator() { // gettar numerator
		return numerator;
	}

	public void setNumerator(int numerator) { // sätter värdet i Numerator
		this.numerator = numerator;
	}

	public int getDenominator() { // gettar Denominator
		return denominator;
	}

	public void setDenominator(int denominator) { // sätter värdet i Denominator
		this.denominator = denominator;
	}

	public boolean isNegative() { // tittar om nämnaren är minus eller 0
		if (denominator <= 0) {
			return true;

		}
		return false;

	}

	public String toString() { // toString gör att strängen skriver ut den text
								// som är i strängen och inte minnesvärdet

		return this.getNumerator() + "/" + this.getDenominator();

	}

	public Fraction add(Fraction in) { // adderar de båda bråktalen
		int newNumerator = (this.getNumerator() * in.getDenominator()) + (this.getDenominator() * in.getNumerator());

		int newDenominator = this.getDenominator() * in.getDenominator();

		return new Fraction(newNumerator, newDenominator);

	}

	public Fraction subtract(Fraction in) { // subtraherar de båda bråktalen
		int newNumerator = (this.getNumerator() * in.getDenominator()) - (this.getDenominator() * in.getNumerator());

		int newDenominator = (this.getDenominator() * in.getDenominator());

		return new Fraction(newNumerator, newDenominator);

	}

	public Fraction multiply(Fraction in) { // multiplicera de båda bråktalen
		int newNumerator = this.getNumerator() * in.getNumerator();
		int newDenominator = this.getDenominator() * in.getDenominator();

		return new Fraction(newNumerator, newDenominator);

	}

	public Fraction divide(Fraction in) { // dividerar de båda bråktalen
		int newDenominator = this.getNumerator() * in.getDenominator();
		int newNumerator = in.getNumerator() * this.getDenominator();

		return new Fraction(newNumerator, newDenominator);

	}

	public boolean isEqualTo(Fraction in) { // metoden tittar om de båda
											// bråktalen är equal
		if (this.getNumerator() == in.getNumerator()) {
			if (this.getDenominator() == in.getDenominator()) {
				return true;
			}

		}

		return false;

	}

}
