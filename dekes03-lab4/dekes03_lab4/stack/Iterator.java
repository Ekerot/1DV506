package dekes03_lab4.stack;

public class Iterator {
	private int nastaElement = 0; // första elementet
	private Object[] elements;
	private int max; // sista i arrayen

	public Iterator(Object[] varde, int storlek) { // Vger värden från EnStack

		elements = varde;
		max = storlek;
	}

	public boolean hasNext() { // är nästa element sista i arrayen
		return nastaElement < max;
	}

	public Object next() {
		return elements[nastaElement++]; // returnerar och plussar på räknaren
										// nextElement
	}
}