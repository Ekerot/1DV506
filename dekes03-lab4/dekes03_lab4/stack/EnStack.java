package dekes03_lab4.stack;

import java.util.EmptyStackException;

public class EnStack implements IStack {

	private int storlek;
	private Object[] stacken = new Object[6];

	public int size() {
		return storlek;
	}

	public boolean isEmpty() { // tittar om stacken är tom är den det returneras
								// true

		if (storlek == 0) {
			return true;
		}
		return false;
	}

	public void push(Object element) { // tilldelar nya element i Stacken

		for (int i = size(); i < stacken.length; i++) {
			stacken[size()] = element;

		}

		storlek++; // plussar på storleken på stacken

	}

	public Object pop() { // metoden tittar vilket det översta talet i stacken
							// är och plockar sedan bort den från stacken

		if (isEmpty()) { // kastar en exception om stacken är tom
			throw new EmptyStackException();

		}

		Object overst = stacken[size() - 1];

		storlek--;

		return overst;

	}

	public Object peek() { // tittar vilket det översta talet i stacken är, om
							// stacken är tom kastas en exception

		if (isEmpty()) {
			throw new EmptyStackException();

		}
		return stacken[size() - 1];
	}

	public Iterator iterator() { // tilldelar värdena Object[] stacken och int
									// storlek
									// till iteratorn
		return new Iterator(stacken, storlek);
	}

}
