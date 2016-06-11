package dekes03_lab4.stack;

public interface IStack { // jag kallade denna IStack pga att en kompis till mig
							// som jobbar med javaprogrammering hjälpte mig att
							// förstå interfaces. Då sa han till mig att man
							// alltid avnnder I innan om det är ett interface,
							// vill inte lära mig fel

	int size(); // Current stack size

	boolean isEmpty(); // True if stack is empty

	void push(Object element); // Add element at top of stack

	Object pop(); // Return and remove top element
	// exception if stack is empty.

	Object peek(); // Return (without removing) top element,
	// exception if stack is empty.

	Iterator iterator(); // Element iterator

}