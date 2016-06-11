package dekes03_lab4;

import java.util.Random;

public class RandomWalk {

	private int antal = 0;
	private int storlek = 0;
	private int max = 0;
	private int x, y;

	public RandomWalk(int in, int in2) { // konstruktor till RandomWalk ger
											// storlken på plattformen samt
											// antal maxsteg
		storlek = in2;
		max = in;

	}

	public String toString() { // varför vi ska ha med den här är lite oklart
								// men den var grymt bra när man testade
								// programmet
		return "Antal steg: " + antal + " Position; " + x + "," + y; // returnerar
																		// antal
																		// steg
																		// och
																		// position

	}

	public void takeStep() {
		antal++;

		Random rand = new Random(); // slumpar fram en siffra som sedan ger
									// olika senario intervallet är 0-3
		int steg = rand.nextInt(4);

		if (steg == 0) { // om 0 slumpas x+1
			x = x + 1;

		}

		else if (steg == 1) {// om 1 slumpas x-1
			x = x - 1;
		} else if (steg == 2) {// om 2 slumpas y+1
			y = y + 1;
		}

		else {// om 3 slumpas y-1
			y = y - 1;
		}

	}

	public boolean moreSteps() { // metoden tittar om max antal steg tagits
		if (antal < max) {
			return true;
		}

		return false;

	}

	public boolean inBounds() { // tittar om fyllehunden ramlat utanför
								// plattformen
		if (storlek > x && storlek > y && storlek * -1 < x && storlek * -1 < y) {
			return true;
		}
		return false;

	}

	public void walk() { // metoden låter vandraren vandra så länge han är
							// innanför plattformen och inte tagit mer än
							// maxantal steg

		while (inBounds() && moreSteps()) {
			takeStep();
		}
	}

}
