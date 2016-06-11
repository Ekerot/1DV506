package dekes03_lab3;

import java.util.ArrayList;

public class DeckMain {

	public static void main(String[] args) {

		ArrayList<Card> dragnaKort = new ArrayList<Card>(); // arraylist som
															// lagrar de
															// dragnakorten

		Deck deck = new Deck();
		deck.makeDeck();// anropar makeDeck
		deck.shuffleCard(); // anropar shuffleCard
		dragnaKort = deck.drawCard(7); // så många kort ska dras

		System.out.println("Du har " + deck.displayAntalKort() + " kort kvar.\n");
		System.out.println("De kort som delats ut är: \n");

		for (Card c : dragnaKort) { // skriver ut vilka dragna kort som gjorts
			System.out.println(c.kortFarg + " " + c.kortVarde);

		}

	}

}