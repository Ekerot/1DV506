package dekes03_lab2;

public class TartLjus {

	public static void main(String[] args) {

		int kopBox = 0, ask = 0, ljus = 0, fodelsedag = 0;

		for (int i = 1; i < 101; i++) { // kör en loop 100 gånger
			fodelsedag = fodelsedag + 1;
			ljus = ljus - fodelsedag; // plockar bort antalet ljus som används

			if (ljus < 0) {

				while (ljus < 0) { // loopar tills antalet ljus är fler än 0
					ask++;
					ljus = ljus + 24; // lägger till 24 ljus
					kopBox++; // räknar hur många boxar vi köper tills vi har
								// mer än 0 ljus

				}

				System.out.printf("Innan din %d:e födelsedag, köp %d\n", fodelsedag, kopBox);
				kopBox = 0; // reset:ar antalet köpta boxar så inte värdet som
							// skrivits ut ligger kvar

			}

		}

		System.out.printf("\nTotalt antal köpta askar: %d Kvarvarande ljus: %d", ask, ljus);

	}

}
