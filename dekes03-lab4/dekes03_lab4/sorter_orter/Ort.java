qpackage dekes03_lab4.sorter_orter;

public class Ort implements Comparable<Ort> {
	private String ort;
	private int postnummer;

	public Ort(String nyOrt) { // splittar postnummer från ortsnamn för att man
								// sedan ska kunna jäämföra postnummer
		String[] orter = nyOrt.split(";");
		String postOmvandla = orter[0];
		ort = orter[orter.length - 1];

		postnummer = Integer.parseInt(postOmvandla);
	}

	public int compareTo(Ort in) { // jämför postnummer med postnummer för att
									// kunna sortera dem

		return postnummer - in.postnummer;

	}

	public String toString() { // returnerar postnummer och ort på korrekt sätt

		return postnummer + " " + ort;

	}

}
