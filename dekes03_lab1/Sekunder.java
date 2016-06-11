package dekes03_lab1;

public class Sekunder {

	public static void main(String[] args) {

		String hours = "Timmar= ";
		String minutes = "Minuter= ";
		String seconds = "Sekunder= ";

		int antalHours = 2;
		int antalMinutes = 34;
		int antalSeconds = 50;

		int summan = antalHours * 3600 + antalMinutes * 60 + antalSeconds;

		System.out.println(hours + antalHours);
		System.out.println(minutes + antalMinutes);
		System.out.println(seconds + antalSeconds);

		System.out.println("\nTotala antalet sekunder= " + summan);
	}

}
