package dekes03_lab4.stack;

public class StackMain {

	public static void main(String[] args) {

		EnStack enStack = new EnStack();

		enStack.push(43); // ger värden till EnStack
		enStack.push(3);
		enStack.push(4);
		enStack.push(34);
		enStack.push(54);

		System.out.println("Antal stackade objekt: " + enStack.size());

		System.out.println("Stacken är tom: " + enStack.isEmpty());

		System.out.println("Överst i stacken: " + enStack.pop());

		System.out.println("Titta på översta: " + enStack.peek());

		System.out.println("Överst i stacken: " + enStack.pop());

		System.out.println("Antal stackade objekt: " + enStack.size());

		System.out.println("Stacken är tom: " + enStack.isEmpty());

		Iterator iterator = enStack.iterator(); // Iterator itererar objekten i
												// stacken och skriver ut de
												// element som finns kvar i
												// stacken

		System.out.println("\nKvarvarande element i stacken är:");
		while (iterator.hasNext()) {
			Object o = iterator.next();
			System.out.println(o + " ");
		}
	}
}
