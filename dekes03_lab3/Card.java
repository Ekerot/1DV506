package dekes03_lab3;

public class Card {

	public Farg kortFarg;
	public Varde kortVarde;

	public Card(Varde vardeIn, Farg fargIn) { // konstruktor ger värde till
												// korten
		kortVarde = vardeIn;
		kortFarg = fargIn;

	}

	public enum Farg {
		HJÄRTER, SPADER, RUTER, KLÖVER; // enumeration Färg på korten

	}

	public enum Varde {
		ESS, TVÅ, TRE, FYRA, FEM, SEX, SJU, ÅTTA, NIO, TIO, KNECKT, DAM, KUNG; // enumeration
																				// värde
																				// på
																				// korten
	}

}
