package dekes03_lab3;

public class Point {

	private int x = 0;
	private int y = 0;

	public Point(int n, int m) {
		x = n;
		y = m;

	}

	public String toString() { // toString metod för utskrift

		StringBuilder sb = new StringBuilder();
		sb.append(x + ",");
		sb.append(y);

		String out = sb.toString();

		return out;

	}

	public boolean isEqualTo(Point p2) { // tittar om två punkterna är samma

		if (p2.x == x) {
			if (p2.y == y) {
				return true;
			}
		}

		return false;
	}

	public double distanceTo(Point p2) { // beräknar avståndet mellan de olika
											// punkterna

		double upphojtX = Math.pow((p2.x - x), 2);
		double upphojtY = Math.pow((p2.y - y), 2);

		double out = Math.sqrt(upphojtX + upphojtY);

		return out;
	}

	public void move(int i, int j) { // plussar x med det nya värdet och samma
										// för y
		x = x + i;
		y = y + j;

	}

	public void moveToXY(int i, int j) { // ger x värdet som finns i i och y
											// värdet i j
		x = i; //
		y = j;

	}

}
