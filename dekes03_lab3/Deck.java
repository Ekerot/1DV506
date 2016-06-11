package dekes03_lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import dekes03_lab3.Card.Farg;
import dekes03_lab3.Card.Varde;

public class Deck {

	private int antalKort = 52;

	private ArrayList<Card> newDeck = new ArrayList<Card>();
	public ArrayList<Card> dragnaKort = new ArrayList<Card>();

	public ArrayList<Card> makeDeck() { // skapar kortlek

		for (Farg f : Farg.values()) { // ger värden och färg till varje kort

			for (Varde v : Varde.values()) {

				newDeck.add(new Card(v, f)); // sparas i Arraylist newDeck så
												// att en nylek skapas

			}

		}
		return newDeck;

	}

	public void shuffleCard() {
		if (newDeck.size() == 52) { // om kortleken innehåller 52kort kommer den
									// att blandas
			Collections.shuffle(newDeck);
		} else {
			System.err.println("Du kan endast blanda när kortleken innehåller 52 kort!"); // om
			System.exit(antalKort); // kortleken
									// inte
									// innehåller
									// 52kort
									// felmedelande
									// skickas
									// och
									// programmet
									// avslutas
		}
	}

	public ArrayList<Card> drawCard(int in) { // hämtar antalet kort som ska
												// dras
		Random rand = new Random();

		for (int i = 0; i < in; i++) { // drar kort som sedan returneras
			int index = rand.nextInt(newDeck.size());
			dragnaKort.add(newDeck.get(index));

			newDeck.remove(index); // tar bort kortet från leken så den inte kan
									// dras två gånger

			antalKort--; // minus 1 på räknaren antalKort

		}
		return dragnaKort;

	}

	public int displayAntalKort() {
		int out = antalKort; // returnerar antal kort i leken
		return out;
	}

}
